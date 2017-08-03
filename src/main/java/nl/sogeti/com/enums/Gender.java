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
package nl.sogeti.com.enums;

/**
 * This class represents the gender of an human. E.g. MALE or FEMALE
 */
public enum Gender
{
   
   /** The male. */
   MALE(0), 
 /** The female. */
 FEMALE(1), 
 /** The unknown. */
 UNKNOWN(2);

   /** The ordinal. */
   private int ordinal;

   /**
    * Instantiates a new gender.
    *
    * @param ordinal the ordinal
    */
   Gender(int ordinal)
   {
      this.ordinal = ordinal;
   }

   /**
    * Gets the value.
    *
    * @return the value
    */
   public int getValue()
   {
      return ordinal;
   }

   /**
    * Parses the.
    *
    * @param id the id
    * @return the gender
    */
   public static Gender parse(int id)
   {
      Gender right = null; // Default
      for (Gender item : Gender.values())
      {
         if (item.getValue() == id)
         {
            right = item;
            break;
         }
      }
      return right;
   }
}
