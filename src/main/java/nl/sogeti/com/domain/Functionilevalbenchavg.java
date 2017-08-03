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
 * The Class Functionilevalbenchavg.
 */
@Entity
@Table(name = "functionilevalbenchavg")
@AttributeOverride(name = "id", column = @Column(name = "funlevalbenchavg_id"))
public class Functionilevalbenchavg extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

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

   /** The level. */
   private String level;

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
    * Gets the level.
    * 
    * @return the level
    */
   public String getLevel()
   {
      return this.level;
   }

   /**
    * Sets the level.
    * 
    * @param level the new level
    */
   public void setLevel(String level)
   {
      this.level = level;
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
      result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
      result = prime * result + ((this.productivityAvg == null) ? 0 : this.productivityAvg.hashCode());
      result = prime * result + ((this.promotionAvg == null) ? 0 : this.promotionAvg.hashCode());
      result = prime * result + ((this.rewardAvg == null) ? 0 : this.rewardAvg.hashCode());
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
      Functionilevalbenchavg other = (Functionilevalbenchavg) obj;
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
      if (this.level == null)
      {
         if (other.level != null)
         {
            return false;
         }
      }
      else if (!this.level.equals(other.level))
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
      return true;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Functionilevalbenchavg [productivityAvg=" + this.productivityAvg + ", affordAvg=" + this.affordAvg + ", rewardAvg=" + this.rewardAvg + ", promotionAvg=" + this.promotionAvg
            + ", frequencyAvg=" + this.frequencyAvg + ", level=" + this.level + ", avgCalculationDate=" + this.avgCalculationDate + "]";
   }

}
