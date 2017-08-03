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

/**
 * This class represents a course which can be done at Sogeti or an external source.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "courses")
@AttributeOverride(name = "id", column = @Column(name = "course_id"))
public class Course extends AbstractEntity
{

   /**
    * The code of the course. Must be unique.
    */
   @Column(unique = true)
   private String code;
   
   /** The name of the course. */
   private String name;

   /**
    * Constructor: create a new Course.
    */
   public Course()
   {
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
   public boolean equals(Object that)
   {
      return (that instanceof Course) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Course;
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
