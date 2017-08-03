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
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.Hibernate;

/**
 * This class represents a unit-manager.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "users")
@AttributeOverride(name = "id", column = @Column(name = "user_id"))
public class User extends AbstractEntity
{

   /**
    * The username of the user. Must be unique
    */
   @Column(unique = true)
   private String username;

   /** The ldap user. */
   private String ldapUser;

   /** The function of this user. */
   private String function;
   
   @Transient
   private boolean temporaryManagerAssigned;

/*   *//** The units this manager manages. *//*
   @OneToMany(mappedBy = "manager")
   private Set<Unit> units = new HashSet<>();*/
   

   @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
   @JoinTable(name="manager_units",joinColumns={@JoinColumn(name="user_id")}, inverseJoinColumns={@JoinColumn(name="unit_id")})
   private Set<Unit> units = new HashSet<>();
   

   /** The units this manager temporarily manages. */
   @OneToMany(mappedBy = "temporaryManager")
   private Set<Unit> tempUnits = new HashSet<>();

   /**
    * The division a manager belongs to.
    */
   @ManyToOne(fetch = FetchType.LAZY)
   private Division division;

   /** The divisions this manager manages. */
   @OneToMany(mappedBy = "manager")
   private Set<Division> divisions = new HashSet<>();

   /** The settings of this manager. */
   @OneToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
   @JoinColumn(name = "settings_id")
   private Settings settings = new Settings();
  
   /** The employee. */
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
   private Employee employee;

   /**
    * The roles for this user. This just makes sure that JPA creates the correct tables. When the LDAP component for authentication will be used this will be obsolete.
    */
   @ManyToMany(fetch = FetchType.LAZY)
   @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
   private Set<Role> roles = new HashSet<>();
   

   /**
    * Constructor: create a new User.
    */
   public User()
   {
   }

   /**
    * Gets the settings.
    *
    * @return the settings
    */
   public Settings getSettings()
   {
      return this.settings;
   }

   /**
    * Sets the settings.
    * 
    * @param settings the new settings
    */
   public void setSettings(Settings settings)
   {
      this.settings = settings;
   }



   /**
    * Gets the username.
    * 
    * @return the username
    */
   public String getUsername()
   {
      return this.username;
   }

   /**
    * Sets the username.
    * 
    * @param username the new username
    */
   public void setUsername(String username)
   {
      this.username = username;
   }

   /**
    * Gets the divisions.
    * 
    * @return the divisions
    */
   public Set<Division> getDivisions()
   {
      return this.divisions;
   }

   /**
    * Sets the divisions.
    * 
    * @param divisions the new divisions
    */
   public void setDivisions(Set<Division> divisions)
   {
      this.divisions = divisions;
   }

   /**
    * Gets the roles.
    * 
    * @return the roles
    */
   public Set<Role> getRoles()
   {
      return this.roles;
   }

   /**
    * Sets the roles.
    * 
    * @param roles the new roles
    */
   public void setRoles(Set<Role> roles)
   {
      this.roles = roles;
   }

   /**
    * Gets the function.
    * 
    * @return the function
    */
   public String getFunction()
   {
      return this.function;
   }

   /**
    * Sets the function.
    * 
    * @param function the new function
    */
   public void setFunction(String function)
   {
      this.function = function;
   }

   /**
    * Gets the ldap user.
    * 
    * @return the ldapUser
    */
   public String getLdapUser()
   {
      return this.ldapUser;
   }

   /**
    * Sets the ldap user.
    * 
    * @param ldapUser the ldapUser to set
    */
   public void setLdapUser(String ldapUser)
   {
      //		if (ldapUser == null)
      //			return;
      this.ldapUser = ldapUser;
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
    * @param division the division to set
    */
   public void setDivision(Division division)
   {
      this.division = division;
   }

   /**
    * Gets the employee.
    * 
    * @return the associated employee
    */
   public Employee getEmployee()
   {
	   Hibernate.initialize(this.employee);
      return this.employee;
   }

   /**
    * Sets the employee.
    * 
    * @param employee the new employee
    */
   public void setEmployee(Employee employee)
   {
      this.employee = employee;
   }
   
  
   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof User) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof User;
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

   public Set<Unit> getUnits()
   {
      return units;
   }

   public void setUnits(Set<Unit> units)
   {
      this.units = units;
   }

   public Set<Unit> getTempUnits()
   {
      return tempUnits;
   }

   public void setTempUnits(Set<Unit> tempUnits)
   {
      this.tempUnits = tempUnits;
   }

   public boolean isTemporaryManagerAssigned() {
		return temporaryManagerAssigned;
   }

	public void setTemporaryManagerAssigned(boolean temporaryManagerAssigned) {
		this.temporaryManagerAssigned = temporaryManagerAssigned;
	}	
   
}
