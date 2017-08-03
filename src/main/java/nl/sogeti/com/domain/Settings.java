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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import nl.sogeti.com.enums.DateSettingOption;

/**
 * This class contains the settings for the application and reperesents the table Setting in the database.
 * 
 * @author cremerma (c) 28 jan. 2014, Sogeti B.V.
 * @version $Id:$
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "settings")
@AttributeOverride(name = "id", column = @Column(name = "settings_id"))
public class Settings extends AbstractEntity
{

   /* Settings for showing information on the General page. (main page) */
   /** The show age. */
   private boolean showAge;

   /** The show phone. */
   private boolean showPhone;

   /** The show sick. */
   private boolean showSick;

   /** The show pop. */
   private boolean showPOP;

   /** The show fb. */
   private boolean showFB;

   /** The show fv. */
   private boolean showFV;

   /** The show ob. */
   private boolean showOB;

   /** The show pg. */
   private boolean showPG;

   /** The show cv. */
   private boolean showCV;

   /** The show cvp. */
   private boolean showCVP;

   /** The show sei. */
   private boolean showSEI;

   /** The show kg. */
   private boolean showKG;

   /* Amount of rows that are shown on the General page. */
   /** The aantal regels. */
   private Integer aantalRegels;

   /* Settings for specific parts of the Employee viewer. */
   /** The amount calls. */
   private Integer amountCalls;

   /** The period calls. */
   private Integer periodCalls;

   /** The use period calls. */
   private boolean usePeriodCalls;

   /** The amount print calls. */
   private Integer amountPrintCalls;

   /** The period print calls. */
   private Integer periodPrintCalls;

   /** The use period print calls. */
   private boolean usePeriodPrintCalls;
   
   private boolean shortReport;

   /** The amount actions. */
   private Integer amountActions;

   /** The period actions. */
   private Integer periodActions;

   /** The use period actions. */
   private boolean usePeriodActions;

   /** The amount print actions. */
   private Integer amountPrintActions;

   /** The period print actions. */
   private Integer periodPrintActions;

   /** The use period print actions. */
   private boolean usePeriodPrintActions;

   /** The locale. */
   @Basic(fetch = FetchType.EAGER)
   private Locale locale = Locale.forLanguageTag("NL");

   /** The date settings. */
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JoinTable(joinColumns = @JoinColumn(name = "settings_id"), inverseJoinColumns = @JoinColumn(name = "datesetting_id"))
   @MapKeyEnumerated(EnumType.STRING)
   private Map<DateSettingOption, DateSetting> dateSettings = new HashMap<>();

   /** The date setting. */
   @Transient
   private List<DateSetting> dateSetting = new ArrayList<DateSetting>();

   /**
    * Copied from InstAlgemeenTabDTO.
    */
   public Settings()
   {
      /* Set the general page settings. */
      this.showAge = true;
      this.showPhone = true;
      this.showSick = true;
      this.showPOP = true;
      this.showFB = true;
      this.showFV = true;
      this.showOB = false;
      this.showPG = true;
      this.showCV = false;
      this.showCVP = false;
      this.showSEI = false;
      this.showKG = false;
      this.shortReport=false;
      setAantalRegels(10);

      /* Set the Employee viewer settings. */
      setAmountCalls(10);
      setPeriodCalls(10);
      this.usePeriodCalls = false;
      setAmountPrintCalls(10);
      setPeriodPrintCalls(10);
      this.usePeriodPrintCalls = false;

      setAmountActions(10);
      setPeriodActions(10);
      this.usePeriodActions = false;
      setAmountPrintActions(10);
      setPeriodPrintActions(10);
      this.usePeriodPrintActions = false;
   }

   /**
    * Instantiates a new settings.
    * 
    * @param settings the settings
    */
   public Settings(Settings settings)
   {
      Map<DateSettingOption, DateSetting> sourceSettings = settings.getDateSettings();

      for (DateSettingOption option : DateSettingOption.values())
      {
         this.dateSetting.add(new DateSetting(option, sourceSettings.get(option)));
      }
   }

   /**
    * Returns based on the {@link DateSettingsOption} the {@link DateSetting} from the local Store.
    * 
    * @param option the option
    * @return the date setting
    */
   public DateSetting getDateSetting(DateSettingOption option)
   {

      return this.dateSettings.get(option);
   }

   /**
    * Return the date settings as a list of map entries, this is (most likely) a work around to iterate over the list in JSF.
    * 
    * @return the date settings
    */
   public Map<DateSettingOption, DateSetting> getDateSettings()
   {
      return this.dateSettings;
   }

   /**
    * Return the date settings as a list of map entries, this is (most likely) a work around to iterate over the list in JSF.
    * 
    * @return the date settings list
    */
   public List<Map.Entry<DateSettingOption, DateSetting>> getDateSettingsList()
   {
      return new ArrayList<>(this.dateSettings.entrySet());
   }

   /**
    * Get the Locale.
    * 
    * @return the locale
    */
   public Locale getLocale()
   {
      return this.locale;
   }

   /**
    * Boolean that represents if the user wants to see the Age of the Employee in the start page.
    * 
    * @return true, if is show age
    */
   public boolean isShowAge()
   {
      return this.showAge;
   }

   /**
    * Boolean that represents if the user wants to see the Phone number of the Employee in the start page.
    * 
    * @return true, if is show phone
    */
   public boolean isShowPhone()
   {
      return this.showPhone;
   }

   /**
    * Boolean that represents if the user wants to see if the Employee is sick or on holiday in the start page.
    * 
    * @return true, if is show sick
    */
   public boolean isShowSick()
   {
      return this.showSick;
   }

   /**
    * Boolean that represents if the user wants to notification area for POP.
    * 
    * @return true, if is show pop
    */
   public boolean isShowPOP()
   {
      return this.showPOP;
   }

   /**
    * Boolean that represents if the user wants to notification area for FB.
    * 
    * @return true, if is show fb
    */
   public boolean isShowFB()
   {
      return this.showFB;
   }

   /**
    * Boolean that represents if the user wants to notification area for FV.
    * 
    * @return true, if is show fv
    */
   public boolean isShowFV()
   {
      return this.showFV;
   }

   /**
    * Boolean that represents if the user wants to notification area for OB.
    * 
    * @return true, if is show ob
    */
   public boolean isShowOB()
   {
      return this.showOB;
   }

   /**
    * Boolean that represents if the user wants to notification area for PG.
    * 
    * @return true, if is show pg
    */
   public boolean isShowPG()
   {
      return this.showPG;
   }

   /**
    * Boolean that represents if the user wants to notification area for CV.
    * 
    * @return true, if is show cv
    */
   public boolean isShowCV()
   {
      return this.showCV;
   }

   /**
    * Boolean that represents if the user wants to notification area for CVP.
    * 
    * @return true, if is show cvp
    */
   public boolean isShowCVP()
   {
      return this.showCVP;
   }

   /**
    * Retrieves a interger with the amount of rows should be shown in the start page.
    * 
    * @return the aantal regels
    */
   public Integer getAantalRegels()
   {
      return this.aantalRegels;
   }

   /**
    * Set the Datesetting in the dateSetting store.
    * 
    * @param option the option
    * @param setting the setting
    */
   public void setDateSetting(DateSettingOption option, DateSetting setting)
   {
      this.dateSettings.put(option, setting);
   }

   /**
    * Set the date settings as a list of map entries, this is done trough iterate over the list.
    * 
    * @param dateSettings the date settings
    * @Deprectad Turning a Map<DSO, DS> into a List<Entry<DSO, DS> turning it back to a Map<DSO, DS>. Should probably just stick to map and this method already exists...
    */
   @Deprecated
   public void setDateSettings(List<Map.Entry<DateSettingOption, DateSetting>> dateSettings)
   {
      this.dateSettings = new HashMap<>();
      for (Map.Entry<DateSettingOption, DateSetting> entry : dateSettings)
      {
         this.dateSettings.put(entry.getKey(), entry.getValue());
      }
   }

   /**
    * Set the Locale.
    * 
    * @param locale the new locale
    */
   public void setLocale(Locale locale)
   {
      this.locale = locale;
   }

   /**
    * Set the boolean that represents if the user wants to see the Age of the Employee in the start page.
    * 
    * @param showAge the new show age
    */
   public void setShowAge(boolean showAge)
   {
      this.showAge = showAge;
   }

   /**
    * Set the boolean that represents if the user wants to see the Phone number of the Employee in the start page.
    * 
    * @param showPhone the new show phone
    */
   public void setShowPhone(boolean showPhone)
   {
      this.showPhone = showPhone;
   }

   /**
    * Set the boolean that represents if the user wants to see if the Employee is sick or on holiday in the start page.
    * 
    * @param showSick the new show sick
    */
   public void setShowSick(boolean showSick)
   {
      this.showSick = showSick;
   }

   /**
    * Sets the aantal regels.
    * 
    * @param aantalRegels the new aantal regels
    */
   public void setAantalRegels(Integer aantalRegels)
   {
      this.aantalRegels = aantalRegels;
   }

   /**
    * Sets the show pop.
    * 
    * @param showPOP the new show pop
    */
   public void setShowPOP(boolean showPOP)
   {
      this.showPOP = showPOP;
   }

   /**
    * Sets the show fb.
    * 
    * @param showFB the new show fb
    */
   public void setShowFB(boolean showFB)
   {
      this.showFB = showFB;
   }

   /**
    * Sets the show fv.
    * 
    * @param showFV the new show fv
    */
   public void setShowFV(boolean showFV)
   {
      this.showFV = showFV;
   }

   /**
    * Sets the show ob.
    * 
    * @param showOB the new show ob
    */
   public void setShowOB(boolean showOB)
   {
      this.showOB = showOB;
   }

   /**
    * Sets the show pg.
    * 
    * @param showPG the new show pg
    */
   public void setShowPG(boolean showPG)
   {
      this.showPG = showPG;
   }

   /**
    * Sets the show cvp.
    * 
    * @param showCVP the new show cvp
    */
   public void setShowCVP(boolean showCVP)
   {
      this.showCVP = showCVP;
   }

   /**
    * Sets the show cv.
    * 
    * @param showCV the new show cv
    */
   public void setShowCV(boolean showCV)
   {
      this.showCV = showCV;
   }

   /**
    * Get the amountCalls.
    * 
    * @return Returns the amountCalls as a int.
    */
   public Integer getAmountCalls()
   {
      return this.amountCalls;
   }

   /**
    * Get the periodCalls.
    * 
    * @return Returns the periodCalls as a int.
    */
   public Integer getPeriodCalls()
   {
      return this.periodCalls;
   }

   /**
    * Get the usePeriodCalls.
    * 
    * @return Returns the usePeriodCalls as a boolean.
    */
   public boolean isUsePeriodCalls()
   {
      return this.usePeriodCalls;
   }

   /**
    * Get the amountPrintCalls.
    * 
    * @return Returns the amountPrintCalls as a int.
    */
   public Integer getAmountPrintCalls()
   {
      return this.amountPrintCalls;
   }

   /**
    * Get the periodPrintCalls.
    * 
    * @return Returns the periodPrintCalls as a int.
    */
   public Integer getPeriodPrintCalls()
   {
      return this.periodPrintCalls;
   }

   /**
    * Get the usePeriodPrintCalls.
    * 
    * @return Returns the usePeriodPrintCalls as a boolean.
    */
   public boolean isUsePeriodPrintCalls()
   {
      return this.usePeriodPrintCalls;
   }

   /**
    * Get the amountAction.
    * 
    * @return Returns the amountAction as a Integer.
    */
   public Integer getAmountActions()
   {
      return this.amountActions;
   }

   /**
    * Get the periodAction.
    * 
    * @return Returns the periodAction as a Integer.
    */
   public Integer getPeriodActions()
   {
      return this.periodActions;
   }

   /**
    * Get the usePeriodAction.
    * 
    * @return Returns the usePeriodAction as a boolean.
    */
   public boolean isUsePeriodActions()
   {
      return this.usePeriodActions;
   }

   /**
    * Get the amountPrintAction.
    * 
    * @return Returns the amountPrintAction as a Integer.
    */
   public Integer getAmountPrintActions()
   {
      return this.amountPrintActions;
   }

   /**
    * Get the periodPrintAction.
    * 
    * @return Returns the periodPrintAction as a Integer.
    */
   public Integer getPeriodPrintActions()
   {
      return this.periodPrintActions;
   }

   /**
    * Get the usePeriodPrintAction.
    * 
    * @return Returns the usePeriodPrintAction as a boolean.
    */
   public boolean isUsePeriodPrintActions()
   {
      return this.usePeriodPrintActions;
   }

   /**
    * Set the amountCalls to the specified value.
    * 
    * @param amountCalls The amountCalls to set.
    */
   public void setAmountCalls(Integer amountCalls)
   {
      this.amountCalls = amountCalls;
   }

   /**
    * Set the periodCalls to the specified value.
    * 
    * @param periodCalls The periodCalls to set.
    */
   public void setPeriodCalls(Integer periodCalls)
   {
      this.periodCalls = periodCalls;
   }

   /**
    * Set the usePeriodCalls to the specified value.
    * 
    * @param usePeriodCalls The usePeriodCalls to set.
    */
   public void setUsePeriodCalls(boolean usePeriodCalls)
   {
      this.usePeriodCalls = usePeriodCalls;
   }

   /**
    * Set the amountPrintCalls to the specified value.
    * 
    * @param amountPrintCalls The amountPrintCalls to set.
    */
   public void setAmountPrintCalls(Integer amountPrintCalls)
   {
      this.amountPrintCalls = amountPrintCalls;
   }

   /**
    * Set the periodPrintCalls to the specified value.
    * 
    * @param periodPrintCalls The periodPrintCalls to set.
    */
   public void setPeriodPrintCalls(Integer periodPrintCalls)
   {
      this.periodPrintCalls = periodPrintCalls;
   }

   /**
    * Set the usePeriodPrintCalls to the specified value.
    * 
    * @param usePeriodPrintCalls The usePeriodPrintCalls to set.
    */
   public void setUsePeriodPrintCalls(boolean usePeriodPrintCalls)
   {
      this.usePeriodPrintCalls = usePeriodPrintCalls;
   }

   /**
    * Set the dateSettings to the specified value.
    * 
    * @param dateSettings The dateSettings to set.
    */
   public void setDateSettings(Map<DateSettingOption, DateSetting> dateSettings)
   {
      this.dateSettings = dateSettings;
   }

   /**
    * Set the amountAction to the specified value.
    * 
    * @param amountActions The amountAction to set.
    */
   public void setAmountActions(Integer amountActions)
   {
      this.amountActions = amountActions;
   }

   /**
    * Set the periodAction to the specified value.
    * 
    * @param periodActions The periodAction to set.
    */
   public void setPeriodActions(Integer periodActions)
   {
      this.periodActions = periodActions;
   }

   /**
    * Set the usePeriodAction to the specified value.
    * 
    * @param usePeriodActions The usePeriodAction to set.
    */
   public void setUsePeriodActions(boolean usePeriodActions)
   {
      this.usePeriodActions = usePeriodActions;
   }

   /**
    * Set the amountPrintAction to the specified value.
    * 
    * @param amountPrintActions The amountPrintAction to set.
    */
   public void setAmountPrintActions(Integer amountPrintActions)
   {
      this.amountPrintActions = amountPrintActions;
   }

   /**
    * Set the periodPrintAction to the specified value.
    * 
    * @param periodPrintActions The periodPrintAction to set.
    */
   public void setPeriodPrintActions(Integer periodPrintActions)
   {
      this.periodPrintActions = periodPrintActions;
   }

   /**
    * Set the usePeriodPrintAction to the specified value.
    * 
    * @param usePeriodPrintActions The usePeriodPrintAction to set.
    */
   public void setUsePeriodPrintActions(boolean usePeriodPrintActions)
   {
      this.usePeriodPrintActions = usePeriodPrintActions;
   }

   /**
    * Get the dateSetting.
    * 
    * @return Returns the dateSetting as a List<DateSettingDTO>.
    */
   public List<DateSetting> getDateSetting()
   {
      return this.dateSetting;
   }

   /**
    * Checks if is show sei.
    * 
    * @return true, if is show sei
    */
   public boolean isShowSEI()
   {
      return this.showSEI;
   }

   /**
    * Sets the show sei.
    * 
    * @param showSEI the new show sei
    */
   public void setShowSEI(boolean showSEI)
   {
      this.showSEI = showSEI;
   }

   /**
    * Boolean that represents if the user wants to notification area for KG.
    * 
    * @return true, if is show kg
    */
   public boolean isShowKG()
   {
      return this.showKG;
   }

   /**
    * Sets the show kg.
    * 
    * @param showKG the new show kg
    */
   public void setShowKG(boolean showKG)
   {
      this.showKG = showKG;
   }

   public boolean isShortReport()
   {
      return shortReport;
   }

   public void setShortReport(boolean shortReport)
   {
      this.shortReport = shortReport;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object that)
   {
      return (that instanceof Settings) && super.equals(that);
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#canEqual(java.lang.Object)
    */
   @Override
   public boolean canEqual(Object that)
   {
      return that instanceof Settings;
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#hashCode()
    */
   @Override
   public int hashCode()
   {
      return super.hashCode();
   }

   /*
    * (non-Javadoc)
    * @see nl.sogeti.umapp.domain.AbstractEntity#toString()
    */
   @Override
   public String toString()
   {
      return "Settings{" + " locale=" + this.locale + ", dateSettings=" + this.dateSettings + '}';
   }
}
