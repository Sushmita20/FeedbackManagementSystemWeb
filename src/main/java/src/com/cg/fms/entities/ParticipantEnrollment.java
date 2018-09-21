package src.com.cg.fms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TRAININGPARTICIPANT_ENROLLMENT")
public class ParticipantEnrollment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Trainingcode")
	private Integer trainingCode;
	@Id
	@Column(name="ParticipantId")
	private Integer participantId;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((participantId == null) ? 0 : participantId.hashCode());
		result = prime * result
				+ ((trainingCode == null) ? 0 : trainingCode.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipantEnrollment other = (ParticipantEnrollment) obj;
		if (participantId == null) {
			if (other.participantId != null)
				return false;
		} else if (!participantId.equals(other.participantId))
			return false;
		if (trainingCode == null) {
			if (other.trainingCode != null)
				return false;
		} else if (!trainingCode.equals(other.trainingCode))
			return false;
		return true;
	}


	public ParticipantEnrollment() {
		super();
		
	}


	public ParticipantEnrollment(Integer trainingCode, Integer participantId) {
		this.trainingCode = trainingCode;
		this.participantId = participantId;
	}


	public Integer getTrainingCode() {
		return trainingCode;
	}


	public void setTrainingCode(Integer trainingCode) {
		this.trainingCode = trainingCode;
	}


	public Integer getParticipantId() {
		return participantId;
	}


	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}


	@Override
	public String toString() {
		return "ParticipantEnrollment [trainingCode=" + trainingCode
				+ ", participantId=" + participantId + "]";
	}
}
