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

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The Class ExpertiseCategory.
 */
@Entity
@Table(name = "expcategories")
@AttributeOverride(name = "id", column = @Column(name = "expcategory_id"))
public class ExpertiseCategory extends AbstractEntity
{
   
   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = -202331591790466593L;

   /** The name. */
   private String name;

   /** The expertises. */
   @OneToMany
   private Set<Expertise> expertises;

   /**
    * Instantiates a new expertise category.
    */
   public ExpertiseCategory()
   {
      this.expertises = new HashSet<Expertise>();
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
    * @param name the name to set
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * Gets the expertises.
    *
    * @return the expertises
    */
   public Set<Expertise> getExpertises()
   {
      return this.expertises;
   }

   /**
    * Sets the expertises.
    *
    * @param expertises the expertises to set
    */
   public void setExpertises(Set<Expertise> expertises)
   {
      this.expertises = expertises;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof ExpertiseCategory) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof ExpertiseCategory;
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
