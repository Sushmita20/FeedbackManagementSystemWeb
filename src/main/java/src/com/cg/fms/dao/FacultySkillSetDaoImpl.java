package src.com.cg.fms.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import src.com.cg.fms.entities.FacultySkill;
import src.com.cg.fms.exception.FeedbackException;

@Repository
public class FacultySkillSetDaoImpl implements IFacultySkillSetDao {
	public static final	Logger LOGGER = Logger.getLogger(CourseDaoImpl.class);
	@PersistenceContext
	EntityManager entityManager;
	public ArrayList<FacultySkill> showFacultySkillSet() throws FeedbackException {
		ArrayList<FacultySkill> facultySkillList;
		TypedQuery<FacultySkill> query = entityManager.createQuery("SELECT f FROM FacultySkill f", FacultySkill.class);
		facultySkillList = (ArrayList<FacultySkill>) query.getResultList();
		LOGGER.info("Displaying Skillset of Faculties");
		return facultySkillList;
	}

}
