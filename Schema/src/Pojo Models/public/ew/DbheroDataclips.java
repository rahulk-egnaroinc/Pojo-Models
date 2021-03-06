package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * DbheroDataclips generated by hbm2java
 */
@Entity
@Table(name = "dbhero_dataclips", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "token") )
public class DbheroDataclips implements java.io.Serializable {

	private int id;
	private String description;
	private String rawQuery;
	private String token;
	private String user;
	private boolean private_;
	private Date createdAt;
	private Date updatedAt;

	public DbheroDataclips() {
	}

	public DbheroDataclips(int id, String description, String rawQuery, String token, boolean private_, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.description = description;
		this.rawQuery = rawQuery;
		this.token = token;
		this.private_ = private_;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public DbheroDataclips(int id, String description, String rawQuery, String token, String user, boolean private_,
			Date createdAt, Date updatedAt) {
		this.id = id;
		this.description = description;
		this.rawQuery = rawQuery;
		this.token = token;
		this.user = user;
		this.private_ = private_;
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

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "raw_query", nullable = false)
	public String getRawQuery() {
		return this.rawQuery;
	}

	public void setRawQuery(String rawQuery) {
		this.rawQuery = rawQuery;
	}

	@Column(name = "token", unique = true, nullable = false)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "user")
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "private", nullable = false)
	public boolean isPrivate_() {
		return this.private_;
	}

	public void setPrivate_(boolean private_) {
		this.private_ = private_;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false, length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false, length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
