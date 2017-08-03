package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professionalsyp")
@AttributeOverride(name = "id", column = @Column(name = "profyp_id"))
public class ProfessionalsYP extends PerformanceLevel
{
   /**
	 * 
	 */
   private static final long serialVersionUID = 5878806421430981348L;
   
   

}
