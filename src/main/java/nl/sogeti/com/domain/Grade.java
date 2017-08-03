package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Grade.
 */
@Entity
@Table(name = "grade")
@AttributeOverride(name = "id", column = @Column(name = "dumpGrade_id"))
public class Grade extends AbstractEntity {
	/**
	 * <code>serialVersionUID</code> indicates/is used for.
	 */
	private static final long serialVersionUID = 4650899420492082053L;

	/** The Jaar. */
	private int medewerkerNummer, periode, lsv, Jaar;

	/** The function code. */
	private String functionCode;

	/** The arve. */
	private double totalPaidTime,vacationTime,lrPercent,Richttarief, fte, ARVE, gmi,totaleKosten,COR,ADRC21,remunerationCosts,otherCosts,markUp;

	/** The csv date. */
	private Date csvDate;

	/** The lr percent. */
	private BigDecimal  revenueOwnResources, adrc ;

	
	
	
	/**
	 * Gets the vacation time.
	 *
	 * @return the vacation time
	 */
	public double getVacationTime() {
		return vacationTime;
	}

	/**
	 * Sets the vacation time.
	 *
	 * @param vacationTime the new vacation time
	 */
	public void setVacationTime(double vacationTime) {
		this.vacationTime = vacationTime;
	}

	
	/**
	 * Gets the lr percent.
	 *
	 * @return the lr percent
	 */
	public double getLrPercent() {
		return lrPercent;
	}

	/**
	 * Sets the lr percent.
	 *
	 * @param lrPercent the new lr percent
	 */
	public void setLrPercent(double lrPercent) {
		this.lrPercent = lrPercent;
	}

	/**
	 * Gets the medewerker nummer.
	 * 
	 * @return the medewerker nummer
	 */
	public int getMedewerkerNummer() {
		return this.medewerkerNummer;
	}

	/**
	 * Sets the medewerker nummer.
	 * 
	 * @param medewerkerNummer
	 *            the new medewerker nummer
	 */
	public void setMedewerkerNummer(int medewerkerNummer) {
		this.medewerkerNummer = medewerkerNummer;
	}

	/**
	 * Gets the periode.
	 * 
	 * @return the periode
	 */
	public int getPeriode() {
		return this.periode;
	}

	/**
	 * Sets the periode.
	 * 
	 * @param periode
	 *            the new periode
	 */
	public void setPeriode(int periode) {
		this.periode = periode;
	}

	/**
	 * Gets the lsv.
	 * 
	 * @return the lsv
	 */
	public int getLsv() {
		return this.lsv;
	}

	/**
	 * Sets the lsv.
	 * 
	 * @param lsv
	 *            the new lsv
	 */
	public void setLsv(int lsv) {
		this.lsv = lsv;
	}

	/**
	 * Gets the jaar.
	 * 
	 * @return the jaar
	 */
	public int getJaar() {
		return this.Jaar;
	}

	/**
	 * Sets the jaar.
	 * 
	 * @param jaar
	 *            the new jaar
	 */
	public void setJaar(int jaar) {
		this.Jaar = jaar;
	}



	/**
	 * Gets the csv date.
	 *
	 * @return the csv date
	 */
	public Date getCsvDate() {
		return csvDate;
	}

	public void setCsvDate(Date csvDate) {
		this.csvDate = csvDate;
	}

	/**
	 * Gets the mark up.
	 *
	 * @return the mark up
	 */
	public double getMarkUp() {
		return markUp;
	}

	/**
	 * Sets the mark up.
	 *
	 * @param markUp the new mark up
	 */
	public void setMarkUp(double markUp) {
		this.markUp = markUp;
	}

	/**
	 * Gets the function code.
	 * 
	 * @return the function code
	 */
	public String getFunctionCode() {
		return this.functionCode;
	}

	/**
	 * Sets the function code.
	 * 
	 * @param functionCode
	 *            the new function code
	 */
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	/**
	 * Gets the total paid time.
	 * 
	 * @return the total paid time
	 */
	public double getTotalPaidTime() {
		return this.totalPaidTime;
	}

	/**
	 * Sets the total paid time.
	 * 
	 * @param totalPaidTime
	 *            the new total paid time
	 */
	public void setTotalPaidTime(double totalPaidTime) {
		this.totalPaidTime = totalPaidTime;
	}

	/**
	 * Gets the revenue own resources.
	 * 
	 * @return the revenue own resources
	 */
	public BigDecimal getRevenueOwnResources() {
		return this.revenueOwnResources;
	}

	/**
	 * Sets the revenue own resources.
	 * 
	 * @param revenueOwnResources
	 *            the new revenue own resources
	 */
	public void setRevenueOwnResources(BigDecimal revenueOwnResources) {
		this.revenueOwnResources = revenueOwnResources;
	}

	/**
	 * Gets the fte.
	 * 
	 * @return the fte
	 */
	public double getFte() {
		return this.fte;
	}

	/**
	 * Sets the fte.
	 * 
	 * @param fte
	 *            the new fte
	 */
	public void setFte(double fte) {
		this.fte = fte;
	}

	

	/**
	 * Gets the richttarief.
	 *
	 * @return the richttarief
	 */
	public double getRichttarief() {
		return Richttarief;
	}

	/**
	 * Sets the richttarief.
	 *
	 * @param richttarief the new richttarief
	 */
	public void setRichttarief(double richttarief) {
		Richttarief = richttarief;
	}

	/**
	 * Gets the gmi.
	 * 
	 * @return the gmi
	 */
	public double getGmi() {
		return gmi;
	}

	/**
	 * Sets the gmi.
	 * 
	 * @param gmi
	 *            the new gmi
	 */
	public void setGmi(double gmi) {
		this.gmi = gmi;
	}


	/**
	 * Gets the arve.
	 * 
	 * @return the arve
	 */
	public double getARVE() {
		return this.ARVE;
	}

	/**
	 * Sets the arve.
	 * 
	 * @param aRVE
	 *            the new arve
	 */
	public void setARVE(double aRVE) {
		this.ARVE = aRVE;
	}

	
	/**
	 * Gets the other costs.
	 *
	 * @return the other costs
	 */
	public double getOtherCosts() {
		return Math.round(otherCosts);
	}

	/**
	 * Sets the other costs.
	 *
	 * @param otherCosts the new other costs
	 */
	public void setOtherCosts(double otherCosts) {
		this.otherCosts = otherCosts;
	}

	/**
	 * Gets the remuneration costs.
	 * 
	 * @return the remuneration costs
	 */
	public double getRemunerationCosts() {
		return Math.round(remunerationCosts);
	}

	/**
	 * Sets the remuneration costs.
	 * 
	 * @param remunerationCosts
	 *            the new remuneration costs
	 */
	public void setRemunerationCosts(double remunerationCosts) {
		this.remunerationCosts = remunerationCosts;
	}

	/**
	 * Gets the adrc.
	 * 
	 * @return the adrc
	 */
	public BigDecimal getAdrc() {
		return this.adrc;
	}

	/**
	 * Sets the adrc.
	 * 
	 * @param adrc
	 *            the new adrc
	 */
	public void setAdrc(BigDecimal adrc) {
		this.adrc = adrc;
	}

	

	/**
	 * Gets the ADR c21.
	 *
	 * @return the ADR c21
	 */
	public double getADRC21() {
		return ADRC21;
	}

	/**
	 * Sets the ADR c21.
	 *
	 * @param aDRC21 the new ADR c21
	 */
	public void setADRC21(double aDRC21) {
		ADRC21 = aDRC21;
	}

	/**
	 * Gets the totale kosten.
	 *
	 * @return the totale kosten
	 */
	public double getTotaleKosten() {
		return totaleKosten;
	}

	/**
	 * Sets the totale kosten.
	 *
	 * @param totaleKosten the new totale kosten
	 */
	public void setTotaleKosten(double totaleKosten) {
		this.totaleKosten = totaleKosten;
	}

	/**
	 * Gets the cor.
	 *
	 * @return the cor
	 */
	public double getCOR() {
		return COR;
	}

	/**
	 * Sets the cor.
	 *
	 * @param cOR the new cor
	 */
	public void setCOR(double cOR) {
		COR = cOR;
	}

	public String getGraphDate(){
	   SimpleDateFormat sdf = new SimpleDateFormat("MMM''yy");
	   return csvDate != null ? sdf.format(csvDate) : "";
	}

}
