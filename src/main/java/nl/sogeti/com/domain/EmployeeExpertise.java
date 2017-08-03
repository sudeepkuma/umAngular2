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

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class EmployeeExpertise.
 */
@Entity
@Table(name = "employee_expertises")
@AttributeOverride(name = "id", column = @Column(name = "empexp_id"))
public class EmployeeExpertise extends AbstractEntity implements Comparable<EmployeeExpertise>
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 7594174551529557654L;

   /** The employee. */
   @ManyToOne
   private Employee employee;

   /** The expertise. */
   @ManyToOne
   private Expertise expertise;

   /** The assignability level. */
   private int assignabilityLevel = 3;

   /**
    * Instantiates a new employee expertise.
    */
   public EmployeeExpertise()
   {

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
    * @param employee the employee to set
    */
   public void setEmployee(Employee employee)
   {
      this.employee = employee;
   }

   /**
    * Gets the expertise.
    * 
    * @return the expertise
    */
   public Expertise getExpertise()
   {
      return this.expertise;
   }

   /**
    * Sets the expertise.
    * 
    * @param expertise the expertise to set
    */
   public void setExpertise(Expertise expertise)
   {
      this.expertise = expertise;
   }

   /**
    * Gets the assignability level.
    * 
    * @return the assignabilityLevel
    */
   public int getAssignabilityLevel()
   {
      return this.assignabilityLevel;
   }

   /**
    * Sets the assignability level.
    * 
    * @param assignabilityLevel the assignabilityLevel to set
    */
   public void setAssignabilityLevel(int assignabilityLevel)
   {
      this.assignabilityLevel = assignabilityLevel;
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(EmployeeExpertise ee)
   {
      // Sort them high to low assignability first:
      if (ee.assignabilityLevel != this.assignabilityLevel)
      {
         return ee.assignabilityLevel - this.assignabilityLevel; // reversed sort
      }
      else
      {
         // by alphabet
         return this.expertise.getName().compareTo(ee.expertise.getName());
      }
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof EmployeeExpertise) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof EmployeeExpertise;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }

}