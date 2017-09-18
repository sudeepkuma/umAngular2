package nl.sogeti.com.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import nl.sogeti.com.dao.AssignmentDAO;
import nl.sogeti.com.dao.EmployeeDAO;
import nl.sogeti.com.dao.GradeDAO;
import nl.sogeti.com.domain.Assignment;
import nl.sogeti.com.domain.Employee;

import org.json.JSONArray;
import org.json.JSONObject;


@Path("employeeService")
public class EmployeeService extends HttpServlet implements Serializable{

@EJB
EmployeeDAO employeeDAO;
@EJB
AssignmentDAO assignmentDao ;

@EJB
GradeDAO gradeDao;

@GET
@Path("/listOfEmployees")
@Produces(MediaType.APPLICATION_JSON)
public Response listOfEmployees(){
	
	List<Employee> listOfEmployees = new ArrayList<Employee>();
	listOfEmployees = this.employeeDAO.findAllEmployees();
	JSONArray jsonArray = new JSONArray();
	
	
	for(Employee emp : listOfEmployees)
	{
		JSONObject jsnObj = new JSONObject();
		jsnObj.put("Id",emp.getId());
        jsnObj.put("Number", emp.getNumber());
        jsnObj.put("Fname", emp.getFirstName());
        jsnObj.put("Lname",emp.getLastName());
        jsnObj.put("DOB",emp.getBirthDate());
        jsnObj.put("TelphoneNo",emp.getTelephoneNumber());
		jsnObj.put("Age",emp.getAge());
        jsnObj.put("Gender",emp.getGender());
        jsnObj.put("StartDate", emp.getStartDate());
        jsnObj.put("Service Years", emp.getServiceYears());
        jsnObj.put("FTE", emp.getFte()/100);
        jsnObj.put("Function_Level", emp.getFunctionLevel());
        jsnObj.put("Function_Name", emp.getFunctionName());
        jsnObj.put("Base Salary", emp.getBaseSalary());
        jsnObj.put("Bonus", emp.getBonus());
        jsnObj.put("Performance Bonus", emp.getPerformanceBonus());
        jsnObj.put("TimesSick", emp.getTimesSick());
        jsnObj.put("SickDays", emp.getSickDays());
        jsnObj.put("VakantieWettelijk", emp.getVakantieWettelijk());
        jsnObj.put("VakantieBovenWettelijk", emp.getVakantieBovenWettelijk());
        jsnObj.put("LeaseAuto", emp.getLeaseCarName());
        jsnObj.put("LeaseCarAmount", emp.getLeaseAmount());
        jsnObj.put("Einde_contract", emp.getEinde_contract());
		jsnObj.put("Uurtareif",emp.getTargetHourlyRate()) ;            		
        List<Assignment> assignments = assignmentDao.findAllAssignmentsByEmployeeId(emp.getId());
        	for(Assignment assignment : assignments){
        		if(assignment.getClient() != null){     	
        			jsnObj.put("Client_Name", assignment.getClient().getName());
        			jsnObj.put("Description", assignment.getDescription());
        		}
        		
        		
        	}
        	long employeeNumber =this.gradeDao.find(Employee.class, emp.getId()).getNumber();
    		int richttariefValue= this.gradeDao.calculatedRichttariefvalue(employeeNumber);
    		jsnObj.put("RichttariefValue", richttariefValue);
        	jsonArray.put(jsnObj);
	}       	
	String responseJson = jsonArray.toString();
	return Response.status(200).entity(responseJson).build();
}


@POST
@Path("/postttHere")
@Consumes(MediaType.APPLICATION_JSON)
public Response setInzetData(String inzetdate) {
	
	Assignment assgn = new Assignment();
	
	String result = "Track saved : " + inzetdate;
	System.out.println("Result is" + result);
	JSONArray jsonArray = new JSONArray(inzetdate);
	JSONObject jsonObject = jsonArray.getJSONObject(0);
	String idValue = jsonObject.getString("id");
	long employeeId = Long.parseLong(idValue);
	System.out.println("value is : "+ idValue);
	String inzetvan = jsonObject.getString("inzetdate");
	String inzetTot = jsonObject.getString("inzetTot");
	System.out.println("Date is "+ inzetvan);

	
	return Response.status(201).entity(result).build();
}

@GET
@Path("/inzet/{id}")
@Produces(MediaType.APPLICATION_JSON)
public Response getInzetData(@PathParam("id") long employeeId ){
	JSONArray jsonArray = new JSONArray();
	JSONObject jsnObj = new JSONObject();
	
	List<Assignment> assignments = assignmentDao.findAllAssignmentsByEmployeeId(employeeId);
 	for(Assignment assignment : assignments){
 		if(assignment.getClient() != null){     	
 			jsnObj.put("Client_Name", assignment.getClient().getName());
 		}
 		long employeeNumber =this.gradeDao.find(Employee.class, employeeId).getNumber();
 		int richttariefValue= this.gradeDao.calculatedRichttariefvalue(employeeNumber);
 		jsnObj.put("RichttariefValue",richttariefValue);
 	}
 	jsonArray.put(jsnObj);
 	String responseJson = jsonArray.toString();
	return Response.status(201).entity(responseJson).build();
}
}


