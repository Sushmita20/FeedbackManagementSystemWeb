package src.com.cg.fms.service;

import src.com.cg.fms.entities.Employee;
import src.com.cg.fms.exception.FeedbackException;

public interface ILoginService {
	public Employee getRole(Employee employee) throws FeedbackException;
}
