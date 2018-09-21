package src.com.cg.fms.dao;

import src.com.cg.fms.entities.Employee;
import src.com.cg.fms.exception.FeedbackException;

public interface ILoginDao {
	public  Employee getRole(Employee employee)throws FeedbackException;
}
