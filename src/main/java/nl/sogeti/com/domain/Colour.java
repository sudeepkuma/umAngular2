/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 19, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import java.util.Comparator;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * ????.
 * 
 * @author himtiwar (c) Feb 19, 2015, Sogeti B.V.
 * @version $Id:$
 */
@Entity
@Table(name = "colour")
@AttributeOverride(name = "id", column = @Column(name = "colour_id"))
public class Colour extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 3583049578134821535L;

   /** The colour code. */
   private String colourCode;

   /** The colour name. */
   private String colourName;

   /**
    * Constructor: create a new Colour.
    */
   public Colour()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the colourCode.
    * 
    * @return Returns the colourCode as a String.
    */
   public String getColourCode()
   {
      return this.colourCode;
   }

   /**
    * Set the colourCode to the specified value.
    * 
    * @param colourCode The colourCode to set.
    */
   public void setColourCode(String colourCode)
   {
      this.colourCode = colourCode;
   }

   /**
    * Get the colourName.
    * 
    * @return Returns the colourName as a String.
    */
   public String getColourName()
   {
      return this.colourName;
   }

   /**
    * Set the colourName to the specified value.
    * 
    * @param colourName The colourName to set.
    */
   public void setColourName(String colourName)
   {
      this.colourName = colourName;
   }

   /** The name comparator. */
   public static Comparator<Colour> NAME_COMPARATOR = new Comparator<Colour>()
      {
         @Override
         public int compare(Colour o1, Colour o2)
         {
            if (o1.colourName == null)
            {
               return -1;
            }
            if (o2.colourName == null)
            {
               return 1;
            }
            return o1.colourName.compareToIgnoreCase(o2.colourName);
         }
      };

}
