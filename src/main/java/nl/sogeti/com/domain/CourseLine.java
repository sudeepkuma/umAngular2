package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class CourseLine.
 */
@Entity
@Table(name="TmpararyCourseLine")
@AttributeOverride(name = "id", column = @Column(name = "CourseLine_id"))
public class CourseLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;
   
   /** The plan. */
   private String plan;

   /** The type. */
   private String type;

   /** The course name. */
   private String courseName;

   /** The start date. */
   private Date startDate;

   /** The sign date. */
   private Date signDate;

   /** The score. */
   private String score;

   /** The code. */
   private String code;

   /** The status. */
   private String status;

   /**
    * Gets the plan.
    * 
    * @return the plan
    */
   public String getPlan()
   {
      return this.plan;
   }

   /**
    * Sets the plan.
    * 
    * @param plan the new plan
    */
   public void setPlan(String plan)
   {
      this.plan = plan;
   }

   /**
    * Gets the type.
    * 
    * @return the type
    */
   public String getType()
   {
      return this.type;
   }

   /**
    * Sets the type.
    * 
    * @param type the new type
    */
   public void setType(String type)
   {
      this.type = type;
   }

   /**
    * Gets the course name.
    * 
    * @return the course name
    */
   public String getCourseName()
   {
      return this.courseName;
   }

   /**
    * Sets the course name.
    * 
    * @param courseName the new course name
    */
   public void setCourseName(String courseName)
   {
      this.courseName = courseName;
   }

   /**
    * Gets the start date.
    * 
    * @return the start date
    */
   public Date getStartDate()
   {
      return copy(this.startDate);
   }

   /**
    * Sets the start date.
    * 
    * @param startDate the new start date
    */
   public void setStartDate(Date startDate)
   {
      this.startDate = copy(startDate);
   }

   /**
    * Gets the sign date.
    * 
    * @return the sign date
    */
   public Date getSignDate()
   {
      return copy(this.signDate);
   }

   /**
    * Sets the sign date.
    * 
    * @param signDate the new sign date
    */
   public void setSignDate(Date signDate)
   {
      this.signDate = copy(signDate);
   }

   /**
    * Gets the score.
    * 
    * @return the score
    */
   public String getScore()
   {
      return this.score;
   }

   /**
    * Sets the score.
    * 
    * @param score the new score
    */
   public void setScore(String score)
   {
      this.score = score;
   }

   /**
    * Gets the code.
    * 
    * @return the code
    */
   public String getCode()
   {
      return this.code;
   }

   /**
    * Sets the code.
    * 
    * @param code the new code
    */
   public void setCode(String code)
   {
      this.code = code;
   }

   /**
    * Gets the status.
    * 
    * @return the status
    */
   public String getStatus()
   {
      return this.status;
   }

   /**
    * Sets the status.
    * 
    * @param status the new status
    */
   public void setStatus(String status)
   {
      this.status = status;
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

   /**
    * Sets the employee number.
    *
    * @param employeeNumber the new employee number
    */
   public void setEmployeeNumber(int employeeNumber)
   {
      this.employeeNumber = employeeNumber;
   }
   
   
}
