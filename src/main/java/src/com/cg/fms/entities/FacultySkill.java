package src.com.cg.fms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FACULTY_SKILL")
public class FacultySkill implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "FacultySkill [facultyId=" + facultyId + ", skillSet="
				+ skillSet + "]";
	}
	@Id
	@Column(name="FacultyId")
	private int facultyId;
	@Column(name="skillset")
	private String skillSet;
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
}
