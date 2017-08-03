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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import nl.sogeti.com.comparator.ConversationComparator;

import org.hibernate.annotations.Type;

/**
 * This entity represents a conversation with an employee.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "conversations")
@AttributeOverride(name = "id", column = @Column(name = "conversation_id"))
public class Conversation extends AbstractEntity
{

   /**
    * The date on which the conversation was held.
    */
   @Temporal(TemporalType.TIMESTAMP)
   @NotNull(message = "You need to set the date")
   private Date date;
   /**
    * The rapport of the conversation written by the unit-manager.
    */
   @Lob
   @Type(type = "org.hibernate.type.StringClobType")
   private String rapport;
   /**
    * So this conversation in the overview.
    */
   private boolean show = true;

   /** If this conversation is already in BIS. */
   private boolean inBIS = false;

   /** The conversations. */
   @Transient
   private List<Conversation> conversations;

   /**
    * standard constructor.
    */
   public Conversation()
   {
   }

   /**
    * Convenience constructor.
    * 
    * @author muizerma
    * @param date the date
    * @param rapport the rapport
    * @param show the show
    * @param inBIS the in bis
    */
   public Conversation(Date date, String rapport, boolean show, boolean inBIS)
   {
      this.date = copy(date);
      this.rapport = rapport;
      this.show = show;
      this.inBIS = inBIS;
   }

   /**
    * Convenience constructor.
    * 
    * @author muizerma
    * @param date the date
    * @param rapport the rapport
    */
   public Conversation(Date date, String rapport)
   {
      this(date, rapport, true, false);
   }

   /**
    * Instantiates a new conversation.
    *
    * @param employee the employee
    */
   public Conversation(Employee employee)
   {
      super(employee);
      if (!employee.getConversations().isEmpty())
      {
         this.conversations = getList(employee.getConversations());
      }
   }

   /**
    * Gets the list.
    *
    * @param conversations the conversations
    * @return the list
    */
   public List<Conversation> getList(Set<Conversation> conversations)
   {
      List<Conversation> result = new ArrayList<Conversation>();
      for (Conversation con : conversations)
      {
         result.add(con);
      }
      Collections.sort(result, new ConversationComparator());
      return result;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Conversation{" + "date=" + this.date + ", rapport='" + this.rapport + '\'' + ", show=" + this.show + ", inBIS=" + this.inBIS + '}';
   }

   /**
    * Gets the date on which the conversation was held.
    * 
    * @return the date on which the conversation was held
    */
   public Date getDate()
   {
      return copy(this.date);
   }

   /**
    * Sets the date on which the conversation was held.
    * 
    * @param date the new date on which the conversation was held
    */
   public void setDate(Date date)
   {
      Objects.requireNonNull(date);
      this.date = copy(date);
   }

   /**
    * Gets the rapport of the conversation written by the unit-manager.
    * 
    * @return the rapport of the conversation written by the unit-manager
    */
   public String getRapport()
   {
      return this.rapport;
   }

   /**
    * Sets the rapport of the conversation written by the unit-manager.
    * 
    * @param rapport the new rapport of the conversation written by the unit-manager
    */
   public void setRapport(String rapport)
   {
      this.rapport = rapport;
   }

   /**
    * Checks if is so this conversation in the overview.
    * 
    * @return the so this conversation in the overview
    */
   public boolean isShow()
   {
      return this.show;
   }

   /**
    * Sets the so this conversation in the overview.
    * 
    * @param show the new so this conversation in the overview
    */
   public void setShow(boolean show)
   {
      this.show = show;
   }

   /**
    * Checks if is if this conversation is already in BIS.
    * 
    * @return the if this conversation is already in BIS
    */
   public boolean isInBIS()
   {
      return this.inBIS;
   }

   /**
    * Sets the if this conversation is already in BIS.
    * 
    * @param inBIS the new if this conversation is already in BIS
    */
   public void setInBIS(boolean inBIS)
   {
      this.inBIS = inBIS;
   }

   /**
    * Get the conversations.
    * 
    * @return Returns the conversations as a List<Conversation>.
    */
   public List<Conversation> getConversations()
   {
      return this.conversations;
   }

   /**
    * Set the conversations to the specified value.
    * 
    * @param conversations The conversations to set.
    */
   public void setConversations(List<Conversation> conversations)
   {
      this.conversations = conversations;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + (int)id;
      return result;
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      Conversation other = (Conversation) obj;
      if (id == 0)
      {
         if (other.id != 0)
            return false;
      }
      else if (id != other.id)
         return false;
      return true;
   }
 
   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Conversation;
   }
   
   
   
}
