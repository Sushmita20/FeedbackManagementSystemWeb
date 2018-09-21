package src.com.cg.fms.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="FEEDBACK_MASTER")
public class Feedback implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="TrainingCode")
	private Integer trainingCode;
	@Id
	@Column(name="ParticipantId")
	private Integer participantId;
	
	
	private String participantName;
	
	@Column(name="FB_Prs_comm")
	@Min(0)
	@Max(5)
	@NotNull(message="Not Empty")
	private Integer fbPrsComm;
	@Column(name="FB_Clrfy_dbts")
	@Min(0)
	@Max(5)
	@NotNull(message="Not Empty")
	private Integer fbClrfyDbts;
	@Column(name="FB_TM")
	@Min(0)
	@Max(5)
	@NotNull(message="Not Empty")
	private Integer fbTm;
	@Column(name="FB_Hnd_out")
	@Min(0)
	@Max(5)
	@NotNull(message="Not Empty")
	private Integer fbHndOut;
	@Column(name="FB_Hw_Sw_Ntwrk")
	@Min(0)
	@Max(5)
	@NotNull(message="Not Empty")
	private Integer fbHwSwNtwrk;
	@Column(name="Comments")
	private String comments;
	@Column(name="Suggestions")
	private String suggestions;
	@Column(name="fbdate")
	private String feedbackDate;
	
	
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


	public String getParticipantName() {
		return participantName;
	}


	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}


	public Integer getFbPrsComm() {
		return fbPrsComm;
	}


	public void setFbPrsComm(Integer fbPrsComm) {
		this.fbPrsComm = fbPrsComm;
	}


	public Integer getFbClrfyDbts() {
		return fbClrfyDbts;
	}


	public void setFbClrfyDbts(Integer fbClrfyDbts) {
		this.fbClrfyDbts = fbClrfyDbts;
	}


	public Integer getFbTm() {
		return fbTm;
	}


	public void setFbTm(Integer fbTm) {
		this.fbTm = fbTm;
	}


	public Integer getFbHndOut() {
		return fbHndOut;
	}


	public void setFbHndOut(Integer fbHndOut) {
		this.fbHndOut = fbHndOut;
	}


	public Integer getFbHwSwNtwrk() {
		return fbHwSwNtwrk;
	}


	public void setFbHwSwNtwrk(Integer fbHwSwNtwrk) {
		this.fbHwSwNtwrk = fbHwSwNtwrk;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getSuggestions() {
		return suggestions;
	}


	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}


	public String getFeedbackDate() {
		return feedbackDate;
	}


	public void setFeedbackDate(String feedbackDate) {
		this.feedbackDate = feedbackDate;
	}


	@Override
	public String toString() {
		return "Feedback [trainingCode=" + trainingCode + ", participantId="
				+ participantId + ", participantName=" + participantName
				+ ", FbPrsComm=" + fbPrsComm + ", FbClrfyDbts=" + fbClrfyDbts
				+ ", FbTm=" + fbTm + ", FbHndOut=" + fbHndOut
				+ ", FbHwSwNtwrk=" + fbHwSwNtwrk + ", comments=" + comments
				+ ", suggestions=" + suggestions + ", feedbackDate="
				+ feedbackDate + "]";
	}
	
}
