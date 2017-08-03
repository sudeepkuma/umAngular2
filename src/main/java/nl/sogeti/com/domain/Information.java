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
@Table(name = "information")
@AttributeOverride(name = "id", column = @Column(name = "information_id"))
public class Information extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 3583049578134821535L;

   /** The colour code. */
   private String lable;

   /** The description. */
   private String description;

   /**
    * Constructor: create a new Colour.
    */
   public Information()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the lable.
    * 
    * @return Returns the lable as a String.
    */
   public String getLable()
   {
      return this.lable;
   }

   /**
    * Set the lable to the specified value.
    * 
    * @param lable The lable to set.
    */
   public void setLable(String lable)
   {
      this.lable = lable;
   }

   /**
    * Get the description.
    * 
    * @return Returns the description as a String.
    */
   public String getDescription()
   {
      return this.description;
   }

   /**
    * Set the description to the specified value.
    * 
    * @param description The description to set.
    */
   public void setDescription(String description)
   {
      this.description = description;
   }

}
