package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class FamilyLine.
 */
@Entity
@Table(name="TmpararyFamilyLine")
@AttributeOverride(name = "id", column = @Column(name = "FamilyLine_id"))
public class FamilyLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   //Mednr	Volgnr	Relatie	Omschrijving	Naam	Geslacht	Geboortedatum

   /** The employee number. */
   private int employeeNumber;
   
   /** The following number. */
   private int followingNumber;

   /** The relation. */
   private String relation;

   /** The type. */
   private String type;

   /** The name. */
   private String name;

   /** The date of birth. */
   private Date dateOfBirth;

   /** The gender. */
   private String gender;

   /**
    * Gets the following number.
    * 
    * @return the following number
    */
   public int getFollowingNumber()
   {
      return this.followingNumber;
   }

   /**
    * Sets the following number.
    * 
    * @param followingNumber the new following number
    */
   public void setFollowingNumber(int followingNumber)
   {
      this.followingNumber = followingNumber;
   }

   /**
    * Gets the relation.
    * 
    * @return the relation
    */
   public String getRelation()
   {
      return this.relation;
   }

   /**
    * Sets the relation.
    * 
    * @param relation the new relation
    */
   public void setRelation(String relation)
   {
      this.relation = relation;
   }

   /**
    * Gets the name.
    * 
    * @return the name
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Sets the name.
    * 
    * @param name the new name
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * Gets the date of birth.
    * 
    * @return the date of birth
    */
   public Date getDateOfBirth()
   {
      return copy(this.dateOfBirth);
   }

   /**
    * Sets the date of birth.
    * 
    * @param dateOfBirth the new date of birth
    */
   public void setDateOfBirth(Date dateOfBirth)
   {
      this.dateOfBirth = copy(dateOfBirth);
   }

   /**
    * Gets the type.
    * 
    * @return the type
    */
   public String getType()
   {
      return this.type;
   }

   /**
    * Sets the type.
    * 
    * @param type the new type
    */
   public void setType(String type)
   {
      this.type = type;
   }

   /**
    * Sets the gender.
    * 
    * @param gender the new gender
    */
   public void setGender(String gender)
   {
      this.gender = gender;
   }

   /**
    * Gets the gender.
    * 
    * @return the gender
    */
   public String getGender()
   {
      return this.gender;
   }

   /**
    * Gets the employee number.
    *
    * @return the employee number
    */
   public int getEmployeeNumber()
   {
      return employeeNumber;
   }

   /**
    * Sets the employee number.
    *
    * @param employeeNumber the new employee number
    */
   public void setEmployeeNumber(int employeeNumber)
   {
      this.employeeNumber = employeeNumber;
   }

   
}
