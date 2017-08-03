package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professionalsbonus")
@AttributeOverride(name = "id", column = @Column(name = "profsbonus_id"))
public class ProfessionalsBonus extends PerformanceLevel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7728723178038781136L;
	
	

}
