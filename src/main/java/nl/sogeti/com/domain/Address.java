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

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * This class represents an actual address.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "addresses")
@AttributeOverride(name = "id", column = @Column(name = "address_id"))
public class Address extends AbstractEntity
{

   /** The name of the street. */
   private String street;
   /**
    * The postal code. E.g. '7329 CE'
    */
   private String postalCode;

   /** The name of the city. */
   private String city;

   /** The country. */
   private String country;

   /** The number of the street. */
   private String number;

   /**
    * Constructor: create a new Address.
    * 
    * @param id
    */
   public Address()
   {

      // TODO Auto-generated constructor stub
   }

   /**
    * Constructor: create a new Address.
    * 
    * @param street
    * @param postalCode
    * @param city
    * @param country
    * @param number
    */
   public Address(Address address)
   {
      this.id = address.getId();
      this.street = address.getStreet();
      this.postalCode = address.getPostalCode();
      this.city = address.getCity();
      this.country = address.getCountry();
      this.number = address.getNumber();
   }

   /**
    * Gets the street.
    * 
    * @return the street
    */
   public String getStreet()
   {
      return this.street;
   }

   /**
    * Sets the street.
    * 
    * @param street the new street
    */
   public void setStreet(String street)
   {
      this.street = street;
   }

   /**
    * Gets the postal code.
    * 
    * @return the postal code
    */
   public String getPostalCode()
   {
      return this.postalCode;
   }

   /**
    * Sets the postal code.
    * 
    * @param postalCode the new postal code
    */
   public void setPostalCode(String postalCode)
   {
      this.postalCode = postalCode;
   }

   /**
    * Gets the city.
    * 
    * @return the city
    */
   public String getCity()
   {
      return this.city;
   }

   /**
    * Sets the city.
    * 
    * @param city the new city
    */
   public void setCity(String city)
   {
      this.city = city;
   }

   /**
    * Gets the country.
    * 
    * @return the country
    */
   public String getCountry()
   {
      return this.country;
   }

   /**
    * Sets the country.
    * 
    * @param country the new country
    */
   public void setCountry(String country)
   {
      this.country = country;
   }

   /**
    * Gets the number.
    * 
    * @return the number
    */
   public String getNumber()
   {
      return this.number;
   }

   /**
    * Sets the number.
    * 
    * @param number the new number
    */
   public void setNumber(String number)
   {
      this.number = number;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Address;
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      return new HashCodeBuilder().append(street).append(postalCode).append(city).append(country).append(number).toHashCode();

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
      else if (obj instanceof Address)
      {
         final Address other = (Address) obj;
         EqualsBuilder builder = new EqualsBuilder().append(street, other.street).append(postalCode, other.postalCode).append(city, other.city).append(country, other.country)
               .append(number, other.number);

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
      builder.append("Address [Address_id=");
      builder.append(id);
      builder.append(", street=");
      builder.append(street);
      builder.append(", postalCode=");
      builder.append(postalCode);
      builder.append(", city=");
      builder.append(city);
      builder.append(", country=");
      builder.append(country);
      builder.append("]");
      return builder.toString();

   }
}
