package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProjectPosts generated by hbm2java
 */
public class ProjectPosts implements java.io.Serializable {

	private int id;
	private Users users;
	private Projects projects;
	private String title;
	private String commentHtml;
	private Date createdAt;
	private Date updatedAt;
	private Boolean exclusive;
	private Set<ProjectPostNotifications> projectPostNotificationses = new HashSet<ProjectPostNotifications>(0);

	public ProjectPosts() {
	}

	public ProjectPosts(int id, Users users, Projects projects, String title, String commentHtml) {
		this.id = id;
		this.users = users;
		this.projects = projects;
		this.title = title;
		this.commentHtml = commentHtml;
	}

	public ProjectPosts(int id, Users users, Projects projects, String title, String commentHtml, Date createdAt,
			Date updatedAt, Boolean exclusive, Set<ProjectPostNotifications> projectPostNotificationses) {
		this.id = id;
		this.users = users;
		this.projects = projects;
		this.title = title;
		this.commentHtml = commentHtml;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.exclusive = exclusive;
		this.projectPostNotificationses = projectPostNotificationses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCommentHtml() {
		return this.commentHtml;
	}

	public void setCommentHtml(String commentHtml) {
		this.commentHtml = commentHtml;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getExclusive() {
		return this.exclusive;
	}

	public void setExclusive(Boolean exclusive) {
		this.exclusive = exclusive;
	}

	public Set<ProjectPostNotifications> getProjectPostNotificationses() {
		return this.projectPostNotificationses;
	}

	public void setProjectPostNotificationses(Set<ProjectPostNotifications> projectPostNotificationses) {
		this.projectPostNotificationses = projectPostNotificationses;
	}

}