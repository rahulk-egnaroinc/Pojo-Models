package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BalanceTransactions generated by hbm2java
 */
@Entity
@Table(name = "balance_transactions", schema = "1")
public class BalanceTransactions implements java.io.Serializable {

	private BalanceTransactionsId id;

	public BalanceTransactions() {
	}

	public BalanceTransactions(BalanceTransactionsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "credit", column = @Column(name = "credit", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "debit", column = @Column(name = "debit", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "totalAmount", column = @Column(name = "total_amount", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 13) ),
			@AttributeOverride(name = "source", column = @Column(name = "source") ) })
	public BalanceTransactionsId getId() {
		return this.id;
	}

	public void setId(BalanceTransactionsId id) {
		this.id = id;
	}

}
