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

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This class represents a type of ranking for an employee. E.g. his skill, potential, appreciation of the client
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "rankingitems")
@AttributeOverride(name = "id", column = @Column(name = "rankingitem_id"))
public class RankingItem extends AbstractEntity
{

   /** The name. */
   private String name;
   /**
    * How much this items counts in the total ranking.
    */
   private BigDecimal weight;

   /**
    * Instantiates a new ranking item.
    */
   public RankingItem()
   {

   }

   /**
    * Instantiates a new ranking item.
    *
    * @param employee the employee
    */
   public RankingItem(Employee employee)
   {
      super(employee);
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
    * Gets the how much this items counts in the total ranking.
    * 
    * @return the how much this items counts in the total ranking
    */
   public BigDecimal getWeight()
   {
      return this.weight;
   }

   /**
    * Sets the how much this items counts in the total ranking.
    * 
    * @param weight the new how much this items counts in the total ranking
    */
   public void setWeight(BigDecimal weight)
   {
      this.weight = weight;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "RankingItem{" + "name='" + this.name + '\'' + ", weight=" + this.weight + '}';
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof RankingItem) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof RankingItem;
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
