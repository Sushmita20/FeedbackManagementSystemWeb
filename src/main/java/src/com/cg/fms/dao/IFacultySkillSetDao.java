package src.com.cg.fms.dao;

import java.util.ArrayList;

import src.com.cg.fms.entities.FacultySkill;
import src.com.cg.fms.exception.FeedbackException;

public interface IFacultySkillSetDao {

	ArrayList<FacultySkill> showFacultySkillSet() throws FeedbackException;
}
