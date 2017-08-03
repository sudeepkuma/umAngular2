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
import javax.persistence.Table;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * This class represents the role a user fulfills. E.g. a manager or an admin
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
@AttributeOverride(name = "id", column = @Column(name = "role_id"))
public class Role extends AbstractEntity implements Comparable<Role>
{

   /** The Constant MANAGER. */
   public static final String MANAGER = "manager";
   
   /** The Constant ADMIN. */
   public static final String ADMIN = "admin";
   
   /** The Constant DIVISION_MANAGER. */
   public static final String DIVISION_MANAGER = "divisionmanager";
   
   /** The Constant GUEST. */
   public static final String GUEST = "guest";

   /** The name. */
   private String name;

   /**
    * Instantiates a new role.
    */
   public Role()
   {
   }

   /**
    * Instantiates a new role.
    *
    * @param name the name
    */
   public Role(String name)
   {
      setName(name);
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
    * @param name the new name
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (obj == null)
      {
         return false;
      }
      if (obj == this)
      {
         return true;
      }
      if (!(obj instanceof Role))
      {
         return false;
      }
      Role that = (Role) obj;

      EqualsBuilder b = new EqualsBuilder();
      b.append(getId(), that.getId());
      b.append(getName(), that.getName());
      return b.isEquals();
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Role;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      HashCodeBuilder b = new HashCodeBuilder();
      b.append(getId());
      b.append(getName());
      return b.toHashCode();
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(Role that)
   {
      CompareToBuilder b = new CompareToBuilder();
      b.append(getId(), that.getId());
      b.append(getName(), that.getName());
      return b.toComparison();
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      StringBuilder builder = new StringBuilder();
      builder.append("Role [name=").append(this.name);
      builder.append(", id=").append(getId());
      builder.append("]");
      return builder.toString();
   }
}
