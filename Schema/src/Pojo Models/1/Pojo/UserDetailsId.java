package gensrc1;
// Generated 9 Jun, 2016 7:06:41 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.Date;

/**
 * UserDetailsId generated by hbm2java
 */
public class UserDetailsId implements java.io.Serializable {

	private Integer id;
	private String name;
	private String addressCity;
	private Date deactivatedAt;
	private String profileImgThumbnail;
	private String facebookLink;
	private String twitterUsername;
	private String email;
	private Long totalContributedProjects;
	private Long totalPublishedProjects;
	private Serializable links;

	public UserDetailsId() {
	}

	public UserDetailsId(Integer id, String name, String addressCity, Date deactivatedAt, String profileImgThumbnail,
			String facebookLink, String twitterUsername, String email, Long totalContributedProjects,
			Long totalPublishedProjects, Serializable links) {
		this.id = id;
		this.name = name;
		this.addressCity = addressCity;
		this.deactivatedAt = deactivatedAt;
		this.profileImgThumbnail = profileImgThumbnail;
		this.facebookLink = facebookLink;
		this.twitterUsername = twitterUsername;
		this.email = email;
		this.totalContributedProjects = totalContributedProjects;
		this.totalPublishedProjects = totalPublishedProjects;
		this.links = links;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressCity() {
		return this.addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public Date getDeactivatedAt() {
		return this.deactivatedAt;
	}

	public void setDeactivatedAt(Date deactivatedAt) {
		this.deactivatedAt = deactivatedAt;
	}

	public String getProfileImgThumbnail() {
		return this.profileImgThumbnail;
	}

	public void setProfileImgThumbnail(String profileImgThumbnail) {
		this.profileImgThumbnail = profileImgThumbnail;
	}

	public String getFacebookLink() {
		return this.facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getTwitterUsername() {
		return this.twitterUsername;
	}

	public void setTwitterUsername(String twitterUsername) {
		this.twitterUsername = twitterUsername;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTotalContributedProjects() {
		return this.totalContributedProjects;
	}

	public void setTotalContributedProjects(Long totalContributedProjects) {
		this.totalContributedProjects = totalContributedProjects;
	}

	public Long getTotalPublishedProjects() {
		return this.totalPublishedProjects;
	}

	public void setTotalPublishedProjects(Long totalPublishedProjects) {
		this.totalPublishedProjects = totalPublishedProjects;
	}

	public Serializable getLinks() {
		return this.links;
	}

	public void setLinks(Serializable links) {
		this.links = links;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserDetailsId))
			return false;
		UserDetailsId castOther = (UserDetailsId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getAddressCity() == castOther.getAddressCity())
						|| (this.getAddressCity() != null && castOther.getAddressCity() != null
								&& this.getAddressCity().equals(castOther.getAddressCity())))
				&& ((this.getDeactivatedAt() == castOther.getDeactivatedAt())
						|| (this.getDeactivatedAt() != null && castOther.getDeactivatedAt() != null
								&& this.getDeactivatedAt().equals(castOther.getDeactivatedAt())))
				&& ((this.getProfileImgThumbnail() == castOther.getProfileImgThumbnail())
						|| (this.getProfileImgThumbnail() != null && castOther.getProfileImgThumbnail() != null
								&& this.getProfileImgThumbnail().equals(castOther.getProfileImgThumbnail())))
				&& ((this.getFacebookLink() == castOther.getFacebookLink())
						|| (this.getFacebookLink() != null && castOther.getFacebookLink() != null
								&& this.getFacebookLink().equals(castOther.getFacebookLink())))
				&& ((this.getTwitterUsername() == castOther.getTwitterUsername())
						|| (this.getTwitterUsername() != null && castOther.getTwitterUsername() != null
								&& this.getTwitterUsername().equals(castOther.getTwitterUsername())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getTotalContributedProjects() == castOther.getTotalContributedProjects())
						|| (this.getTotalContributedProjects() != null
								&& castOther.getTotalContributedProjects() != null
								&& this.getTotalContributedProjects().equals(castOther.getTotalContributedProjects())))
				&& ((this.getTotalPublishedProjects() == castOther.getTotalPublishedProjects())
						|| (this.getTotalPublishedProjects() != null && castOther.getTotalPublishedProjects() != null
								&& this.getTotalPublishedProjects().equals(castOther.getTotalPublishedProjects())))
				&& ((this.getLinks() == castOther.getLinks()) || (this.getLinks() != null
						&& castOther.getLinks() != null && this.getLinks().equals(castOther.getLinks())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getAddressCity() == null ? 0 : this.getAddressCity().hashCode());
		result = 37 * result + (getDeactivatedAt() == null ? 0 : this.getDeactivatedAt().hashCode());
		result = 37 * result + (getProfileImgThumbnail() == null ? 0 : this.getProfileImgThumbnail().hashCode());
		result = 37 * result + (getFacebookLink() == null ? 0 : this.getFacebookLink().hashCode());
		result = 37 * result + (getTwitterUsername() == null ? 0 : this.getTwitterUsername().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getTotalContributedProjects() == null ? 0 : this.getTotalContributedProjects().hashCode());
		result = 37 * result + (getTotalPublishedProjects() == null ? 0 : this.getTotalPublishedProjects().hashCode());
		result = 37 * result + (getLinks() == null ? 0 : this.getLinks().hashCode());
		return result;
	}

}
