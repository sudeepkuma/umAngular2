/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Sep 1, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.comparator;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * ????
 * 
 * @version $Id:$
 * @author mkangule (c) Sep 1, 2015, Sogeti B.V.
 */
public class ValueComparator implements Comparator<Long>,Serializable
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 3856136360853438268L;
   Map<Long, String> map;

   public ValueComparator(HashMap<Long, String> param)
   {
      this.map = param;
   }

   public int compare(Long a, Long b)
   {
      return map.get(a).compareTo(map.get(b));
   }
}
