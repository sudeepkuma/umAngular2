/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 6, 2015 Sogeti Nederland B.V. All Rights Reserved.
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
//TODO: Auto-generated Javadoc
/**
 * ????.
 * 
 * @author himtiwar (c) May 4, 2015, Sogeti B.V.
 * @version $Id:$
 */

@Entity
@Table(name = "seiimportstatus")
@AttributeOverride(name = "id", column = @Column(name = "status_id"))
public class SEIImportStatus extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -1013159455862951243L;

   /** The till date. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date statusDate;

   /** The stauts. */
   private String stauts;

   /**
    * Get the statusDate.
    * 
    * @return Returns the statusDate as a Date.
    */
   public Date getStatusDate()
   {
      return this.statusDate;
   }

   /**
    * Set the statusDate to the specified value.
    * 
    * @param statusDate The statusDate to set.
    */
   public void setStatusDate(Date statusDate)
   {
      this.statusDate = statusDate;
   }

   /**
    * Get the stauts.
    * 
    * @return Returns the stauts as a String.
    */
   public String getStauts()
   {
      return this.stauts;
   }

   /**
    * Set the stauts to the specified value.
    * 
    * @param stauts The stauts to set.
    */
   public void setStauts(String stauts)
   {
      this.stauts = stauts;
   }

}
