package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.math.BigDecimal;
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
 * ProjectBudgets generated by hbm2java
 */
@Entity
@Table(name = "project_budgets", schema = "public")
public class ProjectBudgets implements java.io.Serializable {

	private int id;
	private Projects projects;
	private String name;
	private BigDecimal value;
	private Date createdAt;
	private Date updatedAt;

	public ProjectBudgets() {
	}

	public ProjectBudgets(int id, Projects projects, String name, BigDecimal value) {
		this.id = id;
		this.projects = projects;
		this.name = name;
		this.value = value;
	}

	public ProjectBudgets(int id, Projects projects, String name, BigDecimal value, Date createdAt, Date updatedAt) {
		this.id = id;
		this.projects = projects;
		this.name = name;
		this.value = value;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "value", nullable = false, precision = 8)
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

}