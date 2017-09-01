package nl.sogeti.com.dao;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import nl.sogeti.com.domain.Employee;
import nl.sogeti.com.domain.Role;

/**
 * The Class EmployeeDAO.
 */
@Stateless
public class EmployeeDAO{

	@PersistenceContext(unitName = "data-unit")
	private EntityManager entityManager;

	public List<Employee> findAllEmployees() {
		List<Employee> listOfEmployees = getEntityManager().createQuery("select e from Employee e where e.unit = 655", Employee.class).setMaxResults(19).getResultList();
		return listOfEmployees;
	}
	
	public Employee getEmployee(Long employeeId){
		Employee employee = (Employee) getEntityManager().createQuery("select e from Employee e where e.id = " + employeeId).getSingleResult();
		System.out.println("Employee are" + employee);
		return employee;
	}
	
	

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
