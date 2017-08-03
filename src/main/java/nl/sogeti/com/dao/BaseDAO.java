/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Nov 20, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package  nl.sogeti.com.dao;

import static org.apache.commons.lang.StringUtils.containsNone;
import static org.apache.commons.lang.StringUtils.split;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import nl.sogeti.com.domain.Role;

import org.jboss.ejb3.annotation.SecurityDomain;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseDAO.
 */
@SecurityDomain("umd_policy")
@RolesAllowed({Role.ADMIN,Role.MANAGER})
public class BaseDAO
{

   /** The entity manager. */
   @PersistenceContext(unitName = "data-unit")
   private EntityManager entityManager;

   /**
    * Instantiates a new crud service.
    */
   protected BaseDAO()
   {
      super();
   }

   /**
    * Sets the entity manager.
    * 
    * @param entityManager the new entity manager
    */
   public void setEntityManager(EntityManager entityManager)
   {
      this.entityManager = entityManager;
   }

   /**
    * Persist.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @return the t
    */
   public <T> T persist(T entity)
   {
      this.entityManager.persist(entity);
      return entity;
   }

   /**
    * Merge.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @return the t
    */
   public <T> T merge(T entity)
   {
      return this.entityManager.merge(entity);
   }
   
   

   /**
    * Removes the.
    * 
    * @param <T> the generic type
    * @param entity the entity
    */
   public <T> void remove(T entity)
   {
      T attached = this.entityManager.merge(entity);
      this.entityManager.remove(attached);
   }

   /**
    * Find.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param key the key
    * @return the t
    */
   public <T> T find(Class<T> entity, Long key)
   {
      return this.entityManager.find(entity, key);
   }

   /**
    * Find.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param key the key
    * @return the t
    */
   public <T> T find(Class<T> entity, String key)
   {
      return this.entityManager.find(entity, key);
   }

   /**
    * Find.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param key the key
    * @return the t
    */
   public <T> T find(Class<T> entity, Object key)
   {
      return this.entityManager.find(entity, key);
   }

   /**
    * Find all.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @return the list
    */
   public <T> List<T> findAll(Class<T> entity)
   {
      CriteriaQuery<T> cq = this.entityManager.getCriteriaBuilder().createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      cq.select(entityRoot);
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }

   /**
    * Find all in descending order.
    *
    * @param <T> the generic type
    * @param entity the entity
    * @param orderColumn the order column
    * @return the list
    */
   public <T> List<T> findAllInDescendingOrder(Class<T> entity, String orderColumn)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      cq.select(entityRoot);
      cq.orderBy(cb.desc(entityRoot.get(orderColumn)));
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }

   public <T> List<T> findAllInAscendingOrder(Class<T> entity, String orderColumn)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      cq.select(entityRoot);
      cq.orderBy(cb.asc(entityRoot.get(orderColumn)));
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }
   /**
    * Find by property.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param property the property
    * @param value the value
    * @return the t
    */
   @PermitAll
   public <T> T findByProperty(Class<T> entity, String property, Object value)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      Predicate equalsProperty = cb.equal(getPropertyPath(entityRoot, property), value);
      cq.where(equalsProperty);
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return singleResult(query);
   }

   /**
    * Find all by property.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param property the property
    * @param value the value
    * @param orderColumn the order column
    * @return the list
    */
   public <T> List<T> findAllByPropertyInDescendingOrder(Class<T> entity, String property, Object value, String orderColumn)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      Predicate equalsProperty = cb.equal(getPropertyPath(entityRoot, property), value);
      cq.where(equalsProperty);
      cq.orderBy(cb.desc(entityRoot.get(orderColumn)));
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }

   /**
    * Find all by property.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param property the property
    * @param value the value
    * @return the list
    */
   public <T> List<T> findAllByProperty(Class<T> entity, String property, Object value)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      Predicate equalsProperty = cb.equal(getPropertyPath(entityRoot, property), value);
      cq.where(equalsProperty);
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }

   /**
    * Find by property.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param property the property
    * @param value the value
    * @return the t
    */
   public <T> T findByProperty(Class<T> entity, String[] property, Object[] value)
   {

      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      // get all the where clause conditions to form the query
      List<Predicate> conditions = generateConditions(entityRoot, cb, property, value);
      // add the conditions to the root query
      cq.where(conditions.toArray(new Predicate[conditions.size()]));
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return singleResult(query);
   }

   /**
    * List by property.
    * 
    * @param <T> the generic type
    * @param clazz the clazz
    * @param property the property
    * @param value the value
    * @return the list
    */
   public <T> List<T> listByProperty(Class<T> clazz, String property, Object value)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(clazz);
      Root<T> entityRoot = cq.from(clazz);
      List<Predicate> conditions = new ArrayList<>();
      addPredicate(entityRoot, cb, property, value, conditions);
      cq.where(conditions.toArray(new Predicate[conditions.size()]));
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }

   /**
    * List by property.
    * 
    * @param <T> the generic type
    * @param entity the entity
    * @param property the property
    * @param value the value
    * @return the list
    */
   public <T> List<T> listByProperty(Class<T> entity, String[] property, Object[] value)
   {
      CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
      CriteriaQuery<T> cq = cb.createQuery(entity);
      Root<T> entityRoot = cq.from(entity);
      // get all the where clause conditions to form the query
      List<Predicate> conditions = generateConditions(entityRoot, cb, property, value);
      // add the conditions to the root query
      cq.where(conditions.toArray(new Predicate[conditions.size()]));
      TypedQuery<T> query = this.entityManager.createQuery(cq);
      return query.getResultList();
   }

   /**
    * Generate conditions.
    * 
    * @param <T> the generic type
    * @param entityRoot the entity root
    * @param cb the cb
    * @param property the property
    * @param value the value
    * @return the list
    */
   protected <T> List<Predicate> generateConditions(Root<T> entityRoot, CriteriaBuilder cb, String[] property, Object[] value)
   {
      List<Predicate> conditions = new ArrayList<>();
      for (int i = 0, size = property.length; i < size; i++)
      {
         addPredicate(entityRoot, cb, property[i], value[i], conditions);
      }
      return conditions;
   }

   /**
    * Adds the predicate.
    * 
    * @param <T> the generic type
    * @param entityRoot the entity root
    * @param cb the cb
    * @param property the property
    * @param value the value
    * @param conditions the conditions
    */
   private <T> void addPredicate(Root<T> entityRoot, CriteriaBuilder cb, String property, Object value, List<Predicate> conditions)
   {
      if (String.valueOf(value).contains("*"))
      {
         Predicate likeProperty = cb.like(getPropertyPath(entityRoot, property).as(String.class), String.valueOf(value).replaceAll("\\*", "%"));
         conditions.add(likeProperty);
      }
      else
      {
         Predicate equalsProperty = cb.equal(getPropertyPath(entityRoot, property), value);
         conditions.add(equalsProperty);
      }
   }

   /**
    * Single result.
    * 
    * @param <T> the generic type
    * @param query the query
    * @return the t
    */
   private static <T> T singleResult(TypedQuery<T> query)
   {
      try
      {
         return query.getSingleResult();
      }
      catch (NoResultException nre)
      {
         return null;
      }
   }

   /**
    * Gets the property path.
    * 
    * @param <T> the generic type
    * @param entityRoot the entity root
    * @param property the property
    * @return the property path
    */
   protected <T> Path<String> getPropertyPath(Root<T> entityRoot, String property)
   {
      // of no . found means, its single property and return the property
      // path.
      if (containsNone(property, "."))
      {
         return entityRoot.get(property);
      }
      // in case of '.' found, first get the parent path expression,
      String[] properties = split(property, ".");
      Path<String> path = entityRoot.get(properties[0]);
      // then iterate through the rest of the properties and form the path to
      // reach to the child
      // properties.
      for (int i = 1, size = properties.length; i < size; i++)
      {
         path = path.get(properties[i]);
      }
      return path;
   }

   /**
    * Merge all.
    * 
    * @param <T> the generic type
    * @param all the all
    * @return the list
    */
   @DenyAll
   public <T> List<T> mergeAll(List<T> all)
   {
      List<T> merged = new ArrayList<>(all.size());
      for (T t : all)
      {
         merged.add(this.entityManager.merge(t));
      }
      return merged;
   }

   /**
    * Gets the entity manager.
    * 
    * @return the entity manager
    */
   public EntityManager getEntityManager()
   {
      return this.entityManager;
   }
}