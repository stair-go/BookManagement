package yjx.cs.vo;

/**
 * AdminInfo entity. @author MyEclipse Persistence Tools
 */

public class AdminInfo implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private String adminAccount;
	private String adminPwd;
	private String adminPhoto;

	// Constructors

	/** default constructor */
	public AdminInfo() {
	}

	/** full constructor */
	public AdminInfo(String adminAccount, String adminPwd, String adminPhoto) {
		this.adminAccount = adminAccount;
		this.adminPwd = adminPwd;
		this.adminPhoto = adminPhoto;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminAccount() {
		return this.adminAccount;
	}

	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getAdminPhoto() {
		return this.adminPhoto;
	}

	public void setAdminPhoto(String adminPhoto) {
		this.adminPhoto = adminPhoto;
	}

}