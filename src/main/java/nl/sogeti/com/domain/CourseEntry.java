/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Dec 12, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * This course represents a entry of an employee to a course.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "courseentries")
@AttributeOverride(name = "id", column = @Column(name = "courseentry_id"))
public class CourseEntry extends AbstractEntity implements Comparable<CourseEntry>
{

   /**
    * The status of a CourseEntry.
    */
   public enum Status
   {

      /** The Registered. */
      Registered,
      /** The Done. */
      Done,
      /** The Unknown. */
      Unknown
   }

   /**
    * The result of a CourseEntry.
    */
   public enum Result
   {

      /** The Excellent. */
      Excellent,
      /** The Good. */
      Good,
      /** The Failed. */
      Failed,
      /** The Unknown. */
      Unknown
   }

   /** The employee. */
   @ManyToOne
   @JoinColumn(name = "employee_id")
   private Employee employee;

   /** The course. */
   @ManyToOne
   @JoinColumn(name = "course_id")
   private Course course;

   /** The status. */
   @Enumerated(EnumType.STRING)
   private Status status;

   /** The start date. */
   @Temporal(TemporalType.DATE)
   private Date startDate;

   /** The registered. */
   @Temporal(TemporalType.DATE)
   private Date registered;

   /** The result. */
   @Enumerated(EnumType.STRING)
   private Result result;

   /** The comments. */
   @Size(max = 255)
   private String comments;

   /**
    * Constructor: create a new CourseEntry.
    */
   public CourseEntry()
   {
   }

   /**
    * Gets the comments.
    * 
    * @return the comments
    */
   public String getComments()
   {
      return this.comments;
   }

   /**
    * Sets the comments.
    * 
    * @param comments the new comments
    */
   public void setComments(String comments)
   {
      this.comments = comments;
   }

   /**
    * Gets the employee.
    * 
    * @return the employee
    */
   public Employee getEmployee()
   {
      return this.employee;
   }

   /**
    * Sets the employee.
    * 
    * @param employee the new employee
    */
   public void setEmployee(Employee employee)
   {
      this.employee = employee;
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
    * Gets the registered.
    * 
    * @return the registered
    */
   public Date getRegistered()
   {
      return copy(this.registered);
   }

   /**
    * Sets the registered.
    * 
    * @param registered the new registered
    */
   public void setRegistered(Date registered)
   {
      this.registered = copy(registered);
   }

   /**
    * Gets the result.
    * 
    * @return the result
    */
   public Result getResult()
   {
      return this.result;
   }

   /**
    * Sets the result.
    * 
    * @param result the new result
    */
   public void setResult(Result result)
   {
      this.result = result;
   }

   /**
    * Gets the status.
    * 
    * @return the status
    */
   public Status getStatus()
   {
      return this.status;
   }

   /**
    * Sets the status.
    * 
    * @param status the new status
    */
   public void setStatus(Status status)
   {
      this.status = status;
   }

   /**
    * Gets the course.
    * 
    * @return the course
    */
   public Course getCourse()
   {
      return this.course;
   }

   /**
    * Sets the course.
    * 
    * @param course the new course
    */
   public void setCourse(Course course)
   {
      this.course = course;
   }

   /**
    * Checks if is register row.
    *
    * @return true, if is register row
    */
   public boolean isRegisterRow()
   {
      switch (this.status)
      {
         case Registered:
            return true;
         default:
            return false;
      }
   }

   /**
    * Compare to.
    * 
    * @param other the other
    * @return the int
    * @Override public int compareTo(CourseEntryDTO other) { Integer compare = innerCompare(this.getStartDate(), other.getStartDate()); if (compare != null) { return compare; } // reversed on start
    *           date return -(this.getStartDate().compareTo(other.getStartDate())); } Copied From CourseEntryDTO
    */
   @Override
   public int compareTo(CourseEntry other)
   {
      Integer compare = innerCompare(getStartDate(), other.getStartDate());
      if (compare != null)
      {
         return compare;
      }

      // reversed on start date
      return -(getStartDate().compareTo(other.getStartDate()));
   }

   /**
    * Inner compare.
    *
    * @param one the one
    * @param other the other
    * @return the integer
    */
   private Integer innerCompare(Object one, Object other)
   {
      if (one == null && other == null)
      {
         return 0;
      }
      if (one == null)
      {
         return 1;
      }
      if (other == null)
      {
         return -1;
      }
      return null;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof CourseEntry) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof CourseEntry;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }
}
