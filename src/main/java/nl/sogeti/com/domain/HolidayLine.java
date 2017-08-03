package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The Class HolidayLine.
 */

@Entity
@Table(name="TmpararyHolidayLine")
@AttributeOverride(name = "id", column = @Column(name = "HolidayLine_id"))
public class HolidayLine extends AbstractEntity 
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;
   
   /** The sequence number. */
   private int sequenceNumber;

   /** The date start. */
   private Date dateStart;

   /** The date end. */
   private Date dateEnd;

   /** The remark. */
   private String remark;

   /** The approved. */
   private boolean approved;

   /**
    * Gets the sequence number.
    * 
    * @return the sequence number
    */
   public int getSequenceNumber()
   {
      return this.sequenceNumber;
   }

   /**
    * Sets the sequence number.
    * 
    * @param sequenceNumber the new sequence number
    */
   public void setSequenceNumber(int sequenceNumber)
   {
      this.sequenceNumber = sequenceNumber;
   }

   /**
    * Gets the date start.
    * 
    * @return the date start
    */
   public Date getDateStart()
   {
      return copy(this.dateStart);
   }

   /**
    * Sets the date start.
    * 
    * @param dateStart the new date start
    */
   public void setDateStart(Date dateStart)
   {
      this.dateStart = copy(dateStart);
   }

   /**
    * Gets the date end.
    * 
    * @return the date end
    */
   public Date getDateEnd()
   {
      return copy(this.dateEnd);
   }

   /**
    * Sets the date end.
    * 
    * @param dateEnd the new date end
    */
   public void setDateEnd(Date dateEnd)
   {
      this.dateEnd = copy(dateEnd);
   }

   /**
    * Gets the remark.
    * 
    * @return the remark
    */
   public String getRemark()
   {
      return this.remark;
   }

   /**
    * Sets the remark.
    * 
    * @param remark the new remark
    */
   public void setRemark(String remark)
   {
      this.remark = remark;
   }

   /**
    * Checks if is approved.
    * 
    * @return true, if is approved
    */
   public boolean isApproved()
   {
      return this.approved;
   }

   /**
    * Sets the approved.
    * 
    * @param approved the new approved
    */
   public void setApproved(boolean approved)
   {
      this.approved = approved;
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

   public void setEmployeeNumber(int employeeNumber)
   {
      this.employeeNumber = employeeNumber;
   }
   
  
   

}
