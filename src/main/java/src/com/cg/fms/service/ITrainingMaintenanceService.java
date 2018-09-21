package src.com.cg.fms.service;

import java.util.ArrayList;

import src.com.cg.fms.entities.TrainingProgram;
import src.com.cg.fms.exception.FeedbackException;

public interface ITrainingMaintenanceService {

	public TrainingProgram addTrainingProgram(TrainingProgram program) throws FeedbackException;

	public ArrayList<TrainingProgram> viewAllTrainingProgram() throws FeedbackException;

	public TrainingProgram viewTrainingProgramById(int trainingCode) throws FeedbackException;
	public TrainingProgram updateTrainingProgram(TrainingProgram program)throws FeedbackException;

	public TrainingProgram deleteTrainingProgram(TrainingProgram trainingProgram) throws FeedbackException;

	public ArrayList<Integer> getTrainingCodes();

	public ArrayList<Integer> getParticpantList();

	public ArrayList<Integer> getFacultyCodeList();
}
