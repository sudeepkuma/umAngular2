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

import java.math.BigDecimal;
import java.util.Map;

import nl.sogeti.com.domain.RankingItem;

/**
 * The Class RatingCalculator.
 */
public class RatingCalculator
{

   /**
    * Invoke.
    * 
    * @param ratings the ratings
    * @return the big decimal
    */
   public static BigDecimal invoke(Map<RankingItem, Integer> ratings)
   {
      BigDecimal totalRating = BigDecimal.ZERO;
      for (Map.Entry<RankingItem, Integer> entry : ratings.entrySet())
      {
         BigDecimal singleRating = entry.getKey().getWeight().multiply(new BigDecimal(entry.getValue()));
         totalRating = totalRating.add(singleRating);
      }
      return totalRating;
   }
}
