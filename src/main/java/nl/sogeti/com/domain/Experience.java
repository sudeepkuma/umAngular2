/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 6, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import nl.sogeti.com.comparator.InnerCompare;

import org.joda.time.DateTime;

// TODO: Auto-generated Javadoc
/**
 * ????.
 * 
 * @author himtiwar (c) Feb 6, 2015, Sogeti B.V.
 * @version $Id:$
 */

@Entity
@Table(name = "experiences")
@AttributeOverride(name = "id", column = @Column(name = "experience_id"))
public class Experience extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The from date. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date fromDate;

   /** The till date. */
   @Temporal(TemporalType.TIMESTAMP)
   private Date tillDate;

   /** The keyword. */
   private String keyword;

   /** The branches. */
   @ManyToOne
   @JoinColumn(name = "branche_id")
   private Branche branches;

   /** The start date time. */
   @Transient
   private DateTime startDateTime;

   /** The end date time. */
   @Transient
   private DateTime endDateTime;

   /**
    * Gets the from date.
    * 
    * @return the from date
    */
   public Date getFromDate()
   {
      return this.fromDate;
   }

   /**
    * Sets the from date.
    * 
    * @param fromDate the new from date
    */
   public void setFromDate(Date fromDate)
   {
      this.fromDate = fromDate;
   }

   /**
    * Gets the till date.
    * 
    * @return the till date
    */
   public Date getTillDate()
   {
      return this.tillDate;
   }

   /**
    * Sets the till date.
    * 
    * @param tillDate the new till date
    */
   public void setTillDate(Date tillDate)
   {
      this.tillDate = tillDate;
   }

   /**
    * Gets the keyword.
    * 
    * @return the keyword
    */
   public String getKeyword()
   {
      return this.keyword;
   }

   /**
    * Sets the keyword.
    * 
    * @param keyword the new keyword
    */
   public void setKeyword(String keyword)
   {
      this.keyword = keyword;
   }

   /**
    * Gets the branches.
    * 
    * @return the branches
    */
   public Branche getBranches()
   {
      return this.branches;
   }

   /**
    * Sets the branches.
    * 
    * @param branches the new branches
    */
   public void setBranches(Branche branches)
   {
      this.branches = branches;
   }

   /**
    * Gets the start date time.
    * 
    * @return the start date time
    */
   public DateTime getStartDateTime()
   {

      return this.startDateTime;
   }

   /**
    * Sets the start date time.
    * 
    * @param startDateTime the new start date time
    */
   public void setStartDateTime(DateTime startDateTime)
   {
      this.startDateTime = startDateTime;
   }

   /**
    * Gets the end date time.
    * 
    * @return the end date time
    */
   public DateTime getEndDateTime()
   {
      return this.endDateTime;
   }

   /**
    * Sets the end date time.
    * 
    * @param endDateTime the new end date time
    */
   public void setEndDateTime(DateTime endDateTime)
   {
      this.endDateTime = endDateTime;
   }

   /*
    * (non-Javadoc)
    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
    */
   /**
    * Compare to.
    * 
    * @param one the one
    * @param other the other
    * @return the int
    */
   public int compareTo(Experience one, Experience other)
   {
      Integer comp = 0;

      comp = InnerCompare.innerCompare(one, other);
      if (comp != null)
      {
         return comp;
      }
      DateTime date = one.getStartDateTime();
      comp = date.compareTo(other.getStartDateTime());
      if (comp != null && comp != 0)
      {
         return comp;
      }
      return Long.compare(one.getId(), other.getId());
   }

}
