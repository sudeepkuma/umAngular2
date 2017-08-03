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

/**
 * The Class Util.
 */
public final class Util
{

   /**
    * Hide utility class constructor.
    */
   private Util()
   {
   }

   /**
    * Clones a java.util.Date object without having to cast it.
    * 
    * @param obj A date
    * @return A clone of the given date, or null if the given date is null.
    */
   public static Date copy(Date obj)
   {
      return obj == null ? null : (Date) obj.clone();
   }

   /**
    * Gets the time diffe.
    * 
    * @param date1 the date1
    * @param date2 the date2
    * @return the time diffe
    */
   public static String getTimeDiffe(Date date1, Date date2)
   {
      long diff = date1.getTime() - date2.getTime();
      diff /= 1000;
      int totalmins = (Long.valueOf(diff / 60)).intValue();
      int totalhrs = (Long.valueOf(diff / 3600)).intValue();
      long sec, min;
      sec = diff - (totalmins) * 60;
      min = totalmins - Long.valueOf(((totalmins) / 60)).intValue() * 60;

      StringBuilder string = new StringBuilder();

      string.append(totalhrs).append(" H : ").append(min).append(" M : ").append(sec).append(" S");

      return string.toString();

   }

   /**
    * Calculate difference.
    * 
    * @param a the d1
    * @param b the d2
    * @return the long
    */

   public static long calculateDifference(Date d1, Date d2)
   {

      long diff = d2.getTime() - d1.getTime();

      long diffDays = diff / (24 * 60 * 60 * 1000);

      return diffDays;
   }
   
   public static int minutesDiff(Date earlierDate, Date laterDate)
   {
      if (earlierDate == null || laterDate == null)
         return 0;

      return (int) ((laterDate.getTime() / 60000) - (earlierDate.getTime() / 60000));
   }

}
