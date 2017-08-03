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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import nl.sogeti.com.enums.FieldValue;

/**
 * This class represents the extra fields.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "freefields")
@AttributeOverride(name = "id", column = @Column(name = "freeField_id"))
public class Fields extends AbstractEntity implements Comparable<Fields>
{

   /**
    * The user.
    */
   @ManyToOne(cascade = CascadeType.ALL, optional = true)
   @JoinTable(name = "user_freefields", joinColumns = @JoinColumn(name = "freeField_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
   private User user;

   /** The name of the field. */
   @Column(name = "field_name")
   private String name;

   /** The employee fields. */
   @OneToMany(mappedBy = "field")
   private Set<EmployeeFields> employeeFields;

   /** The type of the field. */
   @Column(name = "field_type")
   @Enumerated(EnumType.STRING)
   private FieldValue type;

   /** The inst table fields. */
   @Transient
   private List<Fields> instTableFields;

   /**
    * Instantiates a new fields.
    */
   public Fields()
   {
      this.type = FieldValue.Ongebruikt;
   }

   /**
    * Instantiates a new fields.
    *
    * @param fields the fields
    */
   public Fields(List<Fields> fields)
   {
      this.instTableFields = new ArrayList<Fields>();
      for (Fields fi : fields)
      {
         this.instTableFields.add(fi);
      }
   }

   /**
    * Getters & Setters.
    * 
    * @return the user
    */

   public User getUser()
   {
      return this.user;
   }

   /**
    * Sets the user.
    * 
    * @param user the new user
    */
   public void setUser(User user)
   {
      this.user = user;
   }

   /**
    * Gets the name.
    * 
    * @return the name
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Sets the name.
    * 
    * @param field_name the new name
    */
   public void setName(String field_name)
   {
      this.name = field_name;
   }

   /**
    * Gets the type.
    * 
    * @return the type
    */
   public FieldValue getType()
   {
      return this.type;
   }

   /**
    * Sets the type.
    * 
    * @param field_type the new type
    */
   public void setType(FieldValue field_type)
   {
      this.type = field_type;
   }

   /**
    * Get the instTableFields.
    * 
    * @return Returns the instTableFields as a List<Fields>.
    */
   public List<Fields> getInstTableFields()
   {
      return this.instTableFields;
   }

   /**
    * Set the instTableFields to the specified value.
    * 
    * @param instTableFields The instTableFields to set.
    */
   public void setInstTableFields(List<Fields> instTableFields)
   {
      this.instTableFields = instTableFields;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Fields))
      {
         return false;
      }
      Fields that = (Fields) obj;
      return Objects.equals(getName(), that.getName()) && Objects.equals(getType(), that.getType()) && getId() == that.getId();
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Fields;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      int result = 17;
      result = (31 * result) + (getName() != null ? getName().hashCode() : 0);
      result = (31 * result) + (getType() != null ? getType().hashCode() : 0);
      result = (31 * result) + (int) getId();
      return result;
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(Fields other)
   {
      if (other == null)
      {
         return -1;
      }

      // When names are the same, sort on ID
      if (getName() !=null && getName().equals(other.getName()) || (getName() == null && other.getName() == null))
      {
         return getId() > other.getId() ? 1 : -1;
      }
      else
      {
         if (getName() == null)
         {
            return -1;
         }

         if (other.getName() == null)
         {
            return -1;
         }

         if (getName().isEmpty())
         {
            return Integer.MAX_VALUE;
         }

         if (other.getName().length() == 0)
         {
            return Integer.MIN_VALUE;
         }

         return getName().compareToIgnoreCase(other.getName());
      }
   }
}
