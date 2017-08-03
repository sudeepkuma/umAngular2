/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Sep 24, 2015 Sogeti Nederland B.V. All Rights Reserved.
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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ????
 * 
 * @version $Id:$
 * @author mkangule (c) Sep 24, 2015, Sogeti B.V.
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "uploadedDocuments")
@AttributeOverride(name = "id", column = @Column(name = "document_id"))
public class UploadedDocuments extends AbstractEntity
{

   private String documnetName;
   
   private long employeeId;

   @Basic(fetch = FetchType.LAZY)
   @Lob
   private byte[] documentContents;

   private String documentType;

   private String createdBy;

   @Temporal(TemporalType.DATE)
   private Date uploadDate;
   
   
   

   public String getDocumnetName()
   {
      return documnetName;
   }

   public void setDocumnetName(String documnetName)
   {
      this.documnetName = documnetName;
   }

   public byte[] getDocumentContents()
   {
      return documentContents;
   }

   public void setDocumentContents(byte[] documentContents)
   {
      this.documentContents = documentContents;
   }

   public String getDocumentType()
   {
      return documentType;
   }

   public void setDocumentType(String documentType)
   {
      this.documentType = documentType;
   }

   public String getCreatedBy()
   {
      return createdBy;
   }

   public void setCreatedBy(String createdBy)
   {
      this.createdBy = createdBy;
   }

   public Date getUploadDate()
   {
      return uploadDate;
   }

   public void setUploadDate(Date uploadDate)
   {
      this.uploadDate = uploadDate;
   }

   public long getEmployeeId()
   {
      return employeeId;
   }

   public void setEmployeeId(long employeeId)
   {
      this.employeeId = employeeId;
   }

}
