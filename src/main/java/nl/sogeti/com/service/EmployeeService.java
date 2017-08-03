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
		//jsnObj.put("Name", emp.getName());
        jsnObj.put("Fname", emp.getFirstName());
        jsnObj.put("Lname",emp.getLastName());
        jsnObj.put("DOB",emp.getBirthDate());
        jsnObj.put("TelphoneNo",emp.getTelephoneNumber());
        
		jsonArray.put(jsnObj);
	}
	String responseJson = jsonArray.toString();
	return Response.status(200).entity(responseJson).build();
}

@GET
@Path("/employee/{Id}")
@Produces(MediaType.APPLICATION_JSON)
public Response getEmployee(@PathParam("Id")Long employeeId){
	System.out.println("value of employee Id"+employeeId );
	Employee employee = this.employeeDAO.getEmployee(employeeId);
	System.out.println("Employee are" + employee.getFirstName());
	JSONArray jsonArray = new JSONArray();
	JSONObject jsnObj = new JSONObject();
	jsnObj.put("Number", employee.getNumber());
	jsnObj.put("Fname", employee.getFirstName());
	jsonArray.put(jsnObj);
	String responseJson = jsonArray.toString();
	return Response.status(200).entity(responseJson).build();
	
}



}
