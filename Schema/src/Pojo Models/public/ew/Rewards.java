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
 * Rewards generated by hbm2java
 */
@Entity
@Table(name = "rewards", schema = "public")
public class Rewards implements java.io.Serializable {

	private int id;
	private Projects projects;
	private BigDecimal minimumValue;
	private Integer maximumContributions;
	private String description;
	private Date createdAt;
	private Date updatedAt;
	private Integer rowOrder;
	private String lastChanges;
	private Date deliverAt;
	private Set<Contributions> contributionses = new HashSet<Contributions>(0);

	public Rewards() {
	}

	public Rewards(int id, Projects projects, BigDecimal minimumValue, String description) {
		this.id = id;
		this.projects = projects;
		this.minimumValue = minimumValue;
		this.description = description;
	}

	public Rewards(int id, Projects projects, BigDecimal minimumValue, Integer maximumContributions, String description,
			Date createdAt, Date updatedAt, Integer rowOrder, String lastChanges, Date deliverAt,
			Set<Contributions> contributionses) {
		this.id = id;
		this.projects = projects;
		this.minimumValue = minimumValue;
		this.maximumContributions = maximumContributions;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.rowOrder = rowOrder;
		this.lastChanges = lastChanges;
		this.deliverAt = deliverAt;
		this.contributionses = contributionses;
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
	@JoinColumn(name = "project_id", nullable = false)
	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

	@Column(name = "minimum_value", nullable = false, precision = 131089, scale = 0)
	public BigDecimal getMinimumValue() {
		return this.minimumValue;
	}

	public void setMinimumValue(BigDecimal minimumValue) {
		this.minimumValue = minimumValue;
	}

	@Column(name = "maximum_contributions")
	public Integer getMaximumContributions() {
		return this.maximumContributions;
	}

	public void setMaximumContributions(Integer maximumContributions) {
		this.maximumContributions = maximumContributions;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Column(name = "row_order")
	public Integer getRowOrder() {
		return this.rowOrder;
	}

	public void setRowOrder(Integer rowOrder) {
		this.rowOrder = rowOrder;
	}

	@Column(name = "last_changes")
	public String getLastChanges() {
		return this.lastChanges;
	}

	public void setLastChanges(String lastChanges) {
		this.lastChanges = lastChanges;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deliver_at", length = 29)
	public Date getDeliverAt() {
		return this.deliverAt;
	}

	public void setDeliverAt(Date deliverAt) {
		this.deliverAt = deliverAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rewards")
	public Set<Contributions> getContributionses() {
		return this.contributionses;
	}

	public void setContributionses(Set<Contributions> contributionses) {
		this.contributionses = contributionses;
	}

}
