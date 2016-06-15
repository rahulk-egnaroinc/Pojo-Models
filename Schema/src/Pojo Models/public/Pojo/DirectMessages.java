package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DirectMessages generated by hbm2java
 */
public class DirectMessages implements java.io.Serializable {

	private int id;
	private Users usersByUserId;
	private Users usersByToUserId;
	private Projects projects;
	private String fromEmail;
	private String fromName;
	private String content;
	private Date createdAt;
	private Date updatedAt;
	private Set<DirectMessageNotifications> directMessageNotificationses = new HashSet<DirectMessageNotifications>(0);

	public DirectMessages() {
	}

	public DirectMessages(int id, Users usersByToUserId, String fromEmail, String content) {
		this.id = id;
		this.usersByToUserId = usersByToUserId;
		this.fromEmail = fromEmail;
		this.content = content;
	}

	public DirectMessages(int id, Users usersByUserId, Users usersByToUserId, Projects projects, String fromEmail,
			String fromName, String content, Date createdAt, Date updatedAt,
			Set<DirectMessageNotifications> directMessageNotificationses) {
		this.id = id;
		this.usersByUserId = usersByUserId;
		this.usersByToUserId = usersByToUserId;
		this.projects = projects;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.content = content;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.directMessageNotificationses = directMessageNotificationses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsersByUserId() {
		return this.usersByUserId;
	}

	public void setUsersByUserId(Users usersByUserId) {
		this.usersByUserId = usersByUserId;
	}

	public Users getUsersByToUserId() {
		return this.usersByToUserId;
	}

	public void setUsersByToUserId(Users usersByToUserId) {
		this.usersByToUserId = usersByToUserId;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Set<DirectMessageNotifications> getDirectMessageNotificationses() {
		return this.directMessageNotificationses;
	}

	public void setDirectMessageNotificationses(Set<DirectMessageNotifications> directMessageNotificationses) {
		this.directMessageNotificationses = directMessageNotificationses;
	}

}