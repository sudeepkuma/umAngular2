package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class SelectListItem.
 */
@Entity
@Table(name = "select_listitem")
@AttributeOverride(name = "id", column = @Column(name = "select_listitem_id"))
public class SelectListItem extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -7683523581987158446L;

   /** The option value. */
   @Column(name = "option_value", length = 50)
   private String optionValue;

   /** The display order. */
   @Column(name = "displayorder")
   @OrderBy("displayorder")
   private long displayOrder;

   /** The active. */
   @Column(name = "active")
   private Boolean active;

   /** The select list. */
   @ManyToOne
   @JoinColumn(name = "select_list_id", nullable = false)
   private SelectList selectList;

   /** The colour. */
   @ManyToOne
   @JoinColumn(name = "colour_id", nullable = false)
   private Colour colour;

   /**
    * Constructor: create a new SelectListItem.
    */
   public SelectListItem()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the optionValue.
    * 
    * @return Returns the optionValue as a String.
    */
   public String getOptionValue()
   {
      return this.optionValue;
   }

   /**
    * Set the optionValue to the specified value.
    * 
    * @param optionValue The optionValue to set.
    */
   public void setOptionValue(String optionValue)
   {
      this.optionValue = optionValue;
   }

   /**
    * Get the active.
    * 
    * @return Returns the active as a Boolean.
    */
   public Boolean getActive()
   {
      return this.active;
   }

   /**
    * Set the active to the specified value.
    * 
    * @param active The active to set.
    */
   public void setActive(Boolean active)
   {
      this.active = active;
   }

   /**
    * Get the selectList.
    * 
    * @return Returns the selectList as a SelectList.
    */
   public SelectList getSelectList()
   {
      return this.selectList;
   }

   /**
    * Set the selectList to the specified value.
    * 
    * @param selectList The selectList to set.
    */
   public void setSelectList(SelectList selectList)
   {
      this.selectList = selectList;
   }

   /**
    * Get the colour.
    * 
    * @return Returns the colour as a Colour.
    */
   public Colour getColour()
   {
      return this.colour;
   }

   /**
    * Set the colour to the specified value.
    * 
    * @param colour The colour to set.
    */
   public void setColour(Colour colour)
   {
      this.colour = colour;
   }

   /**
    * Get the displayOrder.
    * 
    * @return Returns the displayOrder as a long.
    */
   public long getDisplayOrder()
   {
      return this.displayOrder;
   }

   /**
    * Set the displayOrder to the specified value.
    * 
    * @param displayOrder The displayOrder to set.
    */
   public void setDisplayOrder(long displayOrder)
   {
      this.displayOrder = displayOrder;
   }

}
