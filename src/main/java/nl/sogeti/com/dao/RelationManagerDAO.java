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

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import nl.sogeti.com.domain.Client;
import nl.sogeti.com.domain.RelationManager;
import nl.sogeti.com.domain.Role;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class RelationManagerDAO.
 */
@Stateless
@RolesAllowed({ Role.ADMIN, Role.MANAGER })
public class RelationManagerDAO extends BaseDAO
{

   /** The Constant LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(RelationManagerDAO.class);

   /**
    * Find by name.
    * 
    * @param name the name
    * @return the relation manager
    */
   public RelationManager findByName(String name)
   {
      LOGGER.info("RelationManagerDAO.findByName");

      
         CriteriaBuilder criteriaBuilder = super.getEntityManager().getCriteriaBuilder();
         CriteriaQuery<RelationManager> criteriaQuery = criteriaBuilder.createQuery(RelationManager.class);
         Root<RelationManager> entityRoot = criteriaQuery.from(RelationManager.class);

         criteriaQuery.where(criteriaBuilder.like(criteriaBuilder.upper(entityRoot.get("name").as(String.class)), name));
         TypedQuery<RelationManager> query = super.getEntityManager().createQuery(criteriaQuery);
      try
       {
         return query.getSingleResult();
      }
      catch (NoResultException e)
      {
         LOGGER.error("Relation manager with name: " + name + "not found");
         return null;
      }
   }

   /**
    * Find all by name.
    * 
    * @param name the name
    * @return the list
    */
   public List<RelationManager> findAllByName(String name)
   {
      LOGGER.info("RelationManagerDAO.findAllByName");

      try
      {
         CriteriaBuilder criteriaBuilder = super.getEntityManager().getCriteriaBuilder();
         CriteriaQuery<RelationManager> criteriaQuery = criteriaBuilder.createQuery(RelationManager.class);
         Root<RelationManager> entityRoot = criteriaQuery.from(RelationManager.class);

         criteriaQuery.where(criteriaBuilder.like(criteriaBuilder.upper(entityRoot.get("name").as(String.class)), name));
         TypedQuery<RelationManager> query = super.getEntityManager().createQuery(criteriaQuery);
         return query.getResultList();
      }
      catch (NoResultException e)
      {
         LOGGER.error("Relation manager with name: " + name + "not found");
         return null;
      }
   }

   /**
    * Save relation manager.
    * 
    * @param argrelationManager the relation manager dto
    * @return the relation manager
    */
   public RelationManager saveRelationManager(RelationManager argrelationManager)
   {
      LOGGER.info("RelationManagerDAO.saveRelationManager");
      RelationManager relationManager = null;
      if (argrelationManager != null && argrelationManager.getId() != 0)
      {
         relationManager = super.find(RelationManager.class, argrelationManager.getId());
      }
      if (relationManager == null && StringUtils.isNotBlank(argrelationManager.getName()))
      {
         relationManager = findByName(argrelationManager.getName().toUpperCase());
      }
      if (relationManager == null && StringUtils.isNotBlank(argrelationManager.getName()))
      {
         relationManager = new RelationManager();
         relationManager.setName(argrelationManager.getName());
         super.persist(relationManager);
      }
      return relationManager;
   }

   /**
    * Find all by relation manager.
    * 
    * @param relationManager the relation manager
    * @return the list
    */
   public List<Client> findAllByRelationManager(RelationManager relationManager)
   {
      LOGGER.info("RelationManagerDAO.findAllByRelationManager");

      return super.listByProperty(Client.class, "defaultRelationManager", relationManager);

   }

}
