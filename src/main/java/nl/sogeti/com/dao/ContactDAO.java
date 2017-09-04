/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Nov 21, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.dao;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

import nl.sogeti.com.domain.Contact;
import nl.sogeti.com.domain.Role;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ContactDAO.
 */
@Stateless
@RolesAllowed({ Role.ADMIN, Role.MANAGER })
public class ContactDAO extends BaseDAO
{

   /** The Constant LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(ContactDAO.class);

   /**
    * Save contact.
    * 
    * @param argContact the contact dto
    * @param client the client
    * @return the contact
    */
   public Contact saveContact(Contact argContact)
   {
      LOGGER.info("ContactDAO.saveContact");
      Contact contact = null;

      if (argContact != null && argContact.getId() != 0 && StringUtils.isNotBlank(argContact.getName()))
      {
         contact = super.find(Contact.class, argContact.getId());
      }
      if (argContact != null && contact == null && StringUtils.isNotBlank(argContact.getName()))
      {
         contact = new Contact();
         contact.setName(argContact.getName());
         contact.setTelephone(argContact.getTelephone());
         //contact.setClient(null);
         super.persist(contact);
      }
      return contact;
   }

}
