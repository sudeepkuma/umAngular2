package nl.sogeti.com.domain;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class SEILevelAverage.
 */
@Entity
@Table(name = "seilevelaverage")
@AttributeOverride(name = "id", column = @Column(name = "sei_level_avg_id"))
public class SEILevelAverage extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The level. */
   private String level;

   /** The Productiviteit. */
   private BigDecimal Productiviteit;

   /** The min productiviteit. */
   private BigDecimal minProductiviteit;

   /** The max productiviteit. */
   private BigDecimal maxProductiviteit;

   /** The Opbrengst. */
   private BigDecimal Opbrengst;

   /** The min opbrengst. */
   private BigDecimal minOpbrengst;

   /** The max opbrengst. */
   private BigDecimal maxOpbrengst;

   /** The Beloning. */
   private BigDecimal Beloning;

   /** The min beloning. */
   private BigDecimal minBeloning;

   /** The max beloning. */
   private BigDecimal maxBeloning;

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

   /**
    * Gets the productiviteit.
    * 
    * @return the productiviteit
    */
   public BigDecimal getProductiviteit()
   {
      return this.Productiviteit;
   }

   /**
    * Sets the productiviteit.
    * 
    * @param productiviteit the new productiviteit
    */
   public void setProductiviteit(BigDecimal productiviteit)
   {
      this.Productiviteit = productiviteit;
   }

   /**
    * Gets the min productiviteit.
    * 
    * @return the min productiviteit
    */
   public BigDecimal getMinProductiviteit()
   {
      return this.minProductiviteit;
   }

   /**
    * Sets the min productiviteit.
    * 
    * @param minProductiviteit the new min productiviteit
    */
   public void setMinProductiviteit(BigDecimal minProductiviteit)
   {
      this.minProductiviteit = minProductiviteit;
   }

   /**
    * Gets the max productiviteit.
    * 
    * @return the max productiviteit
    */
   public BigDecimal getMaxProductiviteit()
   {
      return this.maxProductiviteit;
   }

   /**
    * Sets the max productiviteit.
    * 
    * @param maxProductiviteit the new max productiviteit
    */
   public void setMaxProductiviteit(BigDecimal maxProductiviteit)
   {
      this.maxProductiviteit = maxProductiviteit;
   }

   /**
    * Gets the opbrengst.
    * 
    * @return the opbrengst
    */
   public BigDecimal getOpbrengst()
   {
      return this.Opbrengst;
   }

   /**
    * Sets the opbrengst.
    * 
    * @param opbrengst the new opbrengst
    */
   public void setOpbrengst(BigDecimal opbrengst)
   {
      this.Opbrengst = opbrengst;
   }

   /**
    * Gets the min opbrengst.
    * 
    * @return the min opbrengst
    */
   public BigDecimal getMinOpbrengst()
   {
      return this.minOpbrengst;
   }

   /**
    * Sets the min opbrengst.
    * 
    * @param minOpbrengst the new min opbrengst
    */
   public void setMinOpbrengst(BigDecimal minOpbrengst)
   {
      this.minOpbrengst = minOpbrengst;
   }

   /**
    * Gets the max opbrengst.
    * 
    * @return the max opbrengst
    */
   public BigDecimal getMaxOpbrengst()
   {
      return this.maxOpbrengst;
   }

   /**
    * Sets the max opbrengst.
    * 
    * @param maxOpbrengst the new max opbrengst
    */
   public void setMaxOpbrengst(BigDecimal maxOpbrengst)
   {
      this.maxOpbrengst = maxOpbrengst;
   }

   /**
    * Gets the beloning.
    * 
    * @return the beloning
    */
   public BigDecimal getBeloning()
   {
      return this.Beloning;
   }

   /**
    * Sets the beloning.
    * 
    * @param beloning the new beloning
    */
   public void setBeloning(BigDecimal beloning)
   {
      this.Beloning = beloning;
   }

   /**
    * Gets the min beloning.
    * 
    * @return the min beloning
    */
   public BigDecimal getMinBeloning()
   {
      return this.minBeloning;
   }

   /**
    * Sets the min beloning.
    * 
    * @param minBeloning the new min beloning
    */
   public void setMinBeloning(BigDecimal minBeloning)
   {
      this.minBeloning = minBeloning;
   }

   /**
    * Gets the max beloning.
    * 
    * @return the max beloning
    */
   public BigDecimal getMaxBeloning()
   {
      return this.maxBeloning;
   }

   /**
    * Sets the max beloning.
    * 
    * @param maxBeloning the new max beloning
    */
   public void setMaxBeloning(BigDecimal maxBeloning)
   {
      this.maxBeloning = maxBeloning;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.Beloning == null) ? 0 : this.Beloning.hashCode());
      result = prime * result + ((this.Opbrengst == null) ? 0 : this.Opbrengst.hashCode());
      result = prime * result + ((this.Productiviteit == null) ? 0 : this.Productiviteit.hashCode());
      result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
      result = prime * result + ((this.maxBeloning == null) ? 0 : this.maxBeloning.hashCode());
      result = prime * result + ((this.maxOpbrengst == null) ? 0 : this.maxOpbrengst.hashCode());
      result = prime * result + ((this.maxProductiviteit == null) ? 0 : this.maxProductiviteit.hashCode());
      result = prime * result + ((this.minBeloning == null) ? 0 : this.minBeloning.hashCode());
      result = prime * result + ((this.minOpbrengst == null) ? 0 : this.minOpbrengst.hashCode());
      result = prime * result + ((this.minProductiviteit == null) ? 0 : this.minProductiviteit.hashCode());
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
      if (obj == null)
      {
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      SEILevelAverage other = (SEILevelAverage) obj;
      if (this.Beloning == null)
      {
         if (other.Beloning != null)
         {
            return false;
         }
      }
      else if (!this.Beloning.equals(other.Beloning))
      {
         return false;
      }
      if (this.Opbrengst == null)
      {
         if (other.Opbrengst != null)
         {
            return false;
         }
      }
      else if (!this.Opbrengst.equals(other.Opbrengst))
      {
         return false;
      }
      if (this.Productiviteit == null)
      {
         if (other.Productiviteit != null)
         {
            return false;
         }
      }
      else if (!this.Productiviteit.equals(other.Productiviteit))
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
      if (this.maxBeloning == null)
      {
         if (other.maxBeloning != null)
         {
            return false;
         }
      }
      else if (!this.maxBeloning.equals(other.maxBeloning))
      {
         return false;
      }
      if (this.maxOpbrengst == null)
      {
         if (other.maxOpbrengst != null)
         {
            return false;
         }
      }
      else if (!this.maxOpbrengst.equals(other.maxOpbrengst))
      {
         return false;
      }
      if (this.maxProductiviteit == null)
      {
         if (other.maxProductiviteit != null)
         {
            return false;
         }
      }
      else if (!this.maxProductiviteit.equals(other.maxProductiviteit))
      {
         return false;
      }
      if (this.minBeloning == null)
      {
         if (other.minBeloning != null)
         {
            return false;
         }
      }
      else if (!this.minBeloning.equals(other.minBeloning))
      {
         return false;
      }
      if (this.minOpbrengst == null)
      {
         if (other.minOpbrengst != null)
         {
            return false;
         }
      }
      else if (!this.minOpbrengst.equals(other.minOpbrengst))
      {
         return false;
      }
      if (this.minProductiviteit == null)
      {
         if (other.minProductiviteit != null)
         {
            return false;
         }
      }
      else if (!this.minProductiviteit.equals(other.minProductiviteit))
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
      return "SEILevelAverage [level=" + this.level + ", Productiviteit=" + this.Productiviteit + ", minProductiviteit=" + this.minProductiviteit + ", maxProductiviteit=" + this.maxProductiviteit
            + ", Opbrengst=" + this.Opbrengst + ", minOpbrengst=" + this.minOpbrengst + ", maxOpbrengst=" + this.maxOpbrengst + ", Beloning=" + this.Beloning + ", minBeloning=" + this.minBeloning
            + ", maxBeloning=" + this.maxBeloning + "]";
   }

}
