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
import javax.persistence.Transient;

import nl.sogeti.com.enums.DateSettingOption;

/**
 * This entity allows to persist 4 ranges of dates; The first range is up to the 'before' value The second range is between the 'before' and 'middle' values The third range is between the 'middle' and
 * 'after' values The fourth range is after the 'after' value.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "datesettings")
@AttributeOverride(name = "id", column = @Column(name = "datesetting_id"))
public class DateSetting extends AbstractEntity
{

   /** The before value. */
   private int before;

   /** The middle value. */
   private int middle;

   /** The after value. */
   private int after;

   /** The key. */
   @Transient
   private DateSettingOption key;

   /**
    * Instantiates a new date setting.
    * 
    * @param before the before
    * @param middle the middle
    * @param after the after
    */
   public DateSetting(int before, int middle, int after)
   {
      this.before = before;
      this.middle = middle;
      this.after = after;
   }

   /**
    * Instantiates a new date setting.
    *
    * @param key the key
    * @param setting the setting
    */
   public DateSetting(DateSettingOption key, DateSetting setting)
   {
      this.key = key;

      if (setting != null)
      {
         this.before = setting.getBefore();
         this.middle = setting.getMiddle();
         this.after = setting.getAfter();
      }
   }

   /**
    * Do NOT use this constructor. We now supply three values instead of two
    * 
    * @param before the before
    * @param after the after
    */
   @Deprecated
   public DateSetting(int before, int after)
   {
      this.before = before;
      this.after = after;
   }

   /**
    * Instantiates a new date setting.
    */
   public DateSetting()
   {
   }

   /**
    * Gets the before value.
    * 
    * @return the before value
    */
   public int getBefore()
   {
      return this.before;
   }

   /**
    * Gets the middle value.
    * 
    * @return the middle value
    */
   public int getMiddle()
   {
      return this.middle;
   }

   /**
    * Gets the after value.
    * 
    * @return the after value
    */
   public int getAfter()
   {
      return this.after;
   }

   /**
    * Sets the before value.
    * 
    * @param before the new before value
    */
   public void setBefore(int before)
   {
      this.before = before;
   }

   /**
    * Sets the middle value.
    * 
    * @param middle the new middle value
    */
   public void setMiddle(int middle)
   {
      this.middle = middle;
   }

   /**
    * Sets the after value.
    * 
    * @param after the new after value
    */
   public void setAfter(int after)
   {
      this.after = after;
   }

   /**
    * Get the key.
    * 
    * @return Returns the key as a DateSettingOption.
    */
   public DateSettingOption getKey()
   {
      return this.key;
   }

   /**
    * Set the key to the specified value.
    * 
    * @param key The key to set.
    */
   public void setKey(DateSettingOption key)
   {
      this.key = key;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof DateSetting) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof DateSetting;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }
}
