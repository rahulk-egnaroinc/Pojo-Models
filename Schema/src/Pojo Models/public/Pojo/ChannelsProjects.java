package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

/**
 * ChannelsProjects generated by hbm2java
 */
public class ChannelsProjects implements java.io.Serializable {

	private int id;
	private Channels channels;
	private Projects projects;

	public ChannelsProjects() {
	}

	public ChannelsProjects(int id) {
		this.id = id;
	}

	public ChannelsProjects(int id, Channels channels, Projects projects) {
		this.id = id;
		this.channels = channels;
		this.projects = projects;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Channels getChannels() {
		return this.channels;
	}

	public void setChannels(Channels channels) {
		this.channels = channels;
	}

	public Projects getProjects() {
		return this.projects;
	}

	public void setProjects(Projects projects) {
		this.projects = projects;
	}

}
