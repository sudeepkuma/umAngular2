package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "calculated_grades")
@AttributeOverride(name = "id", column = @Column(name = "calculated_grade__id"))
public class CalculatedGrade extends AbstractEntity

{ 
   /** The total revenue. */
	private BigDecimal totalRevenue;

	/** The total other cost. */
	private double gmiYearly, totalKosten, totalRenumerationCost,
			totalOtherCost;

	/** The employee number. */
	private long employeeNumber;

	/** The calculation date. */
	private Date calculationDate;

	/**
	 * Gets the employee number.
	 *
	 * @return the employee number
	 */
	public long getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * Sets the employee number.
	 *
	 * @param employeeNumber the new employee number
	 */
	public void setEmployeeNumber(long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * Gets the total kosten.
	 *
	 * @return the total kosten
	 */
	public double getTotalKosten() {
		return totalKosten;
	}

	/**
	 * Sets the total kosten.
	 *
	 * @param totalKosten the new total kosten
	 */
	public void setTotalKosten(double totalKosten) {
		this.totalKosten = totalKosten;
	}

	/**
	 * Gets the total revenue.
	 *
	 * @return the total revenue
	 */
	public BigDecimal getTotalRevenue() {
		return totalRevenue;
	}

	/**
	 * Sets the total revenue.
	 *
	 * @param totalRevenue the new total revenue
	 */
	public void setTotalRevenue(BigDecimal totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	/**
	 * Gets the total renumeration cost.
	 *
	 * @return the total renumeration cost
	 */
	public double getTotalRenumerationCost() {
		return Math.round(totalRenumerationCost);
	}

	/**
	 * Sets the total renumeration cost.
	 *
	 * @param totalRenumerationCost the new total renumeration cost
	 */
	public void setTotalRenumerationCost(double totalRenumerationCost) {
		this.totalRenumerationCost = totalRenumerationCost;
	}

	/**
	 * Gets the total other cost.
	 *
	 * @return the total other cost
	 */
	public double getTotalOtherCost() {
		return Math.round(totalOtherCost);
	}

	/**
	 * Sets the total other cost.
	 *
	 * @param totalOtherCost the new total other cost
	 */
	public void setTotalOtherCost(double totalOtherCost) {
		this.totalOtherCost = totalOtherCost;
	}

	/**
	 * Gets the gmi yearly.
	 *
	 * @return the gmi yearly
	 */
	public double getGmiYearly() {
		return gmiYearly;
	}

	/**
	 * Sets the gmi yearly.
	 *
	 * @param gmiYearly the new gmi yearly
	 */
	public void setGmiYearly(double gmiYearly) {
		this.gmiYearly = gmiYearly;
	}

	/**
	 * Gets the calculation date.
	 *
	 * @return the calculation date
	 */
	public Date getCalculationDate() {
		return calculationDate;
	}

	/**
	 * Sets the calculation date.
	 *
	 * @param calculationDate the new calculation date
	 */
	public void setCalculationDate(Date calculationDate) {
		this.calculationDate = calculationDate;
	}

}