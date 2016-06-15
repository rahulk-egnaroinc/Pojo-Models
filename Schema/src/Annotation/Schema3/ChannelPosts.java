package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

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
 * ChannelPosts generated by hbm2java
 */
@Entity
@Table(name = "channel_posts", schema = "public")
public class ChannelPosts implements java.io.Serializable {

	private int id;
	private Users users;
	private Channels channels;
	private String title;
	private String body;
	private String bodyHtml;
	private boolean visible;
	private Date createdAt;
	private Date updatedAt;
	private Date publishedAt;
	private Set<ChannelPostNotifications> channelPostNotificationses = new HashSet<ChannelPostNotifications>(0);

	public ChannelPosts() {
	}

	public ChannelPosts(int id, Users users, Channels channels, String title, String body, String bodyHtml,
			boolean visible) {
		this.id = id;
		this.users = users;
		this.channels = channels;
		this.title = title;
		this.body = body;
		this.bodyHtml = bodyHtml;
		this.visible = visible;
	}

	public ChannelPosts(int id, Users users, Channels channels, String title, String body, String bodyHtml,
			boolean visible, Date createdAt, Date updatedAt, Date publishedAt,
			Set<ChannelPostNotifications> channelPostNotificationses) {
		this.id = id;
		this.users = users;
		this.channels = channels;
		this.title = title;
		this.body = body;
		this.bodyHtml = bodyHtml;
		this.visible = visible;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.channelPostNotificationses = channelPostNotificationses;
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
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "channel_id", nullable = false)
	public Channels getChannels() {
		return this.channels;
	}

	public void setChannels(Channels channels) {
		this.channels = channels;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "body", nullable = false)
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name = "body_html", nullable = false)
	public String getBodyHtml() {
		return this.bodyHtml;
	}

	public void setBodyHtml(String bodyHtml) {
		this.bodyHtml = bodyHtml;
	}

	@Column(name = "visible", nullable = false)
	public boolean isVisible() {
		return this.visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "published_at", length = 29)
	public Date getPublishedAt() {
		return this.publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "channelPosts")
	public Set<ChannelPostNotifications> getChannelPostNotificationses() {
		return this.channelPostNotificationses;
	}

	public void setChannelPostNotificationses(Set<ChannelPostNotifications> channelPostNotificationses) {
		this.channelPostNotificationses = channelPostNotificationses;
	}

}