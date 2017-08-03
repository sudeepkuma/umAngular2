package nl.sogeti.com.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "meddvbrawdata")
@AttributeOverride(name = "id", column = @Column(name = "meddvb_id"))
public class MedDvBRawData extends AbstractEntity
{

   /** The periode. */
   private int number;

   private String functionCategory, functionLevel;
   
   private Date insertionDate;

   public int getNumber()
   {
      return number;
   }

   public void setNumber(int number)
   {
      this.number = number;
   }

   public String getFunctionCategory()
   {
      return functionCategory;
   }

   public void setFunctionCategory(String functionCategory)
   {
      this.functionCategory = functionCategory;
   }

   public String getFunctionLevel()
   {
      return functionLevel;
   }

   public void setFunctionLevel(String functionLevel)
   {
      this.functionLevel = functionLevel;
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
