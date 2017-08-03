package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "omzetgegrawdata")
@AttributeOverride(name = "id", column = @Column(name = "omzetgeg_id"))
public class OmzetgegRawData extends AbstractEntity {
	
	private int number, sac_code;

	private String opd_ordersoort;

	private BigDecimal boe_omzet, boe_uren;
	
	
   private Date csvDate,insertionDate;

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSac_code() {
		return sac_code;
	}

	public void setSac_code(int sac_code) {
		this.sac_code = sac_code;
	}

	public String getOpd_ordersoort() {
		return opd_ordersoort;
	}

	public void setOpd_ordersoort(String opd_ordersoort) {
		this.opd_ordersoort = opd_ordersoort;
	}


	/**
	 * @return the boe_omzet
	 */
	public BigDecimal getBoe_omzet() {
		return boe_omzet;
	}

	/**
	 * @param boe_omzet the boe_omzet to set
	 */
	public void setBoe_omzet(BigDecimal boe_omzet) {
		this.boe_omzet = boe_omzet;
	}

	/**
	 * @return the boe_uren
	 */
	public BigDecimal getBoe_uren() {
		return boe_uren;
	}

	/**
	 * @param boe_uren the boe_uren to set
	 */
	public void setBoe_uren(BigDecimal boe_uren) {
		this.boe_uren = boe_uren;
	}

	/**
	 * @return the csvDate
	 */
	public Date getCsvDate() {
		return csvDate;
	}

	/**
	 * @param csvDate the csvDate to set
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
