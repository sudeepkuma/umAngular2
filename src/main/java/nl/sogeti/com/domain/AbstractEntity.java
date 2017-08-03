/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Nov 20, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * This class acts as a base class for all the entities. It provides id's and basic equals, hashCode and toString methods. This class is Serializable so that all entities will be, as it needed by the
 * JPA specification.
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity implements Serializable
{

   /** The id. */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   protected  long id; // The import script needs throwaway primary keys

   /**
    * Constructor: create a new AbstractEntity.
    */
   public AbstractEntity()
   {

   }

   /**
    * public AbstractPageDTO(Employee employee) { this.id = employee.getId(); } Copied From AbstractPageDTO
    * 
    * @param employee the employee
    */
   public AbstractEntity(Employee employee)
   {
      this.id = employee.getId();
   }

   /**
    * public AbstractEntity(long id) { this.id = id; } Copied From AbstractPageDTO
    * 
    * @param id the id
    */
   public AbstractEntity(long id)
   {
      this.id = id;
   }

   /**
    * Gets the id.
    * 
    * @return the id
    */
   public long getId()
   {
      return this.id;
   }

   /**
    * Warning: use this method with caution. It might fool JPA and cause terrible bugs. It is a necessary evil for conversions.
    * 
    * @param id the id to set
    */
   public void setId(long id)
   {
      this.id = id;
   }

   /**
    * A basic implementation of equals for an entity. If the other object is a AbstractEntity (or subclass) it will return true if the id's are the same. Otherwise false is returned.
    * 
    * @param that The object to compare with
    * @return if the other object equals this object
    */
   @Override
   public boolean equals(Object that)
   {
      if (!(that instanceof AbstractEntity))
      {
         return false;
      }
      AbstractEntity other = (AbstractEntity) that;
      return other.canEqual(this) && getId() == other.getId();
   }

   /**
    * Helper method for equals(); needed to make equals() work correctly w.r.t. inheritance. See http://www.artima.com/lejava/articles/equality.html for more information.
    * 
    * @param that The object to compare with
    * @return true, if successful
    */
   public boolean canEqual(Object that)
   {
      return that instanceof AbstractEntity;
   }

   /**
    * A basic implementation of hashCode. It only uses the id. This is a stable and correct implementation as the id will never change. Since all subclasses are required to override equals, they are
    * required to override hashCode as well, or else the static analysis tools will choke. It is fine to just call super.hashCode() from the override.
    * 
    * @return the hashCode for this object
    */
   @Override
   public int hashCode()
   {
      return (int) (this.id >> 32 ^ this.id);
   }

   /**
    * A basic toString implementation. It return a String containing the class and and the id of the entity.
    * 
    * @return a String representation of this object
    */
   @Override
   public String toString()
   {
      return getClass().getName() + "{id=" + getId() + '}';
   }
}
