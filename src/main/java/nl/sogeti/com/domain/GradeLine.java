package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class GradeLine.
 */
@Entity
@Table(name="TmpararyGradeLine")
@AttributeOverride(name = "id", column = @Column(name = "GradeLine_id"))
public class GradeLine extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;

   /** The Jaar. */
   private int periode, lsv, Jaar;

   /**
    * Gets the jaar.
    * 
    * @return the jaar
    */
   public int getJaar()
   {
      return this.Jaar;
   }

   /**
    * Sets the jaar.
    * 
    * @param jaar the new jaar
    */
   public void setJaar(int jaar)
   {
      this.Jaar = jaar;
   }

   /** The datum uit dienst. */
   private Date datumInDienst, datumUitDienst;

   /** The divisie uitvoerend. */
   private String medewerkerNaam, unitMedewerker, regioMedewerker, divisieMedewerker, pccMedewerker, gradeMedewerker, functionCode, unitUitvoerend, regioUitvoerend, divisieUitvoerend;

   /** The arve. */
   private double dienstverbandPercent, totalPaidTime, fte, ARVE;

   /** The rt revenue. */
   private BigDecimal timeBooked, vacationTime, revenueOwnResources, remunerationCosts, adrc, ADRC21, Richttarief, totaleKosten, COR, markUp;

   /**
    * Gets the cor.
    * 
    * @return the cor
    */
   public BigDecimal getCOR()
   {
      return this.COR;
   }

   /**
    * Sets the cor.
    * 
    * @param cOR the new cor
    */
   public void setCOR(BigDecimal cOR)
   {
      this.COR = cOR;
   }

   /**
    * Gets the time booked.
    * 
    * @return the time booked
    */
   public BigDecimal getTimeBooked()
   {
      return this.timeBooked;
   }

   /**
    * Sets the time booked.
    * 
    * @param timeBooked the new time booked
    */
   public void setTimeBooked(BigDecimal timeBooked)
   {
      this.timeBooked = timeBooked;
   }

   /**
    * Gets the vacation time.
    * 
    * @return the vacation time
    */
   public BigDecimal getVacationTime()
   {
      return this.vacationTime;
   }

   /**
    * Sets the vacation time.
    * 
    * @param vacationTime the new vacation time
    */
   public void setVacationTime(BigDecimal vacationTime)
   {
      this.vacationTime = vacationTime;
   }

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
    * Gets the lsv.
    * 
    * @return the lsv
    */
   public int getLsv()
   {
      return this.lsv;
   }

   /**
    * Sets the lsv.
    * 
    * @param lsv the new lsv
    */
   public void setLsv(int lsv)
   {
      this.lsv = lsv;
   }

   /**
    * Gets the datum in dienst.
    * 
    * @return the datum in dienst
    */
   public Date getDatumInDienst()
   {
      return this.datumInDienst;
   }

   /**
    * Sets the datum in dienst.
    * 
    * @param datumInDienst the new datum in dienst
    */
   public void setDatumInDienst(Date datumInDienst)
   {
      this.datumInDienst = datumInDienst;
   }

   /**
    * Gets the datum uit dienst.
    * 
    * @return the datum uit dienst
    */
   public Date getDatumUitDienst()
   {
      return this.datumUitDienst;
   }

   /**
    * Sets the datum uit dienst.
    * 
    * @param datumUitDienst the new datum uit dienst
    */
   public void setDatumUitDienst(Date datumUitDienst)
   {
      this.datumUitDienst = datumUitDienst;
   }

   /**
    * Gets the medewerker naam.
    * 
    * @return the medewerker naam
    */
   public String getMedewerkerNaam()
   {
      return this.medewerkerNaam;
   }

   /**
    * Sets the medewerker naam.
    * 
    * @param medewerkerNaam the new medewerker naam
    */
   public void setMedewerkerNaam(String medewerkerNaam)
   {
      this.medewerkerNaam = medewerkerNaam;
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
    * Gets the regio medewerker.
    * 
    * @return the regio medewerker
    */
   public String getRegioMedewerker()
   {
      return this.regioMedewerker;
   }

   /**
    * Sets the regio medewerker.
    * 
    * @param regioMedewerker the new regio medewerker
    */
   public void setRegioMedewerker(String regioMedewerker)
   {
      this.regioMedewerker = regioMedewerker;
   }

   /**
    * Gets the divisie medewerker.
    * 
    * @return the divisie medewerker
    */
   public String getDivisieMedewerker()
   {
      return this.divisieMedewerker;
   }

   /**
    * Sets the divisie medewerker.
    * 
    * @param divisieMedewerker the new divisie medewerker
    */
   public void setDivisieMedewerker(String divisieMedewerker)
   {
      this.divisieMedewerker = divisieMedewerker;
   }

   /**
    * Gets the pcc medewerker.
    * 
    * @return the pcc medewerker
    */
   public String getPccMedewerker()
   {
      return this.pccMedewerker;
   }

   /**
    * Sets the pcc medewerker.
    * 
    * @param pccMedewerker the new pcc medewerker
    */
   public void setPccMedewerker(String pccMedewerker)
   {
      this.pccMedewerker = pccMedewerker;
   }

   /**
    * Gets the grade medewerker.
    * 
    * @return the grade medewerker
    */
   public String getGradeMedewerker()
   {
      return this.gradeMedewerker;
   }

   /**
    * Sets the grade medewerker.
    * 
    * @param gradeMedewerker the new grade medewerker
    */
   public void setGradeMedewerker(String gradeMedewerker)
   {
      this.gradeMedewerker = gradeMedewerker;
   }

   /**
    * Gets the function code.
    * 
    * @return the function code
    */
   public String getFunctionCode()
   {
      return this.functionCode;
   }

   /**
    * Sets the function code.
    * 
    * @param functionCode the new function code
    */
   public void setFunctionCode(String functionCode)
   {
      this.functionCode = functionCode;
   }

   /**
    * Gets the dienstverband percent.
    * 
    * @return the dienstverband percent
    */
   public double getDienstverbandPercent()
   {
      return this.dienstverbandPercent;
   }

   /**
    * Sets the dienstverband percent.
    * 
    * @param dienstverbandPercent the new dienstverband percent
    */
   public void setDienstverbandPercent(double dienstverbandPercent)
   {
      this.dienstverbandPercent = dienstverbandPercent;
   }

   /**
    * Gets the total paid time.
    * 
    * @return the total paid time
    */
   public double getTotalPaidTime()
   {
      return this.totalPaidTime;
   }

   /**
    * Sets the total paid time.
    * 
    * @param totalPaidTime the new total paid time
    */
   public void setTotalPaidTime(double totalPaidTime)
   {
      this.totalPaidTime = totalPaidTime;
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
    * Gets the revenue own resources.
    * 
    * @return the revenue own resources
    */
   public BigDecimal getRevenueOwnResources()
   {
      return this.revenueOwnResources;
   }

   /**
    * Sets the revenue own resources.
    * 
    * @param revenueOwnResources the new revenue own resources
    */
   public void setRevenueOwnResources(BigDecimal revenueOwnResources)
   {
      this.revenueOwnResources = revenueOwnResources;
   }

   /**
    * Gets the fte.
    * 
    * @return the fte
    */
   public double getFte()
   {
      return this.fte;
   }

   /**
    * Sets the fte.
    * 
    * @param fte the new fte
    */
   public void setFte(double fte)
   {
      this.fte = fte;
   }

   /**
    * Gets the adrc.
    * 
    * @return the adrc
    */
   public BigDecimal getAdrc()
   {
      return this.adrc;
   }

   /**
    * Gets the arve.
    * 
    * @return the arve
    */
   public double getARVE()
   {
      return this.ARVE;
   }

   /**
    * Sets the arve.
    * 
    * @param aRVE the new arve
    */
   public void setARVE(double aRVE)
   {
      this.ARVE = aRVE;
   }

   /**
    * Gets the richttarief.
    * 
    * @return the richttarief
    */
   public BigDecimal getRichttarief()
   {
      return this.Richttarief;
   }

   /**
    * Sets the richttarief.
    * 
    * @param richttarief the new richttarief
    */
   public void setRichttarief(BigDecimal richttarief)
   {
      this.Richttarief = richttarief;
   }

   /**
    * Gets the unit uitvoerend.
    * 
    * @return the unit uitvoerend
    */
   public String getUnitUitvoerend()
   {
      return this.unitUitvoerend;
   }

   /**
    * Sets the unit uitvoerend.
    * 
    * @param unitUitvoerend the new unit uitvoerend
    */
   public void setUnitUitvoerend(String unitUitvoerend)
   {
      this.unitUitvoerend = unitUitvoerend;
   }

   /**
    * Gets the regio uitvoerend.
    * 
    * @return the regio uitvoerend
    */
   public String getRegioUitvoerend()
   {
      return this.regioUitvoerend;
   }

   /**
    * Sets the regio uitvoerend.
    * 
    * @param regioUitvoerend the new regio uitvoerend
    */
   public void setRegioUitvoerend(String regioUitvoerend)
   {
      this.regioUitvoerend = regioUitvoerend;
   }

   /**
    * Gets the divisie uitvoerend.
    * 
    * @return the divisie uitvoerend
    */
   public String getDivisieUitvoerend()
   {
      return this.divisieUitvoerend;
   }

   /**
    * Sets the divisie uitvoerend.
    * 
    * @param divisieUitvoerend the new divisie uitvoerend
    */
   public void setDivisieUitvoerend(String divisieUitvoerend)
   {
      this.divisieUitvoerend = divisieUitvoerend;
   }

   /**
    * Gets the remuneration costs.
    * 
    * @return the remuneration costs
    */
   public BigDecimal getRemunerationCosts()
   {
      return this.remunerationCosts;
   }

   /**
    * Sets the remuneration costs.
    * 
    * @param remunerationCosts the new remuneration costs
    */
   public void setRemunerationCosts(BigDecimal remunerationCosts)
   {
      this.remunerationCosts = remunerationCosts;
   }

   /**
    * Sets the adrc.
    * 
    * @param adrc the new adrc
    */
   public void setAdrc(BigDecimal adrc)
   {
      this.adrc = adrc;
   }

   /**
    * Gets the ADR c21.
    * 
    * @return the ADR c21
    */
   public BigDecimal getADRC21()
   {
      return this.ADRC21;
   }

   /**
    * Sets the ADR c21.
    * 
    * @param aDRC21 the new ADR c21
    */
   public void setADRC21(BigDecimal aDRC21)
   {
      this.ADRC21 = aDRC21;
   }

   /**
    * Gets the totale kosten.
    * 
    * @return the totale kosten
    */
   public BigDecimal getTotaleKosten()
   {
      return this.totaleKosten;
   }

   /**
    * Sets the totale kosten.
    * 
    * @param totaleKosten the new totale kosten
    */
   public void setTotaleKosten(BigDecimal totaleKosten)
   {
      this.totaleKosten = totaleKosten;
   }

   /**
    * Get the employeeNumber.
    *
    * @return Returns the employeeNumber as a int.
    */
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }

   /**
    * Set the employeeNumber to the specified value.
    *
    * @param employeeNumber The employeeNumber to set.
    */
   public void setEmployeeNumber(int employeeNumber)
   {
      this.employeeNumber = employeeNumber;
   }

   
  
}
