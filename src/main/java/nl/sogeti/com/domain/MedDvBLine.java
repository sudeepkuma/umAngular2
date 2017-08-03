package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class MedDvBLine.
 */

@Entity
@Table(name="TmpararyMedDvBLine")
@AttributeOverride(name = "id", column = @Column(name = "MedDvBLine_id"))
public class MedDvBLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;
   
    
   /** The employee number. */
   private int employeeNumber;

   /** The manager initials. */
   private String compoundedName, addressName, lastName, nameInserts, firstLetters, firstName, title, gender, otherTitle, streetPlusNumber, postalcode, city, country, dateOfBirth, phoneNumber,
         initials, username, formerCompagny, inserviceCVG, email, unit, unitName, division, divisionName, typeOfEmployment, percDvB, percWAO, percOSV, inShifts, functionQualification, functionOE,
         functionMatrix, functionGroup, functionLevel, lsv, functionName, functionCode, functionCategory, classificationCode, classificationCodeDescription, categoryClassification,
         categoryClassificationDescription, grade, corporateID, corporateEmail, managerInitials,percObv,percAok;

   /** The manager number. */
   private int managerNumber;

   /** The end of employment. */
   private Date startOfEmployment, endOfEmployment;

   /**
    * Gets the compounded name.
    * 
    * @return the compounded name
    */
   public String getCompoundedName()
   {
      return this.compoundedName;
   }

   /**
    * Sets the compounded name.
    * 
    * @param compoundedName the new compounded name
    */
   public void setCompoundedName(String compoundedName)
   {
      this.compoundedName = compoundedName;
   }

   /**
    * Gets the address name.
    * 
    * @return the address name
    */
   public String getAddressName()
   {
      return this.addressName;
   }

   /**
    * Sets the address name.
    * 
    * @param addressName the new address name
    */
   public void setAddressName(String addressName)
   {
      this.addressName = addressName;
   }

   /**
    * Gets the last name.
    * 
    * @return the last name
    */
   public String getLastName()
   {
      return this.lastName;
   }

   /**
    * Sets the last name.
    * 
    * @param lastName the new last name
    */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   /**
    * Gets the name inserts.
    * 
    * @return the name inserts
    */
   public String getNameInserts()
   {
      return this.nameInserts;
   }

   /**
    * Sets the name inserts.
    * 
    * @param nameInserts the new name inserts
    */
   public void setNameInserts(String nameInserts)
   {
      this.nameInserts = nameInserts;
   }

   /**
    * Gets the first letters.
    * 
    * @return the first letters
    */
   public String getFirstLetters()
   {
      return this.firstLetters;
   }

   /**
    * Sets the first letters.
    * 
    * @param firstLetters the new first letters
    */
   public void setFirstLetters(String firstLetters)
   {
      this.firstLetters = firstLetters;
   }

   /**
    * Gets the first name.
    * 
    * @return the first name
    */
   public String getFirstName()
   {
      return this.firstName;
   }

   /**
    * Sets the first name.
    * 
    * @param firstName the new first name
    */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   /**
    * Gets the title.
    * 
    * @return the title
    */
   public String getTitle()
   {
      return this.title;
   }

   /**
    * Sets the title.
    * 
    * @param title the new title
    */
   public void setTitle(String title)
   {
      this.title = title;
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
    * Sets the gender.
    * 
    * @param gender the new gender
    */
   public void setGender(String gender)
   {
      this.gender = gender;
   }

   /**
    * Gets the other title.
    * 
    * @return the other title
    */
   public String getOtherTitle()
   {
      return this.otherTitle;
   }

   /**
    * Sets the other title.
    * 
    * @param otherTitle the new other title
    */
   public void setOtherTitle(String otherTitle)
   {
      this.otherTitle = otherTitle;
   }

   /**
    * Gets the street plus number.
    * 
    * @return the street plus number
    */
   public String getStreetPlusNumber()
   {
      return this.streetPlusNumber;
   }

   /**
    * Sets the street plus number.
    * 
    * @param streetPlusNumber the new street plus number
    */
   public void setStreetPlusNumber(String streetPlusNumber)
   {
      this.streetPlusNumber = streetPlusNumber;
   }

   /**
    * Gets the postalcode.
    * 
    * @return the postalcode
    */
   public String getPostalcode()
   {
      return this.postalcode;
   }

   /**
    * Sets the postalcode.
    * 
    * @param postalcode the new postalcode
    */
   public void setPostalcode(String postalcode)
   {
      this.postalcode = postalcode;
   }

   /**
    * Gets the city.
    * 
    * @return the city
    */
   public String getCity()
   {
      return this.city;
   }

   /**
    * Sets the city.
    * 
    * @param city the new city
    */
   public void setCity(String city)
   {
      this.city = city;
   }

   /**
    * Gets the country.
    * 
    * @return the country
    */
   public String getCountry()
   {
      return this.country;
   }

   /**
    * Sets the country.
    * 
    * @param country the new country
    */
   public void setCountry(String country)
   {
      this.country = country;
   }

   /**
    * Gets the date of birth.
    * 
    * @return the date of birth
    */
   public String getDateOfBirth()
   {
      return this.dateOfBirth;
   }

   /**
    * Sets the date of birth.
    * 
    * @param dateOfBirth the new date of birth
    */
   public void setDateOfBirth(String dateOfBirth)
   {
      this.dateOfBirth = dateOfBirth;
   }

   /**
    * Gets the phone number.
    * 
    * @return the phone number
    */
   public String getPhoneNumber()
   {
      return this.phoneNumber;
   }

   /**
    * Sets the phone number.
    * 
    * @param phoneNumber the new phone number
    */
   public void setPhoneNumber(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   /**
    * Gets the initials.
    * 
    * @return the initials
    */
   public String getInitials()
   {
      return this.initials;
   }

   /**
    * Sets the initials.
    * 
    * @param initials the new initials
    */
   public void setInitials(String initials)
   {
      this.initials = initials;
   }

   /**
    * Gets the username.
    * 
    * @return the username
    */
   public String getUsername()
   {
      return this.username;
   }

   /**
    * Sets the username.
    * 
    * @param username the new username
    */
   public void setUsername(String username)
   {
      this.username = username;
   }

   /**
    * Gets the start of employment.
    * 
    * @return the start of employment
    */
   public Date getStartOfEmployment()
   {
      return copy(this.startOfEmployment);
   }

   /**
    * Sets the start of employment.
    * 
    * @param startOfEmployment the new start of employment
    */
   public void setStartOfEmployment(Date startOfEmployment)
   {
      this.startOfEmployment = copy(startOfEmployment);
   }

   /**
    * Gets the end of employment.
    * 
    * @return the end of employment
    */
   public Date getEndOfEmployment()
   {
      return copy(this.endOfEmployment);
   }

   /**
    * Sets the end of employment.
    * 
    * @param endOfEmployment the new end of employment
    */
   public void setEndOfEmployment(Date endOfEmployment)
   {
      this.endOfEmployment = copy(endOfEmployment);
   }

   /**
    * Gets the former compagny.
    * 
    * @return the former compagny
    */
   public String getFormerCompagny()
   {
      return this.formerCompagny;
   }

   /**
    * Sets the former compagny.
    * 
    * @param formerCompagny the new former compagny
    */
   public void setFormerCompagny(String formerCompagny)
   {
      this.formerCompagny = formerCompagny;
   }

   /**
    * Gets the inservice cvg.
    * 
    * @return the inservice cvg
    */
   public String getInserviceCVG()
   {
      return this.inserviceCVG;
   }

   /**
    * Sets the inservice cvg.
    * 
    * @param inserviceCVG the new inservice cvg
    */
   public void setInserviceCVG(String inserviceCVG)
   {
      this.inserviceCVG = inserviceCVG;
   }

   /**
    * Gets the email.
    * 
    * @return the email
    */
   public String getEmail()
   {
      return this.email;
   }

   /**
    * Sets the email.
    * 
    * @param email the new email
    */
   public void setEmail(String email)
   {
      this.email = email;
   }

   /**
    * Gets the manager number.
    * 
    * @return the manager number
    */
   public int getManagerNumber()
   {
      return this.managerNumber;
   }

   /**
    * Sets the manager number.
    * 
    * @param managerNumber the new manager number
    */
   public void setManagerNumber(int managerNumber)
   {
      this.managerNumber = managerNumber;
   }

   /**
    * Gets the unit.
    * 
    * @return the unit
    */
   public String getUnit()
   {
      return this.unit;
   }

   /**
    * Sets the unit.
    * 
    * @param unit the new unit
    */
   public void setUnit(String unit)
   {
      this.unit = unit;
   }

   /**
    * Gets the unit name.
    * 
    * @return the unit name
    */
   public String getUnitName()
   {
      return this.unitName;
   }

   /**
    * Sets the unit name.
    * 
    * @param unitName the new unit name
    */
   public void setUnitName(String unitName)
   {
      this.unitName = unitName;
   }

   /**
    * Gets the division.
    * 
    * @return the division
    */
   public String getDivision()
   {
      return this.division;
   }

   /**
    * Sets the division.
    * 
    * @param division the new division
    */
   public void setDivision(String division)
   {
      this.division = division;
   }

   /**
    * Gets the division name.
    * 
    * @return the division name
    */
   public String getDivisionName()
   {
      return this.divisionName;
   }

   /**
    * Sets the division name.
    * 
    * @param divisionName the new division name
    */
   public void setDivisionName(String divisionName)
   {
      this.divisionName = divisionName;
   }

   /**
    * Gets the type of employment.
    * 
    * @return the type of employment
    */
   public String getTypeOfEmployment()
   {
      return this.typeOfEmployment;
   }

   /**
    * Sets the type of employment.
    * 
    * @param typeOfEmployment the new type of employment
    */
   public void setTypeOfEmployment(String typeOfEmployment)
   {
      this.typeOfEmployment = typeOfEmployment;
   }

   /**
    * Gets the perc dv b.
    * 
    * @return the perc dv b
    */
   public String getPercDvB()
   {
      return this.percDvB;
   }

   /**
    * Sets the perc dv b.
    * 
    * @param percDvB the new perc dv b
    */
   public void setPercDvB(String percDvB)
   {
      this.percDvB = percDvB;
   }

   /**
    * Gets the perc wao.
    * 
    * @return the perc wao
    */
   public String getPercWAO()
   {
      return this.percWAO;
   }

   /**
    * Sets the perc wao.
    * 
    * @param percWAO the new perc wao
    */
   public void setPercWAO(String percWAO)
   {
      this.percWAO = percWAO;
   }

   /**
    * Gets the perc osv.
    * 
    * @return the perc osv
    */
   public String getPercOSV()
   {
      return this.percOSV;
   }

   /**
    * Sets the perc osv.
    * 
    * @param percOSV the new perc osv
    */
   public void setPercOSV(String percOSV)
   {
      this.percOSV = percOSV;
   }

   /**
    * Gets the in shifts.
    * 
    * @return the in shifts
    */
   public String getInShifts()
   {
      return this.inShifts;
   }

   /**
    * Sets the in shifts.
    * 
    * @param inShifts the new in shifts
    */
   public void setInShifts(String inShifts)
   {
      this.inShifts = inShifts;
   }

   /**
    * Gets the function qualification.
    * 
    * @return the function qualification
    */
   public String getFunctionQualification()
   {
      return this.functionQualification;
   }

   /**
    * Sets the function qualification.
    * 
    * @param functionQualification the new function qualification
    */
   public void setFunctionQualification(String functionQualification)
   {
      this.functionQualification = functionQualification;
   }

   /**
    * Gets the function oe.
    * 
    * @return the function oe
    */
   public String getFunctionOE()
   {
      return this.functionOE;
   }

   /**
    * Sets the function oe.
    * 
    * @param functionOE the new function oe
    */
   public void setFunctionOE(String functionOE)
   {
      this.functionOE = functionOE;
   }

   /**
    * Gets the function matrix.
    * 
    * @return the function matrix
    */
   public String getFunctionMatrix()
   {
      return this.functionMatrix;
   }

   /**
    * Sets the function matrix.
    * 
    * @param functionMatrix the new function matrix
    */
   public void setFunctionMatrix(String functionMatrix)
   {
      this.functionMatrix = functionMatrix;
   }

   /**
    * Gets the function group.
    * 
    * @return the function group
    */
   public String getFunctionGroup()
   {
      return this.functionGroup;
   }

   /**
    * Sets the function group.
    * 
    * @param functionGroup the new function group
    */
   public void setFunctionGroup(String functionGroup)
   {
      this.functionGroup = functionGroup;
   }

   /**
    * Gets the function level.
    * 
    * @return the function level
    */
   public String getFunctionLevel()
   {
      return this.functionLevel;
   }

   /**
    * Sets the function level.
    * 
    * @param functionLevel the new function level
    */
   public void setFunctionLevel(String functionLevel)
   {
      this.functionLevel = functionLevel;
   }

   /**
    * Gets the lsv.
    * 
    * @return the lsv
    */
   public String getLsv()
   {
      return this.lsv;
   }

   /**
    * Sets the lsv.
    * 
    * @param lsv the new lsv
    */
   public void setLsv(String lsv)
   {
      this.lsv = lsv;
   }

   /**
    * Gets the function name.
    * 
    * @return the function name
    */
   public String getFunctionName()
   {
      return this.functionName;
   }

   /**
    * Sets the function name.
    * 
    * @param functionName the new function name
    */
   public void setFunctionName(String functionName)
   {
      this.functionName = functionName;
   }

   /**
    * Gets the function code.
    * 
    * @return the function code
    */
   public String getFunctionCode()
   {
      return this.functionCode;
   }

   /**
    * Sets the function code.
    * 
    * @param functionCode the new function code
    */
   public void setFunctionCode(String functionCode)
   {
      this.functionCode = functionCode;
   }

   /**
    * Gets the function category.
    * 
    * @return the function category
    */
   public String getFunctionCategory()
   {
      return this.functionCategory;
   }

   /**
    * Sets the function category.
    * 
    * @param functionCategory the new function category
    */
   public void setFunctionCategory(String functionCategory)
   {
      this.functionCategory = functionCategory;
   }

   /**
    * Gets the classification code.
    * 
    * @return the classification code
    */
   public String getClassificationCode()
   {
      return this.classificationCode;
   }

   /**
    * Sets the classification code.
    * 
    * @param classificationCode the new classification code
    */
   public void setClassificationCode(String classificationCode)
   {
      this.classificationCode = classificationCode;
   }

   /**
    * Gets the classification code description.
    * 
    * @return the classification code description
    */
   public String getClassificationCodeDescription()
   {
      return this.classificationCodeDescription;
   }

   /**
    * Sets the classification code description.
    * 
    * @param classificationCodeDescription the new classification code description
    */
   public void setClassificationCodeDescription(String classificationCodeDescription)
   {
      this.classificationCodeDescription = classificationCodeDescription;
   }

   /**
    * Gets the category classification.
    * 
    * @return the category classification
    */
   public String getCategoryClassification()
   {
      return this.categoryClassification;
   }

   /**
    * Sets the category classification.
    * 
    * @param categoryClassification the new category classification
    */
   public void setCategoryClassification(String categoryClassification)
   {
      this.categoryClassification = categoryClassification;
   }

   /**
    * Gets the category classification description.
    * 
    * @return the category classification description
    */
   public String getCategoryClassificationDescription()
   {
      return this.categoryClassificationDescription;
   }

   /**
    * Sets the category classification description.
    * 
    * @param categoryClassificationDescription the new category classification description
    */
   public void setCategoryClassificationDescription(String categoryClassificationDescription)
   {
      this.categoryClassificationDescription = categoryClassificationDescription;
   }

   /**
    * Gets the grade.
    * 
    * @return the grade
    */
   public String getGrade()
   {
      return this.grade;
   }

   /**
    * Sets the grade.
    * 
    * @param grade the new grade
    */
   public void setGrade(String grade)
   {
      this.grade = grade;
   }

   /**
    * Gets the corporate id.
    * 
    * @return the corporate id
    */
   public String getCorporateID()
   {
      return this.corporateID;
   }

   /**
    * Sets the corporate id.
    * 
    * @param corporateID the new corporate id
    */
   public void setCorporateID(String corporateID)
   {
      this.corporateID = corporateID;
   }

   /**
    * Gets the corporate email.
    * 
    * @return the corporate email
    */
   public String getCorporateEmail()
   {
      return this.corporateEmail;
   }

   /**
    * Sets the corporate email.
    * 
    * @param corporateEmail the new corporate email
    */
   public void setCorporateEmail(String corporateEmail)
   {
      this.corporateEmail = corporateEmail;
   }

   /**
    * Gets the manager initials.
    * 
    * @return the manager initials
    */
   public String getManagerInitials()
   {
      return this.managerInitials;
   }

   /**
    * Sets the manager initials.
    * 
    * @param managerInitials the new manager initials
    */
   public void setManagerInitials(String managerInitials)
   {
      this.managerInitials = managerInitials;
   }

   /**
    * Gets the perc obv.
    *
    * @return the perc obv
    */
   public String getPercObv()
   {
      return percObv;
   }

   /**
    * Sets the perc obv.
    *
    * @param percObv the new perc obv
    */
   public void setPercObv(String percObv)
   {
      this.percObv = percObv;
   }

   /**
    * Gets the perc aok.
    *
    * @return the perc aok
    */
   public String getPercAok()
   {
      return percAok;
   }

   /**
    * Sets the perc aok.
    *
    * @param percAok the new perc aok
    */
   public void setPercAok(String percAok)
   {
      this.percAok = percAok;
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
