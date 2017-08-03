package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lastselectedunit")
@AttributeOverride(name = "id", column = @Column(name = "selectedunit_id"))
public class LastSelectedUnit extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 5201291353806252653L;

   /** The name. */
   private String name;

   private long unitid;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public long getUnitid()
   {
      return unitid;
   }

   public void setUnitid(long unitid)
   {
      this.unitid = unitid;
   }

}
