package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "reportcolumns")
@AttributeOverride(name = "id", column = @Column(name = "reportcolumns_id"))
public class ReportColumns extends AbstractEntity
{

   private String columnsName;

   /**
    * Get the columnsName.
    * 
    * @return Returns the columnsName as a String.
    */
   public String getColumnsName()
   {
      return columnsName;
   }

   /**
    * Set the columnsName to the specified value.
    * 
    * @param columnsName The columnsName to set.
    */
   public void setColumnsName(String columnsName)
   {
      this.columnsName = columnsName;
   }

}
