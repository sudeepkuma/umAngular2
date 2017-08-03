package nl.sogeti.com.domain;

import java.math.BigDecimal;

import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class PerformanceLevel extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7268559083087296834L;
	
	private String functieniveau;

	/** The bnp. */
	private BigDecimal ondergrens, bovengrens;

	/**
	 * @return the functieniveau
	 */
	public String getFunctieniveau() {
		return functieniveau;
	}

	/**
	 * @param functieniveau
	 *            the functieniveau to set
	 */
	public void setFunctieniveau(String functieniveau) {
		this.functieniveau = functieniveau;
	}

	/**
	 * @return the ondergrens
	 */
	public BigDecimal getOndergrens() {
		return ondergrens;
	}

	/**
	 * @param ondergrens
	 *            the ondergrens to set
	 */
	public void setOndergrens(BigDecimal ondergrens) {
		this.ondergrens = ondergrens;
	}

	/**
	 * @return the bovengrens
	 */
	public BigDecimal getBovengrens() {
		return bovengrens;
	}

	/**
	 * @param bovengrens
	 *            the bovengrens to set
	 */
	public void setBovengrens(BigDecimal bovengrens) {
		this.bovengrens = bovengrens;
	}

}
