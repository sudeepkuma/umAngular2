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
@Table(name = "importdate")
@AttributeOverride(name = "id", column = @Column(name = "importDate_id"))
public class ImportDate extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -7408166722771007347L;

   @Temporal(TemporalType.TIMESTAMP)
   private Date importerdate;

   @Temporal(TemporalType.TIMESTAMP)
   private Date seiImporterdate;

   @Temporal(TemporalType.TIMESTAMP)
   private Date projectImporterdate;

   @Temporal(TemporalType.TIMESTAMP)
   private Date GradeImporterDate;

   public Date getImporterdate()
   {
      return importerdate;
   }

   public void setImporterdate(Date importerdate)
   {
      this.importerdate = importerdate;
   }

   public Date getSeiImporterdate()
   {
      return seiImporterdate;
   }

   public void setSeiImporterdate(Date seiImporterdate)
   {
      this.seiImporterdate = seiImporterdate;
   }

   public Date getProjectImporterdate()
   {
      return projectImporterdate;
   }

   public void setProjectImporterdate(Date projectImporterdate)
   {
      this.projectImporterdate = projectImporterdate;
   }

   public Date getGradeImporterDate()
   {
      return GradeImporterDate;
   }

   public void setGradeImporterDate(Date gradeImporterDate)
   {
      this.GradeImporterDate = gradeImporterDate;
   }

}
