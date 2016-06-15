package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProjectReports generated by hbm2java
 */
@Entity
@Table(name = "project_reports", schema = "public")
public class ProjectReports implements java.io.Serializable {

	private int id;
	private Users users;
	private Projects projects;
	private String reason;
	private String email;
	private String details;
	private Date createdAt;
	private Date updatedAt;
	private Set<ProjectReportNotifications> projectReportNotificationses = new HashSet<ProjectReportNotifications>(0);

	public ProjectReports() {
	}

	public ProjectReports(int id, Projects projects, String reason) {
		this.id = id;
		this.projects = projects;
		this.reason = reason;
	}

	public ProjectReports(int id, Users users, Projects projects, String reason, String email, String details,
			Date createdAt, Date updatedAt, Set<ProjectReportNotifications> projectReportNotificationses) {
		this.id = id;
		this.users = users;
		this.projects = projects;
		this.reason = reason;
		this.email = email;
		this.details = details;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.projectReportNotificationses = projectReportNotificationses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	@Column(name = "reason", nullable = false)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "details")
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectReports")
	public Set<ProjectReportNotifications> getProjectReportNotificationses() {
		return this.projectReportNotificationses;
	}

	public void setProjectReportNotificationses(Set<ProjectReportNotifications> projectReportNotificationses) {
		this.projectReportNotificationses = projectReportNotificationses;
	}

}