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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * This entity represents a row in the grow model of the Young Professionals.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "growmodelelements")
@AttributeOverride(name = "id", column = @Column(name = "growmodelelement_id"))
public class GrowModelElement extends AbstractEntity implements Comparable<GrowModelElement>
{

   /**
    * This enum contains the possible values for the type of GrowModelElement.
    */
   public enum Type
   {

      /** The bl. */
      BL,
      /** The fv. */
      FV,
      /** The pr. */
      PR,
      /** The fv pr. */
      FV_PR
   }

   /**
    * The number of months before this element is applied.
    */
   private int moment;
   /**
    * The type of this element.
    */
   @Enumerated(EnumType.STRING)
   private Type type;
   /**
    * The increase in pay the YP will get.
    */
   private int incrementBasePay;
   /**
    * The increase in bonus the YP will get.
    */
   private int incrementBonus;
   /**
    * The parent tab.
    */
   @ManyToOne
   @JoinColumn(name = "growmodeltab_id")
   private GrowModelTab column;

   /** private long elementId; *. */
   @Transient
   private long elementId;

   /**
    * Constructor: create a new GrowModelElement.
    */
   public GrowModelElement()
   {
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "GrowModelElement{" + "incrementBasePay=" + this.incrementBasePay + ", incrementBonus=" + this.incrementBonus + ", moment=" + this.moment + ", type=" + this.type + '}';
   }

   /**
    * Gets the number of months before this element is applied.
    * 
    * @return the number of months before this element is applied
    */
   public int getMoment()
   {
      return this.moment;
   }

   /**
    * Sets the number of months before this element is applied.
    * 
    * @param moment the new number of months before this element is applied
    */
   public void setMoment(int moment)
   {
      this.moment = moment;
   }

   /**
    * Gets the type of this element.
    * 
    * @return the type of this element
    */
   public Type getType()
   {
      return this.type;
   }

   /**
    * Sets the type of this element.
    * 
    * @param type the new type of this element
    */
   public void setType(Type type)
   {
      this.type = type;
   }

   /**
    * Gets the increase in pay the YP will get.
    * 
    * @return the increase in pay the YP will get
    */
   public int getIncrementBasePay()
   {
      return this.incrementBasePay;
   }

   /**
    * Sets the increase in pay the YP will get.
    * 
    * @param incrementBasePay the new increase in pay the YP will get
    */
   public void setIncrementBasePay(int incrementBasePay)
   {
      this.incrementBasePay = incrementBasePay;
   }

   /**
    * Gets the increase in bonus the YP will get.
    * 
    * @return the increase in bonus the YP will get
    */
   public int getIncrementBonus()
   {
      return this.incrementBonus;
   }

   /**
    * Sets the increase in bonus the YP will get.
    * 
    * @param incrementBonus the new increase in bonus the YP will get
    */
   public void setIncrementBonus(int incrementBonus)
   {
      this.incrementBonus = incrementBonus;
   }

   /**
    * Gets the parent tab.
    * 
    * @return the parent tab
    */
   public GrowModelTab getColumn()
   {
      return this.column;
   }

   /**
    * Sets the parent tab.
    * 
    * @param column the new parent tab
    */
   public void setColumn(GrowModelTab column)
   {
      this.column = column;
   }

   /**
    * Sets the element.
    * 
    * @param gMEDTO the new element
    */
   public void setElement(GrowModelElement gMEDTO)
   {
      this.incrementBasePay = gMEDTO.getIncrementBasePay();
      this.incrementBonus = gMEDTO.getIncrementBonus();
      this.type = gMEDTO.getType();
   }

   /**
    * Gets the private long elementId; *.
    * 
    * @return the private long elementId; *
    */
   public long getElementId()
   {
      return this.elementId;
   }

   /**
    * Sets the private long elementId; *.
    * 
    * @param elementId the new private long elementId; *
    */
   public void setElementId(long elementId)
   {
      this.elementId = elementId;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof GrowModelElement) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof GrowModelElement;
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

   /*
    * (non-Javadoc)
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(GrowModelElement o)
   {
      return getMoment() - o.getMoment();
   }
}
