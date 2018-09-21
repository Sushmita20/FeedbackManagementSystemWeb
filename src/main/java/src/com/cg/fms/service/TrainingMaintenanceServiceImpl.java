package src.com.cg.fms.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.com.cg.fms.dao.ITrainingProgramDao;
import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;
@Service
@Transactional
public class TrainingMaintenanceServiceImpl implements ITrainingMaintenanceService {
	
	@Autowired
	ITrainingProgramDao dao;
	
	public TrainingProgram addTrainingProgram(TrainingProgram program) throws FeedbackException {
		return dao.addTrainingProgram(program);
	}

	
	public ArrayList<TrainingProgram> viewAllTrainingProgram() throws FeedbackException {
		return dao.viewAllTrainingProgram();
	}

	
	public TrainingProgram viewTrainingProgramById(int trainingCode) throws FeedbackException {
		return dao.viewTrainingProgramById(trainingCode);
	}

	
	public TrainingProgram deleteTrainingProgram(TrainingProgram trainingProgram) throws FeedbackException {
		return dao.deleteTrainingProgram(trainingProgram);
	}

	

	
	public TrainingProgram updateTrainingProgram(TrainingProgram program) throws FeedbackException {
		return dao.updateTrainingProgram(program);
	}

	
	public ArrayList<Integer> getTrainingCodes() {
		return dao.getTrainingCodes();
	}

	
	public ArrayList<Integer> getParticpantList() {
		return dao.getParticpantList();
	}

	
	public ArrayList<Integer> getFacultyCodeList() {
	
		return dao.getFacultyCodeList();
	}

}
