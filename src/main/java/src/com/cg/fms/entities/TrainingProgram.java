package src.com.cg.fms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TRAINING_PROGRAM")
public class TrainingProgram implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TrainingCode")
	private Integer trainingCode;
	@Column(name="coursecode")
	private Integer courseCode;
	@Column(name="facultycode")
	private String facultyCode;
	@Column(name="startDate")
	private String startDate;
	@Column(name="endDate")
	private String endDate;
	
	public Integer getTrainingCode() {
		return trainingCode;
	}
	public void setTrainingCode(Integer trainingCode) {
		this.trainingCode = trainingCode;
	}
	public Integer getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}
	public String getFacultyCode() {
		return facultyCode;
	}
	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "TrainingProgram [TrainingCode=" + trainingCode
				+ ", courseCode=" + courseCode + ", facultyCode=" + facultyCode
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
}
