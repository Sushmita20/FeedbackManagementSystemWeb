package src.com.cg.fms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.cg.fms.dao.ILoginDao;
import src.com.cg.fms.entities.Employee;
import src.com.cg.fms.exception.FeedbackException;
@Service
@Transactional(rollbackOn=FeedbackException.class)
public class LoginServiceImpl implements ILoginService {
	@Autowired
	ILoginDao loginDao;
	public Employee getRole(Employee employee)
			throws FeedbackException {
		
		return loginDao.getRole(employee);
	}

}
