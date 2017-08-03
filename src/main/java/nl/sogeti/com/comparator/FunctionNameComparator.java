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
 * This class sorts functionnames. It needs to be a Comparator<Object> as Primefaces requires it.
 * <p/>
 * It compares the names using normal string comparison but case insensitive and ignoring spaces.
 */
@SuppressWarnings("serial")
@Model
public class FunctionNameComparator implements Comparator<Object>, Serializable
{

   /**
    * Compares the two objects. They need to be Strings!. It ingores the case and spaces.
    * 
    * @param o1 object1
    * @param o2 object2
    * @return whether o1 is bigger than o2
    */
   @Override
   public int compare(Object o1, Object o2)
   {
      String levelOne = normalize(o1);
      String levelTwo = normalize(o2);

      return levelOne.compareToIgnoreCase(levelTwo);

   }

   /**
    * Normalize.
    * 
    * @param o1 the o1
    * @return the string
    */
   private String normalize(Object o1)
   {
      return ((String) o1).replaceAll(" ", "");
   }
}
