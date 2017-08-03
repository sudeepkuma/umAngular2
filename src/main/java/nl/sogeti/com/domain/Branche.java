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

import java.util.Comparator;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

// TODO: Auto-generated Javadoc
/**
 * The Class Branche.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "branches", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
@AttributeOverride(name = "id", column = @Column(name = "branche_id"))
public class Branche extends AbstractEntity
{

   /** The name. */
   private String name;

   /**
    * Constructor: create a new Branche.
    */
   public Branche()
   {

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

   /** The name comparator. */
   public static Comparator<Branche> NAME_COMPARATOR = new Comparator<Branche>()
      {
         @Override
         public int compare(Branche o1, Branche o2)
         {
            if (o1.name == null)
            {
               return -1;
            }
            if (o2.name == null)
            {
               return 1;
            }
            return o1.name.compareToIgnoreCase(o2.name);
         }
      };

   /*
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Branche) && super.equals(that);
   }

   /*
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Branche;
   }

   /*
    * @see nl.sogeti.umd.domain.AbstractEntity#hashCode()
    */

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public final int hashCode()
   {
      return super.hashCode();
   }
}
