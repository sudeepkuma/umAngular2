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

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

/**
 * This class represents an action to be taken.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "actions")
@AttributeOverride(name = "id", column = @Column(name = "action_id"))
public class Action extends AbstractEntity implements Comparable<Action>
{

   /** private long id; *. */
   @Transient
   private long id;

   /**
    * The Enum Status.
    */
   public enum Status
   {

      /** The opgevoerd. */
      OPGEVOERD,
      /** The uitgevoerd. */
      UITGEVOERD,
      /** The afgerond. */
      AFGEROND
   }

   /** Describes the action. */
   private String text;

   /** The one who has to perform the action. */
   @Column(length = 5)
   private String performer;

   /** The status. */
   @Enumerated(EnumType.STRING)
   private Status status;
   /**
    * Action creation date.
    */
   @NotNull
   @Temporal(TemporalType.DATE)
   private Date creationDate;

   /** Action due date. */
   @NotNull
   @Temporal(TemporalType.DATE)
   private Date dueDate;

   /** The sequence number. */
   @NotNull
   private long sequenceNumber;

   /** The employee. */
   @ManyToOne
   @JoinTable(name = "employee_actions", joinColumns = @JoinColumn(name = "action_id"), inverseJoinColumns = @JoinColumn(name = "employee_id"))
   private Employee employee;

   /**
    * Instantiates a new action.
    */
   public Action()
   {

   }

   /**
    * Gets the one who has to perform the action.
    * 
    * @return the one who has to perform the action
    */
   public String getPerformer()
   {
      return this.performer;
   }

   /**
    * Sets the one who has to perform the action.
    * 
    * @param performer the new one who has to perform the action
    */
   public void setPerformer(String performer)
   {
      this.performer = performer;
   }

   /**
    * Gets the status.
    * 
    * @return the status
    */
   public Status getStatus()
   {
      return this.status;
   }

   /**
    * Sets the status.
    * 
    * @param status the new status
    */
   public void setStatus(Status status)
   {
      this.status = status;
   }

   /**
    * Gets the describes the action.
    * 
    * @return the describes the action
    */
   public String getText()
   {
      return this.text;
   }

   /**
    * Sets the describes the action.
    * 
    * @param text the new describes the action
    */
   public void setText(String text)
   {
      this.text = text;
   }

   /**
    * Gets the action creation date.
    * 
    * @return the action creation date
    */
   public Date getCreationDate()
   {
      return copy(this.creationDate);
   }

   /**
    * Sets the action creation date.
    * 
    * @param date the new action creation date
    */
   public void setCreationDate(Date date)
   {
      Objects.requireNonNull(date);
      this.creationDate = copy(date);
   }

   /**
    * Gets the action due date.
    * 
    * @return the action due date
    */
   public Date getDueDate()
   {
      return copy(this.dueDate);
   }

   /**
    * Sets the action due date.
    * 
    * @param date the new action due date
    */
   public void setDueDate(Date date)
   {
      Objects.requireNonNull(date);
      this.dueDate = copy(date);
   }

   /**
    * Gets the sequence number.
    * 
    * @return the sequence number
    */
   public long getSequenceNumber()
   {
      return this.sequenceNumber;
   }

   /**
    * Sets the sequence number.
    * 
    * @param sequenceNumber the new sequence number
    */
   public void setSequenceNumber(long sequenceNumber)
   {
      this.sequenceNumber = sequenceNumber;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#getId()
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

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Action) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Action;
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
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(Action other)
   {
      if (other == null)
      {
         return -1;
      }
      if (getCreationDate().equals(other.getCreationDate()))
      {
         // compare sequencenr
         if (this.sequenceNumber > other.getSequenceNumber())
         {
            return -1;
         }
         else
         {
            return 1;
         }
      }

      return other.getCreationDate().compareTo(getCreationDate());
   }

   /**
    * Gets the employee.
    * 
    * @return the employee
    */
   public Employee getEmployee()
   {
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

   /**
    * Sets the action dto list fields.
    *
    * @param ActionDTOList the action dto list
    * @param employee the employee
    */
   public static void setActionDTOListFields(Collection<Action> ActionDTOList, Employee employee)
   {
      Map<Long, Action> actionDTOMap = toMap(ActionDTOList);
      for (Action action : employee.getActions())
      {
         Action actionDTO = actionDTOMap.get(action.getId());
         if (actionDTO == null)
         {
            continue;
         }
         action.setPerformer(actionDTO.getPerformer());
         action.setText(actionDTO.getText());
         action.setStatus(actionDTO.getStatus());
         action.setCreationDate(actionDTO.getCreationDate());
         action.setDueDate(actionDTO.getDueDate());
      }
   }

   /**
    * To map.
    * 
    * @param ActionDTOList the action dto list
    * @return the map
    */
   private static Map<Long, Action> toMap(Collection<Action> ActionDTOList)
   {
      Map<Long, Action> actionDTOMap = new HashMap<Long, Action>();

      for (Action actionDTO : ActionDTOList)
      {
         if (actionDTOMap.get(actionDTO.getId()) == null)
         {
            actionDTOMap.put(actionDTO.getId(), actionDTO);
         }
      }
      return actionDTOMap;
   }
}
