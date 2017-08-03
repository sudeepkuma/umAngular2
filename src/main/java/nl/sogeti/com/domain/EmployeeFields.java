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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import nl.sogeti.com.enums.FieldValue;

/**
 * This class represents a course which can be done at Sogeti or an external source.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "employeeFields")
@AttributeOverride(name = "id", column = @Column(name = "employeeField_id"))
public class EmployeeFields extends AbstractEntity implements Comparable<EmployeeFields>
{

   /**
    * The employee.
    */
   @ManyToOne(cascade = CascadeType.ALL, optional = true)
   @JoinTable(name = "employee_employeefields", joinColumns = @JoinColumn(name = "employeeField_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
   private Employee employee;

   /** The field. */
   @ManyToOne(optional = true)
   private Fields field;

   /** The field text. */
   private String fieldText;

   /** The field date. */
   private Date fieldDate;

   /** The field num. */
   private Integer fieldNum;

   /** The label field. */
   @Transient
   private String labelField;

   /** The text f. */
   @Transient
   private boolean textF = false;

   /** The date f. */
   @Transient
   private boolean dateF = false;

   /** The num f. */
   @Transient
   private boolean numF = false;

   /** The active f. */
   @Transient
   private boolean activeF = true;

   /**
    * Instantiates a new employee fields.
    */
   public EmployeeFields()
   {

   }

   /**
    * Instantiates a new employee fields.
    *
    * @param employeeField the employee field
    */
   public EmployeeFields(EmployeeFields employeeField)
   {
      this.id = employeeField.getId();
      this.labelField = employeeField.getField().getName();
      this.fieldText = employeeField.getFieldText();
      this.fieldDate = employeeField.getFieldDate();
      this.fieldNum = employeeField.getFieldNum();

      switch (employeeField.getField().getType())
      {
         case StringFi:
            this.textF = true;
            this.activeF = true;
            break;
         case DateFi:
            this.dateF = true;
            this.activeF = true;
            break;
         case Numeriek:
            this.numF = true;
            this.activeF = true;
            break;
         case Ongebruikt:
            this.activeF = false;
            break;
      }
   }

   /**
    * Instantiates a new employee fields.
    * 
    * @param field the field
    */
   public EmployeeFields(Fields field)
   {
      this.field = field;
   }

   /**
    * Instantiates a new employee fields.
    * 
    * @param fieldText the field text
    */
   public EmployeeFields(String fieldText)
   {
      this.fieldText = fieldText;
   }

   /**
    * Instantiates a new employee fields.
    * 
    * @param fieldDate the field date
    */
   public EmployeeFields(Date fieldDate)
   {
      this.fieldDate = copy(fieldDate);
   }

   /**
    * Instantiates a new employee fields.
    * 
    * @param fieldNum the field num
    */
   public EmployeeFields(Integer fieldNum)
   {
      this.fieldNum = fieldNum;
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
    * Gets the field.
    * 
    * @return the field
    */
   public Fields getField()
   {
      return this.field;
   }

   /**
    * Sets the field.
    * 
    * @param field the new field
    */
   public void setField(Fields field)
   {
      this.field = field;
   }

   /**
    * Gets the field text.
    * 
    * @return the field text
    */
   public String getFieldText()
   {
      return this.fieldText;
   }

   /**
    * Sets the field text.
    * 
    * @param fieldText the new field text
    */
   public void setFieldText(String fieldText)
   {
      this.fieldText = fieldText;
   }

   /**
    * Gets the field date.
    * 
    * @return the field date
    */
   public Date getFieldDate()
   {
      return copy(this.fieldDate);
   }

   /**
    * Sets the field date.
    * 
    * @param fieldDate the new field date
    */
   public void setFieldDate(Date fieldDate)
   {
      this.fieldDate = copy(fieldDate);
   }

   /**
    * Gets the field num.
    * 
    * @return the field num
    */
   public Integer getFieldNum()
   {
      return this.fieldNum;
   }

   /**
    * Sets the field num.
    * 
    * @param fieldNum the new field num
    */
   public void setFieldNum(Integer fieldNum)
   {
      this.fieldNum = fieldNum;
   }

   /**
    * Get the labelField.
    * 
    * @return Returns the labelField as a String.
    */
   public String getLabelField()
   {
      return this.labelField;
   }

   /**
    * Set the labelField to the specified value.
    * 
    * @param labelField The labelField to set.
    */
   public void setLabelField(String labelField)
   {
      this.labelField = labelField;
   }

   /**
    * Get the textF.
    * 
    * @return Returns the textF as a boolean.
    */
   public boolean isTextF()
   {
      return this.textF;
   }

   /**
    * Set the textF to the specified value.
    * 
    * @param textF The textF to set.
    */
   public void setTextF(boolean textF)
   {
      this.textF = textF;
   }

   /**
    * Get the dateF.
    * 
    * @return Returns the dateF as a boolean.
    */
   public boolean isDateF()
   {
      return this.dateF;
   }

   /**
    * Set the dateF to the specified value.
    * 
    * @param dateF The dateF to set.
    */
   public void setDateF(boolean dateF)
   {
      this.dateF = dateF;
   }

   /**
    * Get the numF.
    * 
    * @return Returns the numF as a boolean.
    */
   public boolean isNumF()
   {
      return this.numF;
   }

   /**
    * Set the numF to the specified value.
    * 
    * @param numF The numF to set.
    */
   public void setNumF(boolean numF)
   {
      this.numF = numF;
   }

   /**
    * Get the activeF.
    * 
    * @return Returns the activeF as a boolean.
    */
   public boolean isActiveF()
   {
      return this.activeF;
   }

   /**
    * Set the activeF to the specified value.
    * 
    * @param activeF The activeF to set.
    */
   public void setActiveF(boolean activeF)
   {
      this.activeF = activeF;
   }

   /**
    * Convert.
    * 
    * @param fromType the from type
    * @param toType the to type
    */
   public void convert(FieldValue fromType, FieldValue toType)
   {
      switch (toType)
      {
         case DateFi:
            convertToDate(fromType);
            break;
         case Numeriek:
            convertToNumeriek(fromType);
            break;
         case StringFi:
            convertToString(fromType);
            break;
         case Ongebruikt:
            convertToOngebruikt(fromType);
            break;
      }
   }

   /**
    * Convert to date.
    * 
    * @param fromType the from type
    */
   private void convertToDate(FieldValue fromType)
   {
      switch (fromType)
      {
         case DateFi:
            // deliberately left empty
            break;
         case StringFi:
            // TODO we might add a conversion here later

            this.fieldDate = null;
            break;
         default:
            this.fieldDate = null;
            break;
      }

      this.fieldNum = null;
      this.fieldText = null;
   }

   /**
    * Convert to numeriek.
    * 
    * @param fromType the from type
    */
   private void convertToNumeriek(FieldValue fromType)
   {
      switch (fromType)
      {
         case StringFi:
            System.out.println("This is the fromType2 " + fromType);
            try
            {
               this.fieldNum = Integer.valueOf(this.fieldText);
            }
            catch (NumberFormatException e)
            {
               this.fieldNum = 0;
            }
            break;
         case Numeriek:
            // deliberately left empty
            break;
         default:
            this.fieldNum = 0;
            break;

      }

      this.fieldDate = null;
      this.fieldText = null;
   }

   /**
    * Convert to string.
    * 
    * @param fromType the from type
    */
   private void convertToString(FieldValue fromType)
   {
      switch (fromType)
      {
         case DateFi:
            this.fieldText = this.fieldDate != null ? this.fieldDate.toString() : "";
            break;

         case Numeriek:
            this.fieldText = this.fieldNum != null ? this.fieldNum.toString() : "0";
            break;

         default:
            // deliberately left empty
            break;
      }

      this.fieldDate = null;
      this.fieldNum = null;
   }

   /**
    * Convert to ongebruikt.
    * 
    * @param fromType the from type
    */
   private void convertToOngebruikt(FieldValue fromType)
   {
      this.fieldDate = null;
      this.fieldNum = null;
      this.fieldText = null;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof EmployeeFields) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof EmployeeFields;
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

   /*
    * (non-Javadoc)
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(EmployeeFields that)
   {
      if (that == null)
      {
         return -1;
      }

      if (this.field != null && that.field != null)
      {
         int comp = this.field.compareTo(that.field);
         if (comp != 0)
         {
            return comp;
         }
      }

      if (this.fieldDate != null && that.fieldDate != null)
      {
         return this.fieldDate.compareTo(that.fieldDate);
      }
      if (this.fieldText != null && that.fieldText != null)
      {
         return this.fieldText.compareTo(that.fieldText);
      }
      if (this.fieldNum != null && that.fieldNum != null)
      {
         return this.fieldNum.compareTo(that.fieldNum);
      }

      // Types are incompatible. Comparing a DateField with a StringField for example
      return -1;
   }

}
