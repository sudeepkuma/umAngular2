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
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * This class represents a division. I.e. a set of units under the same flag.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "divisions")
@AttributeOverride(name = "id", column = @Column(name = "division_id"))
public class Division extends AbstractEntity
{

   /** The name. */
   @NotNull
   private String name;

   /** The abbreviation. */
   @NotNull
   private String abbreviation;

   /** The manager of this division. */
   @ManyToOne
   private User manager;

   /** The units. */
   @OneToMany(mappedBy = "division", fetch = FetchType.LAZY)
   private Set<Unit> units = new HashSet<>();

   /** The ranking items. */
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinTable(name = "division_rankingitems", joinColumns = @JoinColumn(name = "division_id"), inverseJoinColumns = @JoinColumn(name = "rankingitem_id"))
   private Set<RankingItem> rankingItems = new HashSet<>();

   /** The growmodel. */
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinTable(name = "division_growmodel", joinColumns = @JoinColumn(name = "division_id"), inverseJoinColumns = @JoinColumn(name = "growmodeltab_id"))
   private Set<GrowModelTab> growmodel = new HashSet<>();

  

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Division{" + "id=" + getId() + ", " + "name='" + this.name + '\'' +
      //				", units=" + units +
            ", rankingItems=" + this.rankingItems + ", growmodel=" + this.growmodel + '}';
   }

   /**
    * Gets the name.
    * 
    * @return the name
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Sets the name.
    * 
    * @param name the new name
    */
   public void setName(String name)
   {
      Objects.requireNonNull(name);
      this.name = name;
   }

   /**
    * Gets the units.
    * 
    * @return the units
    */
   public Set<Unit> getUnits()
   {
      return this.units;
   }

   /**
    * Sets the units.
    * 
    * @param units the new units
    */
   public void setUnits(Set<Unit> units)
   {
      this.units = units;
   }

   /**
    * Gets the ranking items.
    * 
    * @return the ranking items
    */
   public Set<RankingItem> getRankingItems()
   {
      return this.rankingItems;
   }

   /**
    * Sets the ranking items.
    * 
    * @param rankingItems the new ranking items
    */
   public void setRankingItems(Set<RankingItem> rankingItems)
   {
      this.rankingItems = rankingItems;
   }

   /**
    * Gets the manager.
    * 
    * @return the manager
    */
   public User getManager()
   {
      return this.manager;
   }

   /**
    * Sets the manager.
    * 
    * @param manager the new manager
    */
   public void setManager(User manager)
   {
      this.manager = manager;
   }

   /**
    * Gets the growmodel.
    * 
    * @return the growmodel
    */
   public Set<GrowModelTab> getGrowmodel()
   {
      return this.growmodel;
   }

   /**
    * Sets the growmodel.
    * 
    * @param growmodel the new growmodel
    */
   public void setGrowmodel(Set<GrowModelTab> growmodel)
   {
      this.growmodel = growmodel;
   }

   

   /**
    * Gets the abbreviation.
    * 
    * @return the abbreviation
    */
   public String getAbbreviation()
   {
      return this.abbreviation;
   }

   /**
    * Sets the abbreviation.
    * 
    * @param abbreviation the new abbreviation
    */
   public void setAbbreviation(String abbreviation)
   {
      Objects.requireNonNull(abbreviation);
      this.abbreviation = abbreviation;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Division) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Division;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }
}
