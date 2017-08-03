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

import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * The Class Contact.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "contacts")
@AttributeOverride(name = "id", column = @Column(name = "contact_id"))
public class Contact extends AbstractEntity
{

   /** private long id; *. */
   @Transient
   private long id;

   /** The name. */
   private String name;

   /** The telephone. */
   @Pattern(regexp = "[0-9]*", message = "Telefoonnummer mag alleen cijfers bevatten.")
   private String telephone;

   /* *//** The client. */
   /*
    * @ManyToOne
    * @JoinColumn(name = "client_id") private Client client;
    */
   /** The Address. */
   @Transient
   private Address address;

   /** The number. */
   @Transient
   private String number;

   /**
    * Instantiates a new contact.
    */
   public Contact()
   {
      // TODO Auto-generated constructor stub
   }

   /**
    * Instantiates a new contact.
    * 
    * @param employee the employee
    */
   public Contact(Employee employee)
   {
      super(employee);
      setNumber(employee.getNumber());
      this.name = employee.getName();
      this.address = employee.getAddress();
      this.telephone = employee.getTelephoneNumber();
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#getId()
    */
   @Override
   public long getId()
   {
      return this.id;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#setId(long)
    */
   @Override
   public void setId(long id)
   {
      this.id = id;
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
      //Objects.requireNonNull(name);
      this.name = name;
   }

   /**
    * Gets the telephone.
    * 
    * @return the telephone
    */
   public String getTelephone()
   {
      return this.telephone;
   }

   /**
    * Sets the telephone.
    * 
    * @param telephone the new telephone
    */
   public void setTelephone(String telephone)
   {

      this.telephone = telephone;
   }

   /**
    * Gets the client.
    * 
    * @return the client
    */
   /*
    * public Client getClient() { return this.client; }
    */

   /**
    * Sets the client.
    * 
    * @param client the new client
    */
   /*
    * public void setClient(Client client) { this.client = client; }
    */

   /**
    * Get the address.
    * 
    * @return Returns the address as a Address.
    */
   public Address getAddress()
   {
      return this.address;
   }

   /**
    * Set the address to the specified value.
    * 
    * @param address The address to set.
    */
   public void setAddress(Address address)
   {
      this.address = address;
   }

   /**
    * Get the number.
    * 
    * @return Returns the number as a String.
    */
   public String getNumber()
   {
      return this.number;
   }

   /**
    * Set the number to the specified value.
    * 
    * @param number The number to set.
    */
   public void setNumber(int number)
   {
      this.number = String.format("%04d", number);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Contact) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Contact;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#hashCode()
    */
   @Override
   public final int hashCode()
   {
      return super.hashCode();
   }

}
