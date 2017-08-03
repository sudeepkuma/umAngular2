package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "urengegrawdata")
@AttributeOverride(name = "id", column = @Column(name = "urengeg_id"))
public class UrengegRawData extends AbstractEntity {

	/** The periode. */
	private int number, rubriek, brug;

   private Date csvDate,insertionDate;
	/** The perc_dvb. */
	private BigDecimal overuren, uren;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getRubriek() {
		return rubriek;
	}

	public void setRubriek(int rubriek) {
		this.rubriek = rubriek;
	}

	public int getBrug() {
		return brug;
	}

	public void setBrug(int brug) {
		this.brug = brug;
	}

	public BigDecimal getOveruren() {
		return overuren;
	}

	public void setOveruren(BigDecimal overuren) {
		this.overuren = overuren;
	}

	public BigDecimal getUren() {
		return uren;
	}

	public void setUren(BigDecimal uren) {
		this.uren = uren;
	}

	/**
	 * @return the csvDate
	 */
	public Date getCsvDate() {
		return csvDate;
	}

	/**
	 * @param csvDate
	 *            the csvDate to set
	 */
	public void setCsvDate(Date csvDate) {
		this.csvDate = csvDate;
	}

   public Date getInsertionDate()
   {
      return insertionDate;
   }

   public void setInsertionDate(Date insertionDate)
   {
      this.insertionDate = insertionDate;
   }

}
