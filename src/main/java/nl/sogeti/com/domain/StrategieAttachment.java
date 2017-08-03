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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc

/**
 * The Class StrategieAttachment.
 */
@Entity
@Table(name = "strategie_attachment")
@AttributeOverride(name = "id", column = @Column(name = "strategie_attachment_id"))
public class StrategieAttachment extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 5532614931021408011L;

   /** The strategy loyalties. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "strategie_attachment_loyaliteit", referencedColumnName = "select_listitem_id")
   private SelectListItem strategieLoyaliteit;

   /** The opportunities. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "strategie_attachment_inzetkansen", referencedColumnName = "select_listitem_id")
   private SelectListItem strategieInzetkansen;

   /** The generals. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "strategie_attachment_algemene", referencedColumnName = "select_listitem_id")
   private SelectListItem strategieAlgemenePerformance;

   /**
    * Constructor: create a new StrategieAttachment.
    */
   public StrategieAttachment()
   {
   }

   /**
    * Gets the strategie loyaliteit.
    * 
    * @return the strategie loyaliteit
    */
   public SelectListItem getStrategieLoyaliteit()
   {
      return strategieLoyaliteit;
   }

   /**
    * Sets the strategie loyaliteit.
    * 
    * @param strategieLoyaliteit the new strategie loyaliteit
    */
   public void setStrategieLoyaliteit(SelectListItem strategieLoyaliteit)
   {
      this.strategieLoyaliteit = strategieLoyaliteit;
   }

   /**
    * Gets the strategie inzetkansen.
    * 
    * @return the strategie inzetkansen
    */
   public SelectListItem getStrategieInzetkansen()
   {
      return strategieInzetkansen;
   }

   /**
    * Sets the strategie inzetkansen.
    * 
    * @param strategieInzetkansen the new strategie inzetkansen
    */
   public void setStrategieInzetkansen(SelectListItem strategieInzetkansen)
   {
      this.strategieInzetkansen = strategieInzetkansen;
   }

   /**
    * Gets the strategie algemene performance.
    * 
    * @return the strategie algemene performance
    */
   public SelectListItem getStrategieAlgemenePerformance()
   {
      return strategieAlgemenePerformance;
   }

   /**
    * Sets the strategie algemene performance.
    * 
    * @param strategieAlgemenePerformance the new strategie algemene performance
    */
   public void setStrategieAlgemenePerformance(SelectListItem strategieAlgemenePerformance)
   {
      this.strategieAlgemenePerformance = strategieAlgemenePerformance;
   }

}
