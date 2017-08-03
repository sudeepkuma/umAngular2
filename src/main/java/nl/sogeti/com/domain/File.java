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

import static nl.sogeti.com.util.Util.copy;

import java.util.Date;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * This class encapsulates the properties and content of a file on disk so that it can be stored in the database.
 */
@SuppressWarnings("serial")
@Table(name = "files")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "file_id"))
public class File extends AbstractEntity
{

   /**
    * The content of the file.
    */
   @Lob
   @NotNull
   private byte[] content;

   /**
    * The name of the file.
    */
   @NotNull
   private String name;
   /**
    * The content type of the file. E.g. text/plain.
    */
   private String contentType;
   /**
    * The date on which this file as saved.
    */
   @Temporal(TemporalType.DATE)
   private Date date;

   /**
    * Gets the content.
    *
    * @return the content
    */
   public byte[] getContent()
   {
      return this.content.clone();
   }

   /**
    * Sets the content.
    *
    * @param content the new content
    */
   public void setContent(byte[] content)
   {
      Objects.requireNonNull(content);
      this.content = content.clone();
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
    * Sets the content type.
    *
    * @param contentType the new content type
    */
   public void setContentType(String contentType)
   {
      this.contentType = contentType;
   }

   /**
    * Gets the content type.
    *
    * @return the content type
    */
   public String getContentType()
   {
      return this.contentType;
   }

   /**
    * Sets the date.
    *
    * @param date the new date
    */
   public void setDate(Date date)
   {
      this.date = copy(date);
   }

   /**
    * Gets the date.
    *
    * @return the date
    */
   public Date getDate()
   {
      return copy(this.date);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof File) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof File;
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
