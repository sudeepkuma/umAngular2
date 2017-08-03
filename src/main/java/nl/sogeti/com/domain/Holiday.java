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

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class Holiday.
 */
@Entity
@Table(name = "holidays")
@AttributeOverride(name = "id", column = @Column(name = "holiday_id"))
public class Holiday extends AbstractEntity
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 7457418893652426281L;

   /** The employee. */
   @ManyToOne
   private Employee employee;

   /** The sequence number. */
   private int sequenceNumber;

   /** The date start. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date dateStart;

   /** The date end. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date dateEnd;

   /** The remark. */
   private String remark;

   /** The approved. */
   private boolean approved;

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

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((this.dateEnd == null) ? 0 : this.dateEnd.hashCode());
      result = prime * result + ((this.dateStart == null) ? 0 : this.dateStart.hashCode());
      result = prime * result + ((this.employee.getNumber() == 0) ? 0 : this.employee.getNumber());
      return result;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
     
     
      
      if (this == obj)
      {
         return true;
      }
      if(obj==null){
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      Holiday other = (Holiday) obj;
      if (this.dateEnd == null)
      {
         if (other.dateEnd != null)
         {
            return false;
         }
      }
      else if (!dt.format(this.dateEnd).equals(dt.format(other.dateEnd)))
      {
         return false;
      }
      if (this.dateStart == null)
      {
         if (other.dateStart != null)
         {
            return false;
         }
      }
      else if (!dt.format(this.dateStart).equals(dt.format(other.dateStart)))
      {
         return false;
      }
      if (this.employee == null)
      {
         if (other.employee != null)
         {
            return false;
         }
      }
      else if (this.employee.getNumber() != other.employee.getNumber())
      {
         return false;
      }
      return true;
   }
}
