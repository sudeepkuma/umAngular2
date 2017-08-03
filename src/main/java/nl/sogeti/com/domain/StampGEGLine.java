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

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class StampGEGLine.
 * 
 * @author mkangule (c) Mar 30, 2015, Sogeti B.V.
 * @version $Id:$
 */

@Entity
@Table(name="TmpararyStampGEGLine")
@AttributeOverride(name = "id", column = @Column(name = "StampGEGLine_id"))
public class StampGEGLine extends AbstractEntity
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;

   /** The aantal_ziektedagen. */
   private int jaar, maand, mdw_nr, code_dvb, lsv, aantal_ziekmeldingen, aantal_ziektedagen;

   /** The mv. */
   private String vak_geld_keuze, lease_auto, pl_dienst, functieniveau, functiekwalificatie;

   /** The bnp. */
   private BigDecimal perc_dvb, perc_wao, vaste_toeslag, variabele_toeslag, basisloon, normtantieme, maandelijks_voorschot, prestatienormbeloning, performancenormbeloning, bpv, biv, bov, leasebedrag,
         jaarinkomen, mv, onk, bnp,vaste_additionele_mv,vereveningstoeslag,salarisflex,verg_communicatie,vbp,bpb,inp;

   /**
    * Gets the jaar.
    *
    * @return the jaar
    */
   public int getJaar()
   {
      return jaar;
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
      return maand;
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
    * Gets the mdw_nr.
    *
    * @return the mdw_nr
    */
   public int getMdw_nr()
   {
      return mdw_nr;
   }

   /**
    * Sets the mdw_nr.
    *
    * @param mdw_nr the new mdw_nr
    */
   public void setMdw_nr(int mdw_nr)
   {
      this.mdw_nr = mdw_nr;
   }

   /**
    * Gets the code_dvb.
    *
    * @return the code_dvb
    */
   public int getCode_dvb()
   {
      return code_dvb;
   }

   /**
    * Sets the code_dvb.
    *
    * @param code_dvb the new code_dvb
    */
   public void setCode_dvb(int code_dvb)
   {
      this.code_dvb = code_dvb;
   }

   /**
    * Gets the salarisflex.
    *
    * @return the salarisflex
    */
   public BigDecimal getSalarisflex()
   {
      return salarisflex;
   }

   /**
    * Sets the salarisflex.
    *
    * @param salarisflex the new salarisflex
    */
   public void setSalarisflex(BigDecimal salarisflex)
   {
      this.salarisflex = salarisflex;
   }

   /**
    * Gets the lsv.
    *
    * @return the lsv
    */
   public int getLsv()
   {
      return lsv;
   }

   /**
    * Sets the lsv.
    *
    * @param lsv the new lsv
    */
   public void setLsv(int lsv)
   {
      this.lsv = lsv;
   }

   /**
    * Gets the verg_communicatie.
    *
    * @return the verg_communicatie
    */
   public BigDecimal getVerg_communicatie()
   {
      return verg_communicatie;
   }

   /**
    * Sets the verg_communicatie.
    *
    * @param verg_communicatie the new verg_communicatie
    */
   public void setVerg_communicatie(BigDecimal verg_communicatie)
   {
      this.verg_communicatie = verg_communicatie;
   }

   /**
    * Gets the vaste_additionele_mv.
    *
    * @return the vaste_additionele_mv
    */
   public BigDecimal getVaste_additionele_mv()
   {
      return vaste_additionele_mv;
   }

   /**
    * Sets the vaste_additionele_mv.
    *
    * @param vaste_additionele_mv the new vaste_additionele_mv
    */
   public void setVaste_additionele_mv(BigDecimal vaste_additionele_mv)
   {
      this.vaste_additionele_mv = vaste_additionele_mv;
   }

   /**
    * Gets the vereveningstoeslag.
    *
    * @return the vereveningstoeslag
    */
   public BigDecimal getVereveningstoeslag()
   {
      return vereveningstoeslag;
   }

   /**
    * Sets the vereveningstoeslag.
    *
    * @param vereveningstoeslag the new vereveningstoeslag
    */
   public void setVereveningstoeslag(BigDecimal vereveningstoeslag)
   {
      this.vereveningstoeslag = vereveningstoeslag;
   }

   /**
    * Gets the aantal_ziekmeldingen.
    *
    * @return the aantal_ziekmeldingen
    */
   public int getAantal_ziekmeldingen()
   {
      return aantal_ziekmeldingen;
   }

   /**
    * Sets the aantal_ziekmeldingen.
    *
    * @param aantal_ziekmeldingen the new aantal_ziekmeldingen
    */
   public void setAantal_ziekmeldingen(int aantal_ziekmeldingen)
   {
      this.aantal_ziekmeldingen = aantal_ziekmeldingen;
   }

   /**
    * Gets the aantal_ziektedagen.
    *
    * @return the aantal_ziektedagen
    */
   public int getAantal_ziektedagen()
   {
      return aantal_ziektedagen;
   }

   /**
    * Sets the aantal_ziektedagen.
    *
    * @param aantal_ziektedagen the new aantal_ziektedagen
    */
   public void setAantal_ziektedagen(int aantal_ziektedagen)
   {
      this.aantal_ziektedagen = aantal_ziektedagen;
   }

   /**
    * Gets the vak_geld_keuze.
    *
    * @return the vak_geld_keuze
    */
   public String getVak_geld_keuze()
   {
      return vak_geld_keuze;
   }

   /**
    * Sets the vak_geld_keuze.
    *
    * @param vak_geld_keuze the new vak_geld_keuze
    */
   public void setVak_geld_keuze(String vak_geld_keuze)
   {
      this.vak_geld_keuze = vak_geld_keuze;
   }

   /**
    * Gets the lease_auto.
    *
    * @return the lease_auto
    */
   public String getLease_auto()
   {
      return lease_auto;
   }

   /**
    * Sets the lease_auto.
    *
    * @param lease_auto the new lease_auto
    */
   public void setLease_auto(String lease_auto)
   {
      this.lease_auto = lease_auto;
   }

   /**
    * Gets the pl_dienst.
    *
    * @return the pl_dienst
    */
   public String getPl_dienst()
   {
      return pl_dienst;
   }

   /**
    * Sets the pl_dienst.
    *
    * @param pl_dienst the new pl_dienst
    */
   public void setPl_dienst(String pl_dienst)
   {
      this.pl_dienst = pl_dienst;
   }

   /**
    * Gets the functieniveau.
    *
    * @return the functieniveau
    */
   public String getFunctieniveau()
   {
      return functieniveau;
   }

   /**
    * Sets the functieniveau.
    *
    * @param functieniveau the new functieniveau
    */
   public void setFunctieniveau(String functieniveau)
   {
      this.functieniveau = functieniveau;
   }

   /**
    * Gets the functiekwalificatie.
    *
    * @return the functiekwalificatie
    */
   public String getFunctiekwalificatie()
   {
      return functiekwalificatie;
   }

   /**
    * Sets the functiekwalificatie.
    *
    * @param functiekwalificatie the new functiekwalificatie
    */
   public void setFunctiekwalificatie(String functiekwalificatie)
   {
      this.functiekwalificatie = functiekwalificatie;
   }

   /**
    * Gets the perc_dvb.
    *
    * @return the perc_dvb
    */
   public BigDecimal getPerc_dvb()
   {
      return perc_dvb;
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
    * Gets the perc_wao.
    *
    * @return the perc_wao
    */
   public BigDecimal getPerc_wao()
   {
      return perc_wao;
   }

   /**
    * Sets the perc_wao.
    *
    * @param perc_wao the new perc_wao
    */
   public void setPerc_wao(BigDecimal perc_wao)
   {
      this.perc_wao = perc_wao;
   }

   /**
    * Gets the vaste_toeslag.
    *
    * @return the vaste_toeslag
    */
   public BigDecimal getVaste_toeslag()
   {
      return vaste_toeslag;
   }

   /**
    * Sets the vaste_toeslag.
    *
    * @param vaste_toeslag the new vaste_toeslag
    */
   public void setVaste_toeslag(BigDecimal vaste_toeslag)
   {
      this.vaste_toeslag = vaste_toeslag;
   }

   /**
    * Gets the variabele_toeslag.
    *
    * @return the variabele_toeslag
    */
   public BigDecimal getVariabele_toeslag()
   {
      return variabele_toeslag;
   }

   /**
    * Sets the variabele_toeslag.
    *
    * @param variabele_toeslag the new variabele_toeslag
    */
   public void setVariabele_toeslag(BigDecimal variabele_toeslag)
   {
      this.variabele_toeslag = variabele_toeslag;
   }

   /**
    * Gets the basisloon.
    *
    * @return the basisloon
    */
   public BigDecimal getBasisloon()
   {
      return basisloon;
   }

   /**
    * Sets the basisloon.
    *
    * @param basisloon the new basisloon
    */
   public void setBasisloon(BigDecimal basisloon)
   {
      this.basisloon = basisloon;
   }

   /**
    * Gets the normtantieme.
    *
    * @return the normtantieme
    */
   public BigDecimal getNormtantieme()
   {
      return normtantieme;
   }

   /**
    * Sets the normtantieme.
    *
    * @param normtantieme the new normtantieme
    */
   public void setNormtantieme(BigDecimal normtantieme)
   {
      this.normtantieme = normtantieme;
   }

   /**
    * Gets the maandelijks_voorschot.
    *
    * @return the maandelijks_voorschot
    */
   public BigDecimal getMaandelijks_voorschot()
   {
      return maandelijks_voorschot;
   }

   /**
    * Sets the maandelijks_voorschot.
    *
    * @param maandelijks_voorschot the new maandelijks_voorschot
    */
   public void setMaandelijks_voorschot(BigDecimal maandelijks_voorschot)
   {
      this.maandelijks_voorschot = maandelijks_voorschot;
   }

   /**
    * Gets the prestatienormbeloning.
    *
    * @return the prestatienormbeloning
    */
   public BigDecimal getPrestatienormbeloning()
   {
      return prestatienormbeloning;
   }

   /**
    * Sets the prestatienormbeloning.
    *
    * @param prestatienormbeloning the new prestatienormbeloning
    */
   public void setPrestatienormbeloning(BigDecimal prestatienormbeloning)
   {
      this.prestatienormbeloning = prestatienormbeloning;
   }

   /**
    * Gets the performancenormbeloning.
    *
    * @return the performancenormbeloning
    */
   public BigDecimal getPerformancenormbeloning()
   {
      return performancenormbeloning;
   }

   /**
    * Sets the performancenormbeloning.
    *
    * @param performancenormbeloning the new performancenormbeloning
    */
   public void setPerformancenormbeloning(BigDecimal performancenormbeloning)
   {
      this.performancenormbeloning = performancenormbeloning;
   }

   /**
    * Gets the bpv.
    *
    * @return the bpv
    */
   public BigDecimal getBpv()
   {
      return bpv;
   }

   /**
    * Sets the bpv.
    *
    * @param bpv the new bpv
    */
   public void setBpv(BigDecimal bpv)
   {
      this.bpv = bpv;
   }

   /**
    * Gets the biv.
    *
    * @return the biv
    */
   public BigDecimal getBiv()
   {
      return biv;
   }

   /**
    * Sets the biv.
    *
    * @param biv the new biv
    */
   public void setBiv(BigDecimal biv)
   {
      this.biv = biv;
   }

   /**
    * Gets the bov.
    *
    * @return the bov
    */
   public BigDecimal getBov()
   {
      return bov;
   }

   /**
    * Sets the bov.
    *
    * @param bov the new bov
    */
   public void setBov(BigDecimal bov)
   {
      this.bov = bov;
   }

   /**
    * Gets the leasebedrag.
    *
    * @return the leasebedrag
    */
   public BigDecimal getLeasebedrag()
   {
      return leasebedrag;
   }

   /**
    * Sets the leasebedrag.
    *
    * @param leasebedrag the new leasebedrag
    */
   public void setLeasebedrag(BigDecimal leasebedrag)
   {
      this.leasebedrag = leasebedrag;
   }

   /**
    * Gets the jaarinkomen.
    *
    * @return the jaarinkomen
    */
   public BigDecimal getJaarinkomen()
   {
      return jaarinkomen;
   }

   /**
    * Sets the jaarinkomen.
    *
    * @param jaarinkomen the new jaarinkomen
    */
   public void setJaarinkomen(BigDecimal jaarinkomen)
   {
      this.jaarinkomen = jaarinkomen;
   }

   /**
    * Gets the mv.
    *
    * @return the mv
    */
   public BigDecimal getMv()
   {
      return mv;
   }

   /**
    * Sets the mv.
    *
    * @param mv the new mv
    */
   public void setMv(BigDecimal mv)
   {
      this.mv = mv;
   }

   /**
    * Gets the onk.
    *
    * @return the onk
    */
   public BigDecimal getOnk()
   {
      return onk;
   }

   /**
    * Sets the onk.
    *
    * @param onk the new onk
    */
   public void setOnk(BigDecimal onk)
   {
      this.onk = onk;
   }

   /**
    * Gets the bnp.
    *
    * @return the bnp
    */
   public BigDecimal getBnp()
   {
      return bnp;
   }

   /**
    * Sets the bnp.
    *
    * @param bnp the new bnp
    */
   public void setBnp(BigDecimal bnp)
   {
      this.bnp = bnp;
   }

   /**
    * Gets the vbp.
    *
    * @return the vbp
    */
   public BigDecimal getVbp()
   {
      return vbp;
   }

   /**
    * Sets the vbp.
    *
    * @param vbp the new vbp
    */
   public void setVbp(BigDecimal vbp)
   {
      this.vbp = vbp;
   }

   /**
    * Gets the bpb.
    *
    * @return the bpb
    */
   public BigDecimal getBpb()
   {
      return bpb;
   }

   /**
    * Sets the bpb.
    *
    * @param bpb the new bpb
    */
   public void setBpb(BigDecimal bpb)
   {
      this.bpb = bpb;
   }

   /**
    * Gets the inp.
    *
    * @return the inp
    */
   public BigDecimal getInp()
   {
      return inp;
   }

   /**
    * Sets the inp.
    *
    * @param inp the new inp
    */
   public void setInp(BigDecimal inp)
   {
      this.inp = inp;
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
