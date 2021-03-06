package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contributions generated by hbm2java
 */
@Entity
@Table(name = "contributions", schema = "1")
public class Contributions implements java.io.Serializable {

	private ContributionsId id;

	public Contributions() {
	}

	public Contributions(ContributionsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id") ),
			@AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "publicUserId", column = @Column(name = "public_user_id") ),
			@AttributeOverride(name = "rewardId", column = @Column(name = "reward_id") ),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 29) ) })
	public ContributionsId getId() {
		return this.id;
	}

	public void setId(ContributionsId id) {
		this.id = id;
	}

}
