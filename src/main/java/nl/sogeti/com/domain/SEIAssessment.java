/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 19, 2015 Sogeti Nederland B.V. All Rights Reserved.
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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

// TODO: Auto-generated Javadoc
/**
 * ????.
 * 
 * @author himtiwar (c) Feb 19, 2015, Sogeti B.V.
 * @version $Id:$
 */
@Entity
@Table(name = "sei_assessment")
@AttributeOverride(name = "id", column = @Column(name = "sei_assessment_id"))
public class SEIAssessment extends AbstractEntity
{

  
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = -1325220401161385210L;

   /** The Unit manager. */
   private String UnitManager;

   /** The employabilities. */
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "sei_assessment_employabilities", referencedColumnName = "select_listitem_id")
   private SelectListItem employabilities;

   /** The action plan. */
   @Lob
   @Type(type = "org.hibernate.type.StringClobType")
   private String actionPlan;

   /** The date of dialogue. */
   @NotNull
   @Temporal(TemporalType.TIMESTAMP)
   private Date dateOfDialogue;

   /** The status. */
   private String status;

   /** The client attachment. */
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "client_attachment_id")
   private ClientAttachment clientAttachment;

   /** The sogeti attachment. */
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "sogeti_attachment_id")
   private SogetiAttachment sogetiAttachment;

   /** The professional indicators. */
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "professional_indicators_id")
   private ProfessionalIndicators professionalIndicators;

   /** The performance indicators. */
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "performance_indicators_id")
   private PerformanceIndicators performanceIndicators;

   /** The sogeti attachment. */
   @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinColumn(name = "strategie_attachment_id")
   private StrategieAttachment strategieAttachment;

   /** The employee name. */
   @Transient
   private String employeeName;

   /** The logo path. */
   @Transient
   private String logoPath;

   /**
    * Constructor: create a new SEIAssessment.
    */
   public SEIAssessment()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * Get the unitManager.
    * 
    * @return Returns the unitManager as a String.
    */
   public String getUnitManager()
   {
      return this.UnitManager;
   }

   /**
    * Set the unitManager to the specified value.
    * 
    * @param unitManager The unitManager to set.
    */
   public void setUnitManager(String unitManager)
   {
      this.UnitManager = unitManager;
   }

   /**
    * Get the employabilities.
    * 
    * @return Returns the employabilities as a SelectListItem.
    */
   public SelectListItem getEmployabilities()
   {
      return this.employabilities;
   }

   /**
    * Set the employabilities to the specified value.
    * 
    * @param employabilities The employabilities to set.
    */
   public void setEmployabilities(SelectListItem employabilities)
   {
      this.employabilities = employabilities;
   }

   /**
    * Get the actionPlan.
    * 
    * @return Returns the actionPlan as a String.
    */
   public String getActionPlan()
   {
      return this.actionPlan;
   }

   /**
    * Set the actionPlan to the specified value.
    * 
    * @param actionPlan The actionPlan to set.
    */
   public void setActionPlan(String actionPlan)
   {
      this.actionPlan = actionPlan;
   }

   /**
    * Get the dateOfDialogue.
    * 
    * @return Returns the dateOfDialogue as a Date.
    */
   public Date getDateOfDialogue()
   {
      return this.dateOfDialogue;
   }

   /**
    * Set the dateOfDialogue to the specified value.
    * 
    * @param dateOfDialogue The dateOfDialogue to set.
    */
   public void setDateOfDialogue(Date dateOfDialogue)
   {
      this.dateOfDialogue = dateOfDialogue;
   }

   /**
    * Get the status.
    * 
    * @return Returns the status as a SelectListItem.
    */
   public String getStatus()
   {
      return this.status;
   }

   /**
    * Set the status to the specified value.
    * 
    * @param status The status to set.
    */
   public void setStatus(String status)
   {
      this.status = status;
   }

   /**
    * Get the clientAttachment.
    * 
    * @return Returns the clientAttachment as a ClientAttachment.
    */
   public ClientAttachment getClientAttachment()
   {
      return this.clientAttachment;
   }

   /**
    * Set the clientAttachment to the specified value.
    * 
    * @param clientAttachment The clientAttachment to set.
    */
   public void setClientAttachment(ClientAttachment clientAttachment)
   {
      this.clientAttachment = clientAttachment;
   }

   /**
    * Get the sogetiAttachment.
    * 
    * @return Returns the sogetiAttachment as a SogetiAttachment.
    */
   public SogetiAttachment getSogetiAttachment()
   {
      return this.sogetiAttachment;
   }

   /**
    * Set the sogetiAttachment to the specified value.
    * 
    * @param sogetiAttachment The sogetiAttachment to set.
    */
   public void setSogetiAttachment(SogetiAttachment sogetiAttachment)
   {
      this.sogetiAttachment = sogetiAttachment;
   }

   /**
    * Get the professionalIndicators.
    * 
    * @return Returns the professionalIndicators as a ProfessionalIndicators.
    */
   public ProfessionalIndicators getProfessionalIndicators()
   {
      return this.professionalIndicators;
   }

   /**
    * Set the professionalIndicators to the specified value.
    * 
    * @param professionalIndicators The professionalIndicators to set.
    */
   public void setProfessionalIndicators(ProfessionalIndicators professionalIndicators)
   {
      this.professionalIndicators = professionalIndicators;
   }

   /**
    * Get the performanceIndicators.
    * 
    * @return Returns the performanceIndicators as a PerformanceIndicators.
    */
   public PerformanceIndicators getPerformanceIndicators()
   {
      return this.performanceIndicators;
   }

   /**
    * Set the performanceIndicators to the specified value.
    * 
    * @param performanceIndicators The performanceIndicators to set.
    */
   public void setPerformanceIndicators(PerformanceIndicators performanceIndicators)
   {
      this.performanceIndicators = performanceIndicators;
   }

   /**
    * Gets the employee name.
    *
    * @return the employeeName
    */
   public String getEmployeeName()
   {
      return employeeName;
   }

   /**
    * Sets the employee name.
    *
    * @param employeeName the employeeName to set
    */
   public void setEmployeeName(String employeeName)
   {
      this.employeeName = employeeName;
   }

   /**
    * Gets the logo path.
    *
    * @return the logoPath
    */
   public String getLogoPath()
   {
      return logoPath;
   }

   /**
    * Sets the logo path.
    *
    * @param logoPath the logoPath to set
    */
   public void setLogoPath(String logoPath)
   {
      this.logoPath = logoPath;
   }

   /**
    * Gets the strategie attachment.
    *
    * @return the strategie attachment
    */
   public StrategieAttachment getStrategieAttachment()
   {
      return strategieAttachment;
   }

   /**
    * Sets the strategie attachment.
    *
    * @param strategieAttachment the new strategie attachment
    */
   public void setStrategieAttachment(StrategieAttachment strategieAttachment)
   {
      this.strategieAttachment = strategieAttachment;
   }

}
