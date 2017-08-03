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

import java.math.BigDecimal;

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
@Table(name = "performance_indicators")
@AttributeOverride(name = "id", column = @Column(name = "performance_indicators_id"))
public class PerformanceIndicators extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -7408993022419701375L;

   /** The productivity. */
   private BigDecimal productivity;

   /** The afford. */
   private BigDecimal afford;

   /** The reward. */
   private BigDecimal reward;

   /** The promotion. */
   private String promotion;

   /** The frequency. */
   private String frequency;

   /** The Employabiltiy. */
   private String strategieEmployability;

   /** The conversations. */
   private String strategieBehoudKans;

   /** The productivity color. */
   private String productivityColor;
   
   /** The reward color. */
   private String rewardColor;
   
   /** The afford color. */
   private String affordColor;
   
   /** The productivity avg. */
   private String productivityAvg;
   
   /** The afford avg. */
   private String affordAvg;
   
   /** The reward avg. */
   private String rewardAvg;

   /**
    * Constructor: create a new PerformanceIndicators.
    */
   public PerformanceIndicators()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the productivity.
    * 
    * @return Returns the productivity as a BigDecimal.
    */
   public BigDecimal getProductivity()
   {
      return this.productivity;
   }

   /**
    * Set the productivity to the specified value.
    * 
    * @param productivity The productivity to set.
    */
   public void setProductivity(BigDecimal productivity)
   {
      this.productivity = productivity;
   }

   /**
    * Get the afford.
    * 
    * @return Returns the afford as a BigDecimal.
    */
   public BigDecimal getAfford()
   {
      return this.afford;
   }

   /**
    * Set the afford to the specified value.
    * 
    * @param afford The afford to set.
    */
   public void setAfford(BigDecimal afford)
   {
      this.afford = afford;
   }

   /**
    * Get the reward.
    * 
    * @return Returns the reward as a BigDecimal.
    */
   public BigDecimal getReward()
   {
      return this.reward;
   }

   /**
    * Set the reward to the specified value.
    * 
    * @param reward The reward to set.
    */
   public void setReward(BigDecimal reward)
   {
      this.reward = reward;
   }

   /**
    * Get the promotion.
    * 
    * @return Returns the promotion as a String.
    */
   public String getPromotion()
   {
      return this.promotion;
   }

   /**
    * Set the promotion to the specified value.
    * 
    * @param promotion The promotion to set.
    */
   public void setPromotion(String promotion)
   {
      this.promotion = promotion;
   }

   /**
    * Get the frequency.
    * 
    * @return Returns the frequency as a String.
    */
   public String getFrequency()
   {
      return this.frequency;
   }

   /**
    * Set the frequency to the specified value.
    * 
    * @param frequency The frequency to set.
    */
   public void setFrequency(String frequency)
   {
      this.frequency = frequency;
   }

   /**
    * Gets the strategie employability.
    * 
    * @return the strategie employability
    */
   public String getStrategieEmployability()
   {
      return strategieEmployability;
   }

   /**
    * Sets the strategie employability.
    * 
    * @param strategieEmployability the new strategie employability
    */
   public void setStrategieEmployability(String strategieEmployability)
   {
      this.strategieEmployability = strategieEmployability;
   }

   /**
    * Gets the strategie behoud kans.
    * 
    * @return the strategie behoud kans
    */
   public String getStrategieBehoudKans()
   {
      return strategieBehoudKans;
   }

   /**
    * Sets the strategie behoud kans.
    * 
    * @param strategieBehoudKans the new strategie behoud kans
    */
   public void setStrategieBehoudKans(String strategieBehoudKans)
   {
      this.strategieBehoudKans = strategieBehoudKans;
   }

   /**
    * Gets the productivity color.
    *
    * @return the productivity color
    */
   public String getProductivityColor()
   {
      return productivityColor;
   }

   /**
    * Sets the productivity color.
    *
    * @param productivityColor the new productivity color
    */
   public void setProductivityColor(String productivityColor)
   {
      this.productivityColor = productivityColor;
   }

   /**
    * Gets the reward color.
    *
    * @return the reward color
    */
   public String getRewardColor()
   {
      return rewardColor;
   }

   /**
    * Sets the reward color.
    *
    * @param rewardColor the new reward color
    */
   public void setRewardColor(String rewardColor)
   {
      this.rewardColor = rewardColor;
   }

   /**
    * Gets the afford color.
    *
    * @return the afford color
    */
   public String getAffordColor()
   {
      return affordColor;
   }

   /**
    * Sets the afford color.
    *
    * @param affordColor the new afford color
    */
   public void setAffordColor(String affordColor)
   {
      this.affordColor = affordColor;
   }

   /**
    * Gets the productivity avg.
    *
    * @return the productivity avg
    */
   public String getProductivityAvg()
   {
      return productivityAvg;
   }

   /**
    * Sets the productivity avg.
    *
    * @param productivityAvg the new productivity avg
    */
   public void setProductivityAvg(String productivityAvg)
   {
      this.productivityAvg = productivityAvg;
   }

   /**
    * Gets the afford avg.
    *
    * @return the afford avg
    */
   public String getAffordAvg()
   {
      return affordAvg;
   }

   /**
    * Sets the afford avg.
    *
    * @param affordAvg the new afford avg
    */
   public void setAffordAvg(String affordAvg)
   {
      this.affordAvg = affordAvg;
   }

   /**
    * Gets the reward avg.
    *
    * @return the reward avg
    */
   public String getRewardAvg()
   {
      return rewardAvg;
   }

   /**
    * Sets the reward avg.
    *
    * @param rewardAvg the new reward avg
    */
   public void setRewardAvg(String rewardAvg)
   {
      this.rewardAvg = rewardAvg;
   }

}
