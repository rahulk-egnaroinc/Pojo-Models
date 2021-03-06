package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

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
 * BankAccounts generated by hbm2java
 */
@Entity
@Table(name = "bank_accounts", schema = "public")
public class BankAccounts implements java.io.Serializable {

	private int id;
	private Users users;
	private Banks banks;
	private String account;
	private String agency;
	private String ownerName;
	private String ownerDocument;
	private Date createdAt;
	private Date updatedAt;
	private String accountDigit;
	private String agencyDigit;

	public BankAccounts() {
	}

	public BankAccounts(int id, Banks banks, String account, String agency, String ownerName, String ownerDocument,
			String accountDigit) {
		this.id = id;
		this.banks = banks;
		this.account = account;
		this.agency = agency;
		this.ownerName = ownerName;
		this.ownerDocument = ownerDocument;
		this.accountDigit = accountDigit;
	}

	public BankAccounts(int id, Users users, Banks banks, String account, String agency, String ownerName,
			String ownerDocument, Date createdAt, Date updatedAt, String accountDigit, String agencyDigit) {
		this.id = id;
		this.users = users;
		this.banks = banks;
		this.account = account;
		this.agency = agency;
		this.ownerName = ownerName;
		this.ownerDocument = ownerDocument;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.accountDigit = accountDigit;
		this.agencyDigit = agencyDigit;
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
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bank_id", nullable = false)
	public Banks getBanks() {
		return this.banks;
	}

	public void setBanks(Banks banks) {
		this.banks = banks;
	}

	@Column(name = "account", nullable = false)
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "agency", nullable = false)
	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	@Column(name = "owner_name", nullable = false)
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Column(name = "owner_document", nullable = false)
	public String getOwnerDocument() {
		return this.ownerDocument;
	}

	public void setOwnerDocument(String ownerDocument) {
		this.ownerDocument = ownerDocument;
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

	@Column(name = "account_digit", nullable = false)
	public String getAccountDigit() {
		return this.accountDigit;
	}

	public void setAccountDigit(String accountDigit) {
		this.accountDigit = accountDigit;
	}

	@Column(name = "agency_digit")
	public String getAgencyDigit() {
		return this.agencyDigit;
	}

	public void setAgencyDigit(String agencyDigit) {
		this.agencyDigit = agencyDigit;
	}

}
