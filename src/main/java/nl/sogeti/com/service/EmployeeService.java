package nl.sogeti.com.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import nl.sogeti.com.dao.EmployeeDAO;
import nl.sogeti.com.domain.Employee;

import org.json.JSONArray;
import org.json.JSONObject;


@Path("employeeService")
public class EmployeeService extends HttpServlet{

@EJB
EmployeeDAO employeeDAO;

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
        
		jsonArray.put(jsnObj);
	}
	String responseJson = jsonArray.toString();
	return Response.status(200).entity(responseJson).build();
}
}
