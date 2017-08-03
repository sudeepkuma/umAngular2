/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Dec 12, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * This entity represents a tab in the Young Professional grow model.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "growmodeltabs")
@AttributeOverride(name = "id", column = @Column(name = "growmodeltab_id"))
public class GrowModelTab extends AbstractEntity
{

   /**
    * The name of the tab (usually A, B etc).
    */
   private String model;
   /**
    * The elements in this tab.
    */
   @OneToMany(mappedBy = "column", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   private Set<GrowModelElement> elements = new HashSet<>();

   /** The grow model id. */
   @Transient
   private long growModelId;

   /** The grow panel elements. */
   @Transient
   private List<GrowModelElement> growPanelElements;

   /**
    * Constructor: create a new GrowModelTab.
    */
   public GrowModelTab()
   {
   }

   /**
    * Instantiates a new grow model tab.
    *
    * @param growModelTab the grow model tab
    */
   public GrowModelTab(GrowModelTab growModelTab)
   {
      this.growModelId = growModelTab.getId();
      this.model = growModelTab.getModel();
      this.growPanelElements = new ArrayList<GrowModelElement>();
      for (GrowModelElement gME : growModelTab.getElements())
      {
         this.growPanelElements.add(gME);
      }
      Collections.sort(this.growPanelElements);
   }

   /**
    * Gets the copy from DTO private long growModelId;.
    * 
    * @return the copy from DTO private long growModelId;
    */
   public long getGrowModelId()
   {
      return this.growModelId;
   }

   /**
    * Sets the copy from DTO private long growModelId;.
    * 
    * @param growModelId the new copy from DTO private long growModelId;
    */
   public void setGrowModelId(long growModelId)
   {
      this.growModelId = growModelId;
   }

   /**
    * Gets the grow panel elements.
    * 
    * @return the grow panel elements
    */
   public List<GrowModelElement> getGrowPanelElements()
   {
      return this.growPanelElements;
   }

   /**
    * Sets the grow panel elements.
    * 
    * @param growPanelElements the new grow panel elements
    */
   public void setGrowPanelElements(List<GrowModelElement> growPanelElements)
   {
      this.growPanelElements = growPanelElements;
   }

   /**
    * Gets the name of the tab (usually A, B etc).
    * 
    * @return the name of the tab (usually A, B etc)
    */
   public String getModel()
   {
      return this.model;
   }

   /**
    * Sets the name of the tab (usually A, B etc).
    * 
    * @param model the new name of the tab (usually A, B etc)
    */
   public void setModel(String model)
   {
      this.model = model;
   }

   /**
    * Gets the elements in this tab.
    * 
    * @return the elements in this tab
    */
   public Set<GrowModelElement> getElements()
   {
      return this.elements;
   }

   /**
    * Sets the elements in this tab.
    * 
    * @param elements the new elements in this tab
    */
   public void setElements(Set<GrowModelElement> elements)
   {
      this.elements = elements;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof GrowModelTab) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof GrowModelTab;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "GrowModelTab{" + "elements=" + this.elements + ", model='" + this.model + '\'' + '}';
   }
}
