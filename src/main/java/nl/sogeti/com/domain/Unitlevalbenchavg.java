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
 * The Class Unitlevalbenchavg.
 */
@Entity
@Table(name = "unitlevalbenchavg")
@AttributeOverride(name = "id", column = @Column(name = "unitlevalbenchavg_id"))
public class Unitlevalbenchavg extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The unit_id. */
   private long unit_id;

   /** The productivity. */
   private BigDecimal productivityAvg;

   /** The afford. */
   private BigDecimal affordAvg;

   /** The reward. */
   private BigDecimal rewardAvg;

   /** The promotion. */
   private String promotionAvg;

   /** The frequency. */
   private String frequencyAvg;

   /** The avg calculation date. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date avgCalculationDate;

   /**
    * Gets the productivity avg.
    * 
    * @return the productivity avg
    */
   public BigDecimal getProductivityAvg()
   {
      return this.productivityAvg;
   }

   /**
    * Sets the productivity avg.
    * 
    * @param productivityAvg the new productivity avg
    */
   public void setProductivityAvg(BigDecimal productivityAvg)
   {
      this.productivityAvg = productivityAvg;
   }

   /**
    * Gets the afford avg.
    * 
    * @return the afford avg
    */
   public BigDecimal getAffordAvg()
   {
      return this.affordAvg;
   }

   /**
    * Sets the afford avg.
    * 
    * @param affordAvg the new afford avg
    */
   public void setAffordAvg(BigDecimal affordAvg)
   {
      this.affordAvg = affordAvg;
   }

   /**
    * Gets the reward avg.
    * 
    * @return the reward avg
    */
   public BigDecimal getRewardAvg()
   {
      return this.rewardAvg;
   }

   /**
    * Sets the reward avg.
    * 
    * @param rewardAvg the new reward avg
    */
   public void setRewardAvg(BigDecimal rewardAvg)
   {
      this.rewardAvg = rewardAvg;
   }

   /**
    * Gets the frequency avg.
    * 
    * @return the frequency avg
    */
   public String getFrequencyAvg()
   {
      return this.frequencyAvg;
   }

   /**
    * Sets the frequency avg.
    * 
    * @param frequencyAvg the new frequency avg
    */
   public void setFrequencyAvg(String frequencyAvg)
   {
      this.frequencyAvg = frequencyAvg;
   }

   /**
    * Gets the avg calculation date.
    * 
    * @return the avg calculation date
    */
   public Date getAvgCalculationDate()
   {
      return this.avgCalculationDate;
   }

   /**
    * Sets the avg calculation date.
    * 
    * @param avgCalculationDate the new avg calculation date
    */
   public void setAvgCalculationDate(Date avgCalculationDate)
   {
      this.avgCalculationDate = avgCalculationDate;
   }

   /**
    * Gets the promotion avg.
    * 
    * @return the promotion avg
    */
   public String getPromotionAvg()
   {
      return this.promotionAvg;
   }

   /**
    * Sets the promotion avg.
    * 
    * @param promotionAvg the new promotion avg
    */
   public void setPromotionAvg(String promotionAvg)
   {
      this.promotionAvg = promotionAvg;
   }

   /**
    * Gets the unit_id.
    * 
    * @return the unit_id
    */
   public long getUnit_id()
   {
      return this.unit_id;
   }

   /**
    * Sets the unit_id.
    * 
    * @param unit_id the new unit_id
    */
   public void setUnit_id(long unit_id)
   {
      this.unit_id = unit_id;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((this.affordAvg == null) ? 0 : this.affordAvg.hashCode());
      result = prime * result + ((this.avgCalculationDate == null) ? 0 : this.avgCalculationDate.hashCode());
      result = prime * result + ((this.frequencyAvg == null) ? 0 : this.frequencyAvg.hashCode());
      result = prime * result + ((this.productivityAvg == null) ? 0 : this.productivityAvg.hashCode());
      result = prime * result + ((this.promotionAvg == null) ? 0 : this.promotionAvg.hashCode());
      result = prime * result + ((this.rewardAvg == null) ? 0 : this.rewardAvg.hashCode());
      result = prime * result + (int) (this.unit_id ^ (this.unit_id >>> 32));
      return result;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (!super.equals(obj))
      {
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      Unitlevalbenchavg other = (Unitlevalbenchavg) obj;
      if (this.affordAvg == null)
      {
         if (other.affordAvg != null)
         {
            return false;
         }
      }
      else if (!this.affordAvg.equals(other.affordAvg))
      {
         return false;
      }
      if (this.avgCalculationDate == null)
      {
         if (other.avgCalculationDate != null)
         {
            return false;
         }
      }
      else if (!this.avgCalculationDate.equals(other.avgCalculationDate))
      {
         return false;
      }
      if (this.frequencyAvg == null)
      {
         if (other.frequencyAvg != null)
         {
            return false;
         }
      }
      else if (!this.frequencyAvg.equals(other.frequencyAvg))
      {
         return false;
      }
      if (this.productivityAvg == null)
      {
         if (other.productivityAvg != null)
         {
            return false;
         }
      }
      else if (!this.productivityAvg.equals(other.productivityAvg))
      {
         return false;
      }
      if (this.promotionAvg == null)
      {
         if (other.promotionAvg != null)
         {
            return false;
         }
      }
      else if (!this.promotionAvg.equals(other.promotionAvg))
      {
         return false;
      }
      if (this.rewardAvg == null)
      {
         if (other.rewardAvg != null)
         {
            return false;
         }
      }
      else if (!this.rewardAvg.equals(other.rewardAvg))
      {
         return false;
      }
      if (this.unit_id != other.unit_id)
      {
         return false;
      }
      return true;
   }

}
