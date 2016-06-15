package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TeamTotals generated by hbm2java
 */
@Entity
@Table(name = "team_totals", schema = "1")
public class TeamTotals implements java.io.Serializable {

	private TeamTotalsId id;

	public TeamTotals() {
	}

	public TeamTotals(TeamTotalsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "memberCount", column = @Column(name = "member_count") ),
			@AttributeOverride(name = "countries", column = @Column(name = "countries") ),
			@AttributeOverride(name = "totalContributedProjects", column = @Column(name = "total_contributed_projects") ),
			@AttributeOverride(name = "totalCities", column = @Column(name = "total_cities") ),
			@AttributeOverride(name = "totalAmount", column = @Column(name = "total_amount", precision = 131089, scale = 0) ) })
	public TeamTotalsId getId() {
		return this.id;
	}

	public void setId(TeamTotalsId id) {
		this.id = id;
	}

}