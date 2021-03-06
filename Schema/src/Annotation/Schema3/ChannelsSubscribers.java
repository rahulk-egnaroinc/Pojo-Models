package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ChannelsSubscribers generated by hbm2java
 */
@Entity
@Table(name = "channels_subscribers", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = {
		"user_id", "channel_id" }) )
public class ChannelsSubscribers implements java.io.Serializable {

	private int id;
	private Users users;
	private Channels channels;

	public ChannelsSubscribers() {
	}

	public ChannelsSubscribers(int id, Users users, Channels channels) {
		this.id = id;
		this.users = users;
		this.channels = channels;
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

}
