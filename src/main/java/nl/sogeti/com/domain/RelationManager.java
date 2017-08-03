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

/**
 * The Class RelationManager.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "relationmanagers", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
@AttributeOverride(name = "id", column = @Column(name = "relationmanager_id"))
public class RelationManager extends AbstractEntity
{

   /** The name. */
   private String name;

   /** The approved. */
   private boolean approved;

   /**
    * Instantiates a new relation manager.
    */
   public RelationManager()
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

   /** The name comparator. */
   public static Comparator<RelationManager> NAME_COMPARATOR = new Comparator<RelationManager>()
      {
         @Override
         public int compare(RelationManager o1, RelationManager o2)
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
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof RelationManager) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof RelationManager;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }

}
