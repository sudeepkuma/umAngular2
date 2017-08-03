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
package nl.sogeti.com.util;

import java.util.Date;

import nl.sogeti.com.domain.*;
import nl.sogeti.com.enums.NotificationLevel;

import org.joda.time.DateMidnight;
import org.joda.time.Days;

/**
 * This class calculates if a Date is in a certain range.
 */
public class NotificationConverter
{

   /**
    * Convert.
    * 
    * @param value the value
    * @param setting the setting
    * @return the notification level
    * @see NotificationConverter:convert(Date, DateSetting)
    */
   public static NotificationLevel convert(Date value, DateSetting setting)
   {
      DateMidnight date = new DateMidnight(value);

      // we should assume its long ago, before handling now
      if (value == null)
      {
         date = date.minusDays(999);
      }

      return convert(date, setting);
   }

   /**
    * This method calculates if the given date is in the range specified in the DateSetting.
    * 
    * @param notedate the notedate
    * @param setting The setting where the range is stored
    * @return 0 (normal) if the date is before or equal to the "before" setting, 1 (good) if the date is after the "before" setting but before or equal to the "middle" setting, 2 (warning) if the date
    *         is after the "middle" setting but before or equal to the "after" setting, else 3 (bad)
    */
   public static NotificationLevel convert(DateMidnight notedate, DateSetting setting)
   {
      int difference = numberOfDaysAgo(notedate);

      if (setting == null)
      {
         return NotificationLevel.NORMAL;
      }
      else if (difference < setting.getBefore())
      {
         return NotificationLevel.NORMAL;
      }
      else if (difference < setting.getMiddle())
      {
         return NotificationLevel.GOOD;
      }
      else if (difference < setting.getAfter())
      {
         return NotificationLevel.WARNING;
      }
      else
      {
         return NotificationLevel.ERROR;
      }
   }

   /**
    * Number of days ago.
    * 
    * @param notedate the notedate
    * @return the int
    */
   private static int numberOfDaysAgo(DateMidnight notedate)
   {
      DateMidnight date = notedate != null ? notedate : new DateMidnight();

      DateMidnight now = new DateMidnight();
      return Days.daysBetween(date, now).getDays();
   }
}
