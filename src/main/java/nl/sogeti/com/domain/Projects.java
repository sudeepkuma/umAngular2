package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "projects")
@AttributeOverride(name = "id", column = @Column(name = "project_id"))
public class Projects extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2179551170904717919L;

	/**
	 * The project order.
	 */
	private long projectOrder;

	/**
	 * The start date.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	String clientName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date finalDate;
	
	
	/**
	 * The hourly rate
	 */
	private BigDecimal hourlyRate;

	/**
	 * The sales manager name.
	 */
	private String salesManagerName;

	/**
	 * The sales manager number
	 */
	private int salesManagerNumber;

	/**
	 * The assignment
	 */
	private int assignment;

	public long getProjectOrder() {
		return projectOrder;
	}

	public void setProjectOrder(long projectOrder) {
		this.projectOrder = projectOrder;
	}

	/**
	 * @return the start date.
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * sets the order date.
	 * 
	 * @param startDate
	 *            the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	

	public BigDecimal getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(BigDecimal hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return the sales manager name.
	 */
	public String getSalesManagerName() {
		return salesManagerName;
	}

	/**
	 * sets the sales manager name.
	 * 
	 * @param salesManagerName
	 *            the new sales manager name
	 */
	public void setSalesManagerName(String salesManagerName) {
		this.salesManagerName = salesManagerName;
	}

	/**
	 * @return the sales manager number.
	 */
	public int getSalesManagerNumber() {
		return salesManagerNumber;
	}

	/**
	 * sets the sales manager number.
	 * 
	 * @param salesManagerNumber
	 *            the new sales manager number
	 */
	public void setSalesManagerNumber(int salesManagerNumber) {
		this.salesManagerNumber = salesManagerNumber;
	}

	/**
	 * @return the assignment
	 */
	public int getAssignment() {
		return assignment;
	}

	/**
	 * sets the assignment.
	 * 
	 * @param assignment
	 *            the new assignment
	 */
	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}

   public Date getFinalDate()
   {
      return finalDate;
   }

   public void setFinalDate(Date finalDate)
   {
      this.finalDate = finalDate;
   }

   public String getClientName()
   {
      return clientName;
   }

   public void setClientName(String clientName)
   {
      this.clientName = clientName;
   }

}
