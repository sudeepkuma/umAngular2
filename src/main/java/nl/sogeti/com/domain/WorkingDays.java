package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "workingdays")
@AttributeOverride(name = "id", column = @Column(name = "workingdays_id"))
public class WorkingDays extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2462542254980662337L;
	/** The aantal_ziektedagen. */
	private int year, days;

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the days
	 */
	public int getDays() {
		return days;
	}

	/**
	 * @param days
	 *            the days to set
	 */
	public void setDays(int days) {
		this.days = days;
	}

}
