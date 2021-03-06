package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
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
 * UserTransfers generated by hbm2java
 */
@Entity
@Table(name = "user_transfers", schema = "public")
public class UserTransfers implements java.io.Serializable {

	private int id;
	private Users users;
	private String status;
	private int amount;
	private Serializable transferData;
	private Integer gatewayId;
	private Date createdAt;
	private Date updatedAt;
	private Set<UserTransferNotifications> userTransferNotificationses = new HashSet<UserTransferNotifications>(0);

	public UserTransfers() {
	}

	public UserTransfers(int id, Users users, String status, int amount) {
		this.id = id;
		this.users = users;
		this.status = status;
		this.amount = amount;
	}

	public UserTransfers(int id, Users users, String status, int amount, Serializable transferData, Integer gatewayId,
			Date createdAt, Date updatedAt, Set<UserTransferNotifications> userTransferNotificationses) {
		this.id = id;
		this.users = users;
		this.status = status;
		this.amount = amount;
		this.transferData = transferData;
		this.gatewayId = gatewayId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userTransferNotificationses = userTransferNotificationses;
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

	@Column(name = "status", nullable = false)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Column(name = "transfer_data")
	public Serializable getTransferData() {
		return this.transferData;
	}

	public void setTransferData(Serializable transferData) {
		this.transferData = transferData;
	}

	@Column(name = "gateway_id")
	public Integer getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userTransfers")
	public Set<UserTransferNotifications> getUserTransferNotificationses() {
		return this.userTransferNotificationses;
	}

	public void setUserTransferNotificationses(Set<UserTransferNotifications> userTransferNotificationses) {
		this.userTransferNotificationses = userTransferNotificationses;
	}

}
