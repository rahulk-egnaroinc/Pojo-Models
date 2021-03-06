package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * UserLinks generated by hbm2java
 */
public class UserLinks implements java.io.Serializable {

	private int id;
	private Users users;
	private String link;
	private Date createdAt;
	private Date updatedAt;

	public UserLinks() {
	}

	public UserLinks(int id, Users users, String link) {
		this.id = id;
		this.users = users;
		this.link = link;
	}

	public UserLinks(int id, Users users, String link, Date createdAt, Date updatedAt) {
		this.id = id;
		this.users = users;
		this.link = link;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

}
