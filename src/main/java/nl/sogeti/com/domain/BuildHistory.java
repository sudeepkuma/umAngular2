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

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Type;

// TODO: Auto-generated Javadoc
/**
 * This class represents a certificate. As in a piece of paper which you get after proven a skill at some level.
 */
@Entity
@Table(name = "buildHistory")
@AttributeOverride(name = "id", column = @Column(name = "buildHistory_id"))
public class BuildHistory extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -4062996644996039784L;

   private String bulidVersion;

   private Date deploymentDate;

   @Lob
   @Type(type = "org.hibernate.type.StringClobType")
   private String discripstion;

   /**
    * Get the bulidVersion.
    * 
    * @return Returns the bulidVersion as a String.
    */
   public String getBulidVersion()
   {
      return this.bulidVersion;
   }

   /**
    * Set the bulidVersion to the specified value.
    * 
    * @param bulidVersion The bulidVersion to set.
    */
   public void setBulidVersion(String bulidVersion)
   {
      this.bulidVersion = bulidVersion;
   }

   /**
    * Get the deploymentDate.
    * 
    * @return Returns the deploymentDate as a Date.
    */
   public Date getDeploymentDate()
   {
      return this.deploymentDate;
   }

   /**
    * Set the deploymentDate to the specified value.
    * 
    * @param deploymentDate The deploymentDate to set.
    */
   public void setDeploymentDate(Date deploymentDate)
   {
      this.deploymentDate = deploymentDate;
   }

   /**
    * Get the discripstion.
    * 
    * @return Returns the discripstion as a String.
    */
   public String getDiscripstion()
   {
      return this.discripstion;
     
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
