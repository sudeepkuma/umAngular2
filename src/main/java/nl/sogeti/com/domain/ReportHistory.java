package nl.sogeti.com.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "reporthistory")
@AttributeOverride(name = "id", column = @Column(name = "reporthistory_id"))
public class ReportHistory extends AbstractEntity
{

   private String reportName;
   private String selectedColumns;

   @Temporal(TemporalType.DATE)
   private Date reportCreation;

   private String username;

   /**
    * Get the reportName.
    * 
    * @return Returns the reportName as a String.
    */
   public String getReportName()
   {
      return reportName;
   }

   /**
    * Set the reportName to the specified value.
    * 
    * @param reportName The reportName to set.
    */
   public void setReportName(String reportName)
   {
      this.reportName = reportName;
   }

   /**
    * Get the selectedColumns.
    * 
    * @return Returns the selectedColumns as a String.
    */
   public String getSelectedColumns()
   {
      return selectedColumns;
   }

   /**
    * Set the selectedColumns to the specified value.
    * 
    * @param selectedColumns The selectedColumns to set.
    */
   public void setSelectedColumns(String selectedColumns)
   {
      this.selectedColumns = selectedColumns;
   }

   /**
    * Get the reportCreation.
    * 
    * @return Returns the reportCreation as a Date.
    */
   public Date getReportCreation()
   {
      return reportCreation;
   }

   /**
    * Set the reportCreation to the specified value.
    * 
    * @param reportCreation The reportCreation to set.
    */
   public void setReportCreation(Date reportCreation)
   {
      this.reportCreation = reportCreation;
   }

   public String getUsername()
   {
      return username;
   }

   public void setUsername(String username)
   {
      this.username = username;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((reportName == null) ? 0 : reportName.hashCode());
      result = prime * result + ((username == null) ? 0 : username.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      ReportHistory other = (ReportHistory) obj;
      if (reportName == null)
      {
         if (other.reportName != null)
            return false;
      }
      else if (!reportName.equals(other.reportName))
         return false;
      if (username == null)
      {
         if (other.username != null)
            return false;
      }
      else if (!username.equals(other.username))
         return false;
      return true;
   }


   


}
