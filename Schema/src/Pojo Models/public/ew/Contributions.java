package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
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
 * Contributions generated by hbm2java
 */
@Entity
@Table(name = "contributions", schema = "public")
public class Contributions implements java.io.Serializable {

	private int id;
	private Users users;
	private Origins origins;
	private Rewards rewards;
	private Countries countries;
	private Donations donations;
	private Projects projects;
	private BigDecimal value;
	private Date createdAt;
	private Date updatedAt;
	private boolean anonymous;
	private Boolean notifiedFinish;
	private String payerName;
	private String payerEmail;
	private String payerDocument;
	private String addressStreet;
	private String addressNumber;
	private String addressComplement;
	private String addressNeighbourhood;
	private String addressZipCode;
	private String addressCity;
	private String addressState;
	private String addressPhoneNumber;
	private String paymentChoice;
	private BigDecimal paymentServiceFee;
	private String referralLink;
	private Date deletedAt;
	private Set<ContributionNotifications> contributionNotificationses = new HashSet<ContributionNotifications>(0);
	private Set<Payments> paymentses = new HashSet<Payments>(0);
	private Set<PaymentNotifications> paymentNotificationses = new HashSet<PaymentNotifications>(0);
	private Set<BalanceTransactions> balanceTransactionses = new HashSet<BalanceTransactions>(0);

	public Contributions() {
	}

	public Contributions(int id, Users users, Projects projects, BigDecimal value, boolean anonymous,
			String payerEmail) {
		this.id = id;
		this.users = users;
		this.projects = projects;
		this.value = value;
		this.anonymous = anonymous;
		this.payerEmail = payerEmail;
	}

	public Contributions(int id, Users users, Origins origins, Rewards rewards, Countries countries,
			Donations donations, Projects projects, BigDecimal value, Date createdAt, Date updatedAt, boolean anonymous,
			Boolean notifiedFinish, String payerName, String payerEmail, String payerDocument, String addressStreet,
			String addressNumber, String addressComplement, String addressNeighbourhood, String addressZipCode,
			String addressCity, String addressState, String addressPhoneNumber, String paymentChoice,
			BigDecimal paymentServiceFee, String referralLink, Date deletedAt,
			Set<ContributionNotifications> contributionNotificationses, Set<Payments> paymentses,
			Set<PaymentNotifications> paymentNotificationses, Set<BalanceTransactions> balanceTransactionses) {
		this.id = id;
		this.users = users;
		this.origins = origins;
		this.rewards = rewards;
		this.countries = countries;
		this.donations = donations;
		this.projects = projects;
		this.value = value;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.anonymous = anonymous;
		this.notifiedFinish = notifiedFinish;
		this.payerName = payerName;
		this.payerEmail = payerEmail;
		this.payerDocument = payerDocument;
		this.addressStreet = addressStreet;
		this.addressNumber = addressNumber;
		this.addressComplement = addressComplement;
		this.addressNeighbourhood = addressNeighbourhood;
		this.addressZipCode = addressZipCode;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressPhoneNumber = addressPhoneNumber;
		this.paymentChoice = paymentChoice;
		this.paymentServiceFee = paymentServiceFee;
		this.referralLink = referralLink;
		this.deletedAt = deletedAt;
		this.contributionNotificationses = contributionNotificationses;
		this.paymentses = paymentses;
		this.paymentNotificationses = paymentNotificationses;
		this.balanceTransactionses = balanceTransactionses;
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
	@JoinColumn(name = "origin_id")
	public Origins getOrigins() {
		return this.origins;
	}

	public void setOrigins(Origins origins) {
		this.origins = origins;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reward_id")
	public Rewards getRewards() {
		return this.rewards;
	}

	public void setRewards(Rewards rewards) {
		this.rewards = rewards;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	public Countries getCountries() {
		return this.countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donation_id")
	public Donations getDonations() {
		return this.donations;
	}

	public void setDonations(Donations donations) {
		this.donations = donations;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	@Column(name = "value", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
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

	@Column(name = "anonymous", nullable = false)
	public boolean isAnonymous() {
		return this.anonymous;
	}

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	@Column(name = "notified_finish")
	public Boolean getNotifiedFinish() {
		return this.notifiedFinish;
	}

	public void setNotifiedFinish(Boolean notifiedFinish) {
		this.notifiedFinish = notifiedFinish;
	}

	@Column(name = "payer_name")
	public String getPayerName() {
		return this.payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	@Column(name = "payer_email", nullable = false)
	public String getPayerEmail() {
		return this.payerEmail;
	}

	public void setPayerEmail(String payerEmail) {
		this.payerEmail = payerEmail;
	}

	@Column(name = "payer_document")
	public String getPayerDocument() {
		return this.payerDocument;
	}

	public void setPayerDocument(String payerDocument) {
		this.payerDocument = payerDocument;
	}

	@Column(name = "address_street")
	public String getAddressStreet() {
		return this.addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	@Column(name = "address_number")
	public String getAddressNumber() {
		return this.addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	@Column(name = "address_complement")
	public String getAddressComplement() {
		return this.addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	@Column(name = "address_neighbourhood")
	public String getAddressNeighbourhood() {
		return this.addressNeighbourhood;
	}

	public void setAddressNeighbourhood(String addressNeighbourhood) {
		this.addressNeighbourhood = addressNeighbourhood;
	}

	@Column(name = "address_zip_code")
	public String getAddressZipCode() {
		return this.addressZipCode;
	}

	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}

	@Column(name = "address_city")
	public String getAddressCity() {
		return this.addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	@Column(name = "address_state")
	public String getAddressState() {
		return this.addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	@Column(name = "address_phone_number")
	public String getAddressPhoneNumber() {
		return this.addressPhoneNumber;
	}

	public void setAddressPhoneNumber(String addressPhoneNumber) {
		this.addressPhoneNumber = addressPhoneNumber;
	}

	@Column(name = "payment_choice")
	public String getPaymentChoice() {
		return this.paymentChoice;
	}

	public void setPaymentChoice(String paymentChoice) {
		this.paymentChoice = paymentChoice;
	}

	@Column(name = "payment_service_fee", precision = 131089, scale = 0)
	public BigDecimal getPaymentServiceFee() {
		return this.paymentServiceFee;
	}

	public void setPaymentServiceFee(BigDecimal paymentServiceFee) {
		this.paymentServiceFee = paymentServiceFee;
	}

	@Column(name = "referral_link")
	public String getReferralLink() {
		return this.referralLink;
	}

	public void setReferralLink(String referralLink) {
		this.referralLink = referralLink;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 29)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contributions")
	public Set<ContributionNotifications> getContributionNotificationses() {
		return this.contributionNotificationses;
	}

	public void setContributionNotificationses(Set<ContributionNotifications> contributionNotificationses) {
		this.contributionNotificationses = contributionNotificationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contributions")
	public Set<Payments> getPaymentses() {
		return this.paymentses;
	}

	public void setPaymentses(Set<Payments> paymentses) {
		this.paymentses = paymentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contributions")
	public Set<PaymentNotifications> getPaymentNotificationses() {
		return this.paymentNotificationses;
	}

	public void setPaymentNotificationses(Set<PaymentNotifications> paymentNotificationses) {
		this.paymentNotificationses = paymentNotificationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contributions")
	public Set<BalanceTransactions> getBalanceTransactionses() {
		return this.balanceTransactionses;
	}

	public void setBalanceTransactionses(Set<BalanceTransactions> balanceTransactionses) {
		this.balanceTransactionses = balanceTransactionses;
	}

}
