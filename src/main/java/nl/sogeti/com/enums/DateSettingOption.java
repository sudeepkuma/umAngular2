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
 * This enum contains all the keys for the date settings.
 */
public enum DateSettingOption
{

   /** The pop. */
   POP,
   /** The fb. */
   FB,
   /** The fv. */
   FV,
   /** The ob. */
   OB,
   /** The pg. */
   PG,
   /** The cv. */
   CV,
   /** The cv p. */
   CV_P("CV paspoort"),
   /** The eindeinzet. */
   EINDEINZET("Einde Inzet"),
   /** The jubilee. */
   JUBILEE,
   /** The birthdate. */
   BIRTHDATE,
   /** The pr. */
   PR,

   /** The sei. */
   SEI,
   /** The kg. */
   KG;

   /** The label. */
   private String label;

   /**
    * Instantiates a new date setting option.
    */
   DateSettingOption()
   {
      this.label = toString();
   }

   /**
    * Instantiates a new date setting option.
    * 
    * @param label the label
    */
   DateSettingOption(String label)
   {
      this.label = label;
   }

   /**
    * Gets the label.
    * 
    * @return the label
    */
   public String getLabel()
   {
      return this.label;
   }
}