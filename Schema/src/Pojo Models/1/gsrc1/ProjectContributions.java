package gsrc1;
// Generated 10 Jun, 2016 11:57:07 AM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ProjectContributions generated by hbm2java
 */
@Entity
@Table(name = "project_contributions", schema = "1")
public class ProjectContributions implements java.io.Serializable {

	private ProjectContributionsId id;

	public ProjectContributions() {
	}

	public ProjectContributions(ProjectContributionsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "anonymous", column = @Column(name = "anonymous") ),
			@AttributeOverride(name = "projectId", column = @Column(name = "project_id") ),
			@AttributeOverride(name = "rewardId", column = @Column(name = "reward_id", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "id", column = @Column(name = "id", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "profileImgThumbnail", column = @Column(name = "profile_img_thumbnail") ),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id") ),
			@AttributeOverride(name = "userName", column = @Column(name = "user_name") ),
			@AttributeOverride(name = "value", column = @Column(name = "value", precision = 131089, scale = 0) ),
			@AttributeOverride(name = "state", column = @Column(name = "state") ),
			@AttributeOverride(name = "email", column = @Column(name = "email") ),
			@AttributeOverride(name = "reward", column = @Column(name = "reward") ),
			@AttributeOverride(name = "waitingPayment", column = @Column(name = "waiting_payment") ),
			@AttributeOverride(name = "isOwnerOrAdmin", column = @Column(name = "is_owner_or_admin") ),
			@AttributeOverride(name = "totalContributedProjects", column = @Column(name = "total_contributed_projects") ),
			@AttributeOverride(name = "createdAt", column = @Column(name = "created_at", length = 29) ),
			@AttributeOverride(name = "hasAnother", column = @Column(name = "has_another") ),
			@AttributeOverride(name = "fullTextIndex", column = @Column(name = "full_text_index") ) })
	public ProjectContributionsId getId() {
		return this.id;
	}

	public void setId(ProjectContributionsId id) {
		this.id = id;
	}

}