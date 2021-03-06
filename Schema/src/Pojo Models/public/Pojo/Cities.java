package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Cities generated by hbm2java
 */
public class Cities implements java.io.Serializable {

	private int id;
	private States states;
	private String name;
	private Set<Projects> projectses = new HashSet<Projects>(0);

	public Cities() {
	}

	public Cities(int id, States states, String name) {
		this.id = id;
		this.states = states;
		this.name = name;
	}

	public Cities(int id, States states, String name, Set<Projects> projectses) {
		this.id = id;
		this.states = states;
		this.name = name;
		this.projectses = projectses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public States getStates() {
		return this.states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

}
