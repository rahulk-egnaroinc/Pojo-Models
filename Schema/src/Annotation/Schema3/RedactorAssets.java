package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

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
 * RedactorAssets generated by hbm2java
 */
@Entity
@Table(name = "redactor_assets", schema = "public")
public class RedactorAssets implements java.io.Serializable {

	private int id;
	private Users users;
	private String dataFileName;
	private String dataContentType;
	private Integer dataFileSize;
	private Integer assetableId;
	private String assetableType;
	private String type;
	private Integer width;
	private Integer height;
	private Date createdAt;
	private Date updatedAt;

	public RedactorAssets() {
	}

	public RedactorAssets(int id, String dataFileName) {
		this.id = id;
		this.dataFileName = dataFileName;
	}

	public RedactorAssets(int id, Users users, String dataFileName, String dataContentType, Integer dataFileSize,
			Integer assetableId, String assetableType, String type, Integer width, Integer height, Date createdAt,
			Date updatedAt) {
		this.id = id;
		this.users = users;
		this.dataFileName = dataFileName;
		this.dataContentType = dataContentType;
		this.dataFileSize = dataFileSize;
		this.assetableId = assetableId;
		this.assetableType = assetableType;
		this.type = type;
		this.width = width;
		this.height = height;
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
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "data_file_name", nullable = false)
	public String getDataFileName() {
		return this.dataFileName;
	}

	public void setDataFileName(String dataFileName) {
		this.dataFileName = dataFileName;
	}

	@Column(name = "data_content_type")
	public String getDataContentType() {
		return this.dataContentType;
	}

	public void setDataContentType(String dataContentType) {
		this.dataContentType = dataContentType;
	}

	@Column(name = "data_file_size")
	public Integer getDataFileSize() {
		return this.dataFileSize;
	}

	public void setDataFileSize(Integer dataFileSize) {
		this.dataFileSize = dataFileSize;
	}

	@Column(name = "assetable_id")
	public Integer getAssetableId() {
		return this.assetableId;
	}

	public void setAssetableId(Integer assetableId) {
		this.assetableId = assetableId;
	}

	@Column(name = "assetable_type", length = 30)
	public String getAssetableType() {
		return this.assetableType;
	}

	public void setAssetableType(String assetableType) {
		this.assetableType = assetableType;
	}

	@Column(name = "type", length = 30)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "width")
	public Integer getWidth() {
		return this.width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@Column(name = "height")
	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
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
