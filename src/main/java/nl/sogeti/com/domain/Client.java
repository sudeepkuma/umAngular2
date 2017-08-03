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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * This class represents a client of Sogeti.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "clients", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
@AttributeOverride(name = "id", column = @Column(name = "client_id"))
public class Client extends AbstractEntity
{

   /** The name. */
   //@NotNull(message="Bij klant: vul inzetgegevens in, is verplicht veld")
   private String name;

   /** The approved. */
   private boolean approved;

   /** The username. */
   private String username;

   /** The address. */
   @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   @JoinColumn(name = "address_id")
   private Address address;

   /** The assignments. */
   @OneToMany(mappedBy = "client")
   private Set<Assignment> assignments = new HashSet<>();

   /** The default relation manager. */
   @ManyToOne
   @JoinColumn(name = "default_relationmanager_id")
   private RelationManager defaultRelationManager;

   /** The branche. */
   @ManyToOne
   @JoinColumn(name = "branche_id")
   private Branche branche;

   /*  *//** The contacts. */
   /*
    * @OneToMany(mappedBy = "client", fetch = FetchType.EAGER) private List<Contact> contacts = new ArrayList<>();
    */
   /**
    * Instantiates a new client.
    */
   public Client()
   {
      //this.defaultRelationManager = new RelationManager();
      this.address = new Address();
      this.address.setCountry("Nederland");
   }

   /**
    * Instantiates a new client.
    * 
    * @param client the client
    */
   public Client(Client client)
   {
      this.address = new Address();
      this.id = client.getId();
      this.name = client.getName();
      this.approved = client.isApproved();
      this.address = client.getAddress();
      this.username = client.getUsername();
      if (client.getDefaultRelationManager() != null)
      {
         this.defaultRelationManager = client.getDefaultRelationManager();
      }
      else
      {
         this.defaultRelationManager = new RelationManager();
      }

      if (client.getBranche() != null)
      {
         this.branche = client.getBranche();
      }
      else
      {
         this.branche = new Branche();
      }

      /*
       * for (Contact contact : client.getContacts()) { this.contacts.add(contact); }
       */
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
     // Objects.requireNonNull(name);
      this.name = name;
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
    * Gets the address.
    * 
    * @return the address
    */
   public Address getAddress()
   {
      return this.address;
   }

   /**
    * Sets the address.
    * 
    * @param address the new address
    */
   public void setAddress(Address address)
   {
      this.address = address;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Client{" + "name='" + this.name + '\'' + ", address=" + this.address + '}';
   }

   /**
    * Gets the assignments.
    * 
    * @return the assignments
    */
   public Set<Assignment> getAssignments()
   {
      return this.assignments;
   }

   /**
    * Sets the assignments.
    * 
    * @param assignments the new assignments
    */
   public void setAssignments(Set<Assignment> assignments)
   {
      this.assignments = assignments;
   }

   /**
    * Checks if is approved.
    * 
    * @return true, if is approved
    */
   public boolean isApproved()
   {
      return this.approved;
   }

   /**
    * Sets the approved.
    * 
    * @param approved the new approved
    */
   public void setApproved(boolean approved)
   {
      this.approved = approved;
   }

   /**
    * Gets the default relation manager.
    * 
    * @return the default relation manager
    */
   public RelationManager getDefaultRelationManager()
   {
      return this.defaultRelationManager;
   }

   /**
    * Sets the default relation manager.
    * 
    * @param defaultRelationManager the new default relation manager
    */
   public void setDefaultRelationManager(RelationManager defaultRelationManager)
   {
      this.defaultRelationManager = defaultRelationManager;
   }

   /**
    * Gets the branche.
    * 
    * @return the branche
    */
   public Branche getBranche()
   {
      return this.branche;
   }

   /**
    * Sets the branche.
    * 
    * @param branche the new branche
    */
   public void setBranche(Branche branche)
   {
      this.branche = branche;
   }

   /*
   *//**
    * Gets the contacts.
    * 
    * @param that the that
    * @return the contacts
    */
   /*
    * public List<Contact> getContacts() { return this.contacts; }
    *//**
    * Sets the contacts.
    * 
    * @param contacts the new contacts
    */
   /*
    * public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
    */
   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Client) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Client;
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
