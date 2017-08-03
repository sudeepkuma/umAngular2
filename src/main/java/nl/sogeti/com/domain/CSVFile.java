package nl.sogeti.com.domain;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The Class CSVFile.
 */

@Entity
@Table(name = "csvfiles")
@AttributeOverride(name = "id", column = @Column(name = "csvfile_id"))
public class CSVFile extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -4134360116457605783L;

   /** The filename. */
   private String filename;

   /** The filesize. */
   private long filesize;

   /** The modifiedtimestamp. */
   private Date modifiedtimestamp;

   /**
    * Instantiates a new CSV file.
    */
   public CSVFile()
   {
      super();
   }

   /**
    * Instantiates a new CSV file.
    * 
    * @param name the name
    * @param size the size
    * @param timestamp the timestamp
    */
   public CSVFile(String name, long size, Date timestamp)
   {
      super();
      this.filename = name;
      this.filesize = size;
      this.modifiedtimestamp = timestamp;
   }

   /**
    * Gets the filename.
    * 
    * @return the filename
    */
   public String getFilename()
   {
      return filename;
   }

   /**
    * Sets the filename.
    * 
    * @param filename the new filename
    */
   public void setFilename(String filename)
   {
      this.filename = filename;
   }

   /**
    * Gets the filesize.
    * 
    * @return the filesize
    */
   public long getFilesize()
   {
      return filesize;
   }

   /**
    * Sets the filesize.
    * 
    * @param filesize the new filesize
    */
   public void setFilesize(long filesize)
   {
      this.filesize = filesize;
   }

   /**
    * Gets the modifiedtimestamp.
    * 
    * @return the modifiedtimestamp
    */
   public Date getModifiedtimestamp()
   {
      return modifiedtimestamp;
   }

   /**
    * Sets the modifiedtimestamp.
    * 
    * @param modifiedtimestamp the new modifiedtimestamp
    */
   public void setModifiedtimestamp(Date modifiedtimestamp)
   {
      this.modifiedtimestamp = modifiedtimestamp;
   }

}
