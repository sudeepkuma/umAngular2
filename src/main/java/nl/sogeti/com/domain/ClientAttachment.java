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
@Table(name = "client_attachment")
@AttributeOverride(name = "id", column = @Column(name = "client_attachment_id"))
public class ClientAttachment extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1674147651911271639L;

   /** The performances. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "client_attachment_performances", referencedColumnName = "select_listitem_id")
   private SelectListItem performances;

   /** The levels. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "client_attachment_levels", referencedColumnName = "select_listitem_id")
   private SelectListItem levels;

   /** The travel times. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "client_attachment_traveltimes", referencedColumnName = "select_listitem_id")
   private SelectListItem travelTimes;

   /** The satisfactions. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "client_attachment_satisfactions", referencedColumnName = "select_listitem_id")
   private SelectListItem satisfactions;

   /** The chance of leavings. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "client_attachment_chanceof_leavings", referencedColumnName = "select_listitem_id")
   private SelectListItem chanceOfLeavings;

   /**
    * Constructor: create a new ClientAttachment.
    */
   public ClientAttachment()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the performances.
    * 
    * @return Returns the performances as a SelectListItem.
    */
   public SelectListItem getPerformances()
   {
      return this.performances;
   }

   /**
    * Set the performances to the specified value.
    * 
    * @param performances The performances to set.
    */
   public void setPerformances(SelectListItem performances)
   {
      this.performances = performances;
   }

   /**
    * Get the levels.
    * 
    * @return Returns the levels as a SelectListItem.
    */
   public SelectListItem getLevels()
   {
      return this.levels;
   }

   /**
    * Set the levels to the specified value.
    * 
    * @param levels The levels to set.
    */
   public void setLevels(SelectListItem levels)
   {
      this.levels = levels;
   }

   /**
    * Get the travelTimes.
    * 
    * @return Returns the travelTimes as a SelectListItem.
    */
   public SelectListItem getTravelTimes()
   {
      return this.travelTimes;
   }

   /**
    * Set the travelTimes to the specified value.
    * 
    * @param travelTimes The travelTimes to set.
    */
   public void setTravelTimes(SelectListItem travelTimes)
   {
      this.travelTimes = travelTimes;
   }

   /**
    * Get the satisfactions.
    * 
    * @return Returns the satisfactions as a SelectListItem.
    */
   public SelectListItem getSatisfactions()
   {
      return this.satisfactions;
   }

   /**
    * Set the satisfactions to the specified value.
    * 
    * @param satisfactions The satisfactions to set.
    */
   public void setSatisfactions(SelectListItem satisfactions)
   {
      this.satisfactions = satisfactions;
   }

   /**
    * Get the chanceOfLeavings.
    * 
    * @return Returns the chanceOfLeavings as a SelectListItem.
    */
   public SelectListItem getChanceOfLeavings()
   {
      return this.chanceOfLeavings;
   }

   /**
    * Set the chanceOfLeavings to the specified value.
    * 
    * @param chanceOfLeavings The chanceOfLeavings to set.
    */
   public void setChanceOfLeavings(SelectListItem chanceOfLeavings)
   {
      this.chanceOfLeavings = chanceOfLeavings;
   }

}
