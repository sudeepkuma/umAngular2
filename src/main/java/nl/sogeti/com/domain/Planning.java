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

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.joda.time.DateTime;

/**
 * This class wraps planned events for e.g. functional assessments.
 */
@Entity
@Table(name = "planning")
@AttributeOverride(name = "id", column = @Column(name = "planning_id"))
public class Planning extends AbstractEntity
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 2892646813864547199L;

   /** The next pg. */
   @Temporal(TemporalType.DATE)
   private Date nextPG;

   /** The next fb. */
   @Temporal(TemporalType.DATE)
   private Date nextFB;

   /** The next fv. */
   @Temporal(TemporalType.DATE)
   private Date nextFV;

   /** The next pr. */
   @Temporal(TemporalType.DATE)
   private Date nextPR;

   /** The next fv. */
   @Temporal(TemporalType.DATE)
   private Date nextSEI;

   /** The next gesprek met klant. */
   @Temporal(TemporalType.DATE)
   private Date nextGesprekMetKlant;

   /** The laatste persoonlijk gesprek. */
   @Transient
   private DateTime laatstePersoonlijkGesprek; // PG

   /** The planning persoonlijk gesprek. */
   @Transient
   private DateTime planningPersoonlijkGesprek; // PG

   /** The laatste functionele beoordeling. */
   @Transient
   private DateTime laatsteFunctioneleBeoordeling; // FB

   /** The planning functionele beoordeling. */
   @Transient
   private DateTime planningFunctioneleBeoordeling; // FB

   /** The laatste financiele verhoging. */
   @Transient
   private DateTime laatsteFinancieleVerhoging; // FV

   /** The planning financiele verhoging. */
   @Transient
   private DateTime planningFinancieleVerhoging; // FV

   /** The laatste promotie. */
   @Transient
   private DateTime laatstePromotie; // PR

   /** The planning promotie. */
   @Transient
   private DateTime planningPromotie; // PR

   @Transient
   private DateTime laatsteSEI; // SEI

   @Transient
   private DateTime planningSEI; // SEI

   /** The laatste cv update. */
   @Transient
   private DateTime laatsteCvUpdate; //   CV Update

   /** The laatste opdracht beschrijving update. */
   @Transient
   private DateTime laatsteOpdrachtBeschrijvingUpdate; // OB Update

   /** The laatste persoonlijk ontwikkel plan update. */
   @Transient
   private DateTime laatstePersoonlijkOntwikkelPlanUpdate; // POP

   /** The laatste gesprek met klant. */
   @Transient
   private DateTime laatsteGesprekMetKlant;//   KG

   /** The planning gesprek met klant. */
   @Transient
   private DateTime planningGesprekMetKlant;//   KG

   /**
    * Constructor: create a new Planning.
    */
   public Planning()
   {

   }

   /**
    * Instantiates a new planning.
    * 
    * @param employee the employee
    */
   public Planning(Employee employee)
   {
      super(employee);
   }

   /**
    * Gets the next pg.
    * 
    * @return the next pg
    */
   public Date getNextPG()
   {
      return copy(this.nextPG);
   }

   /**
    * Sets the next pg.
    * 
    * @param nextPG the new next pg
    */
   public void setNextPG(Date nextPG)
   {
      this.nextPG = copy(nextPG);
   }

   /**
    * Gets the next fb.
    * 
    * @return the next fb
    */
   public Date getNextFB()
   {
      return copy(this.nextFB);
   }

   /**
    * Sets the next fb.
    * 
    * @param nextFB the new next fb
    */
   public void setNextFB(Date nextFB)
   {
      this.nextFB = copy(nextFB);
   }

   /**
    * Gets the next fv.
    * 
    * @return the next fv
    */
   public Date getNextFV()
   {
      return copy(this.nextFV);
   }

   /**
    * Sets the next fv.
    * 
    * @param nextFV the new next fv
    */
   public void setNextFV(Date nextFV)
   {
      this.nextFV = copy(nextFV);
   }

   /**
    * Gets the next pr.
    * 
    * @return the next pr
    */
   public Date getNextPR()
   {
      return copy(this.nextPR);
   }

   /**
    * Sets the next pr.
    * 
    * @param nextPR the new next pr
    */
   public void setNextPR(Date nextPR)
   {
      this.nextPR = copy(nextPR);
   }

   public Date getNextSEI()
   {
      return copy(this.nextSEI);
   }

   public void setNextSEI(Date nextSEI)
   {
      this.nextSEI = copy(nextSEI);
      ;
   }

   /**
    * Gets the next gesprek met klant.
    * 
    * @return the next gesprek met klant
    */
   public Date getNextGesprekMetKlant()
   {
      return copy(this.nextGesprekMetKlant);
   }

   /**
    * Sets the next gesprek met klant.
    * 
    * @param nextGesprekMetKlant the new next gesprek met klant
    */
   public void setNextGesprekMetKlant(Date nextGesprekMetKlant)
   {
      this.nextGesprekMetKlant = copy(nextGesprekMetKlant);
   }

   /**
    * Gets the laatste persoonlijk gesprek.
    * 
    * @return the laatste persoonlijk gesprek
    */
   public DateTime getLaatstePersoonlijkGesprek()
   {
      return this.laatstePersoonlijkGesprek;
   }

   /**
    * Sets the laatste persoonlijk gesprek.
    * 
    * @param laatstePersoonlijkGesprek the new laatste persoonlijk gesprek
    */
   public void setLaatstePersoonlijkGesprek(DateTime laatstePersoonlijkGesprek)
   {
      this.laatstePersoonlijkGesprek = laatstePersoonlijkGesprek;
   }

   /**
    * Gets the planning persoonlijk gesprek.
    * 
    * @return the planning persoonlijk gesprek
    */
   public DateTime getPlanningPersoonlijkGesprek()
   {
      return this.planningPersoonlijkGesprek;
   }

   /**
    * Sets the planning persoonlijk gesprek.
    * 
    * @param planningPersoonlijkGesprek the new planning persoonlijk gesprek
    */
   public void setPlanningPersoonlijkGesprek(DateTime planningPersoonlijkGesprek)
   {
      this.planningPersoonlijkGesprek = planningPersoonlijkGesprek;
   }

   /**
    * Gets the laatste functionele beoordeling.
    * 
    * @return the laatste functionele beoordeling
    */
   public DateTime getLaatsteFunctioneleBeoordeling()
   {
      return this.laatsteFunctioneleBeoordeling;
   }

   /**
    * Sets the laatste functionele beoordeling.
    * 
    * @param laatsteFunctioneleBeoordeling the new laatste functionele beoordeling
    */
   public void setLaatsteFunctioneleBeoordeling(DateTime laatsteFunctioneleBeoordeling)
   {
      this.laatsteFunctioneleBeoordeling = laatsteFunctioneleBeoordeling;
   }

   /**
    * Gets the planning functionele beoordeling.
    * 
    * @return the planning functionele beoordeling
    */
   public DateTime getPlanningFunctioneleBeoordeling()
   {
      return this.planningFunctioneleBeoordeling;
   }

   /**
    * Sets the planning functionele beoordeling.
    * 
    * @param planningfunctioneleBeoordeling the new planning functionele beoordeling
    */
   public void setPlanningFunctioneleBeoordeling(DateTime planningfunctioneleBeoordeling)
   {
      this.planningFunctioneleBeoordeling = planningfunctioneleBeoordeling;
   }

   /**
    * Gets the laatste financiele verhoging.
    * 
    * @return the laatste financiele verhoging
    */
   public DateTime getLaatsteFinancieleVerhoging()
   {
      return this.laatsteFinancieleVerhoging;
   }

   /**
    * Sets the laatste financiele verhoging.
    * 
    * @param laatsteFinancieleVerhoging the new laatste financiele verhoging
    */
   public void setLaatsteFinancieleVerhoging(DateTime laatsteFinancieleVerhoging)
   {
      this.laatsteFinancieleVerhoging = laatsteFinancieleVerhoging;
   }

   /**
    * Gets the planning financiele verhoging.
    * 
    * @return the planning financiele verhoging
    */
   public DateTime getPlanningFinancieleVerhoging()
   {
      return this.planningFinancieleVerhoging;
   }

   /**
    * Sets the planning financiele verhoging.
    * 
    * @param planningFinancieleVerhoging the new planning financiele verhoging
    */
   public void setPlanningFinancieleVerhoging(DateTime planningFinancieleVerhoging)
   {
      this.planningFinancieleVerhoging = planningFinancieleVerhoging;
   }

   /**
    * Gets the laatste promotie.
    * 
    * @return the laatste promotie
    */
   public DateTime getLaatstePromotie()
   {
      return this.laatstePromotie;
   }

   /**
    * Sets the laatste promotie.
    * 
    * @param laatstePromotie the new laatste promotie
    */
   public void setLaatstePromotie(DateTime laatstePromotie)
   {
      this.laatstePromotie = laatstePromotie;
   }

   /**
    * Gets the planning promotie.
    * 
    * @return the planning promotie
    */
   public DateTime getPlanningPromotie()
   {
      return this.planningPromotie;
   }

   /**
    * Sets the planning promotie.
    * 
    * @param planningPromotie the new planning promotie
    */
   public void setPlanningPromotie(DateTime planningPromotie)
   {
      this.planningPromotie = planningPromotie;
   }

   /**
    * Gets the laatste cv update.
    * 
    * @return the laatste cv update
    */
   public DateTime getLaatsteCvUpdate()
   {
      return this.laatsteCvUpdate;
   }

   /**
    * Sets the laatste cv update.
    * 
    * @param laatsteCvUpdate the new laatste cv update
    */
   public void setLaatsteCvUpdate(DateTime laatsteCvUpdate)
   {
      this.laatsteCvUpdate = laatsteCvUpdate;
   }

   /**
    * Gets the laatste opdracht beschrijving update.
    * 
    * @return the laatste opdracht beschrijving update
    */
   public DateTime getLaatsteOpdrachtBeschrijvingUpdate()
   {
      return this.laatsteOpdrachtBeschrijvingUpdate;
   }

   /**
    * Sets the laatste opdracht beschrijving update.
    * 
    * @param laatsteOpdrachtBeschrijvingUpdate the new laatste opdracht beschrijving update
    */
   public void setLaatsteOpdrachtBeschrijvingUpdate(DateTime laatsteOpdrachtBeschrijvingUpdate)
   {
      this.laatsteOpdrachtBeschrijvingUpdate = laatsteOpdrachtBeschrijvingUpdate;
   }

   /**
    * Gets the laatste persoonlijk ontwikkel plan update.
    * 
    * @return the laatste persoonlijk ontwikkel plan update
    */
   public DateTime getLaatstePersoonlijkOntwikkelPlanUpdate()
   {
      return this.laatstePersoonlijkOntwikkelPlanUpdate;
   }

   /**
    * Sets the laatste persoonlijk ontwikkel plan update.
    * 
    * @param laatstePersoonlijkOntwikkelPlanUpdate the new laatste persoonlijk ontwikkel plan update
    */
   public void setLaatstePersoonlijkOntwikkelPlanUpdate(DateTime laatstePersoonlijkOntwikkelPlanUpdate)
   {
      this.laatstePersoonlijkOntwikkelPlanUpdate = laatstePersoonlijkOntwikkelPlanUpdate;
   }

   /**
    * Gets the laatste gesprek met klant.
    * 
    * @return the laatste gesprek met klant
    */
   public DateTime getLaatsteGesprekMetKlant()
   {
      return this.laatsteGesprekMetKlant;
   }

   /**
    * Sets the laatste gesprek met klant.
    * 
    * @param laatsteGesprekMetKlant the new laatste gesprek met klant
    */
   public void setLaatsteGesprekMetKlant(DateTime laatsteGesprekMetKlant)
   {
      this.laatsteGesprekMetKlant = laatsteGesprekMetKlant;
   }

   /**
    * Gets the planning gesprek met klant.
    * 
    * @return the planning gesprek met klant
    */
   public DateTime getPlanningGesprekMetKlant()
   {
      return this.planningGesprekMetKlant;
   }

   /**
    * Sets the planning gesprek met klant.
    * 
    * @param planningGesprekMetKlant the new planning gesprek met klant
    */
   public void setPlanningGesprekMetKlant(DateTime planningGesprekMetKlant)
   {
      this.planningGesprekMetKlant = planningGesprekMetKlant;
   }

   public DateTime getLaatsteSEI()
   {
      return laatsteSEI;
   }

   public void setLaatsteSEI(DateTime laatsteSEI)
   {
      this.laatsteSEI = laatsteSEI;
   }

   public DateTime getPlanningSEI()
   {
      return planningSEI;
   }

   public void setPlanningSEI(DateTime planningSEI)
   {
      this.planningSEI = planningSEI;
   }

   /**
    * Fills the PlanningsTab DTO based on the Employee.
    * 
    * @param employee the employee
    * @return the planning
    */
   public Planning buildPlanningTab(Employee employee)
   {
      Planning planningTab = new Planning(employee);

      if (employee.getPlanning() != null)
      {
         planningTab = processPlanning(planningTab, employee.getPlanning());
      }
      if (employee.getLastFB() != null)
      {
         planningTab.setLaatsteFunctioneleBeoordeling(new DateTime(employee.getLastFB()));
      }
      if (employee.getLastFV() != null)
      {
         planningTab.setLaatsteFinancieleVerhoging(new DateTime(employee.getLastFV()));
      }
      if (employee.getLastPG() != null)
      {
         planningTab.setLaatstePersoonlijkGesprek(new DateTime(employee.getLastPG()));
      }
      if (employee.getLastPR() != null)
      {
         planningTab.setLaatstePromotie(new DateTime(employee.getLastPR()));
      }

      if (employee.getLastSEI() != null)
      {
         planningTab.setLaatsteSEI(new DateTime(employee.getLastSEI()));
      }

      if (employee.getLastCVUpdate() != null)
      {
         planningTab.setLaatsteCvUpdate(new DateTime(employee.getLastCVUpdate()));
      }
      if (employee.getLastOBUpdate() != null)
      {
         planningTab.setLaatsteOpdrachtBeschrijvingUpdate(new DateTime(employee.getLastOBUpdate()));
      }
      if (employee.getLastPOPUpdate() != null)
      {
         planningTab.setLaatstePersoonlijkOntwikkelPlanUpdate(new DateTime(employee.getLastPOPUpdate()));
      }
      if (employee.getLastKG()!= null)
      {
         planningTab.setLaatsteGesprekMetKlant(new DateTime(employee.getLastKG()));
      }
      return planningTab;
   }

   /**
    * Processes the planning part for {@link #buildPlanningTabDTO}.
    * 
    * @param planningTab the planning tab
    * @param planning the planning
    * @return the planning
    */
   private Planning processPlanning(Planning planningTab, Planning planning)
   {
      if (planning.getNextFB() != null)
      {
         planningTab.setPlanningFunctioneleBeoordeling(new DateTime(planning.getNextFB()));
      }
      if (planning.getNextFV() != null)
      {
         planningTab.setPlanningFinancieleVerhoging(new DateTime(planning.getNextFV()));
      }
      if (planning.getNextPG() != null)
      {
         planningTab.setPlanningPersoonlijkGesprek(new DateTime(planning.getNextPG()));
      }
      if (planning.getNextPR() != null)
      {
         planningTab.setPlanningPromotie(new DateTime(planning.getNextPR()));
      }
      if (planning.getNextSEI() != null)
      {
         planningTab.setPlanningSEI(new DateTime(planning.getNextSEI()));
      }
      if (planning.getNextGesprekMetKlant() != null)
      {
         planningTab.setPlanningGesprekMetKlant(new DateTime(planning.getNextGesprekMetKlant()));
      }
      return planningTab;
   }

   /**
    * Sets the planning tab dto fields.
    * 
    * @param planningTab the planning tab
    * @param employee the employee
    */
   public void setPlanningTabFields(Planning planningTab, Employee employee)
   {
      employee.setLastFB(checkDate(planningTab.getLaatsteFunctioneleBeoordeling()));
      employee.setLastFV(checkDate(planningTab.getLaatsteFinancieleVerhoging()));
      employee.setLastPG(checkDate(planningTab.getLaatstePersoonlijkGesprek()));
      employee.setLastPR(checkDate(planningTab.getLaatstePromotie()));
      employee.setLastSEI(checkDate(planningTab.getLaatsteSEI()));
      employee.setLastCVUpdate(checkDate(planningTab.getLaatsteCvUpdate()));
      employee.setLastOBUpdate(checkDate(planningTab.getLaatsteOpdrachtBeschrijvingUpdate()));
      employee.setLastPOPUpdate(checkDate(planningTab.getLaatstePersoonlijkOntwikkelPlanUpdate()));
      employee.setLastKG(checkDate(planningTab.getLaatsteGesprekMetKlant()));

      // Planning fields
      employee.setPlanning(setPlanningvields(planningTab, employee.getPlanning()));
   }

   /**
    * Check date.
    * 
    * @param tocheck the tocheck
    * @return the date
    */
   private Date checkDate(DateTime tocheck)
   {
      return tocheck != null ? tocheck.toDate() : null;
   }

   /**
    * Private class that process evry thing for setting and saving the planning.
    * 
    * @param planningTab the planning tab
    * @param planning the planning
    * @return the planning
    */
   private Planning setPlanningvields(Planning planningTab, Planning planning)
   {
      planning.setNextFV(checkDate(planningTab.getPlanningFinancieleVerhoging()));
      planning.setNextFB(checkDate(planningTab.getPlanningFunctioneleBeoordeling()));
      planning.setNextPR(checkDate(planningTab.getPlanningPromotie()));
      planning.setNextPG(checkDate(planningTab.getPlanningPersoonlijkGesprek()));
      planning.setNextSEI(checkDate(planningTab.getPlanningSEI()));
      planning.setNextGesprekMetKlant(checkDate(planningTab.getPlanningGesprekMetKlant()));

      return planning;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.umappcore.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Planning) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Planning;
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
    * @see nl.sogeti.umd.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Planning{" + "nextPG=" + this.nextPG + ", nextFB=" + this.nextFB + ", nextFV=" + this.nextFV + ", nextPR=" + this.nextPR + '}';
   }
}
