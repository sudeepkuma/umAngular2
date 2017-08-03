package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class SelectList.
 */
@Entity
@Table(name = "select_list")
@AttributeOverride(name = "id", column = @Column(name = "select_list_id"))
public class SelectList extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -994311828529691396L;

   /** The list code. */

   @Column(name = "list_code", unique = true, nullable = false)
   private String listCode;

   /** The list name. */
   @Column(name = "list_name", length = 50)
   private String listName;

   /**
    * Constructor: create a new SelectList.
    */
   public SelectList()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the listCode.
    * 
    * @return Returns the listCode as a String.
    */
   public String getListCode()
   {
      return this.listCode;
   }

   /**
    * Set the listCode to the specified value.
    * 
    * @param listCode The listCode to set.
    */
   public void setListCode(String listCode)
   {
      this.listCode = listCode;
   }

   /**
    * Get the listName.
    * 
    * @return Returns the listName as a String.
    */
   public String getListName()
   {
      return this.listName;
   }

   /**
    * Set the listName to the specified value.
    * 
    * @param listName The listName to set.
    */
   public void setListName(String listName)
   {
      this.listName = listName;
   }

}