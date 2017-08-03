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

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * This entity represents a unit. A group of employees managed by the unit-manager.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "units")
@AttributeOverride(name = "id", column = @Column(name = "unit_id"))
public class Unit extends AbstractEntity
{

   /** The name of the unit. */
   @NotNull
   private String name;

   /** The abbreviation. */
   @NotNull
   private String abbreviation;

   /** The division. */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "division_id")
   @NotNull
   private Division division;

   @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
   @JoinTable(name="manager_units",joinColumns={@JoinColumn(name="unit_id")}, inverseJoinColumns={@JoinColumn(name="user_id")})
   private Set<User> manager = new HashSet<>();

   /** The temporary manager of this unit for if the manager is unavailable (holiday). */
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "temp_manager_id")
   private User temporaryManager;

   /** The employees that are in this unit. */
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "unit")
   private Set<Employee> employees = new HashSet<>();

   /** The categories. */
   @OneToMany(fetch = FetchType.LAZY)
   private Set<ExpertiseCategory> categories;

   /**
    * unit definitions for the free fields.
    */
   @OneToMany(fetch = FetchType.LAZY)
   @JoinTable(name = "units_freefields", joinColumns = @JoinColumn(name = "unit_id"), inverseJoinColumns = @JoinColumn(name = "freefield_id"))
   private Set<Fields> freeFields = new HashSet<>();

   @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   @JoinTable(name="units_certificates",joinColumns={@JoinColumn(name="units_unit_id")}, inverseJoinColumns={@JoinColumn(name="certificate_certificate_id")})
   private Set<Certificate> certificate = new HashSet<>();

   /**
    * Constructor: create a new Unit.
    */
   public Unit()
   {
   }

   /**
    * Gets the employees.
    * 
    * @return the employees
    */
   public Set<Employee> getEmployees()
   {
      return this.employees;
   }

   /**
    * Sets the employees.
    * 
    * @param employees the new employees
    */
   public void setEmployees(Set<Employee> employees)
   {
      this.employees = employees;
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
    * Gets the temporary manager.
    * 
    * @return the temporary manager
    */
   public User getTemporaryManager()
   {
      return this.temporaryManager;
   }

   /**
    * Sets the temporary manager.
    * 
    * @param temporaryManager the new temporary manager
    */
   public void setTemporaryManager(User temporaryManager)
   {
      // TODO This if should not be here probably
      if (temporaryManager != null && temporaryManager.getId() == -1)
      {
         this.temporaryManager = null;
         return;
      }

      this.temporaryManager = temporaryManager;
   }

   /**
    * Gets the division.
    * 
    * @return the division
    */
   public Division getDivision()
   {
      return this.division;
   }

   /**
    * Sets the division.
    * 
    * @param division the new division
    */
   public void setDivision(Division division)
   {
      Objects.requireNonNull(division);
      this.division = division;
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
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Unit;
   }

   /**
    * Gets the categories.
    * 
    * @return the categories
    */
   public Set<ExpertiseCategory> getCategories()
   {
      return this.categories;
   }

   /**
    * Sets the categories.
    * 
    * @param categories the categories to set
    */
   public void setCategories(Set<ExpertiseCategory> categories)
   {
      this.categories = categories;
   }

   /**
    * Gets the free fields.
    * 
    * @return the free fields
    */
   public Set<Fields> getFreeFields()
   {
      return this.freeFields;
   }

   /**
    * Sets the free fields.
    * 
    * @param freeFields the new free fields
    */
   public void setFreeFields(Set<Fields> freeFields)
   {
      this.freeFields = freeFields;
   }

   public Set<Certificate> getCertificate()
   {
      return certificate;
   }

   public void setCertificate(Set<Certificate> certificate)
   {
      this.certificate = certificate;
   }

   public Set<User> getManager()
   {
      return manager;
   }

   public void setManager(Set<User> manager)
   {
      this.manager = manager;
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      return new HashCodeBuilder().append(name).append(abbreviation).toHashCode();

   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      boolean equals = false;
      if (obj == this)
      {
         equals = true;
      }
      else if (obj instanceof Unit)
      {
         final Unit other = (Unit) obj;
         EqualsBuilder builder = new EqualsBuilder().append(name, other.name).append(abbreviation, other.abbreviation);

         equals = builder.isEquals();
      }
      return equals;

   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      StringBuilder builder = new StringBuilder();
      builder.append("Unit [unitId=");
      builder.append(id);
      builder.append(", name=");
      builder.append(name);
      builder.append(", abbreviation=");
      builder.append(abbreviation);
      builder.append(", manager=");
      builder.append(manager);
      builder.append(", division=");
      builder.append(division);
      builder.append("]");
      return builder.toString();

   }

}
