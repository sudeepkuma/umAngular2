/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: cremerma
 ** Copyright: (c) 27 feb. 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.comparator;

/**
 * Simplified compair.
 * 
 * @author cremerma (c) 27 feb. 2014, Sogeti B.V.
 * @version $Id:$
 */
public class InnerCompare
{

   /**
    * This class checks if the given objects are Null (taking the need to do this in evry class away).<br>
    * one == null && other == null returns 0<br>
    * one == null returns -1<br>
    * other == null returns 1<br>
    * if objects are not null returns NULL<br>
    * 
    * @param one the one
    * @param other the other
    * @return the integer
    */
   public static Integer innerCompare(Object one, Object other)
   {
      if (one == null && other == null)
      {
         return 0;
      }
      if (one == null)
      {
         return -1;
      }
      if (other == null)
      {
         return 1;
      }
      return null;
   }
}
