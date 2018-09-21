package src.com.cg.fms.service;

import java.util.ArrayList;

import src.com.cg.fms.entities.FacultySkill;
import src.com.cg.fms.exception.FeedbackException;

public interface IFacultySkillService {

	public ArrayList<FacultySkill> showFacultySkillSet() throws FeedbackException;
}
