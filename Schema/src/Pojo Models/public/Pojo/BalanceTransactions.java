package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * BalanceTransactions generated by hbm2java
 */
public class BalanceTransactions implements java.io.Serializable {

	private int id;
	private Contributions contributions;
	private Users users;
	private BalanceTransfers balanceTransfers;
	private Projects projects;
	private String eventName;
	private Date createdAt;
	private Date updatedAt;
	private BigDecimal amount;

	public BalanceTransactions() {
	}

	public BalanceTransactions(int id, Users users, String eventName, BigDecimal amount) {
		this.id = id;
		this.users = users;
		this.eventName = eventName;
		this.amount = amount;
	}

	public BalanceTransactions(int id, Contributions contributions, Users users, BalanceTransfers balanceTransfers,
			Projects projects, String eventName, Date createdAt, Date updatedAt, BigDecimal amount) {
		this.id = id;
		this.contributions = contributions;
		this.users = users;
		this.balanceTransfers = balanceTransfers;
		this.projects = projects;
		this.eventName = eventName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.amount = amount;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Contributions getContributions() {
		return this.contributions;
	}

	public void setContributions(Contributions contributions) {
		this.contributions = contributions;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public BalanceTransfers getBalanceTransfers() {
		return this.balanceTransfers;
	}

	public void setBalanceTransfers(BalanceTransfers balanceTransfers) {
		this.balanceTransfers = balanceTransfers;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
