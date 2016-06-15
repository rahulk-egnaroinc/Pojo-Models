package gensrc1;
// Generated 9 Jun, 2016 7:06:41 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;

/**
 * ProjectScoresId generated by hbm2java
 */
public class ProjectScoresId implements java.io.Serializable {

	private Integer projectId;
	private BigDecimal score;

	public ProjectScoresId() {
	}

	public ProjectScoresId(Integer projectId, BigDecimal score) {
		this.projectId = projectId;
		this.score = score;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectScoresId))
			return false;
		ProjectScoresId castOther = (ProjectScoresId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getScore() == castOther.getScore()) || (this.getScore() != null
						&& castOther.getScore() != null && this.getScore().equals(castOther.getScore())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getScore() == null ? 0 : this.getScore().hashCode());
		return result;
	}

}