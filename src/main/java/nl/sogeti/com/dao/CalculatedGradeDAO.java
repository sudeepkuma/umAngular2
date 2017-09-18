package nl.sogeti.com.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nl.sogeti.com.domain.CalculatedGrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculatedGradeDAO.
 */
@Stateless
public class CalculatedGradeDAO 
{

   /** The Constant LOGGER. */
   @SuppressWarnings("unused")
   private static final Logger LOGGER = LoggerFactory.getLogger(CalculatedGradeDAO.class);

	@PersistenceContext(unitName = "data-unit")
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
   /**
    * Find annual grades.
    * 
    * @param employeeNumber the employee number
    * @return the list
    */
	
	
   public CalculatedGrade findAnnualGrades(long employeeNumber)
   {
      List<CalculatedGrade> annualGrades = null;
      CalculatedGrade result = null;
      annualGrades = getEntityManager().createQuery("select u from CalculatedGrade u where u.employeeNumber=:employeeNumber order by calculationDate desc", CalculatedGrade.class)
                                       .setParameter("employeeNumber", employeeNumber)
                                       .getResultList();

      if (annualGrades.size() > 0)
      {
    	  result = annualGrades.get(0);
      }

      return result == null ? new CalculatedGrade() : result;

   }
}
