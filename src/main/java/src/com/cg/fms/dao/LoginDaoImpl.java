package src.com.cg.fms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import src.com.cg.fms.entities.Employee;
import src.com.cg.fms.exception.FeedbackException;
@Repository
public class LoginDaoImpl implements ILoginDao {
	public static final	Logger LOGGER = Logger.getLogger(CourseDaoImpl.class);
	@PersistenceContext
	EntityManager entityManager;
	public Employee getRole(Employee employee) throws FeedbackException {
		TypedQuery< Employee> query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.employeeId=? and e.password=?", Employee.class);
		query.setParameter(1, employee.getEmployeeId());
		query.setParameter(2, employee.getPassword());
		try {
			employee = query.getSingleResult();
			LOGGER.info("Login Successfully");
		} catch (Exception e) {
			LOGGER.error("Error in logging");
			throw new FeedbackException("Employee With above credentials does not exixts");
		}
		
		return employee;
	}

}
