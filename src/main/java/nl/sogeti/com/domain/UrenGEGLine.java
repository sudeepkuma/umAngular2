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

// TODO: Auto-generated Javadoc
/**
 * The Class UrenGEGLine.
 * 
 * @author mkangule (c) Mar 30, 2015, Sogeti B.V.
 * @version $Id:$
 * 
 * 
 */
@Entity
@Table(name="TmpararyUrenGEGLine")
@AttributeOverride(name = "id", column = @Column(name = "UrenGEGLine_id"))
public class UrenGEGLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;
   
   /** The periode. */
   private int jaar, maand, rubriek, brug, sac_code, sur_code, med_nr, sdi_code, dee_code, inz_volgnr, periode;

   /** The bonus_ind_izo. */
   private String rubriek_oms, brug_oms, sac_oms, sur_oms, mvw_naam, oee_code_hoger, oee_code_mdw, pcc, sfn_spn, sdi_oms, opd_code, dee_oms, inz_oms, oee_code_hoger_verantw, oee_code_verantw,
         oee_code_hoger_uitv_dee, oee_code_uitv_dee, oee_code_hoger_uitv, oee_code_uitv, bonus_ind_izo;

   /** The corr_uit_periode. */
   private Date corr_uit_periode;

   /** The perc_dvb. */
   private BigDecimal overuren, uren, perc_dvb;

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
    * Gets the rubriek.
    * 
    * @return the rubriek
    */
   public int getRubriek()
   {
      return this.rubriek;
   }

   /**
    * Sets the rubriek.
    * 
    * @param rubriek the new rubriek
    */
   public void setRubriek(int rubriek)
   {
      this.rubriek = rubriek;
   }

   /**
    * Gets the brug.
    * 
    * @return the brug
    */
   public int getBrug()
   {
      return this.brug;
   }

   /**
    * Sets the brug.
    * 
    * @param brug the new brug
    */
   public void setBrug(int brug)
   {
      this.brug = brug;
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
    * Gets the sur_code.
    * 
    * @return the sur_code
    */
   public int getSur_code()
   {
      return this.sur_code;
   }

   /**
    * Sets the sur_code.
    * 
    * @param sur_code the new sur_code
    */
   public void setSur_code(int sur_code)
   {
      this.sur_code = sur_code;
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
    * Gets the perc_dvb.
    * 
    * @return the perc_dvb
    */
   public BigDecimal getPerc_dvb()
   {
      return this.perc_dvb;
   }

   /**
    * Sets the perc_dvb.
    * 
    * @param perc_dvb the new perc_dvb
    */
   public void setPerc_dvb(BigDecimal perc_dvb)
   {
      this.perc_dvb = perc_dvb;
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
    * Gets the uren.
    * 
    * @return the uren
    */
   public BigDecimal getUren()
   {
      return this.uren;
   }

   /**
    * Sets the uren.
    * 
    * @param uren the new uren
    */
   public void setUren(BigDecimal uren)
   {
      this.uren = uren;
   }

   /**
    * Gets the overuren.
    * 
    * @return the overuren
    */
   public BigDecimal getOveruren()
   {
      return this.overuren;
   }

   /**
    * Sets the overuren.
    * 
    * @param overuren the new overuren
    */
   public void setOveruren(BigDecimal overuren)
   {
      this.overuren = overuren;
   }

   /**
    * Gets the periode.
    * 
    * @return the periode
    */
   public int getPeriode()
   {
      return this.periode;
   }

   /**
    * Sets the periode.
    * 
    * @param periode the new periode
    */
   public void setPeriode(int periode)
   {
      this.periode = periode;
   }

   /**
    * Gets the rubriek_oms.
    * 
    * @return the rubriek_oms
    */
   public String getRubriek_oms()
   {
      return this.rubriek_oms;
   }

   /**
    * Sets the rubriek_oms.
    * 
    * @param rubriek_oms the new rubriek_oms
    */
   public void setRubriek_oms(String rubriek_oms)
   {
      this.rubriek_oms = rubriek_oms;
   }

   /**
    * Gets the brug_oms.
    * 
    * @return the brug_oms
    */
   public String getBrug_oms()
   {
      return this.brug_oms;
   }

   /**
    * Sets the brug_oms.
    * 
    * @param brug_oms the new brug_oms
    */
   public void setBrug_oms(String brug_oms)
   {
      this.brug_oms = brug_oms;
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
    * Gets the sur_oms.
    * 
    * @return the sur_oms
    */
   public String getSur_oms()
   {
      return this.sur_oms;
   }

   /**
    * Sets the sur_oms.
    * 
    * @param sur_oms the new sur_oms
    */
   public void setSur_oms(String sur_oms)
   {
      this.sur_oms = sur_oms;
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
    * Gets the pcc.
    * 
    * @return the pcc
    */
   public String getPcc()
   {
      return this.pcc;
   }

   /**
    * Sets the pcc.
    * 
    * @param pcc the new pcc
    */
   public void setPcc(String pcc)
   {
      this.pcc = pcc;
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
    * Gets the inz_oms.
    * 
    * @return the inz_oms
    */
   public String getInz_oms()
   {
      return this.inz_oms;
   }

   /**
    * Sets the inz_oms.
    * 
    * @param inz_oms the new inz_oms
    */
   public void setInz_oms(String inz_oms)
   {
      this.inz_oms = inz_oms;
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
    * Gets the oee_code_hoger_uitv_dee.
    * 
    * @return the oee_code_hoger_uitv_dee
    */
   public String getOee_code_hoger_uitv_dee()
   {
      return this.oee_code_hoger_uitv_dee;
   }

   /**
    * Sets the oee_code_hoger_uitv_dee.
    * 
    * @param oee_code_hoger_uitv_dee the new oee_code_hoger_uitv_dee
    */
   public void setOee_code_hoger_uitv_dee(String oee_code_hoger_uitv_dee)
   {
      this.oee_code_hoger_uitv_dee = oee_code_hoger_uitv_dee;
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
    * Gets the bonus_ind_izo.
    * 
    * @return the bonus_ind_izo
    */
   public String getBonus_ind_izo()
   {
      return this.bonus_ind_izo;
   }

   /**
    * Sets the bonus_ind_izo.
    * 
    * @param bonus_ind_izo the new bonus_ind_izo
    */
   public void setBonus_ind_izo(String bonus_ind_izo)
   {
      this.bonus_ind_izo = bonus_ind_izo;
   }

   /**
    * Gets the corr_uit_periode.
    * 
    * @return the corr_uit_periode
    */
   public Date getCorr_uit_periode()
   {
      return this.corr_uit_periode;
   }

   /**
    * Sets the corr_uit_periode.
    * 
    * @param corr_uit_periode the new corr_uit_periode
    */
   public void setCorr_uit_periode(Date corr_uit_periode)
   {
      this.corr_uit_periode = corr_uit_periode;
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
