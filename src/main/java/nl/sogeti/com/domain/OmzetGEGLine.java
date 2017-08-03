/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Mar 30, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The Class OmzetGEGLine.
 * 
 * @author mkangule (c) Mar 30, 2015, Sogeti B.V.
 * @version $Id:$
 */

@Entity
@Table(name="TmpararyOmzetGEGLine")
@AttributeOverride(name = "id", column = @Column(name = "OmzetGEGLine_id"))
public class OmzetGEGLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;
   
   /** The eindklanttier. */
   private int jaar, maand, kla_nr, dee_code, sac_code, inz_volgnr, med_nr, boe_omzet_maand, sdi_code, dee_am_med_nr, inz_med_nr_rm_verkoop_number, eindklantnummer, eindklanttier;

   /** The klantgroepsector. */
   private String kla_naam, kla_groep, kad_postcode, opd_code, dee_oms, sac_oms, opd_ordersoort, oee_code_hoger, oee_code_mdw, mvw_naam, bcd_ind_css_dss, oee_code_hoger_verantw, oee_code_verantw,
         oee_code_uitv_dee, oee_code_hoger_uitv, oee_code_uitv, sfn_spn, sdi_oms, dee_am_med_naam, inz_med_nr_rm_verkoop_name, eindklantnaam, eindklantsegment, eindklantindustry, eindklantsector,
         eindklantklassificatie, eindklantzipcode, eindklantklantgroep, klantgroepsegment, klantgroepindustry, klantgroepsector;

   /** The boe_uren. */
   private BigDecimal bin_tarief, boe_omzet, fri_richttarief, boe_uren;

   /** The inz_dat. */
   private Date inz_dat;

   /**
    * Gets the jaar.
    * 
    * @return the jaar
    */
   public int getJaar()
   {
      return this.jaar;
   }

   /**
    * Sets the jaar.
    * 
    * @param jaar the new jaar
    */
   public void setJaar(int jaar)
   {
      this.jaar = jaar;
   }

   /**
    * Gets the maand.
    * 
    * @return the maand
    */
   public int getMaand()
   {
      return this.maand;
   }

   /**
    * Sets the maand.
    * 
    * @param maand the new maand
    */
   public void setMaand(int maand)
   {
      this.maand = maand;
   }

   /**
    * Gets the kla_nr.
    * 
    * @return the kla_nr
    */
   public int getKla_nr()
   {
      return this.kla_nr;
   }

   /**
    * Sets the kla_nr.
    * 
    * @param kla_nr the new kla_nr
    */
   public void setKla_nr(int kla_nr)
   {
      this.kla_nr = kla_nr;
   }

   /**
    * Gets the dee_code.
    * 
    * @return the dee_code
    */
   public int getDee_code()
   {
      return this.dee_code;
   }

   /**
    * Sets the dee_code.
    * 
    * @param dee_code the new dee_code
    */
   public void setDee_code(int dee_code)
   {
      this.dee_code = dee_code;
   }

   /**
    * Gets the sac_code.
    * 
    * @return the sac_code
    */
   public int getSac_code()
   {
      return this.sac_code;
   }

   /**
    * Sets the sac_code.
    * 
    * @param sac_code the new sac_code
    */
   public void setSac_code(int sac_code)
   {
      this.sac_code = sac_code;
   }

   /**
    * Gets the inz_volgnr.
    * 
    * @return the inz_volgnr
    */
   public int getInz_volgnr()
   {
      return this.inz_volgnr;
   }

   /**
    * Sets the inz_volgnr.
    * 
    * @param inz_volgnr the new inz_volgnr
    */
   public void setInz_volgnr(int inz_volgnr)
   {
      this.inz_volgnr = inz_volgnr;
   }

   /**
    * Gets the med_nr.
    * 
    * @return the med_nr
    */
   public int getMed_nr()
   {
      return this.med_nr;
   }

   /**
    * Sets the med_nr.
    * 
    * @param med_nr the new med_nr
    */
   public void setMed_nr(int med_nr)
   {
      this.med_nr = med_nr;
   }

   /**
    * Gets the boe_omzet_maand.
    * 
    * @return the boe_omzet_maand
    */
   public int getBoe_omzet_maand()
   {
      return this.boe_omzet_maand;
   }

   /**
    * Sets the boe_omzet_maand.
    * 
    * @param boe_omzet_maand the new boe_omzet_maand
    */
   public void setBoe_omzet_maand(int boe_omzet_maand)
   {
      this.boe_omzet_maand = boe_omzet_maand;
   }

   /**
    * Gets the sdi_code.
    * 
    * @return the sdi_code
    */
   public int getSdi_code()
   {
      return this.sdi_code;
   }

   /**
    * Sets the sdi_code.
    * 
    * @param sdi_code the new sdi_code
    */
   public void setSdi_code(int sdi_code)
   {
      this.sdi_code = sdi_code;
   }

   /**
    * Gets the dee_am_med_nr.
    * 
    * @return the dee_am_med_nr
    */
   public int getDee_am_med_nr()
   {
      return this.dee_am_med_nr;
   }

   /**
    * Sets the dee_am_med_nr.
    * 
    * @param dee_am_med_nr the new dee_am_med_nr
    */
   public void setDee_am_med_nr(int dee_am_med_nr)
   {
      this.dee_am_med_nr = dee_am_med_nr;
   }

   /**
    * Gets the inz_med_nr_rm_verkoop_number.
    * 
    * @return the inz_med_nr_rm_verkoop_number
    */
   public int getInz_med_nr_rm_verkoop_number()
   {
      return this.inz_med_nr_rm_verkoop_number;
   }

   /**
    * Sets the inz_med_nr_rm_verkoop_number.
    * 
    * @param inz_med_nr_rm_verkoop_number the new inz_med_nr_rm_verkoop_number
    */
   public void setInz_med_nr_rm_verkoop_number(int inz_med_nr_rm_verkoop_number)
   {
      this.inz_med_nr_rm_verkoop_number = inz_med_nr_rm_verkoop_number;
   }

   /**
    * Gets the eindklantnummer.
    * 
    * @return the eindklantnummer
    */
   public int getEindklantnummer()
   {
      return this.eindklantnummer;
   }

   /**
    * Sets the eindklantnummer.
    * 
    * @param eindklantnummer the new eindklantnummer
    */
   public void setEindklantnummer(int eindklantnummer)
   {
      this.eindklantnummer = eindklantnummer;
   }

   /**
    * Gets the eindklanttier.
    * 
    * @return the eindklanttier
    */
   public int getEindklanttier()
   {
      return this.eindklanttier;
   }

   /**
    * Sets the eindklanttier.
    * 
    * @param eindklanttier the new eindklanttier
    */
   public void setEindklanttier(int eindklanttier)
   {
      this.eindklanttier = eindklanttier;
   }

   /**
    * Gets the kla_naam.
    * 
    * @return the kla_naam
    */
   public String getKla_naam()
   {
      return this.kla_naam;
   }

   /**
    * Sets the kla_naam.
    * 
    * @param kla_naam the new kla_naam
    */
   public void setKla_naam(String kla_naam)
   {
      this.kla_naam = kla_naam;
   }

   /**
    * Gets the kla_groep.
    * 
    * @return the kla_groep
    */
   public String getKla_groep()
   {
      return this.kla_groep;
   }

   /**
    * Sets the kla_groep.
    * 
    * @param kla_groep the new kla_groep
    */
   public void setKla_groep(String kla_groep)
   {
      this.kla_groep = kla_groep;
   }

   /**
    * Gets the kad_postcode.
    * 
    * @return the kad_postcode
    */
   public String getKad_postcode()
   {
      return this.kad_postcode;
   }

   /**
    * Sets the kad_postcode.
    * 
    * @param kad_postcode the new kad_postcode
    */
   public void setKad_postcode(String kad_postcode)
   {
      this.kad_postcode = kad_postcode;
   }

   /**
    * Gets the opd_code.
    * 
    * @return the opd_code
    */
   public String getOpd_code()
   {
      return this.opd_code;
   }

   /**
    * Sets the opd_code.
    * 
    * @param opd_code the new opd_code
    */
   public void setOpd_code(String opd_code)
   {
      this.opd_code = opd_code;
   }

   /**
    * Gets the dee_oms.
    * 
    * @return the dee_oms
    */
   public String getDee_oms()
   {
      return this.dee_oms;
   }

   /**
    * Sets the dee_oms.
    * 
    * @param dee_oms the new dee_oms
    */
   public void setDee_oms(String dee_oms)
   {
      this.dee_oms = dee_oms;
   }

   /**
    * Gets the sac_oms.
    * 
    * @return the sac_oms
    */
   public String getSac_oms()
   {
      return this.sac_oms;
   }

   /**
    * Sets the sac_oms.
    * 
    * @param sac_oms the new sac_oms
    */
   public void setSac_oms(String sac_oms)
   {
      this.sac_oms = sac_oms;
   }

   /**
    * Gets the opd_ordersoort.
    * 
    * @return the opd_ordersoort
    */
   public String getOpd_ordersoort()
   {
      return this.opd_ordersoort;
   }

   /**
    * Sets the opd_ordersoort.
    * 
    * @param opd_ordersoort the new opd_ordersoort
    */
   public void setOpd_ordersoort(String opd_ordersoort)
   {
      this.opd_ordersoort = opd_ordersoort;
   }

   /**
    * Gets the oee_code_hoger.
    * 
    * @return the oee_code_hoger
    */
   public String getOee_code_hoger()
   {
      return this.oee_code_hoger;
   }

   /**
    * Sets the oee_code_hoger.
    * 
    * @param oee_code_hoger the new oee_code_hoger
    */
   public void setOee_code_hoger(String oee_code_hoger)
   {
      this.oee_code_hoger = oee_code_hoger;
   }

   /**
    * Gets the oee_code_mdw.
    * 
    * @return the oee_code_mdw
    */
   public String getOee_code_mdw()
   {
      return this.oee_code_mdw;
   }

   /**
    * Sets the oee_code_mdw.
    * 
    * @param oee_code_mdw the new oee_code_mdw
    */
   public void setOee_code_mdw(String oee_code_mdw)
   {
      this.oee_code_mdw = oee_code_mdw;
   }

   /**
    * Gets the mvw_naam.
    * 
    * @return the mvw_naam
    */
   public String getMvw_naam()
   {
      return this.mvw_naam;
   }

   /**
    * Sets the mvw_naam.
    * 
    * @param mvw_naam the new mvw_naam
    */
   public void setMvw_naam(String mvw_naam)
   {
      this.mvw_naam = mvw_naam;
   }

   /**
    * Gets the bcd_ind_css_dss.
    * 
    * @return the bcd_ind_css_dss
    */
   public String getBcd_ind_css_dss()
   {
      return this.bcd_ind_css_dss;
   }

   /**
    * Sets the bcd_ind_css_dss.
    * 
    * @param bcd_ind_css_dss the new bcd_ind_css_dss
    */
   public void setBcd_ind_css_dss(String bcd_ind_css_dss)
   {
      this.bcd_ind_css_dss = bcd_ind_css_dss;
   }

   /**
    * Gets the oee_code_hoger_verantw.
    * 
    * @return the oee_code_hoger_verantw
    */
   public String getOee_code_hoger_verantw()
   {
      return this.oee_code_hoger_verantw;
   }

   /**
    * Sets the oee_code_hoger_verantw.
    * 
    * @param oee_code_hoger_verantw the new oee_code_hoger_verantw
    */
   public void setOee_code_hoger_verantw(String oee_code_hoger_verantw)
   {
      this.oee_code_hoger_verantw = oee_code_hoger_verantw;
   }

   /**
    * Gets the oee_code_verantw.
    * 
    * @return the oee_code_verantw
    */
   public String getOee_code_verantw()
   {
      return this.oee_code_verantw;
   }

   /**
    * Sets the oee_code_verantw.
    * 
    * @param oee_code_verantw the new oee_code_verantw
    */
   public void setOee_code_verantw(String oee_code_verantw)
   {
      this.oee_code_verantw = oee_code_verantw;
   }

   /**
    * Gets the oee_code_uitv_dee.
    * 
    * @return the oee_code_uitv_dee
    */
   public String getOee_code_uitv_dee()
   {
      return this.oee_code_uitv_dee;
   }

   /**
    * Sets the oee_code_uitv_dee.
    * 
    * @param oee_code_uitv_dee the new oee_code_uitv_dee
    */
   public void setOee_code_uitv_dee(String oee_code_uitv_dee)
   {
      this.oee_code_uitv_dee = oee_code_uitv_dee;
   }

   /**
    * Gets the oee_code_hoger_uitv.
    * 
    * @return the oee_code_hoger_uitv
    */
   public String getOee_code_hoger_uitv()
   {
      return this.oee_code_hoger_uitv;
   }

   /**
    * Sets the oee_code_hoger_uitv.
    * 
    * @param oee_code_hoger_uitv the new oee_code_hoger_uitv
    */
   public void setOee_code_hoger_uitv(String oee_code_hoger_uitv)
   {
      this.oee_code_hoger_uitv = oee_code_hoger_uitv;
   }

   /**
    * Gets the oee_code_uitv.
    * 
    * @return the oee_code_uitv
    */
   public String getOee_code_uitv()
   {
      return this.oee_code_uitv;
   }

   /**
    * Sets the oee_code_uitv.
    * 
    * @param oee_code_uitv the new oee_code_uitv
    */
   public void setOee_code_uitv(String oee_code_uitv)
   {
      this.oee_code_uitv = oee_code_uitv;
   }

   /**
    * Gets the sfn_spn.
    * 
    * @return the sfn_spn
    */
   public String getSfn_spn()
   {
      return this.sfn_spn;
   }

   /**
    * Sets the sfn_spn.
    * 
    * @param sfn_spn the new sfn_spn
    */
   public void setSfn_spn(String sfn_spn)
   {
      this.sfn_spn = sfn_spn;
   }

   /**
    * Gets the sdi_oms.
    * 
    * @return the sdi_oms
    */
   public String getSdi_oms()
   {
      return this.sdi_oms;
   }

   /**
    * Sets the sdi_oms.
    * 
    * @param sdi_oms the new sdi_oms
    */
   public void setSdi_oms(String sdi_oms)
   {
      this.sdi_oms = sdi_oms;
   }

   /**
    * Gets the dee_am_med_naam.
    * 
    * @return the dee_am_med_naam
    */
   public String getDee_am_med_naam()
   {
      return this.dee_am_med_naam;
   }

   /**
    * Sets the dee_am_med_naam.
    * 
    * @param dee_am_med_naam the new dee_am_med_naam
    */
   public void setDee_am_med_naam(String dee_am_med_naam)
   {
      this.dee_am_med_naam = dee_am_med_naam;
   }

   /**
    * Gets the inz_med_nr_rm_verkoop_name.
    * 
    * @return the inz_med_nr_rm_verkoop_name
    */
   public String getInz_med_nr_rm_verkoop_name()
   {
      return this.inz_med_nr_rm_verkoop_name;
   }

   /**
    * Sets the inz_med_nr_rm_verkoop_name.
    * 
    * @param inz_med_nr_rm_verkoop_name the new inz_med_nr_rm_verkoop_name
    */
   public void setInz_med_nr_rm_verkoop_name(String inz_med_nr_rm_verkoop_name)
   {
      this.inz_med_nr_rm_verkoop_name = inz_med_nr_rm_verkoop_name;
   }

   /**
    * Gets the eindklantnaam.
    * 
    * @return the eindklantnaam
    */
   public String getEindklantnaam()
   {
      return this.eindklantnaam;
   }

   /**
    * Sets the eindklantnaam.
    * 
    * @param eindklantnaam the new eindklantnaam
    */
   public void setEindklantnaam(String eindklantnaam)
   {
      this.eindklantnaam = eindklantnaam;
   }

   /**
    * Gets the eindklantsegment.
    * 
    * @return the eindklantsegment
    */
   public String getEindklantsegment()
   {
      return this.eindklantsegment;
   }

   /**
    * Sets the eindklantsegment.
    * 
    * @param eindklantsegment the new eindklantsegment
    */
   public void setEindklantsegment(String eindklantsegment)
   {
      this.eindklantsegment = eindklantsegment;
   }

   /**
    * Gets the eindklantindustry.
    * 
    * @return the eindklantindustry
    */
   public String getEindklantindustry()
   {
      return this.eindklantindustry;
   }

   /**
    * Sets the eindklantindustry.
    * 
    * @param eindklantindustry the new eindklantindustry
    */
   public void setEindklantindustry(String eindklantindustry)
   {
      this.eindklantindustry = eindklantindustry;
   }

   /**
    * Gets the eindklantsector.
    * 
    * @return the eindklantsector
    */
   public String getEindklantsector()
   {
      return this.eindklantsector;
   }

   /**
    * Sets the eindklantsector.
    * 
    * @param eindklantsector the new eindklantsector
    */
   public void setEindklantsector(String eindklantsector)
   {
      this.eindklantsector = eindklantsector;
   }

   /**
    * Gets the eindklantklassificatie.
    * 
    * @return the eindklantklassificatie
    */
   public String getEindklantklassificatie()
   {
      return this.eindklantklassificatie;
   }

   /**
    * Sets the eindklantklassificatie.
    * 
    * @param eindklantklassificatie the new eindklantklassificatie
    */
   public void setEindklantklassificatie(String eindklantklassificatie)
   {
      this.eindklantklassificatie = eindklantklassificatie;
   }

   /**
    * Gets the eindklantzipcode.
    * 
    * @return the eindklantzipcode
    */
   public String getEindklantzipcode()
   {
      return this.eindklantzipcode;
   }

   /**
    * Sets the eindklantzipcode.
    * 
    * @param eindklantzipcode the new eindklantzipcode
    */
   public void setEindklantzipcode(String eindklantzipcode)
   {
      this.eindklantzipcode = eindklantzipcode;
   }

   /**
    * Gets the eindklantklantgroep.
    * 
    * @return the eindklantklantgroep
    */
   public String getEindklantklantgroep()
   {
      return this.eindklantklantgroep;
   }

   /**
    * Sets the eindklantklantgroep.
    * 
    * @param eindklantklantgroep the new eindklantklantgroep
    */
   public void setEindklantklantgroep(String eindklantklantgroep)
   {
      this.eindklantklantgroep = eindklantklantgroep;
   }

   /**
    * Gets the klantgroepsegment.
    * 
    * @return the klantgroepsegment
    */
   public String getKlantgroepsegment()
   {
      return this.klantgroepsegment;
   }

   /**
    * Sets the klantgroepsegment.
    * 
    * @param klantgroepsegment the new klantgroepsegment
    */
   public void setKlantgroepsegment(String klantgroepsegment)
   {
      this.klantgroepsegment = klantgroepsegment;
   }

   /**
    * Gets the klantgroepindustry.
    * 
    * @return the klantgroepindustry
    */
   public String getKlantgroepindustry()
   {
      return this.klantgroepindustry;
   }

   /**
    * Sets the klantgroepindustry.
    * 
    * @param klantgroepindustry the new klantgroepindustry
    */
   public void setKlantgroepindustry(String klantgroepindustry)
   {
      this.klantgroepindustry = klantgroepindustry;
   }

   /**
    * Gets the klantgroepsector.
    * 
    * @return the klantgroepsector
    */
   public String getKlantgroepsector()
   {
      return this.klantgroepsector;
   }

   /**
    * Sets the klantgroepsector.
    * 
    * @param klantgroepsector the new klantgroepsector
    */
   public void setKlantgroepsector(String klantgroepsector)
   {
      this.klantgroepsector = klantgroepsector;
   }

   /**
    * Gets the bin_tarief.
    * 
    * @return the bin_tarief
    */
   public BigDecimal getBin_tarief()
   {
      return this.bin_tarief;
   }

   /**
    * Sets the bin_tarief.
    * 
    * @param bin_tarief the new bin_tarief
    */
   public void setBin_tarief(BigDecimal bin_tarief)
   {
      this.bin_tarief = bin_tarief;
   }

   /**
    * Gets the boe_omzet.
    * 
    * @return the boe_omzet
    */
   public BigDecimal getBoe_omzet()
   {
      return this.boe_omzet;
   }

   /**
    * Sets the boe_omzet.
    * 
    * @param boe_omzet the new boe_omzet
    */
   public void setBoe_omzet(BigDecimal boe_omzet)
   {
      this.boe_omzet = boe_omzet;
   }

   /**
    * Gets the fri_richttarief.
    * 
    * @return the fri_richttarief
    */
   public BigDecimal getFri_richttarief()
   {
      return this.fri_richttarief;
   }

   /**
    * Sets the fri_richttarief.
    * 
    * @param fri_richttarief the new fri_richttarief
    */
   public void setFri_richttarief(BigDecimal fri_richttarief)
   {
      this.fri_richttarief = fri_richttarief;
   }

   /**
    * Gets the inz_dat.
    * 
    * @return the inz_dat
    */
   public Date getInz_dat()
   {
      return this.inz_dat;
   }

   /**
    * Sets the inz_dat.
    * 
    * @param inz_dat the new inz_dat
    */
   public void setInz_dat(Date inz_dat)
   {
      this.inz_dat = inz_dat;
   }

   /**
    * Get the boe_uren.
    * 
    * @return Returns the boe_uren as a BigDecimal.
    */
   public BigDecimal getBoe_uren()
   {
      return this.boe_uren;
   }

   /**
    * Set the boe_uren to the specified value.
    * 
    * @param boe_uren The boe_uren to set.
    */
   public void setBoe_uren(BigDecimal boe_uren)
   {
      this.boe_uren = boe_uren;
   }

   /**
    * Get the employeeNumber.
    *
    * @return Returns the employeeNumber as a int.
    */
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }

   /**
    * Set the employeeNumber to the specified value.
    *
    * @param employeeNumber The employeeNumber to set.
    */
   public void setEmployeeNumber(int employeeNumber)
   {
      this.employeeNumber = employeeNumber;
   }

}
