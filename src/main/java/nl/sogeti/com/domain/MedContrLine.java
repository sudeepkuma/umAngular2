package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class MedContrLine.
 */

@Entity
@Table(name="TmpararyMedContrLine")
@AttributeOverride(name = "id", column = @Column(name = "MedContrLine_id"))
public class MedContrLine extends AbstractEntity
{

   
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;
   
   /** The periode. */
   private int periode;

   /** The jaar. */
   private int jaar;

   /** The datum in dienst. */
   private Date datumInDienst;

   /** The datum uit dienst. */
   private Date datumUitDienst;

   /** The unit medewerker. */
   private String unitMedewerker;

   /** The dag tarief. */
   private BigDecimal dagTarief;

   /** The mark up. */
   private BigDecimal markUp;

   /** The urve. */
   private BigDecimal URVE;

   /**
    * Gets the periode.
    * 
    * @return the periode
    */
   public int getPeriode()
   {
      return this.periode;
   }

   /**
    * Sets the periode.
    * 
    * @param periode the new periode
    */
   public void setPeriode(int periode)
   {
      this.periode = periode;
   }

   /**
    * Gets the jaar.
    * 
    * @return the jaar
    */
   public int getJaar()
   {
      return this.jaar;
   }

   /**
    * Sets the jaar.
    * 
    * @param jaar the new jaar
    */
   public void setJaar(int jaar)
   {
      this.jaar = jaar;
   }

   /**
    * Gets the datum in dienst.
    * 
    * @return the datum in dienst
    */
   public Date getDatumInDienst()
   {
      return copy(this.datumInDienst);
   }

   /**
    * Sets the datum in dienst.
    * 
    * @param datumInDienst the new datum in dienst
    */
   public void setDatumInDienst(Date datumInDienst)
   {
      this.datumInDienst = copy(datumInDienst);
   }

   /**
    * Gets the datum uit dienst.
    * 
    * @return the datum uit dienst
    */
   public Date getDatumUitDienst()
   {
      return copy(this.datumUitDienst);
   }

   /**
    * Sets the datum uit dienst.
    * 
    * @param datumUitDienst the new datum uit dienst
    */
   public void setDatumUitDienst(Date datumUitDienst)
   {
      this.datumUitDienst = copy(datumUitDienst);
   }

   /**
    * Gets the unit medewerker.
    * 
    * @return the unit medewerker
    */
   public String getUnitMedewerker()
   {
      return this.unitMedewerker;
   }

   /**
    * Sets the unit medewerker.
    * 
    * @param unitMedewerker the new unit medewerker
    */
   public void setUnitMedewerker(String unitMedewerker)
   {
      this.unitMedewerker = unitMedewerker;
   }

   /**
    * Gets the dag tarief.
    * 
    * @return the dag tarief
    */
   public BigDecimal getDagTarief()
   {
      return this.dagTarief;
   }

   /**
    * Sets the dag tarief.
    * 
    * @param dagTarief the new dag tarief
    */
   public void setDagTarief(BigDecimal dagTarief)
   {
      this.dagTarief = dagTarief;
   }

   /**
    * Gets the mark up.
    * 
    * @return the mark up
    */
   public BigDecimal getMarkUp()
   {
      return this.markUp;
   }

   /**
    * Sets the mark up.
    * 
    * @param markUp the new mark up
    */
   public void setMarkUp(BigDecimal markUp)
   {
      this.markUp = markUp;
   }

   /**
    * Gets the urve.
    * 
    * @return the urve
    */
   public BigDecimal getURVE()
   {
      return this.URVE;
   }

   /**
    * Sets the urve.
    * 
    * @param URVE the new urve
    */
   public void setURVE(BigDecimal URVE)
   {
      this.URVE = URVE;
   }

   /**
    * Gets the employee number.
    *
    * @return the employee number
    */
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }

   /**
    * Sets the employee number.
    *
    * @param employeeNumber the new employee number
    */
   public void setEmployeeNumber(int employeeNumber)
   {
      this.employeeNumber = employeeNumber;
   }
   
   
}
