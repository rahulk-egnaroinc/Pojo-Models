package src3;
// Generated 13 Jun, 2016 5:44:25 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
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
import javax.persistence.UniqueConstraint;

/**
 * Projects generated by hbm2java
 */
@Entity
@Table(name = "projects", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "lower(permalink)") )
public class Projects implements java.io.Serializable {

	private int id;
	private Users users;
	private Origins origins;
	private ProjectStates projectStates;
	private Cities cities;
	private Categories categories;
	private String name;
	private BigDecimal goal;
	private String headline;
	private String videoUrl;
	private String shortUrl;
	private Date createdAt;
	private Date updatedAt;
	private String aboutHtml;
	private Boolean recommended;
	private String homePageComment;
	private String permalink;
	private String videoThumbnail;
	private Integer onlineDays;
	private String moreLinks;
	private String firstContributions;
	private String uploadedImage;
	private String videoEmbedUrl;
	private String auditedUserName;
	private String auditedUserCpf;
	private String auditedUserMoipLogin;
	private String auditedUserPhoneNumber;
	private String trafficSources;
	private String budget;
	private Serializable fullTextIndex;
	private String budgetHtml;
	private Date expiresAt;
	private BigDecimal serviceFee;
	private int totalInstallments;
	private String mode;
	private String trackerSnippetHtml;
	private Set<ProjectAccounts> projectAccountses = new HashSet<ProjectAccounts>(0);
	private Set<ProjectReports> projectReportses = new HashSet<ProjectReports>(0);
	private Set<Rdevents> rdeventses = new HashSet<Rdevents>(0);
	private Set<Taggings> taggingses = new HashSet<Taggings>(0);
	private Set<ProjectPosts> projectPostses = new HashSet<ProjectPosts>(0);
	private Set<ProjectErrors> projectErrorses = new HashSet<ProjectErrors>(0);
	private Set<FlexibleProjects> flexibleProjectses = new HashSet<FlexibleProjects>(0);
	private Set<BalanceTransactions> balanceTransactionses = new HashSet<BalanceTransactions>(0);
	private Set<Rewards> rewardses = new HashSet<Rewards>(0);
	private Set<DirectMessages> directMessageses = new HashSet<DirectMessages>(0);
	private Set<ChannelsProjects> channelsProjectses = new HashSet<ChannelsProjects>(0);
	private Set<ProjectNotifications> projectNotificationses = new HashSet<ProjectNotifications>(0);
	private Set<ProjectReminders> projectReminderses = new HashSet<ProjectReminders>(0);
	private Set<Contributions> contributionses = new HashSet<Contributions>(0);
	private Set<Unsubscribes> unsubscribeses = new HashSet<Unsubscribes>(0);
	private Set<ProjectBudgets> projectBudgetses = new HashSet<ProjectBudgets>(0);
	private Set<BalanceTransfers> balanceTransferses = new HashSet<BalanceTransfers>(0);
	private Set<ProjectTransitions> projectTransitionses = new HashSet<ProjectTransitions>(0);

	public Projects() {
	}

	public Projects(int id, Users users, ProjectStates projectStates, Categories categories, String name,
			String permalink, int totalInstallments, String mode) {
		this.id = id;
		this.users = users;
		this.projectStates = projectStates;
		this.categories = categories;
		this.name = name;
		this.permalink = permalink;
		this.totalInstallments = totalInstallments;
		this.mode = mode;
	}

	public Projects(int id, Users users, Origins origins, ProjectStates projectStates, Cities cities,
			Categories categories, String name, BigDecimal goal, String headline, String videoUrl, String shortUrl,
			Date createdAt, Date updatedAt, String aboutHtml, Boolean recommended, String homePageComment,
			String permalink, String videoThumbnail, Integer onlineDays, String moreLinks, String firstContributions,
			String uploadedImage, String videoEmbedUrl, String auditedUserName, String auditedUserCpf,
			String auditedUserMoipLogin, String auditedUserPhoneNumber, String trafficSources, String budget,
			Serializable fullTextIndex, String budgetHtml, Date expiresAt, BigDecimal serviceFee, int totalInstallments,
			String mode, String trackerSnippetHtml, Set<ProjectAccounts> projectAccountses,
			Set<ProjectReports> projectReportses, Set<Rdevents> rdeventses, Set<Taggings> taggingses,
			Set<ProjectPosts> projectPostses, Set<ProjectErrors> projectErrorses,
			Set<FlexibleProjects> flexibleProjectses, Set<BalanceTransactions> balanceTransactionses,
			Set<Rewards> rewardses, Set<DirectMessages> directMessageses, Set<ChannelsProjects> channelsProjectses,
			Set<ProjectNotifications> projectNotificationses, Set<ProjectReminders> projectReminderses,
			Set<Contributions> contributionses, Set<Unsubscribes> unsubscribeses, Set<ProjectBudgets> projectBudgetses,
			Set<BalanceTransfers> balanceTransferses, Set<ProjectTransitions> projectTransitionses) {
		this.id = id;
		this.users = users;
		this.origins = origins;
		this.projectStates = projectStates;
		this.cities = cities;
		this.categories = categories;
		this.name = name;
		this.goal = goal;
		this.headline = headline;
		this.videoUrl = videoUrl;
		this.shortUrl = shortUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.aboutHtml = aboutHtml;
		this.recommended = recommended;
		this.homePageComment = homePageComment;
		this.permalink = permalink;
		this.videoThumbnail = videoThumbnail;
		this.onlineDays = onlineDays;
		this.moreLinks = moreLinks;
		this.firstContributions = firstContributions;
		this.uploadedImage = uploadedImage;
		this.videoEmbedUrl = videoEmbedUrl;
		this.auditedUserName = auditedUserName;
		this.auditedUserCpf = auditedUserCpf;
		this.auditedUserMoipLogin = auditedUserMoipLogin;
		this.auditedUserPhoneNumber = auditedUserPhoneNumber;
		this.trafficSources = trafficSources;
		this.budget = budget;
		this.fullTextIndex = fullTextIndex;
		this.budgetHtml = budgetHtml;
		this.expiresAt = expiresAt;
		this.serviceFee = serviceFee;
		this.totalInstallments = totalInstallments;
		this.mode = mode;
		this.trackerSnippetHtml = trackerSnippetHtml;
		this.projectAccountses = projectAccountses;
		this.projectReportses = projectReportses;
		this.rdeventses = rdeventses;
		this.taggingses = taggingses;
		this.projectPostses = projectPostses;
		this.projectErrorses = projectErrorses;
		this.flexibleProjectses = flexibleProjectses;
		this.balanceTransactionses = balanceTransactionses;
		this.rewardses = rewardses;
		this.directMessageses = directMessageses;
		this.channelsProjectses = channelsProjectses;
		this.projectNotificationses = projectNotificationses;
		this.projectReminderses = projectReminderses;
		this.contributionses = contributionses;
		this.unsubscribeses = unsubscribeses;
		this.projectBudgetses = projectBudgetses;
		this.balanceTransferses = balanceTransferses;
		this.projectTransitionses = projectTransitionses;
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
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "origin_id")
	public Origins getOrigins() {
		return this.origins;
	}

	public void setOrigins(Origins origins) {
		this.origins = origins;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state", nullable = false)
	public ProjectStates getProjectStates() {
		return this.projectStates;
	}

	public void setProjectStates(ProjectStates projectStates) {
		this.projectStates = projectStates;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id")
	public Cities getCities() {
		return this.cities;
	}

	public void setCities(Cities cities) {
		this.cities = cities;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "goal", precision = 131089, scale = 0)
	public BigDecimal getGoal() {
		return this.goal;
	}

	public void setGoal(BigDecimal goal) {
		this.goal = goal;
	}

	@Column(name = "headline")
	public String getHeadline() {
		return this.headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	@Column(name = "video_url")
	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	@Column(name = "short_url")
	public String getShortUrl() {
		return this.shortUrl;
	}

	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
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

	@Column(name = "about_html")
	public String getAboutHtml() {
		return this.aboutHtml;
	}

	public void setAboutHtml(String aboutHtml) {
		this.aboutHtml = aboutHtml;
	}

	@Column(name = "recommended")
	public Boolean getRecommended() {
		return this.recommended;
	}

	public void setRecommended(Boolean recommended) {
		this.recommended = recommended;
	}

	@Column(name = "home_page_comment")
	public String getHomePageComment() {
		return this.homePageComment;
	}

	public void setHomePageComment(String homePageComment) {
		this.homePageComment = homePageComment;
	}

	@Column(name = "permalink", nullable = false)
	public String getPermalink() {
		return this.permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	@Column(name = "video_thumbnail")
	public String getVideoThumbnail() {
		return this.videoThumbnail;
	}

	public void setVideoThumbnail(String videoThumbnail) {
		this.videoThumbnail = videoThumbnail;
	}

	@Column(name = "online_days")
	public Integer getOnlineDays() {
		return this.onlineDays;
	}

	public void setOnlineDays(Integer onlineDays) {
		this.onlineDays = onlineDays;
	}

	@Column(name = "more_links")
	public String getMoreLinks() {
		return this.moreLinks;
	}

	public void setMoreLinks(String moreLinks) {
		this.moreLinks = moreLinks;
	}

	@Column(name = "first_contributions")
	public String getFirstContributions() {
		return this.firstContributions;
	}

	public void setFirstContributions(String firstContributions) {
		this.firstContributions = firstContributions;
	}

	@Column(name = "uploaded_image")
	public String getUploadedImage() {
		return this.uploadedImage;
	}

	public void setUploadedImage(String uploadedImage) {
		this.uploadedImage = uploadedImage;
	}

	@Column(name = "video_embed_url")
	public String getVideoEmbedUrl() {
		return this.videoEmbedUrl;
	}

	public void setVideoEmbedUrl(String videoEmbedUrl) {
		this.videoEmbedUrl = videoEmbedUrl;
	}

	@Column(name = "audited_user_name")
	public String getAuditedUserName() {
		return this.auditedUserName;
	}

	public void setAuditedUserName(String auditedUserName) {
		this.auditedUserName = auditedUserName;
	}

	@Column(name = "audited_user_cpf")
	public String getAuditedUserCpf() {
		return this.auditedUserCpf;
	}

	public void setAuditedUserCpf(String auditedUserCpf) {
		this.auditedUserCpf = auditedUserCpf;
	}

	@Column(name = "audited_user_moip_login")
	public String getAuditedUserMoipLogin() {
		return this.auditedUserMoipLogin;
	}

	public void setAuditedUserMoipLogin(String auditedUserMoipLogin) {
		this.auditedUserMoipLogin = auditedUserMoipLogin;
	}

	@Column(name = "audited_user_phone_number")
	public String getAuditedUserPhoneNumber() {
		return this.auditedUserPhoneNumber;
	}

	public void setAuditedUserPhoneNumber(String auditedUserPhoneNumber) {
		this.auditedUserPhoneNumber = auditedUserPhoneNumber;
	}

	@Column(name = "traffic_sources")
	public String getTrafficSources() {
		return this.trafficSources;
	}

	public void setTrafficSources(String trafficSources) {
		this.trafficSources = trafficSources;
	}

	@Column(name = "budget")
	public String getBudget() {
		return this.budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	@Column(name = "full_text_index")
	public Serializable getFullTextIndex() {
		return this.fullTextIndex;
	}

	public void setFullTextIndex(Serializable fullTextIndex) {
		this.fullTextIndex = fullTextIndex;
	}

	@Column(name = "budget_html")
	public String getBudgetHtml() {
		return this.budgetHtml;
	}

	public void setBudgetHtml(String budgetHtml) {
		this.budgetHtml = budgetHtml;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expires_at", length = 29)
	public Date getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	@Column(name = "service_fee", precision = 131089, scale = 0)
	public BigDecimal getServiceFee() {
		return this.serviceFee;
	}

	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}

	@Column(name = "total_installments", nullable = false)
	public int getTotalInstallments() {
		return this.totalInstallments;
	}

	public void setTotalInstallments(int totalInstallments) {
		this.totalInstallments = totalInstallments;
	}

	@Column(name = "mode", nullable = false)
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Column(name = "tracker_snippet_html")
	public String getTrackerSnippetHtml() {
		return this.trackerSnippetHtml;
	}

	public void setTrackerSnippetHtml(String trackerSnippetHtml) {
		this.trackerSnippetHtml = trackerSnippetHtml;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectAccounts> getProjectAccountses() {
		return this.projectAccountses;
	}

	public void setProjectAccountses(Set<ProjectAccounts> projectAccountses) {
		this.projectAccountses = projectAccountses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectReports> getProjectReportses() {
		return this.projectReportses;
	}

	public void setProjectReportses(Set<ProjectReports> projectReportses) {
		this.projectReportses = projectReportses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Rdevents> getRdeventses() {
		return this.rdeventses;
	}

	public void setRdeventses(Set<Rdevents> rdeventses) {
		this.rdeventses = rdeventses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Taggings> getTaggingses() {
		return this.taggingses;
	}

	public void setTaggingses(Set<Taggings> taggingses) {
		this.taggingses = taggingses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectPosts> getProjectPostses() {
		return this.projectPostses;
	}

	public void setProjectPostses(Set<ProjectPosts> projectPostses) {
		this.projectPostses = projectPostses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectErrors> getProjectErrorses() {
		return this.projectErrorses;
	}

	public void setProjectErrorses(Set<ProjectErrors> projectErrorses) {
		this.projectErrorses = projectErrorses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<FlexibleProjects> getFlexibleProjectses() {
		return this.flexibleProjectses;
	}

	public void setFlexibleProjectses(Set<FlexibleProjects> flexibleProjectses) {
		this.flexibleProjectses = flexibleProjectses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<BalanceTransactions> getBalanceTransactionses() {
		return this.balanceTransactionses;
	}

	public void setBalanceTransactionses(Set<BalanceTransactions> balanceTransactionses) {
		this.balanceTransactionses = balanceTransactionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Rewards> getRewardses() {
		return this.rewardses;
	}

	public void setRewardses(Set<Rewards> rewardses) {
		this.rewardses = rewardses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<DirectMessages> getDirectMessageses() {
		return this.directMessageses;
	}

	public void setDirectMessageses(Set<DirectMessages> directMessageses) {
		this.directMessageses = directMessageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ChannelsProjects> getChannelsProjectses() {
		return this.channelsProjectses;
	}

	public void setChannelsProjectses(Set<ChannelsProjects> channelsProjectses) {
		this.channelsProjectses = channelsProjectses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectNotifications> getProjectNotificationses() {
		return this.projectNotificationses;
	}

	public void setProjectNotificationses(Set<ProjectNotifications> projectNotificationses) {
		this.projectNotificationses = projectNotificationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectReminders> getProjectReminderses() {
		return this.projectReminderses;
	}

	public void setProjectReminderses(Set<ProjectReminders> projectReminderses) {
		this.projectReminderses = projectReminderses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Contributions> getContributionses() {
		return this.contributionses;
	}

	public void setContributionses(Set<Contributions> contributionses) {
		this.contributionses = contributionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<Unsubscribes> getUnsubscribeses() {
		return this.unsubscribeses;
	}

	public void setUnsubscribeses(Set<Unsubscribes> unsubscribeses) {
		this.unsubscribeses = unsubscribeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectBudgets> getProjectBudgetses() {
		return this.projectBudgetses;
	}

	public void setProjectBudgetses(Set<ProjectBudgets> projectBudgetses) {
		this.projectBudgetses = projectBudgetses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<BalanceTransfers> getBalanceTransferses() {
		return this.balanceTransferses;
	}

	public void setBalanceTransferses(Set<BalanceTransfers> balanceTransferses) {
		this.balanceTransferses = balanceTransferses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projects")
	public Set<ProjectTransitions> getProjectTransitionses() {
		return this.projectTransitionses;
	}

	public void setProjectTransitionses(Set<ProjectTransitions> projectTransitionses) {
		this.projectTransitionses = projectTransitionses;
	}

}