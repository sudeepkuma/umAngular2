/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: himtiwar
 ** Copyright: (c) Feb 19, 2015 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ????.
 * 
 * @author himtiwar (c) Feb 19, 2015, Sogeti B.V.
 * @version $Id:$
 */
@Entity
@Table(name = "professional_indicators")
@AttributeOverride(name = "id", column = @Column(name = "professional_indicators_id"))
public class ProfessionalIndicators extends AbstractEntity {

	/**
	 * <code>serialVersionUID</code> indicates/is used for.
	 */
	private static final long serialVersionUID = 2661343931088343027L;

	/** The professionalisms. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "professional_indicators_professionalisms", referencedColumnName = "select_listitem_id")
	private SelectListItem professionalisms;

	/** The personal skills. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "professional_indicators_personal_skills", referencedColumnName = "select_listitem_id")
	private SelectListItem personalSkills;

	/** The commercial alertnesses. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "professional_indicators_commercial_alertnesses", referencedColumnName = "select_listitem_id")
	private SelectListItem commercialAlertnesses;

	/** The potential growths. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "professional_indicators_potential_growths", referencedColumnName = "select_listitem_id")
	private SelectListItem potentialGrowths;

	/**
	 * Get the professionalisms.
	 * 
	 * @return Returns the professionalisms as a SelectListItem.
	 */
	public SelectListItem getProfessionalisms() {
		return this.professionalisms;
	}

	/**
	 * Set the professionalisms to the specified value.
	 * 
	 * @param professionalisms
	 *            The professionalisms to set.
	 */
	public void setProfessionalisms(SelectListItem professionalisms) {
		this.professionalisms = professionalisms;
	}

	/**
	 * Get the personalSkills.
	 * 
	 * @return Returns the personalSkills as a SelectListItem.
	 */
	public SelectListItem getPersonalSkills() {
		return this.personalSkills;
	}

	/**
	 * Set the personalSkills to the specified value.
	 * 
	 * @param personalSkills
	 *            The personalSkills to set.
	 */
	public void setPersonalSkills(SelectListItem personalSkills) {
		this.personalSkills = personalSkills;
	}

	/**
	 * Get the commercialAlertnesses.
	 * 
	 * @return Returns the commercialAlertnesses as a SelectListItem.
	 */
	public SelectListItem getCommercialAlertnesses() {
		return this.commercialAlertnesses;
	}

	/**
	 * Set the commercialAlertnesses to the specified value.
	 * 
	 * @param commercialAlertnesses
	 *            The commercialAlertnesses to set.
	 */
	public void setCommercialAlertnesses(SelectListItem commercialAlertnesses) {
		this.commercialAlertnesses = commercialAlertnesses;
	}

	/**
	 * Get the potentialGrowths.
	 * 
	 * @return Returns the potentialGrowths as a SelectListItem.
	 */
	public SelectListItem getPotentialGrowths() {
		return this.potentialGrowths;
	}

	/**
	 * Set the potentialGrowths to the specified value.
	 * 
	 * @param potentialGrowths
	 *            The potentialGrowths to set.
	 */
	public void setPotentialGrowths(SelectListItem potentialGrowths) {
		this.potentialGrowths = potentialGrowths;
	}

}
