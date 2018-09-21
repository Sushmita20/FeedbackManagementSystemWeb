package src.com.cg.fms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="COURSE_MASTER")
public class Course implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName
				+ ", noOfDays=" + noOfDays + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CourseId")
	private Integer courseId;
	@Column(name="courseName")
	@NotNull(message="This is a required field")
	@Pattern(regexp="[a-zA-Z]*")
	private String courseName;
	@Column(name="noOfDays")
	@NotNull(message="This is a required field")
	@Max(30)
	private Integer noOfDays;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	
}
