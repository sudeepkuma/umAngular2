/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Nov 24, 2014 Sogeti Nederland B.V. All Rights Reserved.
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

import javax.enterprise.inject.Model;

/**
 * This class sorts functionlevels (P1, P2, ..., P10). It needs to be a Comparator<Object> and not a Comparator<String> as Primefaces only accepts it in the former form.
 */
@SuppressWarnings("serial")
@Model
public class FunctionLevelComparator implements Comparator<Object>, Serializable
{

   /**
    * This method sorts functionlevels from P1 to P10.
    * 
    * @param one The first functionlevel to compare
    * @param two The second functionlevel to compare
    * @return if one is higher than two
    */
   @Override
   public int compare(Object one, Object two)
   {
      if (!(one instanceof String) || !(two instanceof String))
      {
         return -1;
      }

      String s1 = (String) one;
      String s2 = (String) two;

      if (s1.length() > s2.length())
      {
         return 1;
      }
      if (s1.length() < s2.length())
      {
         return -1;
      }

      return s1.compareTo(s2);
   }
}
