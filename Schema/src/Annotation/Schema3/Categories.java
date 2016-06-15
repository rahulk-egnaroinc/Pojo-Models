package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Categories generated by hbm2java
 */
@Entity
@Table(name = "categories", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "name_pt") )
public class Categories implements java.io.Serializable {

	private int id;
	private String namePt;
	private Date createdAt;
	private Date updatedAt;
	private String nameEn;
	private String nameFr;
	private Set<CategoryFollowers> categoryFollowerses = new HashSet<CategoryFollowers>(0);
	private Set<Projects> projectses = new HashSet<Projects>(0);
	private Set<CategoryNotifications> categoryNotificationses = new HashSet<CategoryNotifications>(0);

	public Categories() {
	}

	public Categories(int id, String namePt) {
		this.id = id;
		this.namePt = namePt;
	}

	public Categories(int id, String namePt, Date createdAt, Date updatedAt, String nameEn, String nameFr,
			Set<CategoryFollowers> categoryFollowerses, Set<Projects> projectses,
			Set<CategoryNotifications> categoryNotificationses) {
		this.id = id;
		this.namePt = namePt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.nameEn = nameEn;
		this.nameFr = nameFr;
		this.categoryFollowerses = categoryFollowerses;
		this.projectses = projectses;
		this.categoryNotificationses = categoryNotificationses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name_pt", unique = true, nullable = false)
	public String getNamePt() {
		return this.namePt;
	}

	public void setNamePt(String namePt) {
		this.namePt = namePt;
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

	@Column(name = "name_en")
	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	@Column(name = "name_fr")
	public String getNameFr() {
		return this.nameFr;
	}

	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<CategoryFollowers> getCategoryFollowerses() {
		return this.categoryFollowerses;
	}

	public void setCategoryFollowerses(Set<CategoryFollowers> categoryFollowerses) {
		this.categoryFollowerses = categoryFollowerses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public Set<CategoryNotifications> getCategoryNotificationses() {
		return this.categoryNotificationses;
	}

	public void setCategoryNotificationses(Set<CategoryNotifications> categoryNotificationses) {
		this.categoryNotificationses = categoryNotificationses;
	}

}