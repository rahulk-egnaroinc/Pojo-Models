package src;
// Generated 13 Jun, 2016 5:39:40 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectTransfers generated by hbm2java
 */
@Entity
@Table(name = "project_transfers", schema = "1")
public class ProjectTransfers implements java.io.Serializable {

	private ProjectTransfersId id;

	public ProjectTransfers() {
	}

	public ProjectTransfers(ProjectTransfersId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "serviceFee", column = @Column(name = "service_fee", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "goal", column = @Column(name = "goal", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "pledged", column = @Column(name = "pledged", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "expiresAt", column = @Column(name = "expires_at", length = 29) ),
			@AttributeOverride(name = "finishedAt", column = @Column(name = "finished_at", length = 29) ),
			@AttributeOverride(name = "gatewayFee", column = @Column(name = "gateway_fee", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "catarseFee", column = @Column(name = "catarse_fee", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "catarseFeeWithoutGateway", column = @Column(name = "catarse_fee_without_gateway", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "amountWithoutCatarseFee", column = @Column(name = "amount_without_catarse_fee", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "irrfTax", column = @Column(name = "irrf_tax", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "pccTax", column = @Column(name = "pcc_tax", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "totalAmount", column = @Column(name = "total_amount", precision = 131089, scale = 0) ) })
	public ProjectTransfersId getId() {
		return this.id;
	}

	public void setId(ProjectTransfersId id) {
		this.id = id;
	}

}
