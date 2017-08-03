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

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;

/**
 * This class represents an assignment. I.e. a job for a client.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "assignments")
@AttributeOverride(name = "id", column = @Column(name = "assignment_id"))
public class Assignment extends AbstractEntity implements Comparable<Assignment>
{

   /** A short description of the assignment. */
   @Lob
   @Type(type = "org.hibernate.type.StringClobType")
   private String description;

   /** The date on which the assignment started. */
   private Date start;

   /** The date on which the assignment ended/going to end. */
   @Column(name = "\"end\"")
   private Date end;

   /** The employee which is executing the assignment. */
   @ManyToOne
   @NotNull
   @JoinColumn(name = "employee_id")
   private Employee employee;
   /**
    * The relation-manager for this assignment.
    */
   @ManyToOne
   @JoinColumn(name = "relationmanager_id")
   private RelationManager relationManager;

   /** The daily rate for this assignment. */
   private BigDecimal dailyRate;

   /** The target rate for this assignment. */
   private BigDecimal targetRate;

   /** The client. */
   @ManyToOne
   @JoinColumn(name = "client_id")
   private Client client;

   /** The contact. */
   @ManyToOne
   @JoinColumn(name = "contact_id")
   private Contact contact;
   
   private Date creationdate;

   /*
    * @NotNull private boolean archive;
    */

   /** The previous assignments. */
   @Transient
   private List<Assignment> previousAssignments = null;

   /** The start date time. */
   @Transient
   private DateTime startDateTime;

   /** The end date time. */
   @Transient
   private DateTime endDateTime;

   /**
    * Instantiates a new assignment.
    */
   public Assignment()
   {
      this.client = new Client();
      this.relationManager = new RelationManager();
      this.contact = new Contact();
   }

   /**
    * Instantiates a new assignment.
    * 
    * @param employee the employee
    */
   public Assignment(Employee employee)
   {
      super(employee);
      this.client = new Client(employee.getClient());
   }

   /**
    * Instantiates a new assignment.
    * 
    * @param assignment the assignment
    */
   public Assignment(Assignment assignment)
   {

      super(assignment.getId());
      this.description = assignment.getDescription();

      if (assignment.getStart() != null)
      {
         this.startDateTime = new DateTime(assignment.getStart());
      }

      if (assignment.getEnd() != null)
      {
         this.endDateTime = new DateTime(assignment.getEnd());
      }
      
      if (assignment.getCreationdate() != null)
      {
         this.creationdate = assignment.getEnd();
      }
      
      this.client = assignment.getClient() == null ? null : assignment.getClient();
      this.relationManager = assignment.getRelationManager() == null ? null : assignment.getRelationManager();
      this.contact = assignment.getContact() == null ? null : assignment.getContact();

   }

   /**
    * Gets the contact dto.
    * 
    * @param assignment the assignment
    * @return the contact dto
    */
   public void getContactDTO(Assignment assignment)
   {
      Contact contact = new Contact();
      if (assignment.getContact() != null)
      {
         contact.setName(assignment.getContact().getName());
         contact.setTelephone(assignment.getContact().getTelephone());

      }
      this.contact = contact;
   }

   /**
    * Builds the assignment.
    * 
    * @param argassignment the argassignment
    * @return the assignment
    */
   public Assignment buildAssignment(Assignment argassignment)
   {
      if (argassignment == null)
      {
         return new Assignment();
      }
      Assignment assignment = new Assignment(argassignment);
      assignment.setClient(getClientByAssignmet(argassignment));
      assignment.setRelationManager(getRelationManager(argassignment));
      assignment.setContact(getContactByAssignmet(argassignment));
      return assignment;
   }

   /**
    * Gets the client by assignmet.
    * 
    * @param assignment the assignment
    * @return the client by assignmet
    */
   private Client getClientByAssignmet(Assignment assignment)
   {

      Client client = new Client();
      if (assignment.getClient() != null)
      {
         /*client.setId(assignment.getClient().getId());
         client.setName(assignment.getClient().getName());
         client.setApproved(assignment.getClient().isApproved());
         if (assignment.getClient().getAddress() != null)
         {
            Address address = new Address();
            address.setId(assignment.getClient().getAddress().getId());
            address.setStreet(assignment.getClient().getAddress().getStreet());
            address.setNumber(assignment.getClient().getAddress().getNumber());
            address.setPostalCode(assignment.getClient().getAddress().getPostalCode());
            address.setCity(assignment.getClient().getAddress().getCity());
            address.setCountry(assignment.getClient().getAddress().getCountry());
            client.setAddress(address);
         }
         
         
*/      
         client=assignment.getClient();
         }
      return client;
   }

   /**
    * Gets the relation manager.
    * 
    * @param assignment the assignment
    * @return the relation manager
    */
   private RelationManager getRelationManager(Assignment assignment)
   {
      RelationManager relationManager = new RelationManager();
      if (assignment.getRelationManager() != null)
      {
         relationManager.setName(assignment.getRelationManager().getName());
      }
      return relationManager;
   }

   /**
    * Gets the contact by assignmet.
    * 
    * @param assignment the assignment
    * @return the contact by assignmet
    */
   public Contact getContactByAssignmet(Assignment assignment)
   {
      Contact contact = new Contact();
      if (assignment.getContact() != null)
      {
         contact.setName(assignment.getContact().getName());
         contact.setTelephone(assignment.getContact().getTelephone());
      }
      return contact;
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

   /**
    * Gets the previous assignments.
    * 
    * @return the previous assignments
    */
   public List<Assignment> getPreviousAssignments()
   {
      return this.previousAssignments;
   }

   /**
    * Sets the previous assignments.
    * 
    * @param previousAssignments the new previous assignments
    */
   public void setPreviousAssignments(List<Assignment> previousAssignments)
   {
      this.previousAssignments = previousAssignments;
   }

   /**
    * Gets the description.
    * 
    * @return the description
    */
   public String getDescription()
   {
      return this.description;
   }

   /**
    * Sets the description.
    * 
    * @param description the new description
    */
   public void setDescription(String description)
   {
      this.description = description;
   }

   /**
    * Gets the start.
    * 
    * @return the start
    */
   public Date getStart()
   {
      return copy(this.start);
   }

   /**
    * Sets the start.
    * 
    * @param start the new start
    */
   public void setStart(Date start)
   {
      this.start = copy(start);
   }

   /**
    * Gets the end.
    * 
    * @return the end
    */
   public Date getEnd()
   {
      return copy(this.end);
   }

   /**
    * Sets the end.
    * 
    * @param end the new end
    */
   public void setEnd(Date end)
   {
      this.end = copy(end);
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
    * @param client the new employee
    */
   public void setEmployee(Employee client)
   {
      Objects.requireNonNull(client);
      this.employee = client;
   }

   /**
    * Gets the relation manager.
    * 
    * @return the relation manager
    */
   public RelationManager getRelationManager()
   {
      return this.relationManager;
   }

   /**
    * Sets the relation manager.
    * 
    * @param relationManager the new relation manager
    */
   public void setRelationManager(RelationManager relationManager)
   {
      this.relationManager = relationManager;
   }

   /**
    * Gets the daily rate.
    * 
    * @return the daily rate
    */
   public BigDecimal getDailyRate()
   {
      return this.dailyRate;
   }

   /**
    * Sets the daily rate.
    * 
    * @param dailyRate the new daily rate
    */
   public void setDailyRate(BigDecimal dailyRate)
   {
      this.dailyRate = dailyRate;
   }

   /**
    * Gets the target rate.
    * 
    * @return the target rate
    */
   public BigDecimal getTargetRate()
   {
      return this.targetRate;
   }

   /**
    * Sets the target rate.
    * 
    * @param targetRate the new target rate
    */
   public void setTargetRate(BigDecimal targetRate)
   {
      this.targetRate = targetRate;
   }

   /**
    * Gets the client.
    * 
    * @return the client
    */
   public Client getClient()
   {
      return this.client;
   }

   /**
    * Sets the client.
    * 
    * @param client the new client
    */
   public void setClient(Client client)
   {
      this.client = client;
   }

   /**
    * Gets the contact.
    * 
    * @return the contact
    */
   public Contact getContact()
   {
      return this.contact;
   }

   /**
    * Sets the contact.
    * 
    * @param contact the new contact
    */
   public void setContact(Contact contact)
   {
      this.contact = contact;
   }

   /*
    * public boolean isArchive() { return archive; } public void setArchive(boolean archive) { this.archive = archive; }
    */

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Assignment) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Assignment;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#hashCode()
    */
   @Override
   public final int hashCode()
   {
      return super.hashCode();
   }

   /*
    * (non-Javadoc)
    * @see java.lang.Comparable#compareTo(java.lang.Object)
    */
   @Override
   public int compareTo(Assignment other)
   {
      // Won't compare to null
      if (other == null)
      {
         return -1;
      }

      DateTimeComparator comparator = DateTimeComparator.getInstance();

      int compr = comparator.compare(getEnd(), other.getEnd());
      if (compr != 0)
      {
         return compr;
      }

      compr = comparator.compare(getStart(), other.getStart());
      if (compr != 0)
      {
         return compr;
      }

      // If we are here, both assignment are still current or ended at the
      // same date. Now sort by id (entry sequence)
      return Long.compare(getId(), other.getId());
   }

   public Date getCreationdate()
   {
      return creationdate;
   }

   public void setCreationdate(Date creationdate)
   {
      this.creationdate = creationdate;
   }
}