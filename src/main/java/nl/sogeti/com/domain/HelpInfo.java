/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) June 04, 2015 Sogeti Nederland B.V. All Rights Reserved.
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
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

// TODO: Auto-generated Javadoc
/**
 * This class represents a certificate. As in a piece of paper which you get after proven a skill at some level.
 */
@Entity
@Table(name = "helpInfo")
@AttributeOverride(name = "id", column = @Column(name = "helpInfo_id"))
public class HelpInfo extends AbstractEntity
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = -6864589741396620033L;

   private String lable;
   @Lob
   @Type(type = "org.hibernate.type.StringClobType")
   private String discripstion;
   
   
   
 
   /**
    * Get the lable.
    *
    * @return Returns the lable as a String.
    */
   public String getLable()
   {
      return lable;
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
    * Get the discripstion.
    *
    * @return Returns the discripstion as a String.
    */
   public String getDiscripstion()
   {
      return discripstion;
   }
   /**
    * Set the discripstion to the specified value.
    *
    * @param discripstion The discripstion to set.
    */
   public void setDiscripstion(String discripstion)
   {
      this.discripstion = discripstion;
   }


 
}
