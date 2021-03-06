package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ChannelsProjects generated by hbm2java
 */
@Entity
@Table(name = "channels_projects", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = {
		"channel_id", "project_id" }) )
public class ChannelsProjects implements java.io.Serializable {

	private int id;
	private Channels channels;
	private Projects projects;

	public ChannelsProjects() {
	}

	public ChannelsProjects(int id) {
		this.id = id;
	}

	public ChannelsProjects(int id, Channels channels, Projects projects) {
		this.id = id;
		this.channels = channels;
		this.projects = projects;
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
	@JoinColumn(name = "channel_id")
	public Channels getChannels() {
		return this.channels;
	}

	public void setChannels(Channels channels) {
		this.channels = channels;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id")
	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

}
