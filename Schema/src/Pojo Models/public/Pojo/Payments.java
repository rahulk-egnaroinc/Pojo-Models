package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Payments generated by hbm2java
 */
public class Payments implements java.io.Serializable {

	private int id;
	private Contributions contributions;
	private String state;
	private String key;
	private String gateway;
	private String gatewayId;
	private BigDecimal gatewayFee;
	private Serializable gatewayData;
	private String paymentMethod;
	private BigDecimal value;
	private int installments;
	private BigDecimal installmentValue;
	private Date paidAt;
	private Date refusedAt;
	private Date pendingRefundAt;
	private Date refundedAt;
	private Date createdAt;
	private Date updatedAt;
	private Serializable fullTextIndex;
	private Date deletedAt;
	private Date chargebackAt;
	private String ipAddress;
	private Set<PaymentNotifications> paymentNotificationses = new HashSet<PaymentNotifications>(0);
	private Set<PaymentTransfers> paymentTransferses = new HashSet<PaymentTransfers>(0);

	public Payments() {
	}

	public Payments(int id, Contributions contributions, String state, String key, String gateway, String paymentMethod,
			BigDecimal value, int installments) {
		this.id = id;
		this.contributions = contributions;
		this.state = state;
		this.key = key;
		this.gateway = gateway;
		this.paymentMethod = paymentMethod;
		this.value = value;
		this.installments = installments;
	}

	public Payments(int id, Contributions contributions, String state, String key, String gateway, String gatewayId,
			BigDecimal gatewayFee, Serializable gatewayData, String paymentMethod, BigDecimal value, int installments,
			BigDecimal installmentValue, Date paidAt, Date refusedAt, Date pendingRefundAt, Date refundedAt,
			Date createdAt, Date updatedAt, Serializable fullTextIndex, Date deletedAt, Date chargebackAt,
			String ipAddress, Set<PaymentNotifications> paymentNotificationses,
			Set<PaymentTransfers> paymentTransferses) {
		this.id = id;
		this.contributions = contributions;
		this.state = state;
		this.key = key;
		this.gateway = gateway;
		this.gatewayId = gatewayId;
		this.gatewayFee = gatewayFee;
		this.gatewayData = gatewayData;
		this.paymentMethod = paymentMethod;
		this.value = value;
		this.installments = installments;
		this.installmentValue = installmentValue;
		this.paidAt = paidAt;
		this.refusedAt = refusedAt;
		this.pendingRefundAt = pendingRefundAt;
		this.refundedAt = refundedAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.fullTextIndex = fullTextIndex;
		this.deletedAt = deletedAt;
		this.chargebackAt = chargebackAt;
		this.ipAddress = ipAddress;
		this.paymentNotificationses = paymentNotificationses;
		this.paymentTransferses = paymentTransferses;
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public BigDecimal getGatewayFee() {
		return this.gatewayFee;
	}

	public void setGatewayFee(BigDecimal gatewayFee) {
		this.gatewayFee = gatewayFee;
	}

	public Serializable getGatewayData() {
		return this.gatewayData;
	}

	public void setGatewayData(Serializable gatewayData) {
		this.gatewayData = gatewayData;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public int getInstallments() {
		return this.installments;
	}

	public void setInstallments(int installments) {
		this.installments = installments;
	}

	public BigDecimal getInstallmentValue() {
		return this.installmentValue;
	}

	public void setInstallmentValue(BigDecimal installmentValue) {
		this.installmentValue = installmentValue;
	}

	public Date getPaidAt() {
		return this.paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public Date getRefusedAt() {
		return this.refusedAt;
	}

	public void setRefusedAt(Date refusedAt) {
		this.refusedAt = refusedAt;
	}

	public Date getPendingRefundAt() {
		return this.pendingRefundAt;
	}

	public void setPendingRefundAt(Date pendingRefundAt) {
		this.pendingRefundAt = pendingRefundAt;
	}

	public Date getRefundedAt() {
		return this.refundedAt;
	}

	public void setRefundedAt(Date refundedAt) {
		this.refundedAt = refundedAt;
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

	public Serializable getFullTextIndex() {
		return this.fullTextIndex;
	}

	public void setFullTextIndex(Serializable fullTextIndex) {
		this.fullTextIndex = fullTextIndex;
	}

	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Date getChargebackAt() {
		return this.chargebackAt;
	}

	public void setChargebackAt(Date chargebackAt) {
		this.chargebackAt = chargebackAt;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Set<PaymentNotifications> getPaymentNotificationses() {
		return this.paymentNotificationses;
	}

	public void setPaymentNotificationses(Set<PaymentNotifications> paymentNotificationses) {
		this.paymentNotificationses = paymentNotificationses;
	}

	public Set<PaymentTransfers> getPaymentTransferses() {
		return this.paymentTransferses;
	}

	public void setPaymentTransferses(Set<PaymentTransfers> paymentTransferses) {
		this.paymentTransferses = paymentTransferses;
	}

}
