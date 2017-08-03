/*------------------------------------------------------------------------------
 **     Ident: Delivery Center Java
 **    Author: mkangule
 ** Copyright: (c) Dec 12, 2014 Sogeti Nederland B.V. All Rights Reserved.
 **------------------------------------------------------------------------------
 ** Sogeti Nederland B.V.            |  No part of this file may be reproduced  
 ** Distributed Software Engineering |  or transmitted in any form or by any        
 ** Lange Dreef 17                   |  means, electronic or mechanical, for the      
 ** 4131 NJ Vianen                   |  purpose, without the express written    
 ** The Netherlands                  |  permission of the copyright holder.
 *------------------------------------------------------------------------------
 */
package nl.sogeti.com.domain;

import static java.lang.System.getProperty;
import static nl.sogeti.com.util.Util.copy;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import javax.imageio.ImageIO;
import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import nl.sogeti.com.comparator.PersonByAgeComparator;
import nl.sogeti.com.domain.Action.Status;
import nl.sogeti.com.enums.DateSettingOption;
import nl.sogeti.com.enums.Gender;
import nl.sogeti.com.enums.NotificationLevel;
import nl.sogeti.com.util.NotificationConverter;
import nl.sogeti.com.util.RatingCalculator;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// TODO: Auto-generated Javadoc
/**
 * This class represents an employee of Sogeti.
 */
@Entity
@Table(name = "employees")
@AttributeOverride(name = "id", column = @Column(name = "employee_id"))
public class Employee extends AbstractEntity implements Comparable<Employee> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 871042331336401548L;

	/** The number. */
	@NotNull
	private int number;

	/** The umnumber. */
	@NotNull
	private Integer umnumber = 0;

	/**
	 * The full name of the employee. E.g. Wouter Oet
	 */
	@NotNull
	private String name;
	
	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The gender. */
	@Enumerated(EnumType.STRING)
	private Gender gender;

	/**
	 * The name of the function (s)he is in. E.g. Technisch Projectmanager)
	 */
	@NotNull
	private String functionName;

	/** The email id. */
	private String emailId;

	/**
	 * The level of his function. E.g. P8 TODO convert to int based
	 */
	@NotNull
	private String functionLevel;

	/** The birth date. */

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthDate;

	/**
	 * The date (s)he joined Sogeti.
	 */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	/**
	 * The data (s)he left Sogeti.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	/** The base salary of the employee. */
	@NotNull
	private BigDecimal baseSalary;

	/**
	 * The bonus (s)he could make.
	 */
	@NotNull
	private BigDecimal bonus;// =="prestatienormbeloning"

	/** A different performance bonus element TODO import. */
	private BigDecimal performanceBonus;

	/**
	 * TODO import Tantième as part of the agreement of some employees. If an
	 * employee has tantième, he does not have the other performance related
	 * income components.
	 */
	private BigDecimal tantieme;

	/** The target rate per hour TODO import from BIS?. */
	private BigDecimal targetHourRate;

	/** The target day rate. */
	private BigDecimal targetHourlyRate;

	/** The mark up. */
	private BigDecimal markUp;

	/** The urve. */
	private BigDecimal urve;

	/** The date TODO what was this again?. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastOBUpdate;

	/**
	 * The date (s)he last updated his/her POP plan (Persoonlijk ontwikkelings
	 * plan, Personal Development Plan).
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastPOPUpdate;

	/**
	 * The date (s)he last updated his/her Curriculum Vitae.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastCVUpdate;

	/**
	 * The date (s)he last updated his/her Curriculum Vitae.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastCVPaspoortUpdate;

	/** The date (s)he TODO again ??. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastFV;

	/**
	 * The date (s)he last had a Persoonlijk Gesprek (Personal Conversation)
	 * with his/her Unit-manager.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastPG;

	/** TODO what?. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastPR;

	/**
	 * The date (s)he last had a Functionele Beoordeling (Functional Assessment)
	 * with his/her Unit-Manager.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastFB;

	/** The last sei. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastSEI;

	/** The last sei. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastKG;

	/**
	 * A photo of the employee.
	 */
	@Lob
	private byte[] photo;

	/** The Einde Contract date */
	@Temporal(TemporalType.TIMESTAMP)
	private Date einde_contract;

	private static final String KEY_EMPLOYEE_IMAGE_PATH = "umapp.job.pictures.detinationpath";
	/**
	 * A collection of files associated with this employee.
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "employee_files", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "file_id"))
	private Set<EmployeeFile> files = new HashSet<>();

	/**
	 * The client which (s)he is currently working for.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private Client client;

	/** The unit. */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "unit_id")
	private Unit unit;

	/**
	 * The notepad. A place to insert additional information about this
	 * employee.
	 */
	@Type(type = "org.hibernate.type.StringClobType")
	@Lob
	private String notepad;

	/**
	 * The certificates this employee has obtained.
	 */
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "employee_certificates", uniqueConstraints = @UniqueConstraint(columnNames = {
			"employee_id", "certificate_id" }), joinColumns = @JoinColumn(name = "employee_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "certificate_id", nullable = false))
	private Set<Certificate> certificates = new HashSet<>();

	/** The experiences. */
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "employee_experience", uniqueConstraints = @UniqueConstraint(columnNames = {
			"employee_id", "experience_id" }), joinColumns = @JoinColumn(name = "employee_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "experience_id", nullable = false))
	private Set<Experience> experiences = new HashSet<>();

	/** The ratings. */
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "employee_ratings", joinColumns = @JoinColumn(name = "employee_id"))
	@Fetch(FetchMode.JOIN)
	@MapKeyJoinColumn(name = "rankingitem_id")
	@Column(name = "rating")
	private Map<RankingItem, Integer> ratings = new HashMap<>();

	/** The previous assignments fulfilled by this employee. */
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Filter(name = "filterCurrent", condition = "(a.end is null OR a.end > CURRENT_TIMESTAMP() )")
	private Set<Assignment> assignments = new TreeSet<>();

	/** The expertises. */
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	private Set<EmployeeExpertise> expertises;

	/** The holidays. */
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Holiday> holidays = new ArrayList<Holiday>();

	/** The user. */
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User user;

	/**
	 * The address at which this employee lives.
	 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address = new Address();
	/**
	 * The telephone number of this employee.
	 */
	private String telephoneNumber;

	/**
	 * Additional general information about this employee.
	 */
	@Lob
	@Type(type = "org.hibernate.type.StringClobType")
	private String generalInfo;

	/**
	 * The Full-time-employee rating of this employee. I.e. if (s)he is working
	 * 40 hours a week it's 100, if (s)he is working 20 hours a week it's 50.
	 */
	private double fte;

	/**
	 * The number of days this employee has been sick this year.
	 */
	@Min(0)
	private int sickDays;
	/**
	 * The number of times this employee has been sick this year (multiple days
	 * in a row counts a one).
	 */
	@Min(0)
	private int timesSick;

	/** The percentage of current sickness. */
	private int sicknessPercentage;

	/** If the employee has a lease car. */
	private boolean leaseCar;

	/** The lease car name **/
	private String leaseCarName;
	/** The lease car amount **/
	private BigDecimal leaseAmount;
	/**
	 * If the employee is a young professional or not.
	 */
	private boolean youngProfessional;

	/** The vakantie wettelijk. */
	private BigDecimal vakantieWettelijk;

	/** The vakantie boven wettelijk. */
	private BigDecimal vakantieBovenWettelijk;

	/** The current employee. */
	private boolean oldEmployee;
	
	@Transient
	private String umName;

	/** The current employee. */
	@Temporal(TemporalType.DATE)
	private Date resignDate;	
	/**
    * If the employee is selected to generate pdf.
    */
	@Transient
   private boolean selected;	 
	/**
	 * Important persons in this employees life. E.g. partner and children
	 */
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinTable(name = "employee_relations", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "person_id"))
	private Set<Person> relations = new HashSet<>();

	/** The conversations. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "employee_conversations", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "conversation_id"))
	private Set<Conversation> conversations = new HashSet<>();

	/** The course entries. */
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<CourseEntry> courseEntries = new HashSet<>();

	/** The actions. */
	@OrderBy(value = "dueDate DESC")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "employee_actions", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "action_id"))
	private Set<Action> actions = new HashSet<>();

	/** Fields for the Free Fields tab. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "employee_employeefields", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "employeeField_id"))
	private Set<EmployeeFields> employeeFields = new HashSet<>();

	/** The projects. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinTable(name = "employee_projects", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Projects> projects = new ArrayList<Projects>();

	/** The planning. */
	@OneToOne(cascade = CascadeType.ALL, optional = true, fetch = FetchType.LAZY)
	private Planning planning = new Planning();

	/** The current assignment. */
	@OneToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "assignment_id")
	private Assignment currentAssignment; // =

	/** The sei assessments. */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "employee_sei_assessments", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "sei_assessment_id"))
	private Set<SEIAssessment> seiAssessments = new HashSet<>();

	/** The rating. */
	@Transient
	private Map<DateSettingOption, NotificationLevel> rating;

	/** The um rank. */
	@Transient
	private BigDecimal umRank;

	/** The iz rating. */
	@Transient
	private int izRating;

	/** The deviation. */
	@Transient
	private int deviation;

	/** The ranking. */
	@Transient
	private int ranking;

	/** The on holiday. */
	@Transient
	private boolean onHoliday;

	/** The pending actions. */
	@Transient
	private boolean pendingActions;

	/** The pending actions past due date. */
	@Transient
	private boolean pendingActionsPastDueDate;

	/** The sick. */
	@Transient
	private boolean sick;

	/** The age. */
	@Transient
	private int age;

	/** The expertise. */
	@Transient
	private Map<String, List<String>> expertise = new HashMap<String, List<String>>();

	/** The relation. */
	@Transient
	private List<Person> relation = new ArrayList<Person>();

	/** Copied From FreeFieldsTabDTO. */
	@Transient
	private List<EmployeeFields> tableFields;

	@Transient
	private String[] anniversaryDate;

	@Transient
	private String vacation;

	@Transient
	private String logo;	 
	
	@Transient
	private BufferedImage image;

	/**
	 * Constructor: create a new Employee.
	 */
	public Employee() {
	}

   /**
    * Constructor: create a new Employee.
    * @param number
    * @param name
    * @param firstName
    * @param lastName
    */
   public Employee(int number, String name, String firstName, String lastName,int umnumber )
   {
      super();
      this.number = number;
      this.name = name;
      this.firstName = firstName;
      this.lastName = lastName;
      this.umnumber = umnumber;
   }

   /**
	 * Instantiates a new employee.
	 * 
	 * @param employee
	 *            the employee
	 */
	public Employee(Employee employee) {
		super(employee);
		this.tableFields = new ArrayList<EmployeeFields>();
		Set<EmployeeFields> fields = employee.getEmployeeFields();
		for (EmployeeFields ef : fields) {
			this.tableFields.add(new EmployeeFields(ef));
		}
	}

	/**
	 * Instantiates a new employee.
	 * 
	 * @param employee
	 *            the employee
	 * @param settings
	 *            the settings
	 */
	public Employee(Employee employee, Settings settings) {

		this.id = employee.getId();
		this.number = employee.getNumber();
		this.name = employee.getName();
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.startDate = employee.getStartDate();

		this.photo = employee.getPhoto();
		this.umnumber = employee.getUmNumber();
		this.rating = calculateNotificationLevels(employee, settings);
		this.umRank = RatingCalculator.invoke(employee.getRatings());

		// TODO : The following is not implemented
		this.izRating = 1;
		this.deviation = 1;
		this.ranking = 1;

		// Person
		this.gender = employee.getGender();
		this.birthDate = employee.getBirthDate();
		this.address = employee.getAddress();
		this.telephoneNumber = employee.getTelephoneNumber();

		// Absence
		setSicknessPercentage(employee.getSicknessPercentage());
		this.sickDays = employee.getSickDays();

		// Business
		this.functionLevel = employee.getFunctionLevel();
		this.expertises = employee.getExpertises();
		this.certificates = employee.getCertificates();
		this.setRelation(employee.getRelations());
		setPendingActions(employee.getActions());

		// Holidays
		this.vakantieWettelijk = employee.getVakantieWettelijk();
		this.vakantieBovenWettelijk = employee.getVakantieBovenWettelijk();
		this.timesSick = employee.getTimesSick();

		this.oldEmployee = employee.isOldEmployee();
		this.emailId = employee.getEmailId();

		// planning

		this.lastPG = employee.getLastPG();
		this.lastFB = employee.getLastFB();
		this.lastFV = employee.getLastFV();
		this.lastPR = employee.getLastPR();
		this.lastKG = employee.getLastKG();
		this.lastSEI = employee.getLastSEI();
		this.lastCVUpdate = employee.getLastCVUpdate();
		this.lastCVPaspoortUpdate = employee.getLastCVPaspoortUpdate();
		this.lastOBUpdate = employee.getLastOBUpdate();
		this.lastPOPUpdate = employee.getLastPOPUpdate();

	}

	/**
	 * Instantiates a new employee.
	 * 
	 * @param user
	 *            the user
	 */
	public Employee(User user) {
		this(user.getEmployee(), user.getSettings());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nl.sogeti.umd.domain.AbstractEntity#toString()
	 */
	@Override
	public String toString() {
		return "Employee{" + "id=" + getId() + ", number=" + this.number
				+ ", name='" + this.name + '\'' + ", gender=" + this.gender
				+ ", functionName='" + this.functionName + '\''
				+ ", functionLevel='" + this.functionLevel + '\''
				+ ", birthDate=" + this.birthDate + ", startDate="
				+ this.startDate + ", endDate=" + this.endDate
				+ ", baseSalary=" + this.baseSalary + ", bonus=" + this.bonus
				+ ", lastOBUpdate=" + this.lastOBUpdate + ", lastPOPUpdate="
				+ this.lastPOPUpdate + ", lastCVUpdate=" + this.lastCVUpdate
				+ ", lastFV=" + this.lastFV + ", lastPG=" + this.lastPG
				+ ", lastPR=" + this.lastPR + ", lastFB=" + this.lastFB
				+ this.lastKG + ", files=" + this.files + ", client="
				+ this.client + ", notepad='" + this.notepad + '\''
				+ ", certificates=" + this.certificates + ", address="
				+ this.address + ", telephoneNumber='" + this.telephoneNumber
				+ '\'' + ", generalInfo='" + this.generalInfo + '\'' + ", fte="
				+ this.fte + ", leaseCar=" + this.leaseCar
				+ ", youngProfessional=" + this.youngProfessional +
				", selected=" +this.selected + '}'; 
	}

	/**
	 * Get the seiAssessments.
	 * 
	 * @return Returns the seiAssessments as a Set<SEIAssessment>.
	 */
	public Set<SEIAssessment> getSeiAssessments() {
		return this.seiAssessments;
	}

	/**
	 * Set the seiAssessments to the specified value.
	 * 
	 * @param seiAssessments
	 *            The seiAssessments to set.
	 */
	public void setSeiAssessments(Set<SEIAssessment> seiAssessments) {
		this.seiAssessments = seiAssessments;
	}

	/**
	 * Gets the certificates this employee has obtained.
	 * 
	 * @return the certificates this employee has obtained
	 */
	public Set<Certificate> getCertificates() {
		return this.certificates;
	}

	/**
	 * Sets the certificates this employee has obtained.
	 * 
	 * @param certificates
	 *            the new certificates this employee has obtained
	 */
	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}

	/**
	 * Gets the client which (s)he is currently working for.
	 * 
	 * @return the client which (s)he is currently working for
	 */
	public Client getClient() {
		return this.client;
	}

	/**
	 * Sets the client which (s)he is currently working for.
	 * 
	 * @param client
	 *            the new client which (s)he is currently working for
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Gets the base salary of the employee.
	 * 
	 * @return the base salary of the employee
	 */
	public BigDecimal getBaseSalary() {
		return this.baseSalary;
	}

	/**
	 * Sets the base salary of the employee.
	 * 
	 * @param baseSalary
	 *            the new base salary of the employee
	 */
	public void setBaseSalary(BigDecimal baseSalary) {
		Objects.requireNonNull(baseSalary);
		this.baseSalary = baseSalary;
	}

	/**
	 * Gets the bonus (s)he could make.
	 * 
	 * @return the bonus (s)he could make
	 */
	public BigDecimal getBonus() {
		return this.bonus;
	}

	/**
	 * Sets the bonus (s)he could make.
	 * 
	 * @param bonus
	 *            the new bonus (s)he could make
	 */
	public void setBonus(BigDecimal bonus) {
		Objects.requireNonNull(bonus);
		this.bonus = bonus;
	}

	/**
	 * Gets the notepad. A place to insert additional information about this
	 * employee.
	 * 
	 * @return the notepad
	 */
	public String getNotepad() {
		return this.notepad;
	}

	/**
	 * Sets the notepad. A place to insert additional information about this
	 * employee.
	 * 
	 * @param notepad
	 *            the new notepad
	 */
	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}

	/**
	 * Gets the number.
	 * 
	 * @return The employee number assigned to him by Sogeti.
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * Sets the number.
	 * 
	 * @param number
	 *            Integer representing the Unique EmployeeNumber within the
	 *            company.
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Gets the gender.
	 * 
	 * @return the gender
	 */
	public Gender getGender() {
		return this.gender;
	}

	/**
	 * Sets the gender.
	 * 
	 * @param gender
	 *            the new gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * Gets the data (s)he left Sogeti.
	 * 
	 * @return the data (s)he left Sogeti
	 */
	public Date getEndDate() {
		return copy(this.endDate);
	}

	/**
	 * Sets the data (s)he left Sogeti.
	 * 
	 * @param endDate
	 *            the new data (s)he left Sogeti
	 */
	public void setEndDate(Date endDate) {
		this.endDate = copy(endDate);
	}

	/**
	 * Gets the a photo of the employee.
	 * 
	 * @return the a photo of the employee
	 */
	public byte[] getPhoto() {
		return this.photo;
	}

	/**
	 * Sets the a photo of the employee.
	 * 
	 * @param photo
	 *            the new a photo of the employee
	 */
	public void setPhoto(byte[] photo) {
		if (photo != null) {
			this.photo = photo.clone();
		} else {
			this.photo = null;
		}
	}

	/**
	 * Gets the a collection of files associated with this employee.
	 * 
	 * @return the a collection of files associated with this employee
	 */
	public Set<EmployeeFile> getFiles() {
		return this.files;
	}

	/**
	 * Sets the a collection of files associated with this employee.
	 * 
	 * @param files
	 *            the new a collection of files associated with this employee
	 */
	public void setFiles(Set<EmployeeFile> files) {
		this.files = files;
	}

	/**
	 * Gets the address at which this employee lives.
	 * 
	 * @return the address at which this employee lives
	 */
	public Address getAddress() {
		return this.address;
	}

	/**
	 * Sets the address at which this employee lives.
	 * 
	 * @param address
	 *            the new address at which this employee lives
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Sets the telephone number of this employee.
	 * 
	 * @param telephoneNumber
	 *            the new telephone number of this employee
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	/**
	 * Gets the telephone number of this employee.
	 * 
	 * @return the telephone number of this employee
	 */
	public String getTelephoneNumber() {
		return this.telephoneNumber;
	}

	/**
	 * Gets the full name of the employee. E.g. Wouter Oet.
	 * 
	 * @return the full name of the employee
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the full name of the employee. E.g. Wouter Oet.
	 * 
	 * @param name
	 *            the new full name of the employee
	 */
	public void setName(String name) {
		Objects.requireNonNull(name);
		this.name = name;
	}

	/**
	 * Gets the name of the function (s)he is in. E.g. Technisch
	 * Projectmanager).
	 * 
	 * @return the name of the function (s)he is in
	 */
	public String getFunctionName() {
		return this.functionName;
	}

	/**
	 * Sets the name of the function (s)he is in. E.g. Technisch
	 * Projectmanager).
	 * 
	 * @param functionName
	 *            the new name of the function (s)he is in
	 */
	public void setFunctionName(String functionName) {
		Objects.requireNonNull(functionName);
		this.functionName = functionName;
	}

	/**
	 * Gets the level of his function. E.g. P8 TODO convert to int based.
	 * 
	 * @return the level of his function
	 */
	public String getFunctionLevel() {
		return this.functionLevel;
	}

	/**
	 * Sets the level of his function. E.g. P8 TODO convert to int based.
	 * 
	 * @param functionLevel
	 *            the new level of his function
	 */
	public void setFunctionLevel(String functionLevel) {
		Objects.requireNonNull(functionLevel);
		this.functionLevel = functionLevel;
	}

	/**
	 * Gets the birth date.
	 * 
	 * @return the birth date
	 */
	public Date getBirthDate() {
		return copy(this.birthDate);
	}

	/**
	 * Sets the birth date.
	 * 
	 * @param birthDate
	 *            the new birth date
	 */
	public void setBirthDate(Date birthDate) {
		// Objects.requireNonNull(birthDate);
		this.birthDate = copy(birthDate);
	}

	/**
	 * Gets the date (s)he joined Sogeti.
	 * 
	 * @return the date (s)he joined Sogeti
	 */
	public Date getStartDate() {
		return copy(this.startDate);
	}

	/**
	 * Sets the date (s)he joined Sogeti.
	 * 
	 * @param startDate
	 *            the new date (s)he joined Sogeti
	 */
	public void setStartDate(Date startDate) {
		Objects.requireNonNull(startDate);
		this.startDate = copy(startDate);
	}

	/**
	 * Gets the date TODO what was this again?.
	 * 
	 * @return the date TODO what was this again?
	 */
	public Date getLastOBUpdate() {
		return copy(this.lastOBUpdate);
	}

	/**
	 * Sets the date TODO what was this again?.
	 * 
	 * @param lastOBUpdate
	 *            the new date TODO what was this again?
	 */
	public void setLastOBUpdate(Date lastOBUpdate) {
		this.lastOBUpdate = copy(lastOBUpdate);
	}

	/**
	 * Gets the date (s)he last updated his/her POP plan (Persoonlijk
	 * ontwikkelings plan, Personal Development Plan).
	 * 
	 * @return the date (s)he last updated his/her POP plan (Persoonlijk
	 *         ontwikkelings plan, Personal Development Plan)
	 */
	public Date getLastPOPUpdate() {
		return copy(this.lastPOPUpdate);
	}

	/**
	 * Sets the date (s)he last updated his/her POP plan (Persoonlijk
	 * ontwikkelings plan, Personal Development Plan).
	 * 
	 * @param lastPOPUpdate
	 *            the new date (s)he last updated his/her POP plan (Persoonlijk
	 *            ontwikkelings plan, Personal Development Plan)
	 */
	public void setLastPOPUpdate(Date lastPOPUpdate) {
		this.lastPOPUpdate = copy(lastPOPUpdate);
	}

	/**
	 * Gets the date (s)he last updated his/her Curriculum Vitae.
	 * 
	 * @return the date (s)he last updated his/her Curriculum Vitae
	 */
	public Date getLastCVPaspoortUpdate() {
		return copy(this.lastCVPaspoortUpdate);
	}

	/**
	 * Sets the date (s)he last updated his/her Curriculum Vitae.
	 * 
	 * @param lastCVPaspoortUpdate
	 *            the new date (s)he last updated his/her Curriculum Vitae
	 */
	public void setLastCVPaspoortUpdate(Date lastCVPaspoortUpdate) {
		this.lastCVPaspoortUpdate = copy(lastCVPaspoortUpdate);
	}

	/**
	 * Gets the date (s)he last updated his/her Curriculum Vitae.
	 * 
	 * @return the date (s)he last updated his/her Curriculum Vitae
	 */
	public Date getLastCVUpdate() {
		return copy(this.lastCVUpdate);
	}

	/**
	 * Sets the date (s)he last updated his/her Curriculum Vitae.
	 * 
	 * @param lastCVUpdate
	 *            the new date (s)he last updated his/her Curriculum Vitae
	 */
	public void setLastCVUpdate(Date lastCVUpdate) {
		this.lastCVUpdate = copy(lastCVUpdate);
	}

	/**
	 * Gets the date (s)he TODO again ??.
	 * 
	 * @return the date (s)he TODO again ??
	 */
	public Date getLastFV() {
		return copy(this.lastFV);
	}

	/**
	 * Sets the date (s)he TODO again ??.
	 * 
	 * @param lastFV
	 *            the new date (s)he TODO again ??
	 */
	public void setLastFV(Date lastFV) {
		this.lastFV = copy(lastFV);
	}

	/**
	 * Gets the date (s)he last had a Persoonlijk Gesprek (Personal
	 * Conversation) with his/her Unit-manager.
	 * 
	 * @return the date (s)he last had a Persoonlijk Gesprek (Personal
	 *         Conversation) with his/her Unit-manager
	 */
	public Date getLastPG() {
		return copy(this.lastPG);
	}

	/**
	 * Sets the date (s)he last had a Persoonlijk Gesprek (Personal
	 * Conversation) with his/her Unit-manager.
	 * 
	 * @param lastPG
	 *            the new date (s)he last had a Persoonlijk Gesprek (Personal
	 *            Conversation) with his/her Unit-manager
	 */
	public void setLastPG(Date lastPG) {
		this.lastPG = copy(lastPG);
	}

	/**
	 * Gets the tODO what?.
	 * 
	 * @return the tODO what?
	 */
	public Date getLastPR() {
		return copy(this.lastPR);
	}

	/**
	 * Sets the tODO what?.
	 * 
	 * @param lastPR
	 *            the new tODO what?
	 */
	public void setLastPR(Date lastPR) {
		this.lastPR = copy(lastPR);
	}

	/**
	 * Gets the date (s)he last had a Functionele Beoordeling (Functional
	 * Assessment) with his/her Unit-Manager.
	 * 
	 * @return the date (s)he last had a Functionele Beoordeling (Functional
	 *         Assessment) with his/her Unit-Manager
	 */
	public Date getLastFB() {
		return copy(this.lastFB);
	}

	/**
	 * Sets the date (s)he last had a Functionele Beoordeling (Functional
	 * Assessment) with his/her Unit-Manager.
	 * 
	 * @param lastFB
	 *            the new date (s)he last had a Functionele Beoordeling
	 *            (Functional Assessment) with his/her Unit-Manager
	 */
	public void setLastFB(Date lastFB) {
		this.lastFB = copy(lastFB);
	}

	/**
	 * Gets the last sei.
	 * 
	 * @return the last sei
	 */
	public Date getLastSEI() {
		return copy(this.lastSEI);
	}

	/**
	 * Sets the date (s)he last had a Functionele Beoordeling (Functional
	 * Assessment) with his/her Unit-Manager.
	 * 
	 * @param lastSEI
	 *            the new last sei
	 */
	public void setLastSEI(Date lastSEI) {
		this.lastSEI = copy(lastSEI);
	}

	/**
	 * Gets the last kg.
	 * 
	 * @return the last kg
	 */
	public Date getLastKG() {
		return copy(this.lastKG);
	}

	/**
	 * Sets the date (s)he last had a Functionele Beoordeling (Functional
	 * Assessment) with his/her Unit-Manager.
	 * 
	 * @param lastKG
	 *            the new last kg
	 */
	public void setLastKG(Date lastKG) {
		this.lastKG = copy(lastKG);
	}

	/**
	 * Sets the additional general information about this employee.
	 * 
	 * @param generalInfo
	 *            the new additional general information about this employee
	 */
	public void setGeneralInfo(String generalInfo) {
		this.generalInfo = generalInfo;
	}

	/**
	 * Gets the additional general information about this employee.
	 * 
	 * @return the additional general information about this employee
	 */
	public String getGeneralInfo() {
		return this.generalInfo;
	}

	/**
	 * Gets the Full-time-employee rating of this employee. I.e. if (s)he is
	 * working 40 hours a week it's 100, if (s)he is working 20 hours a week
	 * it's 50.
	 * 
	 * @return the Full-time-employee rating of this employee
	 */
	public double getFte() {
		return this.fte;
	}

	/**
	 * Sets the Full-time-employee rating of this employee. I.e. if (s)he is
	 * working 40 hours a week it's 100, if (s)he is working 20 hours a week
	 * it's 50.
	 * 
	 * @param fte
	 *            the new Full-time-employee rating of this employee
	 */
	public void setFte(double fte) {
		this.fte = fte;
	}

	/**
	 * Gets the if the employee has a lease car.
	 * 
	 * @return the if the employee has a lease car
	 */
	public boolean getLeaseCar() {
		return this.leaseCar;
	}

	/**
	 * Sets the if the employee has a lease car.
	 * 
	 * @param hasLeaseCar
	 *            the new if the employee has a lease car
	 */
	public void setLeaseCar(boolean hasLeaseCar) {
		this.leaseCar = hasLeaseCar;
	}

	/**
	 * Checks if is if the employee is a young professional or not.
	 * 
	 * @return the if the employee is a young professional or not
	 */
	public boolean isYoungProfessional() {
		return this.youngProfessional;
	}

	/**
	 * Sets the if the employee is a young professional or not.
	 * 
	 * @param youngProfessional
	 *            the new if the employee is a young professional or not
	 */
	public void setYoungProfessional(boolean youngProfessional) {
		this.youngProfessional = youngProfessional;
	}

	/**
	 * Gets the vakantie wettelijk.
	 * 
	 * @return the vakantie wettelijk
	 */
	public BigDecimal getVakantieWettelijk() {
		return this.vakantieWettelijk;
	}

	/**
	 * Sets the vakantie wettelijk.
	 * 
	 * @param vakantieWettelijk
	 *            the new vakantie wettelijk
	 */
	public void setVakantieWettelijk(BigDecimal vakantieWettelijk) {
		this.vakantieWettelijk = vakantieWettelijk;
	}

	/**
	 * Gets the vakantie boven wettelijk.
	 * 
	 * @return the vakantie boven wettelijk
	 */
	public BigDecimal getVakantieBovenWettelijk() {
		return this.vakantieBovenWettelijk;
	}

	/**
	 * Sets the vakantie boven wettelijk.
	 * 
	 * @param vakantieBovenWettelijk
	 *            the new vakantie boven wettelijk
	 */
	public void setVakantieBovenWettelijk(BigDecimal vakantieBovenWettelijk) {
		this.vakantieBovenWettelijk = vakantieBovenWettelijk;
	}

	/**
	 * Gets the number of days this employee has been sick this year.
	 * 
	 * @return the number of days this employee has been sick this year
	 */
	public int getSickDays() {
		return this.sickDays;
	}

	/**
	 * Sets the number of days this employee has been sick this year.
	 * 
	 * @param daysSick
	 *            the new number of days this employee has been sick this year
	 */
	public void setSickDays(int daysSick) {
		this.sickDays = daysSick;
	}

	/**
	 * Gets the number of times this employee has been sick this year (multiple
	 * days in a row counts a one).
	 * 
	 * @return the number of times this employee has been sick this year
	 *         (multiple days in a row counts a one)
	 */
	public int getTimesSick() {
		return this.timesSick;
	}

	/**
	 * Sets the number of times this employee has been sick this year (multiple
	 * days in a row counts a one).
	 * 
	 * @param timesSick
	 *            the new number of times this employee has been sick this year
	 *            (multiple days in a row counts a one)
	 */
	public void setTimesSick(int timesSick) {
		this.timesSick = timesSick;
	}

	/**
	 * Gets the important persons in this employees life. E.g. partner and
	 * children.
	 * 
	 * @return the important persons in this employees life
	 */
	public Set<Person> getRelations() {
		return this.relations;
	}

	/**
	 * Sets the important persons in this employees life. E.g. partner and
	 * children.
	 * 
	 * @param persons
	 *            the new important persons in this employees life
	 */
	public void setRelations(Set<Person> persons) {
		this.relations = persons;
	}

	/**
	 * Gets the conversations.
	 * 
	 * @return the conversations
	 */
	public Set<Conversation> getConversations() {
		return this.conversations;
	}

	/**
	 * Sets the conversations.
	 * 
	 * @param conversations
	 *            the new conversations
	 */
	public void setConversations(Set<Conversation> conversations) {
		this.conversations = conversations;
	}

	/**
	 * Gets the course entries.
	 * 
	 * @return the course entries
	 */
	public Set<CourseEntry> getCourseEntries() {
		return this.courseEntries;
	}

	/**
	 * Sets the course entries.
	 * 
	 * @param courseEntries
	 *            the new course entries
	 */
	public void setCourseEntries(Set<CourseEntry> courseEntries) {
		this.courseEntries = courseEntries;
	}

	/**
	 * Gets the previous assignments fulfilled by this employee.
	 * 
	 * @return the previous assignments fulfilled by this employee
	 */
	public Set<Assignment> getAssignments() {
		return this.assignments;
	}

	/**
	 * Sets the previous assignments fulfilled by this employee.
	 * 
	 * @param assignments
	 *            the new previous assignments fulfilled by this employee
	 */
	public void setAssignments(Set<Assignment> assignments) {
		this.assignments = assignments;
	}

	/**
	 * Gets the planning.
	 * 
	 * @return the planning
	 */
	public Planning getPlanning() {
		return this.planning;
	}

	/**
	 * Sets the planning.
	 * 
	 * @param planning
	 *            the new planning
	 */
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	/**
	 * Gets the current assignment.
	 * 
	 * @return the current assignment
	 */
	public Assignment getCurrentAssignment() {
		return this.currentAssignment;
	}

	/**
	 * Sets the current assignment.
	 * 
	 * @param currentAssignment
	 *            the new current assignment
	 */
	public void setCurrentAssignment(Assignment currentAssignment) {
		this.currentAssignment = currentAssignment;
	}

	/**
	 * Gets the actions.
	 * 
	 * @return the actions
	 */
	public Set<Action> getActions() {
		return this.actions;
	}

	/**
	 * Sets the actions.
	 * 
	 * @param actions
	 *            the new actions
	 */
	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}

	/**
	 * Gets the ratings.
	 * 
	 * @return the ratings
	 */
	public Map<RankingItem, Integer> getRatings() {
		return this.ratings;
	}

	/**
	 * Sets the ratings.
	 * 
	 * @param ratings
	 *            the ratings
	 */
	public void setRatings(Map<RankingItem, Integer> ratings) {
		this.ratings = ratings;
	}

	/**
	 * Gets the unit.
	 * 
	 * @return the unit
	 */
	public Unit getUnit() {
		return this.unit;
	}

	/**
	 * Sets the unit.
	 * 
	 * @param unit
	 *            the new unit
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	/**
	 * Gets the a different performance bonus element TODO import.
	 * 
	 * @return the performanceBonus
	 */
	public BigDecimal getPerformanceBonus() {
		return this.performanceBonus;
	}

	/**
	 * Sets the a different performance bonus element TODO import.
	 * 
	 * @param performanceBonus
	 *            the performanceBonus to set
	 */
	public void setPerformanceBonus(BigDecimal performanceBonus) {
		this.performanceBonus = performanceBonus;
	}

	/**
	 * Gets the tODO import Tantième as part of the agreement of some employees.
	 * If an employee has tantième, he does not have the other performance
	 * related income components.
	 * 
	 * @return the tantieme
	 */
	public BigDecimal getTantieme() {
		return this.tantieme;
	}

	/**
	 * Sets the tODO import Tantième as part of the agreement of some employees.
	 * If an employee has tantième, he does not have the other performance
	 * related income components.
	 * 
	 * @param tantieme
	 *            the tantieme to set
	 */
	public void setTantieme(BigDecimal tantieme) {
		this.tantieme = tantieme;
	}

	/**
	 * Gets the target rate per hour TODO import from BIS?.
	 * 
	 * @return the targetHourRate
	 */
	public BigDecimal getTargetHourRate() {
		return this.targetHourRate;
	}

	/**
	 * Sets the target rate per hour TODO import from BIS?.
	 * 
	 * @param targetHourRate
	 *            the targetHourRate to set
	 */
	public void setTargetHourRate(BigDecimal targetHourRate) {
		this.targetHourRate = targetHourRate;
	}

	/**
	 * Gets the expertises.
	 * 
	 * @return the expertises
	 */
	public Set<EmployeeExpertise> getExpertises() {
		return this.expertises;
	}

	/**
	 * Sets the expertises.
	 * 
	 * @param expertises
	 *            the expertises to set
	 */
	public void setExpertises(Set<EmployeeExpertise> expertises) {
		this.expertises = expertises;
	}

	/**
	 * Gets the target day rate.
	 * 
	 * @return the target day rate
	 */
	public BigDecimal getTargetHourlyRate() {
		return this.targetHourlyRate;
	}

	/**
	 * Sets the target day rate.
	 * 
	 * @param targetDayRate
	 *            the new target day rate
	 */
	public void setTargetHourlyRate(BigDecimal targetHourlyRate) {
		this.targetHourlyRate = targetHourlyRate;
	}

	/**
	 * Gets the mark up.
	 * 
	 * @return the mark up
	 */
	public BigDecimal getMarkUp() {
		return this.markUp;
	}

	/**
	 * Sets the mark up.
	 * 
	 * @param markUp
	 *            the new mark up
	 */
	public void setMarkUp(BigDecimal markUp) {
		this.markUp = markUp;
	}

	/**
	 * Gets the urve.
	 * 
	 * @return the urve
	 */
	public BigDecimal getUrve() {
		return this.urve;
	}

	/**
	 * Sets the urve.
	 * 
	 * @param urve
	 *            the new urve
	 */
	public void setUrve(BigDecimal urve) {
		this.urve = urve;
	}

	/**
	 * Gets the holidays.
	 * 
	 * @return the holidays
	 */
	public List<Holiday> getHolidays() {
		return this.holidays;
	}

	/**
	 * Sets the holidays.
	 * 
	 * @param holidays
	 *            the new holidays
	 */
	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	/**
	 * Gets the fields for the Free Fields tab.
	 * 
	 * @return the fields for the Free Fields tab
	 */
	public Set<EmployeeFields> getEmployeeFields() {
		return new TreeSet<EmployeeFields>(this.employeeFields);
	}

	/**
	 * Sets the fields for the Free Fields tab.
	 * 
	 * @param employeeFields
	 *            the new fields for the Free Fields tab
	 */
	public void setEmployeeFields(Set<EmployeeFields> employeeFields) {
		this.employeeFields = employeeFields;
	}

	/**
	 * Gets the user.
	 * 
	 * @return the user
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Sets the user.
	 * 
	 * @param user
	 *            the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Sets the employee field values.
	 * 
	 * @param tableFields
	 *            the new employee field values
	 */
	public void setEmployeeFieldValues(List<EmployeeFields> tableFields) {
		for (EmployeeFields tf : tableFields) {
			for (EmployeeFields ef : this.employeeFields) {
				if (tf.getId() == ef.getId()) {
					switch (ef.getField().getType()) {
					case StringFi:
						ef.setFieldText(tf.getFieldText());
						break;
					case DateFi:
						ef.setFieldDate(tf.getFieldDate());
						break;
					case Numeriek:
						ef.setFieldNum(tf.getFieldNum());
						break;
					case Ongebruikt:
						break;
					}
				}
			}
		}
	}

	/**
	 * Gets the percentage of current sickness.
	 * 
	 * @return the sicknessPercentage
	 */
	public int getSicknessPercentage() {
		return this.sicknessPercentage;
	}

	/**
	 * Sets the percentage of current sickness.
	 * 
	 * @param sicknessPercentage
	 *            the sicknessPercentage to set
	 */
	public void setSicknessPercentage(int sicknessPercentage) {
		this.sicknessPercentage = sicknessPercentage;
		this.sick = sicknessPercentage > 0;
	}

	/**
	 * Sets the sickness percentage from string.
	 * 
	 * @param snp
	 *            the new sickness percentage from string
	 */
	public void setSicknessPercentageFromString(String snp) {
		try {
			this.sicknessPercentage = Integer.parseInt(snp);
		} catch (NumberFormatException nfe) {
			this.sicknessPercentage = 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nl.sogeti.umd.domain.AbstractEntity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object that) {
		return (that instanceof Employee) && super.equals(that);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nl.sogeti.umd.domain.AbstractEntity#canEqual(java.lang.Object)
	 */
	@Override
	public boolean canEqual(Object that) {
		return that instanceof Employee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see nl.sogeti.umd.domain.AbstractEntity#hashCode()
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	/**
	 * Calculate notification levels.
	 * 
	 * @param employee
	 *            the employee
	 * @param settings
	 *            the settings
	 * @return the map
	 */
	private Map<DateSettingOption, NotificationLevel> calculateNotificationLevels(
			Employee employee, Settings settings) {
		Map<DateSettingOption, NotificationLevel> levels = new HashMap<DateSettingOption, NotificationLevel>();

		levels.put(
				DateSettingOption.CV_P,
				NotificationConverter.convert(
						employee.getLastCVPaspoortUpdate(),
						settings.getDateSetting(DateSettingOption.CV_P)));
		levels.put(DateSettingOption.CV, NotificationConverter.convert(
				employee.getLastCVUpdate(),
				settings.getDateSetting(DateSettingOption.CV)));
		levels.put(
				DateSettingOption.FB,
				NotificationConverter.convert(employee.getLastFB(),
						settings.getDateSetting(DateSettingOption.FB)));
		levels.put(
				DateSettingOption.FV,
				NotificationConverter.convert(employee.getLastFV(),
						settings.getDateSetting(DateSettingOption.FV)));

		levels.put(DateSettingOption.OB, NotificationConverter.convert(
				employee.getLastOBUpdate(),
				settings.getDateSetting(DateSettingOption.OB)));
		levels.put(DateSettingOption.POP, NotificationConverter.convert(
				employee.getLastPOPUpdate(),
				settings.getDateSetting(DateSettingOption.POP)));
		levels.put(
				DateSettingOption.PR,
				NotificationConverter.convert(employee.getLastPR(),
						settings.getDateSetting(DateSettingOption.PR)));
		levels.put(
				DateSettingOption.SEI,
				NotificationConverter.convert(employee.getLastSEI(),
						settings.getDateSetting(DateSettingOption.SEI)));

		levels.put(
				DateSettingOption.KG,
				NotificationConverter.convert(employee.getLastKG(),
						settings.getDateSetting(DateSettingOption.KG)));

		Planning planning = employee.getPlanning();
		// Date pgUpdate = employee.getLastPG();
		if (planning.getNextPG() != null
				&& planning.getNextPG().after(new Date())) {
			levels.put(DateSettingOption.PG, NotificationConverter.convert(
					planning.getNextPG(),
					settings.getDateSetting(DateSettingOption.PG)));
		} else {
			levels.put(DateSettingOption.PG, NotificationConverter.convert(
					employee.getLastPG(),
					settings.getDateSetting(DateSettingOption.PG)));
		}

		return levels;
	}

	/**
	 * Sets the pending actions.
	 * 
	 * @param actions
	 *            the new pending actions
	 */
	public void setPendingActions(Collection<Action> actions) {
		this.pendingActions = false;
		this.pendingActionsPastDueDate = false;

		Date now = new Date();

		// Test each action
		for (Action action : actions) {
			// We only care for actions with an open-status
			if (action.getStatus() == Status.OPGEVOERD) {
				// We have at least one pending action
				this.pendingActions = true;

				if (now.after(action.getDueDate())) {
					// We have an action past due
					this.pendingActionsPastDueDate = true;
					return; // This is all we need to know, so we are done
				}
			}
		}
	}

	/**
	 * Gets the rating.
	 * 
	 * @return the rating
	 */
	public Map<DateSettingOption, NotificationLevel> getRating() {
		return this.rating;
	}

	/**
	 * Gets the um rank.
	 * 
	 * @return the um rank
	 */
	public BigDecimal getUmRank() {
		return this.umRank;
	}

	/**
	 * Gets the iz rating.
	 * 
	 * @return the iz rating
	 */
	public int getIzRating() {
		return this.izRating;
	}

	/**
	 * Gets the deviation.
	 * 
	 * @return the deviation
	 */
	public int getDeviation() {
		return this.deviation;
	}

	/**
	 * Gets the ranking.
	 * 
	 * @return the ranking
	 */
	public int getRanking() {
		return this.ranking;
	}

	/**
	 * Checks if is on holiday.
	 * 
	 * @return true, if is on holiday
	 */
	public boolean isOnHoliday() {

		return this.onHoliday;

	}

	/**
	 * Sets the on holiday.
	 * 
	 * @param onHoliday
	 *            the new on holiday
	 */
	public void setOnHoliday(boolean onHoliday) {
		this.onHoliday = onHoliday;
	}

	/**
	 * Checks if is pending actions.
	 * 
	 * @return true, if is pending actions
	 */
	public boolean isPendingActions() {
		return this.pendingActions;
	}

	/**
	 * Checks if is pending actions past due date.
	 * 
	 * @return true, if is pending actions past due date
	 */
	public boolean isPendingActionsPastDueDate() {
		return this.pendingActionsPastDueDate;
	}

	/**
	 * Checks if is sick.
	 * 
	 * @return true, if is sick
	 */
	public boolean isSick() {
		return this.sick;
	}

	/**
	 * Get the age.
	 * 
	 * @return Returns the age as a int.
	 */
	public int getAge() {
		return calculateAge(getBirthDate());
	}

	/**
	 * Calculate age.
	 * 
	 * @param birthDate
	 *            the birth date
	 * @return the int
	 */
	public static int calculateAge(Date birthDate) {
		if (birthDate == null) {
			return -1;
		}

		Years years = Years.yearsBetween(new LocalDate(birthDate),
				new LocalDate());
		return years.getYears();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee other) {
		if (other == null) {
			return -1;
		}
		if (other.getName() == null || other.getName().length() == 0) {
			return -1;
		}
		if (getName() == null || getName().length() == 0) {
			return -1;
		}

		// TODO: if two names are the same, we should return
		// the compareTo of the two employee id's

		return getName().compareTo(other.getName());
	}

	/**
	 * Gets the status.
	 * 
	 * @return the status
	 */
	public String getStatus() {
		String status = "";
		if (isSick()) {
			status = "sick";
		} else if (isOnHoliday()) {
			status = "holiday";
		}

		return status;
	}

	/**
	 * Gets the pg_rating.
	 * 
	 * @return the pg_rating
	 */
	public NotificationLevel getPg_rating() {
		return this.rating.get(DateSettingOption.PG);
	}

	/**
	 * Gets the cv_rating.
	 * 
	 * @return the cv_rating
	 */
	public NotificationLevel getCv_rating() {
		return this.rating.get(DateSettingOption.CV);
	}

	/**
	 * Gets the cvp_rating.
	 * 
	 * @return the cvp_rating
	 */
	public NotificationLevel getCvp_rating() {
		return this.rating.get(DateSettingOption.CV_P);
	}

	/**
	 * Gets the pop_rating.
	 * 
	 * @return the pop_rating
	 */
	public NotificationLevel getPop_rating() {
		return this.rating.get(DateSettingOption.POP);
	}

	/**
	 * Gets the fb_rating.
	 * 
	 * @return the fb_rating
	 */
	public NotificationLevel getFb_rating() {
		return this.rating.get(DateSettingOption.FB);
	}

	/**
	 * Gets the fv_rating.
	 * 
	 * @return the fv_rating
	 */
	public NotificationLevel getFv_rating() {
		return this.rating.get(DateSettingOption.FV);
	}

	/**
	 * Gets the ob_rating.
	 * 
	 * @return the ob_rating
	 */
	public NotificationLevel getOb_rating() {
		return this.rating.get(DateSettingOption.OB);
	}

	/**
	 * Gets the SE i_rating.
	 * 
	 * @return the SE i_rating
	 */
	public NotificationLevel getSEI_rating() {
		return this.rating.get(DateSettingOption.SEI);
	}

	/**
	 * Gets the KG _rating.
	 * 
	 * @return the KG i_rating
	 */
	public NotificationLevel getKG_rating() {
		return this.rating.get(DateSettingOption.KG);
	}

	/**
	 * Gets the expertise.
	 * 
	 * @return the expertise
	 */
	public Map<String, List<String>> getExpertise() {
		return this.expertise;
	}

	/**
	 * Sets the expertise.
	 * 
	 * @param expertise
	 *            the expertise
	 */
	public void setExpertise(Map<String, List<String>> expertise) {
		this.expertise = expertise;
	}

	/**
	 * Sets the expertises.
	 * 
	 * @param expertise
	 *            the new expertises
	 */
	public void setExpertises(Collection<EmployeeExpertise> expertise) {
		setExpertise(convertExpertise(expertise));
	}

	/**
	 * Gets the experiences.
	 * 
	 * @return the experiences
	 */
	public Set<Experience> getExperiences() {
		return this.experiences;
	}

	/**
	 * Sets the experiences.
	 * 
	 * @param experiences
	 *            the new experiences
	 */
	public void setExperiences(Set<Experience> experiences) {
		this.experiences = experiences;
	}

	/**
	 * Convert expertise.
	 * 
	 * @param exp
	 *            the exp
	 * @return the map
	 */
	private Map<String, List<String>> convertExpertise(
			Collection<EmployeeExpertise> exp) {
		Map<String, List<String>> expertise = new HashMap<String, List<String>>();
		for (EmployeeExpertise empexp : exp) {
			String category = empexp.getExpertise().getCategory().getName();

			if (!expertise.containsKey(category)) {
				expertise.put(category, new ArrayList<String>());
			}
			expertise.get(category).add(empexp.getExpertise().getName());

		}

		return expertise;
	}

	/**
	 * Gets the relation.
	 * 
	 * @return the relation
	 */
	public List<Person> getRelation() {
		return this.relation;
	}

	/**
	 * Sets the relation.
	 * 
	 * @param relation
	 *            the new relation
	 */
	public void setRelation(List<Person> relation) {
		this.relation = relation;
	}

	/**
	 * Sets the relation.
	 * 
	 * @param relation
	 *            the new relation
	 */
	public void setRelation(Collection<Person> relation) {
		setRelation(convertRelation(relation));
	}

	/**
	 * Get the tableFields.
	 * 
	 * @return Returns the tableFields as a List<EmployeeFields>.
	 */
	public List<EmployeeFields> getTableFields() {
		return this.tableFields;
	}

	/**
	 * Set the tableFields to the specified value.
	 * 
	 * @param tableFields
	 *            The tableFields to set.
	 */
	public void setTableFields(List<EmployeeFields> tableFields) {
		this.tableFields = tableFields;
	}

	/**
	 * Convert relation.
	 * 
	 * @param relation
	 *            the relation
	 * @return the list
	 */
	private List<Person> convertRelation(Collection<Person> relation) {
		List<Person> result = new ArrayList<Person>(relation);
		Collections.sort(result, new PersonByAgeComparator());
		return result;
	}

	/**
	 * Checks if is birthday.
	 * 
	 * @return true, if is birthday
	 */
	public boolean isBirthday() {

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		if (this.birthDate != null) {
			cal1.setTime(this.birthDate);
			cal2.setTime(new Date());
			if (cal1 == null || cal2 == null) {
				return false;
			}
			return (cal1.get(Calendar.DAY_OF_MONTH) == cal2
					.get(Calendar.DAY_OF_MONTH) && cal1.get(Calendar.MONTH) == cal2
					.get(Calendar.MONTH));

		} else {
			return false;
		}

	}

	/**
	 * Checks if is anniversary.
	 * 
	 * @return true, if is anniversary
	 */
	public boolean isAnniversary() {
		this.anniversaryDate = new String[2];

		if (this.startDate != null) {
			DateTimeFormatter datTimeFormat = DateTimeFormat
					.forPattern("dd-MM-yyyy");

			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");

			DateTime firstTime = datTimeFormat.parseDateTime(dateFormatter
					.format(this.startDate));
			DateTime secondTime = datTimeFormat.parseDateTime(dateFormatter
					.format(new Date()));

			int months = Months.monthsBetween(new LocalDate(firstTime),
					new LocalDate(secondTime)).getMonths();

			if ((months >= 117 && months <= 120)
					|| (months >= 297 && months <= 300)
					|| (months >= 357 && months <= 360)
					|| (months >= 147 && months <= 150)) {

				if (months == 120 || months == 300 || months == 360
						|| months == 150) {
					if (firstTime.getDayOfMonth() < secondTime.getDayOfMonth()) {

						return false;
					} else {

						this.anniversaryDate[0] = calculateAnniversaryYears(months);
						this.anniversaryDate[1] = calculateAnniversaryDate();

						return true;
					}
				} else {
					this.anniversaryDate[0] = calculateAnniversaryYears(months);
					this.anniversaryDate[1] = calculateAnniversaryDate();

					return true;
				}
			}
		}
		return false;
	}

	public String calculateAnniversaryYears(int months) {

		if (months == 117 || months == 118 || months == 119 || months == 120) {
			return "10";
		} else if (months == 297 || months == 298 || months == 299
				|| months == 300) {
			return "25";
		} else if (months == 357 || months == 358 || months == 359
				|| months == 360) {
			return "30";
		} else if (months == 147 || months == 148 || months == 149
				|| months == 150) {
			return "12.5";
		}

		return null;

	}

	/**
	 * Gets the anniversary date for display.
	 * 
	 * @return the anniversary date for display
	 */
	public String calculateAnniversaryDate() {
		Calendar anniversaryDate = Calendar.getInstance();
		anniversaryDate.setTime(this.startDate);
		anniversaryDate.get(Calendar.MONTH);
		anniversaryDate.get(Calendar.DAY_OF_MONTH);

		int year = Calendar.getInstance().get(Calendar.YEAR);
		anniversaryDate.set(Calendar.YEAR, year);

		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormatter.format(anniversaryDate.getTime());

	}

	/**
	 * Gets the um number.
	 * 
	 * @return the um number
	 */
	public int getUmNumber() {
		return this.umnumber;
	}

	/**
	 * Sets the um number.
	 * 
	 * @param umNumber
	 *            the new um number
	 */
	public void setUmNumber(int umNumber) {
		this.umnumber = umNumber;
	}

	/**
	 * Checks if is current employee.
	 * 
	 * @return true, if is current employee
	 */
	public boolean isOldEmployee() {
		return this.oldEmployee;
	}

	/**
	 * Sets the current employee.
	 * 
	 * @param oldEmployee
	 *            the new old employee
	 */
	public void setOldEmployee(boolean oldEmployee) {
		this.oldEmployee = oldEmployee;
	}

	/**
	 * Get the emailId.
	 * 
	 * @return Returns the emailId as a String.
	 */
	public String getEmailId() {
		return this.emailId;
	}

	/**
	 * Set the emailId to the specified value.
	 * 
	 * @param emailId
	 *            The emailId to set.
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * Gets the resign date.
	 * 
	 * @return the resign date
	 */
	public Date getResignDate() {
		return this.resignDate;
	}

	/**
	 * Sets the resign date.
	 * 
	 * @param resignDate
	 *            the new resign date
	 */
	public void setResignDate(Date resignDate) {
		this.resignDate = resignDate;
	}

	/**
	 * Gets the first name.
	 * 
	 * @return the first name
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets the first name.
	 * 
	 * @param firstName
	 *            the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 * 
	 * @return the last name
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * Sets the last name.
	 * 
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return leaseCarName
	 */
	public String getLeaseCarName() {
		return leaseCarName;
	}

	/**
	 * @param leaseCarName
	 */
	public void setLeaseCarName(String leaseCarName) {
		this.leaseCarName = leaseCarName;
	}

	/**
	 * @return leaseAmount
	 */
	public BigDecimal getLeaseAmount() {
		return leaseAmount;
	}

	/**
	 * @param leaseAmount
	 */
	public void setLeaseAmount(BigDecimal leaseAmount) {
		this.leaseAmount = leaseAmount;
	}

	/**
	 * Gets the projects.
	 * 
	 * @return the projects
	 */
	public List<Projects> getProjects() {
		return this.projects;
	}

	public String[] getAnniversaryDate() {
		return anniversaryDate;
	}

	/**
	 * @return vacation
	 */
	public String getVacation() {
		return vacation;
	}

	/**
	 * @param vacation
	 */
	public void setVacation(String vacation) {
		this.vacation = vacation;
	}

	/**
	 * @return einde_contract
	 */
	public Date getEinde_contract() {
		return einde_contract;
	}

	/**
	 * @param einde_contract
	 */
	public void setEinde_contract(Date einde_contract) {
		this.einde_contract = einde_contract;
	}

	public String getImagePath() throws IOException {
			return employeePicture().replace("\\", "/");
	}

	private String employeePicture() throws IOException {
		String dummyImg = getProperty(KEY_EMPLOYEE_IMAGE_PATH) + "\\dummy.jpg";
		String empNumber = String.valueOf(this.number);
		while (empNumber.length() < 6) {
			empNumber = "0" + empNumber;
		}
		empNumber = "/NL-S-" + empNumber;
		long tempDate = 0;
		String latestImage = "";
		for (String image : getImages(empNumber)) {
			File imageFile = new File(getProperty(KEY_EMPLOYEE_IMAGE_PATH) + image);
			if (imageFile.exists() && imageFile.lastModified() > tempDate) {
				tempDate = imageFile.lastModified();
				latestImage = imageFile.getAbsolutePath();
			}
		}
		return latestImage.equals("") ? dummyImg : latestImage;
	}

	private String[] getImages(String empNumber) {
		String[] images = new String[4];
		images[0] = empNumber + ".JPG";
		images[1] = empNumber + ".JPEG";
		images[2] = empNumber + ".jpg";
		images[3] = empNumber + ".jpeg";
		return images;
	}
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public BufferedImage getImage() throws IOException {
		File img = new File(getImagePath());
		return ImageIO.read(new FileInputStream(img));
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getUmName() {
		return umName;
	}

	public void setUmName(String umName) {
		this.umName = umName;
	}

}
