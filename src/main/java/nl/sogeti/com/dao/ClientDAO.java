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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJBTransactionRolledbackException;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import nl.sogeti.com.domain.Branche;
import nl.sogeti.com.domain.Client;
import nl.sogeti.com.domain.Employee;
import nl.sogeti.com.domain.Role;
import nl.sogeti.com.domain.User;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class ClientDAO.
 */
@Stateless
@RolesAllowed({ Role.ADMIN, Role.MANAGER })
public class ClientDAO extends BaseDAO
{

   /** The Constant LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(ClientDAO.class);
private static final String SAVED = "Client already Exists";

   /**
    * Find client by name.
    * 
    * @param name the name
    * @return the client
    */
   public Client findClientByName(String name)
   {
      LOGGER.info("ClientDAO. Client By Name");
      CriteriaBuilder criteriaBuilder = super.getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Client> criteriaQuery = criteriaBuilder.createQuery(Client.class);
      Root<Client> entityRoot = criteriaQuery.from(Client.class);
      criteriaQuery.where(criteriaBuilder.like(criteriaBuilder.upper(entityRoot.get("name").as(String.class)), name));
      TypedQuery<Client> query = super.getEntityManager().createQuery(criteriaQuery);
      try
      {
         return query.getSingleResult();
      }
      catch (NoResultException e)
      {
         return null;
      }

   }

   /**
    * Find employee by name.
    * 
    * @param name the name
    * @return the employee
    */
   public Employee findEmployeeByName(String name)
   {
      CriteriaBuilder criteriaBuilder = super.getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
      Root<Employee> entityRoot = criteriaQuery.from(Employee.class);
      criteriaQuery.where(criteriaBuilder.like(entityRoot.get("name").as(String.class), name));
      TypedQuery<Employee> query = super.getEntityManager().createQuery(criteriaQuery);
      return query.getSingleResult();

   }

   /**
    * Find client by id.
    * 
    * @param id the id
    * @return the client
    */
   public Client findClientById(long id)
   {
      LOGGER.info("ClientDAO.findClientById");
      Client clientDTO = null;
      Client client = super.find(Client.class, id);

      if (client != null)
      {
         clientDTO = new Client(client);
      }
      return clientDTO;
   }

   /**
    * Find by name.
    * 
    * @param name the name
    * @return the client
    */
   public Client findByName(String name)
   {
      Client clientDTO = null;
      Client client = findClientByName(name.toUpperCase());

      if (client != null)
      {
         clientDTO = new Client(client);
      }
      return clientDTO;
   }

   /**
    * Find all client.
    * 
    * @return the list
    */
   public List<Client> findAllClient()
   {
      LOGGER.info("ClientDAO.All ClientList ");
      List<Client> list = new ArrayList<Client>();
      for (Client client : super.findAll(Client.class))
      {
         list.add(new Client(client));
      }
      return list;
   }

   /**
    * Find all by name.
    * 
    * @param name the name
    * @return the list
    */
   public List<Client> findAllByName(String name)
   {
      LOGGER.info("ClientDAO.ClientList By Name ");
      List<Client> list = new ArrayList<Client>();
      for (Client client : findAllClientByName(name.toUpperCase() + "%"))
      {
         list.add(new Client(client));
      }
      return list;
   }

   /**
    * Find all client by name.
    * 
    * @param name the name
    * @return the list
    */
   public List<Client> findAllClientByName(String name)
   {
      CriteriaBuilder criteriaBuilder = super.getEntityManager().getCriteriaBuilder();
      CriteriaQuery<Client> criteriaQuery = criteriaBuilder.createQuery(Client.class);
      Root<Client> entityRoot = criteriaQuery.from(Client.class);
      criteriaQuery.where(criteriaBuilder.like(criteriaBuilder.upper(entityRoot.get("name").as(String.class)), name));
      criteriaQuery.orderBy(criteriaBuilder.asc(entityRoot.get("name")));
      TypedQuery<Client> query = super.getEntityManager().createQuery(criteriaQuery);
      return query.getResultList();

   }
   public List<Client> findClientsByName(String names){
	  List<Client> listOfClient = getEntityManager().createQuery("select u from Client u where u.name = '"+ names + "'", Client.class).getResultList();
	   return listOfClient;
   }

   /**
    * Save client.
    * 
    * @param argClient the client dto
    * @param username the username
    * @return the client
    */
   public Client saveClient(Client argClient, String username)
   {

      Client client = null;
      if (argClient != null && argClient.getId() != 0)
      {
         client = super.find(Client.class, argClient.getId());
      }
      else if ((argClient == null ? false : StringUtils.isNotBlank(argClient.getName())) && client == null)
      {
         client = findByName(argClient.getName());
      }
      if (client == null && StringUtils.isNotBlank(argClient.getName()))
      {
         LOGGER.info("ClientDAO.save Client");
         User user = this.findByProperty(User.class, "ldapUser", username);

         /*
          * client.setUsername(user.getEmployee().getName()); //client.setAddress(new Address()); client.setName(argClient.getName()); client.setAddress(argClient.getAddress());
          */
         argClient.setUsername(user.getEmployee().getName());
         super.persist(argClient);

         return argClient;
      }
      return client;
   }

   /**
    * Find client.
    * 
    * @param argClient the arg client
    * @return the client
    */
   public Client findClient(Client argClient)
   {
      LOGGER.info("ClientDAO.Find Client");
      Client client = null;
      if (argClient != null && argClient.getId() != 0)
      {
         client = super.find(Client.class, argClient.getId());
      }
      if ((argClient == null ? false : StringUtils.isNotBlank(argClient.getName())) && client == null)
      {
         client = findByName(argClient.getName());
      }

      return client;
   }

   /**
    * Update client.
    * 
    * @param argClient the arg client
    */
   public void updateClient(Client argClient)
   {
	  
      LOGGER.info("ClientDAO.update Client Details");
      try{
      Client client = null;
      if (argClient != null && argClient.getId() != 0)
      {
         client = super.find(Client.class, argClient.getId());
      }
      if (client == null)
      {
         client = findByName(argClient.getName());
      }
      if (client != null)
      {
         client.setName(argClient.getName());
         client.setDefaultRelationManager(null);
         client.setAddress(argClient.getAddress());
         client.setBranche(null);
         super.merge(client);
      }
      }catch(EJBTransactionRolledbackException e){
    	  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, SAVED, ""));
      }

   }

   /**
    * Find all by branche.
    * 
    * @param branche the branche
    * @return the list
    */
   public List<Client> findAllByBranche(Branche branche)
   {
      LOGGER.info("ClientDAO.Client List By Branche");

      return super.listByProperty(Client.class, "branche", branche);
   }

   /**
    * Find all client by status.
    * 
    * @return the list
    */
   public List<Client> findAllClientByStatus()
   {

      LOGGER.info("ClientDAO.Client List By Status");
      return super.listByProperty(Client.class, "approved", false);
   }
}
