package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

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

/**
 * ChannelPartners generated by hbm2java
 */
@Entity
@Table(name = "channel_partners", schema = "public")
public class ChannelPartners implements java.io.Serializable {

	private int id;
	private Channels channels;
	private String url;
	private String image;
	private Date createdAt;
	private Date updatedAt;

	public ChannelPartners() {
	}

	public ChannelPartners(int id, Channels channels, String url, String image) {
		this.id = id;
		this.channels = channels;
		this.url = url;
		this.image = image;
	}

	public ChannelPartners(int id, Channels channels, String url, String image, Date createdAt, Date updatedAt) {
		this.id = id;
		this.channels = channels;
		this.url = url;
		this.image = image;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	@JoinColumn(name = "channel_id", nullable = false)
	public Channels getChannels() {
		return this.channels;
	}

	public void setChannels(Channels channels) {
		this.channels = channels;
	}

	@Column(name = "url", nullable = false)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "image", nullable = false)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
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

}
