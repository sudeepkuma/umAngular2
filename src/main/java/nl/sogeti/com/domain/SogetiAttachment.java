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
 * ????.
 * 
 * @author himtiwar (c) Feb 19, 2015, Sogeti B.V.
 * @version $Id:$
 */
@Entity
@Table(name = "sogeti_attachment")
@AttributeOverride(name = "id", column = @Column(name = "sogeti_attachment_id"))
public class SogetiAttachment extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 6280029246985441978L;

   /** The loyalties. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_loyalties", referencedColumnName = "select_listitem_id")
   private SelectListItem loyalties;

   /** The commitments. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_commitments", referencedColumnName = "select_listitem_id")
   private SelectListItem commitments;

   /** The ambitions. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_ambitions", referencedColumnName = "select_listitem_id")
   private SelectListItem ambitions;

   /** The reward levels. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_rewardlevels", referencedColumnName = "select_listitem_id")
   private SelectListItem rewardLevels;

   /** The general well beings. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_generalwellbeings", referencedColumnName = "select_listitem_id")
   private SelectListItem generalWellBeings;

   /** The lasting relationships. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_lastingrelationships", referencedColumnName = "select_listitem_id")
   private SelectListItem lastingRelationships;

   /**
    * Constructor: create a new SogetiAttachment.
    */
   public SogetiAttachment()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the loyalties.
    * 
    * @return Returns the loyalties as a SelectListItem.
    */
   public SelectListItem getLoyalties()
   {
      return this.loyalties;
   }

   /**
    * Set the loyalties to the specified value.
    * 
    * @param loyalties The loyalties to set.
    */
   public void setLoyalties(SelectListItem loyalties)
   {
      this.loyalties = loyalties;
   }

   /**
    * Get the commitments.
    * 
    * @return Returns the commitments as a SelectListItem.
    */
   public SelectListItem getCommitments()
   {
      return this.commitments;
   }

   /**
    * Set the commitments to the specified value.
    * 
    * @param commitments The commitments to set.
    */
   public void setCommitments(SelectListItem commitments)
   {
      this.commitments = commitments;
   }

   /**
    * Get the ambitions.
    * 
    * @return Returns the ambitions as a SelectListItem.
    */
   public SelectListItem getAmbitions()
   {
      return this.ambitions;
   }

   /**
    * Set the ambitions to the specified value.
    * 
    * @param ambitions The ambitions to set.
    */
   public void setAmbitions(SelectListItem ambitions)
   {
      this.ambitions = ambitions;
   }

   /**
    * Get the rewardLevels.
    * 
    * @return Returns the rewardLevels as a SelectListItem.
    */
   public SelectListItem getRewardLevels()
   {
      return this.rewardLevels;
   }

   /**
    * Set the rewardLevels to the specified value.
    * 
    * @param rewardLevels The rewardLevels to set.
    */
   public void setRewardLevels(SelectListItem rewardLevels)
   {
      this.rewardLevels = rewardLevels;
   }

   /**
    * Get the generalWellBeings.
    * 
    * @return Returns the generalWellBeings as a SelectListItem.
    */
   public SelectListItem getGeneralWellBeings()
   {
      return this.generalWellBeings;
   }

   /**
    * Set the generalWellBeings to the specified value.
    * 
    * @param generalWellBeings The generalWellBeings to set.
    */
   public void setGeneralWellBeings(SelectListItem generalWellBeings)
   {
      this.generalWellBeings = generalWellBeings;
   }

   /**
    * Get the lastingRelationships.
    * 
    * @return Returns the lastingRelationships as a SelectListItem.
    */
   public SelectListItem getLastingRelationships()
   {
      return this.lastingRelationships;
   }

   /**
    * Set the lastingRelationships to the specified value.
    * 
    * @param lastingRelationships The lastingRelationships to set.
    */
   public void setLastingRelationships(SelectListItem lastingRelationships)
   {
      this.lastingRelationships = lastingRelationships;
   }

}
