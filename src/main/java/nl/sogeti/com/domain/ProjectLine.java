package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class ProjectLine.
 */
@Entity
@Table(name="TmpararyProjectLine")
@AttributeOverride(name = "id", column = @Column(name = "ProjectLine_id"))
public class ProjectLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;
   
   /** The expected final date. */
   private Date startDate, finalDate, expectedFinalDate;

   /** The activity code. */
   private int salesManagerNumber, assignmentPercent, employmentPercent, activityCode;

   /** The sales unit. */
   private String employeeName, clientName, salesManagerName, pOrD, projectID, levelOfEmployee, divisionOfEmployee, salesUnit;

   /** The daily rate. */
   private BigDecimal hourlyRate, dailyRate;

   /** The project order. */
   private int projectOrder;

   /**
    * Gets the start date.
    *
    * @return the start date
    */
   public Date getStartDate()
   {
      return this.startDate;
   }

   /**
    * Sets the start date.
    *
    * @param startDate the new start date
    */
   public void setStartDate(Date startDate)
   {
      this.startDate = startDate;
   }

   /**
    * Gets the final date.
    *
    * @return the final date
    */
   public Date getFinalDate()
   {
      return this.finalDate;
   }

   /**
    * Sets the final date.
    *
    * @param finalDate the new final date
    */
   public void setFinalDate(Date finalDate)
   {
      this.finalDate = finalDate;
   }

   /**
    * Gets the expected final date.
    *
    * @return the expected final date
    */
   public Date getExpectedFinalDate()
   {
      return this.expectedFinalDate;
   }

   /**
    * Sets the expected final date.
    *
    * @param expectedFinalDate the new expected final date
    */
   public void setExpectedFinalDate(Date expectedFinalDate)
   {
      this.expectedFinalDate = expectedFinalDate;
   }

   /**
    * Gets the project order.
    *
    * @return the project order
    */
   public int getProjectOrder()
   {
      return this.projectOrder;
   }

   /**
    * Sets the project order.
    *
    * @param projectOrder the new project order
    */
   public void setProjectOrder(int projectOrder)
   {
      this.projectOrder = projectOrder;
   }

   /**
    * Gets the sales manager number.
    *
    * @return the sales manager number
    */
   public int getSalesManagerNumber()
   {
      return this.salesManagerNumber;
   }

   /**
    * Sets the sales manager number.
    *
    * @param salesManagerNumber the new sales manager number
    */
   public void setSalesManagerNumber(int salesManagerNumber)
   {
      this.salesManagerNumber = salesManagerNumber;
   }

   /**
    * Gets the assignment percent.
    *
    * @return the assignment percent
    */
   public int getAssignmentPercent()
   {
      return this.assignmentPercent;
   }

   /**
    * Sets the assignment percent.
    *
    * @param assignmentPercent the new assignment percent
    */
   public void setAssignmentPercent(int assignmentPercent)
   {
      this.assignmentPercent = assignmentPercent;
   }

   /**
    * Gets the employment percent.
    *
    * @return the employment percent
    */
   public int getEmploymentPercent()
   {
      return this.employmentPercent;
   }

   /**
    * Sets the employment percent.
    *
    * @param employmentPercent the new employment percent
    */
   public void setEmploymentPercent(int employmentPercent)
   {
      this.employmentPercent = employmentPercent;
   }

   /**
    * Gets the daily rate.
    *
    * @return the daily rate
    */
   public BigDecimal getDailyRate()
   {
      return this.dailyRate;
   }

   /**
    * Sets the daily rate.
    *
    * @param dailyRate the new daily rate
    */
   public void setDailyRate(BigDecimal dailyRate)
   {
      this.dailyRate = dailyRate;
   }

   /**
    * Gets the activity code.
    *
    * @return the activity code
    */
   public int getActivityCode()
   {
      return this.activityCode;
   }

   /**
    * Sets the activity code.
    *
    * @param activityCode the new activity code
    */
   public void setActivityCode(int activityCode)
   {
      this.activityCode = activityCode;
   }

   /**
    * Gets the employee name.
    *
    * @return the employee name
    */
   public String getEmployeeName()
   {
      return this.employeeName;
   }

   /**
    * Sets the employee name.
    *
    * @param employeeName the new employee name
    */
   public void setEmployeeName(String employeeName)
   {
      this.employeeName = employeeName;
   }

   /**
    * Gets the client name.
    *
    * @return the client name
    */
   public String getClientName()
   {
      return this.clientName;
   }

   /**
    * Sets the client name.
    *
    * @param clientName the new client name
    */
   public void setClientName(String clientName)
   {
      this.clientName = clientName;
   }

   /**
    * Gets the sales manager name.
    *
    * @return the sales manager name
    */
   public String getSalesManagerName()
   {
      return this.salesManagerName;
   }

   /**
    * Sets the sales manager name.
    *
    * @param salesManagerName the new sales manager name
    */
   public void setSalesManagerName(String salesManagerName)
   {
      this.salesManagerName = salesManagerName;
   }

   /**
    * Gets the p or d.
    *
    * @return the p or d
    */
   public String getpOrD()
   {
      return this.pOrD;
   }

   /**
    * Sets the p or d.
    *
    * @param pOrD the new p or d
    */
   public void setpOrD(String pOrD)
   {
      this.pOrD = pOrD;
   }

   /**
    * Gets the project id.
    *
    * @return the project id
    */
   public String getProjectID()
   {
      return this.projectID;
   }

   /**
    * Sets the project id.
    *
    * @param projectID the new project id
    */
   public void setProjectID(String projectID)
   {
      this.projectID = projectID;
   }

   /**
    * Gets the level of employee.
    *
    * @return the level of employee
    */
   public String getLevelOfEmployee()
   {
      return this.levelOfEmployee;
   }

   /**
    * Sets the level of employee.
    *
    * @param levelOfEmployee the new level of employee
    */
   public void setLevelOfEmployee(String levelOfEmployee)
   {
      this.levelOfEmployee = levelOfEmployee;
   }

   /**
    * Gets the division of employee.
    *
    * @return the division of employee
    */
   public String getDivisionOfEmployee()
   {
      return this.divisionOfEmployee;
   }

   /**
    * Sets the division of employee.
    *
    * @param divisionOfEmployee the new division of employee
    */
   public void setDivisionOfEmployee(String divisionOfEmployee)
   {
      this.divisionOfEmployee = divisionOfEmployee;
   }

   /**
    * Gets the sales unit.
    *
    * @return the sales unit
    */
   public String getSalesUnit()
   {
      return this.salesUnit;
   }

   /**
    * Sets the sales unit.
    *
    * @param salesUnit the new sales unit
    */
   public void setSalesUnit(String salesUnit)
   {
      this.salesUnit = salesUnit;
   }

   /**
    * Gets the hourly rate.
    *
    * @return the hourly rate
    */
   public BigDecimal getHourlyRate()
   {
      return this.hourlyRate;
   }

   /**
    * Sets the hourly rate.
    *
    * @param hourlyRate the new hourly rate
    */
   public void setHourlyRate(BigDecimal hourlyRate)
   {
      this.hourlyRate = hourlyRate;
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
