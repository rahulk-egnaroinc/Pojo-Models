package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * UserFriends generated by hbm2java
 */
public class UserFriends implements java.io.Serializable {

	private int id;
	private Users usersByUserId;
	private Users usersByFriendId;
	private Date createdAt;
	private Date updatedAt;

	public UserFriends() {
	}

	public UserFriends(int id) {
		this.id = id;
	}

	public UserFriends(int id, Users usersByUserId, Users usersByFriendId, Date createdAt, Date updatedAt) {
		this.id = id;
		this.usersByUserId = usersByUserId;
		this.usersByFriendId = usersByFriendId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public Users getUsersByFriendId() {
		return this.usersByFriendId;
	}

	public void setUsersByFriendId(Users usersByFriendId) {
		this.usersByFriendId = usersByFriendId;
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
