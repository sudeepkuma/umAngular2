package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "stamgegrawdata")
@AttributeOverride(name = "id", column = @Column(name = "stamgeg_id"))
public class StamgegRawData extends AbstractEntity
{

   /** The aantal_ziektedagen. */
   private int number,aantal_ziekmeldingen,aantal_ziektedagen;

   private String functieniveau;
   
   private Date csvDate,insertionDate;

   /** The bnp. */
   private BigDecimal jaarinkomen,perc_dvb,basisloon,normtantieme,prestatienormbeloning,performancenormbeloning;
   

   public int getNumber()
   {
      return number;
   }

   public void setNumber(int number)
   {
      this.number = number;
   }

   public BigDecimal getPerc_dvb()
   {
      return perc_dvb;
   }

   public void setPerc_dvb(BigDecimal bigDecimal)
   {
      this.perc_dvb = bigDecimal;
   }

   public String getFunctieniveau()
   {
      return functieniveau;
   }

   public void setFunctieniveau(String functieniveau)
   {
      this.functieniveau = functieniveau;
   }

   public BigDecimal getBasisloon()
   {
      return basisloon;
   }

   public void setBasisloon(BigDecimal basisloon)
   {
      this.basisloon = basisloon;
   }

   public BigDecimal getJaarinkomen()
   {
      return jaarinkomen;
   }

   public void setJaarinkomen(BigDecimal jaarinkomen)
   {
      this.jaarinkomen = jaarinkomen;
   }

   /**
    * Get the aantal_ziektedagen.
    *
    * @return Returns the aantal_ziektedagen as a BigDecimal.
    */
   public int getAantal_ziektedagen()
   {
      return aantal_ziektedagen;
   }

   /**
    * Set the aantal_ziektedagen to the specified value.
    *
    * @param aantal_ziektedagen The aantal_ziektedagen to set.
    */
   public void setAantal_ziektedagen(int aantal_ziektedagen)
   {
      this.aantal_ziektedagen = aantal_ziektedagen;
   }

   /**
    * Get the aantal_ziekmeldingen.
    *
    * @return Returns the aantal_ziekmeldingen as a BigDecimal.
    */
   public int getAantal_ziekmeldingen()
   {
      return aantal_ziekmeldingen;
   }

   /**
    * Set the aantal_ziekmeldingen to the specified value.
    *
    * @param aantal_ziekmeldingen The aantal_ziekmeldingen to set.
    */
   public void setAantal_ziekmeldingen(int aantal_ziekmeldingen)
   {
      this.aantal_ziekmeldingen = aantal_ziekmeldingen;
   }

   public Date getCsvDate()
   {
      return csvDate;
   }

   public void setCsvDate(Date csvDate)
   {
      this.csvDate = csvDate;
   }

   public Date getInsertionDate()
   {
      return insertionDate;
   }

   public void setInsertionDate(Date insertionDate)
   {
      this.insertionDate = insertionDate;
   }

   public BigDecimal getNormtantieme()
   {
      return normtantieme;
   }

   public void setNormtantieme(BigDecimal normtantieme)
   {
      this.normtantieme = normtantieme;
   }

   public BigDecimal getPrestatienormbeloning()
   {
      return prestatienormbeloning;
   }

   public void setPrestatienormbeloning(BigDecimal prestatienormbeloning)
   {
      this.prestatienormbeloning = prestatienormbeloning;
   }

   public BigDecimal getPerformancenormbeloning()
   {
      return performancenormbeloning;
   }

   public void setPerformancenormbeloning(BigDecimal performancenormbeloning)
   {
      this.performancenormbeloning = performancenormbeloning;
   }



}
