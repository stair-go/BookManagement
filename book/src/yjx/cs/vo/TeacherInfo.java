package yjx.cs.vo;

/**
 * TeacherInfo entity. @author MyEclipse Persistence Tools
 */

public class TeacherInfo implements java.io.Serializable {

	// Fields

	private Integer tchId;
	private String tchNo;
	private String tchName;
	private String tchPwd;
	private String tchGender;
	private String tchTel;
	private String tchCollege;
	private String tchPhoto;

	// Constructors

	/** default constructor */
	public TeacherInfo() {
	}

	/** full constructor */
	public TeacherInfo(String tchNo, String tchName, String tchPwd,
			String tchGender, String tchTel, String tchCollege, String tchPhoto) {
		this.tchNo = tchNo;
		this.tchName = tchName;
		this.tchPwd = tchPwd;
		this.tchGender = tchGender;
		this.tchTel = tchTel;
		this.tchCollege = tchCollege;
		this.tchPhoto = tchPhoto;
	}

	// Property accessors

	public Integer getTchId() {
		return this.tchId;
	}

	public void setTchId(Integer tchId) {
		this.tchId = tchId;
	}

	public String getTchNo() {
		return this.tchNo;
	}

	public void setTchNo(String tchNo) {
		this.tchNo = tchNo;
	}

	public String getTchName() {
		return this.tchName;
	}

	public void setTchName(String tchName) {
		this.tchName = tchName;
	}

	public String getTchPwd() {
		return this.tchPwd;
	}

	public void setTchPwd(String tchPwd) {
		this.tchPwd = tchPwd;
	}

	public String getTchGender() {
		return this.tchGender;
	}

	public void setTchGender(String tchGender) {
		this.tchGender = tchGender;
	}

	public String getTchTel() {
		return this.tchTel;
	}

	public void setTchTel(String tchTel) {
		this.tchTel = tchTel;
	}

	public String getTchCollege() {
		return this.tchCollege;
	}

	public void setTchCollege(String tchCollege) {
		this.tchCollege = tchCollege;
	}

	public String getTchPhoto() {
		return this.tchPhoto;
	}

	public void setTchPhoto(String tchPhoto) {
		this.tchPhoto = tchPhoto;
	}

}