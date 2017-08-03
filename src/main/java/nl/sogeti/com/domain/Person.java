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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import nl.sogeti.com.enums.Gender;

/**
 * This class represents a person in a relation with an employee. E.g. the partner or child of an employee.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
public class Person extends AbstractEntity
{

   /**
    * The Enum Type.
    */
   public enum Type
   {
      
      /** The child. */
      CHILD, 
 /** The partner. */
 PARTNER, 
 /** The deceased child. */
 DECEASED_CHILD, 
 /** The deceased partner. */
 DECEASED_PARTNER
   }

   /** The gender. */
   private Gender gender;
   
   /** The name. */
   private String name;
   
   /** The birth date. */
   @Temporal(TemporalType.DATE)
   private Date birthDate;
   
   /** The type. */
   @Enumerated(EnumType.STRING)
   private Type type;

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Person{" + "birthDate=" + this.birthDate + ", name='" + this.name + '\'' + ", type=" + this.type + '}';
   }

   /**
    * Sets the gender.
    *
    * @param gender the new gender
    */
   public void setGender(Gender gender)
   {
      this.gender = gender;
   }

   /**
    * Gets the gender.
    *
    * @return the gender
    */
   public Gender getGender()
   {
      return this.gender;
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

   /**
    * Gets the birth date.
    *
    * @return the birth date
    */
   public Date getBirthDate()
   {
      return copy(this.birthDate);
   }

   /**
    * Sets the birth date.
    *
    * @param birthDate the new birth date
    */
   public void setBirthDate(Date birthDate)
   {
      this.birthDate = copy(birthDate);
   }

   /**
    * Gets the type.
    *
    * @return the type
    */
   public Type getType()
   {
      return this.type;
   }

   /**
    * Sets the type.
    *
    * @param type the new type
    */
   public void setType(Type type)
   {
      this.type = type;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Person) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Person;
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
