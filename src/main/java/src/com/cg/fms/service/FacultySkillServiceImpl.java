package src.com.cg.fms.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.cg.fms.dao.IFacultySkillSetDao;
import src.com.cg.fms.entities.FacultySkill;
import src.com.cg.fms.exception.FeedbackException;
@Service
@Transactional
public class FacultySkillServiceImpl implements IFacultySkillService {
	@Autowired
	IFacultySkillSetDao facultySkillSetDao;
	public ArrayList<FacultySkill> showFacultySkillSet()
			throws FeedbackException {

		return facultySkillSetDao.showFacultySkillSet();
	}

}
