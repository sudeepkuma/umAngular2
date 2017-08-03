package nl.sogeti.com.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "meddatarawdata")
@AttributeOverride(name = "id", column = @Column(name = "meddata_id"))
public class MedDataRawData extends AbstractEntity
{

   /** The periode. */
   private int number;

   private String function;

   private Date datestartedOn, datelastFV, datelastPR,insertionDate;
   

   public int getNumber()
   {
      return number;
   }

   public MedDataRawData()
   {
      super();
   }

   public MedDataRawData(Date datelastFV, int number, Date datestartedOn, String function, Date datelastPR)
   {
      this.datelastFV = datelastFV;
      this.number = number;
      this.datestartedOn = datestartedOn;
      this.function = function;
      this.datelastPR=datelastPR;

   }

   public void setNumber(int number)
   {
      this.number = number;
   }

   public String getFunction()
   {
      return function;
   }

   public void setFunction(String function)
   {
      this.function = function;
   }

   public Date getDatestartedOn()
   {
      return datestartedOn;
   }

   public void setDatestartedOn(Date datestartedOn)
   {
      this.datestartedOn = datestartedOn;
   }

   public Date getDatelastFV()
   {
      return datelastFV;
   }

   public void setDatelastFV(Date datelastFV)
   {
      this.datelastFV = datelastFV;
   }

   public Date getDatelastPR()
   {
      return datelastPR;
   }

   public void setDatelastPR(Date datelastPR)
   {
      this.datelastPR = datelastPR;
   }

   public Date getInsertionDate()
   {
      return insertionDate;
   }

   public void setInsertionDate(Date insertionDate)
   {
      this.insertionDate = insertionDate;
   }

}
