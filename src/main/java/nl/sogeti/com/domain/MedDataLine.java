package nl.sogeti.com.domain;

import static nl.sogeti.com.util.Util.copy;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class MedDataLine.
 */
@Entity
@Table(name = "TmpararyMedDateLine")
@AttributeOverride(name = "id", column = @Column(name = "MedDataLine_id"))
public class MedDataLine extends AbstractEntity
{

   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 1L;

   /** The employee number. */
   private int employeeNumber;

   /** The um. */
   private int um;

   /** The sick code. */
   private String name, street, postcalcode, city, telephoneNumber, burgelijkeStaat, leaseCar, dvbPerc, function, lsn, functionName, typeEmployment, unit, normtaine, startOfIllness,
         ziekPerc, careAddress, sickCode;

   /** The started on. */
   private Date dateOfBirth, lastFB, lastPR, lastPG, lastFV, lastCVUpdate, startedOn,einde_contract;

   /** The home number. */
   private int homeNumber;

   /** The illness perc. */
   private String illnessPerc;

   /** The vakantie boven wettelijk. */
   private BigDecimal baseSalary, presBonus, perfBonus, vakantieWettelijk, leaseAmount, vakantieBovenWettelijk;

   /**
    * Gets the um.
    * 
    * @return the um
    */
   public int getUm()
   {
      return this.um;
   }

   /**
    * Sets the um.
    * 
    * @param um the new um
    */
   public void setUm(int um)
   {
      this.um = um;
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
    * Gets the street.
    * 
    * @return the street
    */
   public String getStreet()
   {
      return this.street;
   }

   /**
    * Sets the street.
    * 
    * @param street the new street
    */
   public void setStreet(String street)
   {
      this.street = street;
   }

   /**
    * Gets the home number.
    * 
    * @return the home number
    */
   public int getHomeNumber()
   {
      return this.homeNumber;
   }

   /**
    * Sets the home number.
    * 
    * @param homeNumber the new home number
    */
   public void setHomeNumber(int homeNumber)
   {
      this.homeNumber = homeNumber;
   }

   /**
    * Gets the postcalcode.
    * 
    * @return the postcalcode
    */
   public String getPostcalcode()
   {
      return this.postcalcode;
   }

   /**
    * Sets the postcalcode.
    * 
    * @param postcalcode the new postcalcode
    */
   public void setPostcalcode(String postcalcode)
   {
      this.postcalcode = postcalcode;
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
    * Gets the telephone number.
    * 
    * @return the telephone number
    */
   public String getTelephoneNumber()
   {
      return this.telephoneNumber;
   }

   /**
    * Sets the telephone number.
    * 
    * @param telephoneNumber the new telephone number
    */
   public void setTelephoneNumber(String telephoneNumber)
   {
      this.telephoneNumber = telephoneNumber;
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
    * Gets the started on.
    * 
    * @return the started on
    */
   public Date getStartedOn()
   {
      return copy(this.startedOn);
   }

   /**
    * Sets the started on.
    * 
    * @param startedOn the new started on
    */
   public void setStartedOn(Date startedOn)
   {
      this.startedOn = copy(startedOn);
   }

   /**
    * Gets the burgelijke staat.
    * 
    * @return the burgelijke staat
    */
   public String getBurgelijkeStaat()
   {
      return this.burgelijkeStaat;
   }

   /**
    * Sets the burgelijke staat.
    * 
    * @param burgelijkeStaat the new burgelijke staat
    */
   public void setBurgelijkeStaat(String burgelijkeStaat)
   {
      this.burgelijkeStaat = burgelijkeStaat;
   }

   /**
    * Gets the lease car.
    * 
    * @return the lease car
    */
   public String getLeaseCar()
   {
      return this.leaseCar;
   }

   /**
    * Sets the lease car.
    * 
    * @param leaseCar the new lease car
    */
   public void setLeaseCar(String leaseCar)
   {
      this.leaseCar = leaseCar;
   }

   /**
    * Gets the lease amount.
    * 
    * @return the lease amount
    */
   public BigDecimal getLeaseAmount()
   {
      return this.leaseAmount;
   }

   /**
    * Sets the lease amount.
    * 
    * @param line the new lease amount
    */
   public void setLeaseAmount(BigDecimal leaseAmount)
   {
      this.leaseAmount = leaseAmount;
   }

   /**
    * Gets the dvb perc.
    * 
    * @return the dvb perc
    */
   public String getDvbPerc()
   {
      return this.dvbPerc;
   }

   /**
    * Sets the dvb perc.
    * 
    * @param dvbPerc the new dvb perc
    */
   public void setDvbPerc(String dvbPerc)
   {
      this.dvbPerc = dvbPerc;
   }

   /**
    * Gets the function.
    * 
    * @return the function
    */
   public String getFunction()
   {
      return this.function;
   }

   /**
    * Sets the function.
    * 
    * @param function the new function
    */
   public void setFunction(String function)
   {
      this.function = function;
   }

   /**
    * Gets the lsn.
    * 
    * @return the lsn
    */
   public String getLsn()
   {
      return this.lsn;
   }

   /**
    * Sets the lsn.
    * 
    * @param lsn the new lsn
    */
   public void setLsn(String lsn)
   {
      this.lsn = lsn;
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
    * Gets the last cv update.
    * 
    * @return the last cv update
    */
   public Date getLastCVUpdate()
   {
      return copy(this.lastCVUpdate);
   }

   /**
    * Sets the last cv update.
    * 
    * @param lastCVUpdate the new last cv update
    */
   public void setLastCVUpdate(Date lastCVUpdate)
   {
      this.lastCVUpdate = copy(lastCVUpdate);
   }

   /**
    * Gets the type employment.
    * 
    * @return the type employment
    */
   public String getTypeEmployment()
   {
      return this.typeEmployment;
   }

   /**
    * Sets the type employment.
    * 
    * @param typeEmployment the new type employment
    */
   public void setTypeEmployment(String typeEmployment)
   {
      this.typeEmployment = typeEmployment;
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
    * Gets the last fb.
    * 
    * @return the last fb
    */
   public Date getLastFB()
   {
      return copy(this.lastFB);
   }

   /**
    * Sets the last fb.
    * 
    * @param lastFB the new last fb
    */
   public void setLastFB(Date lastFB)
   {
      this.lastFB = copy(lastFB);
   }

   /**
    * Gets the last pr.
    * 
    * @return the last pr
    */
   public Date getLastPR()
   {
      return copy(this.lastPR);
   }

   /**
    * Sets the last pr.
    * 
    * @param lastPR the new last pr
    */
   public void setLastPR(Date lastPR)
   {
      this.lastPR = copy(lastPR);
   }

   /**
    * Gets the last pg.
    * 
    * @return the last pg
    */
   public Date getLastPG()
   {
      return copy(this.lastPG);
   }

   /**
    * Sets the last pg.
    * 
    * @param lastPG the new last pg
    */
   public void setLastPG(Date lastPG)
   {
      this.lastPG = copy(lastPG);
   }

   /**
    * Gets the last fv.
    * 
    * @return the last fv
    */
   public Date getLastFV()
   {
      return copy(this.lastFV);
   }

   /**
    * Sets the last fv.
    * 
    * @param lastFV the new last fv
    */
   public void setLastFV(Date lastFV)
   {
      this.lastFV = copy(lastFV);
   }

   /**
    * Gets the base salary.
    * 
    * @return the base salary
    */
   public BigDecimal getBaseSalary()
   {
      return this.baseSalary;
   }

   /**
    * Sets the base salary.
    * 
    * @param baseSalary the new base salary
    */
   public void setBaseSalary(BigDecimal baseSalary)
   {
      this.baseSalary = baseSalary;
   }

   /**
    * Gets the pres bonus.
    * 
    * @return the pres bonus
    */
   public BigDecimal getPresBonus()
   {
      return this.presBonus;
   }

   /**
    * Sets the pres bonus.
    * 
    * @param normBonus the new pres bonus
    */
   public void setPresBonus(BigDecimal normBonus)
   {
      this.presBonus = normBonus;
   }

   /**
    * Gets the perf bonus.
    * 
    * @return the perf bonus
    */
   public BigDecimal getPerfBonus()
   {
      return this.perfBonus;
   }

   /**
    * Sets the perf bonus.
    * 
    * @param perfBonus the new perf bonus
    */
   public void setPerfBonus(BigDecimal perfBonus)
   {
      this.perfBonus = perfBonus;
   }

   /**
    * Gets the normtaine.
    * 
    * @return the normtaine
    */
   public String getNormtaine()
   {
      return this.normtaine;
   }

   /**
    * Sets the normtaine.
    * 
    * @param normtaine the new normtaine
    */
   public void setNormtaine(String normtaine)
   {
      this.normtaine = normtaine;
   }

   /**
    * Gets the start of illness.
    * 
    * @return the start of illness
    */
   public String getStartOfIllness()
   {
      return this.startOfIllness;
   }

   /**
    * Sets the start of illness.
    * 
    * @param startOfIllness the new start of illness
    */
   public void setStartOfIllness(String startOfIllness)
   {
      this.startOfIllness = startOfIllness;
   }

   /**
    * Gets the ziek perc.
    * 
    * @return the ziek perc
    */
   public String getZiekPerc()
   {
      return this.ziekPerc;
   }

   /**
    * Sets the ziek perc.
    * 
    * @param ziekPerc the new ziek perc
    */
   public void setZiekPerc(String ziekPerc)
   {
      this.ziekPerc = ziekPerc;
   }

   /**
    * Gets the care address.
    * 
    * @return the care address
    */
   public String getCareAddress()
   {
      return this.careAddress;
   }

   /**
    * Sets the care address.
    * 
    * @param careAddress the new care address
    */
   public void setCareAddress(String careAddress)
   {
      this.careAddress = careAddress;
   }

   /**
    * Gets the sick code.
    * 
    * @return the sick code
    */
   public String getSickCode()
   {
      return this.sickCode;
   }

   /**
    * Sets the sick code.
    * 
    * @param sickCode the new sick code
    */
   public void setSickCode(String sickCode)
   {
      this.sickCode = sickCode;
   }

   /**
    * Sets the illness perc.
    * 
    * @param illnessPerc the new illness perc
    */
   public void setIllnessPerc(String illnessPerc)
   {
      this.illnessPerc = illnessPerc;
   }

   /**
    * Gets the illness perc.
    * 
    * @return the illness perc
    */
   public String getIllnessPerc()
   {
      return this.illnessPerc;
   }

   /**
    * Gets the vakantie wettelijk.
    * 
    * @return the vakantie wettelijk
    */
   public BigDecimal getVakantieWettelijk()
   {
      return this.vakantieWettelijk;
   }

   /**
    * Sets the vakantie wettelijk.
    * 
    * @param vakantieWettelijk the new vakantie wettelijk
    */
   public void setVakantieWettelijk(BigDecimal vakantieWettelijk)
   {
      this.vakantieWettelijk = vakantieWettelijk;
   }

   /**
    * Gets the vakantie boven wettelijk.
    * 
    * @return the vakantie boven wettelijk
    */
   public BigDecimal getVakantieBovenWettelijk()
   {
      return this.vakantieBovenWettelijk;
   }

   /**
    * Sets the vakantie boven wettelijk.
    * 
    * @param vakantieBovenWettelijk the new vakantie boven wettelijk
    */
   public void setVakantieBovenWettelijk(BigDecimal vakantieBovenWettelijk)
   {
      this.vakantieBovenWettelijk = vakantieBovenWettelijk;
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

   public String getFirstName()
   {
      return name.split(" ")[0];
   }

   public String getLastName()
   {
      String[] arr = name.split(" ");
      return  arr[arr.length - 1] ;
   }

   public Date getEinde_contract() {
	return einde_contract;
   }

   public void setEinde_contract(Date einde_contract) {
	this.einde_contract = einde_contract;
   }

}
