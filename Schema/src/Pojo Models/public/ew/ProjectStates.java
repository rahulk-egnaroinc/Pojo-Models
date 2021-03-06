package ew;
// Generated 10 Jun, 2016 12:07:08 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProjectStates generated by hbm2java
 */
@Entity
@Table(name = "project_states", schema = "public")
public class ProjectStates implements java.io.Serializable {

	private String state;
	private Serializable stateOrder;
	private Set<ProjectTransitions> projectTransitionses = new HashSet<ProjectTransitions>(0);
	private Set<Projects> projectses = new HashSet<Projects>(0);

	public ProjectStates() {
	}

	public ProjectStates(String state, Serializable stateOrder) {
		this.state = state;
		this.stateOrder = stateOrder;
	}

	public ProjectStates(String state, Serializable stateOrder, Set<ProjectTransitions> projectTransitionses,
			Set<Projects> projectses) {
		this.state = state;
		this.stateOrder = stateOrder;
		this.projectTransitionses = projectTransitionses;
		this.projectses = projectses;
	}

	@Id

	@Column(name = "state", unique = true, nullable = false)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "state_order", nullable = false)
	public Serializable getStateOrder() {
		return this.stateOrder;
	}

	public void setStateOrder(Serializable stateOrder) {
		this.stateOrder = stateOrder;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectStates")
	public Set<ProjectTransitions> getProjectTransitionses() {
		return this.projectTransitionses;
	}

	public void setProjectTransitionses(Set<ProjectTransitions> projectTransitionses) {
		this.projectTransitionses = projectTransitionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectStates")
	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

}
