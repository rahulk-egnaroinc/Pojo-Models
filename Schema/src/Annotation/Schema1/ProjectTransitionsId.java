package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProjectTransitionsId generated by hbm2java
 */
@Embeddable
public class ProjectTransitionsId implements java.io.Serializable {

	private Integer projectId;
	private String state;
	private String metadata;
	private Boolean mostRecent;
	private Date createdAt;

	public ProjectTransitionsId() {
	}

	public ProjectTransitionsId(Integer projectId, String state, String metadata, Boolean mostRecent, Date createdAt) {
		this.projectId = projectId;
		this.state = state;
		this.metadata = metadata;
		this.mostRecent = mostRecent;
		this.createdAt = createdAt;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "state")
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "metadata")
	public String getMetadata() {
		return this.metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	@Column(name = "most_recent")
	public Boolean getMostRecent() {
		return this.mostRecent;
	}

	public void setMostRecent(Boolean mostRecent) {
		this.mostRecent = mostRecent;
	}

	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjectTransitionsId))
			return false;
		ProjectTransitionsId castOther = (ProjectTransitionsId) other;

		return ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
				&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getState() == castOther.getState()) || (this.getState() != null
						&& castOther.getState() != null && this.getState().equals(castOther.getState())))
				&& ((this.getMetadata() == castOther.getMetadata()) || (this.getMetadata() != null
						&& castOther.getMetadata() != null && this.getMetadata().equals(castOther.getMetadata())))
				&& ((this.getMostRecent() == castOther.getMostRecent()) || (this.getMostRecent() != null
						&& castOther.getMostRecent() != null && this.getMostRecent().equals(castOther.getMostRecent())))
				&& ((this.getCreatedAt() == castOther.getCreatedAt()) || (this.getCreatedAt() != null
						&& castOther.getCreatedAt() != null && this.getCreatedAt().equals(castOther.getCreatedAt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result + (getMetadata() == null ? 0 : this.getMetadata().hashCode());
		result = 37 * result + (getMostRecent() == null ? 0 : this.getMostRecent().hashCode());
		result = 37 * result + (getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode());
		return result;
	}

}
