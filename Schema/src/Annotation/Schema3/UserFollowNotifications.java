package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * UserFollowNotifications generated by hbm2java
 */
@Entity
@Table(name = "user_follow_notifications", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = {
		"template_name", "user_id", "((metadata ->> 'follow_id'::text))", "((metadata ->> 'project_id'::text))" }) )
public class UserFollowNotifications implements java.io.Serializable {

	private int id;
	private UserFollows userFollows;
	private Users users;
	private String fromEmail;
	private String fromName;
	private String templateName;
	private String locale;
	private String cc;
	private Date sentAt;
	private Date deliverAt;
	private Date createdAt;
	private Date updatedAt;
	private Serializable metadata;

	public UserFollowNotifications() {
	}

	public UserFollowNotifications(int id, Users users, String fromEmail, String fromName, String templateName,
			String locale, Serializable metadata) {
		this.id = id;
		this.users = users;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
		this.metadata = metadata;
	}

	public UserFollowNotifications(int id, UserFollows userFollows, Users users, String fromEmail, String fromName,
			String templateName, String locale, String cc, Date sentAt, Date deliverAt, Date createdAt, Date updatedAt,
			Serializable metadata) {
		this.id = id;
		this.userFollows = userFollows;
		this.users = users;
		this.fromEmail = fromEmail;
		this.fromName = fromName;
		this.templateName = templateName;
		this.locale = locale;
		this.cc = cc;
		this.sentAt = sentAt;
		this.deliverAt = deliverAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.metadata = metadata;
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
	@JoinColumn(name = "user_follow_id")
	public UserFollows getUserFollows() {
		return this.userFollows;
	}

	public void setUserFollows(UserFollows userFollows) {
		this.userFollows = userFollows;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "from_email", nullable = false)
	public String getFromEmail() {
		return this.fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	@Column(name = "from_name", nullable = false)
	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	@Column(name = "template_name", nullable = false)
	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@Column(name = "locale", nullable = false)
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Column(name = "cc")
	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sent_at", length = 29)
	public Date getSentAt() {
		return this.sentAt;
	}

	public void setSentAt(Date sentAt) {
		this.sentAt = sentAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deliver_at", length = 29)
	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
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

	@Column(name = "metadata", nullable = false)
	public Serializable getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Serializable metadata) {
		this.metadata = metadata;
	}

}
