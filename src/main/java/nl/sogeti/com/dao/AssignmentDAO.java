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

import java.util.Date;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import nl.sogeti.com.domain.Assignment;
import nl.sogeti.com.domain.Client;
import nl.sogeti.com.domain.Contact;
import nl.sogeti.com.domain.Employee;
import nl.sogeti.com.domain.RelationManager;
import nl.sogeti.com.domain.Role;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class AssignmentDAO.
 */
@Stateless
public class AssignmentDAO 
{
	@PersistenceContext(unitName = "data-unit")
	private EntityManager entityManager;

   /** The Constant LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(AssignmentDAO.class);




	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

   /**
    * Find previous by employee id.
    * 
    * @param employeeId the employee id
    * @return the list
    */
   public List<Assignment> findAllAssignmentsByEmployeeId(long employeeId)
   {
        List<Assignment> listOfAssignment = getEntityManager().createQuery("select e from Assignment e where e.employee = " + employeeId + " order by e.end", Assignment.class).setMaxResults(1).getResultList();
		return listOfAssignment;
   }
   



}