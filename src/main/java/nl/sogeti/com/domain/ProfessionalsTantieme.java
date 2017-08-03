package nl.sogeti.com.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professionalstantieme")
@AttributeOverride(name = "id", column = @Column(name = "proftantieme_id"))
public class ProfessionalsTantieme extends PerformanceLevel
{
   /**
	 * 
	 */
   private static final long serialVersionUID = -3023795208449334300L;
   
   

}
