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
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * ????.
 * 
 * @author himtiwar (c) Feb 19, 2015, Sogeti B.V.
 * @version $Id:$
 */
@Entity
@Table(name = "calculated_performance_indicators")
@AttributeOverride(name = "id", column = @Column(name = "calculated_performance_indicators_id"))
public class CalculatedPerformanceIndicators extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -7408993022419701375L;

   /** The employeeid. */
   private long employeeid;

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

   @Temporal(TemporalType.TIMESTAMP)
   private Date calculationdate;

   /**
    * Constructor: create a new PerformanceIndicators.
    */
   public CalculatedPerformanceIndicators()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the employeeid.
    * 
    * @return Returns the employeeid as a long.
    */
   public long getEmployeeid()
   {
      return this.employeeid;
   }

   /**
    * Set the employeeid to the specified value.
    * 
    * @param employeeid The employeeid to set.
    */
   public void setEmployeeid(long employeeid)
   {
      this.employeeid = employeeid;
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

   public Date getCalculationdate()
   {
      return calculationdate;
   }

   public void setCalculationdate(Date calculationdate)
   {
      this.calculationdate = calculationdate;
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

}
