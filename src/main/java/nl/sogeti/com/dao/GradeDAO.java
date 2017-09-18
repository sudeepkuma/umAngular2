package nl.sogeti.com.dao;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import nl.sogeti.com.domain.Grade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless
public class GradeDAO  {
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(CalculatedGradeDAO.class);
	
	@PersistenceContext(unitName = "data-unit")
	private EntityManager entityManager;
	
	public static String getDate(Calendar cal) {
		return "" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	private final DateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public List<Grade> findAllGrades(long employeeNumber) {

		List<Grade> grades = null;
		Calendar now = Calendar.getInstance();
		// now.set(Calendar.DAY_OF_MONTH, 1);

		Calendar before = Calendar.getInstance();
		before.set(Calendar.DAY_OF_MONTH, 1);
		before.add(Calendar.MONTH, -13);

		grades = getEntityManager()
				.createQuery(
						"select u from Grade u where u.medewerkerNummer=" + employeeNumber + "and(u.csvDate between"
								+ "'" + newDateFormat.format(before.getTime()) + "'" + "  and " + "'"
								+ newDateFormat.format(now.getTime()) + "'" + " ) order by u.csvDate desc", Grade.class)
				.setMaxResults(12).getResultList();

		Collections.reverse(grades);

		if (grades.size() == 0)
			grades.add(new Grade()); // set empty values to display blank graph

		return grades;

	}

	public Date findlatestGMIimportedDate(long employeeNumber) {
		List<Grade> latestGMIimporteddate = new ArrayList<Grade>();

		latestGMIimporteddate = getEntityManager().createQuery(
				"select u from Grade u where u.medewerkerNummer = " + employeeNumber + "order by csvDate desc ",
				Grade.class).getResultList();
		if (latestGMIimporteddate.size() > 0) {
			for (Grade dateOfGMI : latestGMIimporteddate) {
				return dateOfGMI.getCsvDate();

			}
		}

		return null;

	}

   public int calculatedRichttariefvalue(long employeeNumber)
   {
      try{
      int calculatedRichttariefValue = 0;
      Grade grade = new Grade();
      grade = getEntityManager().createQuery("select u from Grade u where u.medewerkerNummer = " + employeeNumber + "order by csvDate desc", Grade.class).setMaxResults(1).getSingleResult();
      if (grade!=null)
      {
         calculatedRichttariefValue = (int) (grade.getRichttarief() / 8);
         return calculatedRichttariefValue;
      }
      }  
      catch(NoResultException ex)
      { }
      return 0;
   
   }

   public BigDecimal calculatedAfwijkingvalue(BigDecimal targetHourlyRate, int calculatedRichttariefvalue)
   {
      BigDecimal calculatedAfwijkingvalue = new BigDecimal(0);
      if (targetHourlyRate.compareTo(BigDecimal.ZERO) != 0)
      {
         MathContext mc = new MathContext(4);
         calculatedAfwijkingvalue = targetHourlyRate.divide(BigDecimal.valueOf(calculatedRichttariefvalue), 4, BigDecimal.ROUND_HALF_UP).subtract(BigDecimal.valueOf(1))
               .multiply(BigDecimal.valueOf(100), mc);
      }
      else
      {
         calculatedAfwijkingvalue = calculatedAfwijkingvalue.subtract(BigDecimal.valueOf(1).multiply(BigDecimal.valueOf(100)));
      }
      return calculatedAfwijkingvalue;
   }
   public <T> T find(Class<T> entity, Long key)
   {
      return this.entityManager.find(entity, key);
   }

}
