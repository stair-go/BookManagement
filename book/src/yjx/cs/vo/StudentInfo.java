package yjx.cs.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * StudentInfo entity. @author MyEclipse Persistence Tools
 */

public class StudentInfo implements java.io.Serializable {

	// Fields

	private Integer stuId;
	private String stuNo;
	private String stuName;
	private String stuPwd;
	private String stuGender;
	private String stuCollege;
	private String stuMajor;
	private String stuClass;
	private Integer schoolSystem;
	private String stuLevel;
	private String stuNativePlace;
	private String stuTel;
	private String stuEmail;
	private String stuIdNumber;
	private String stuPhoto;
	private Set studentVolunteers = new HashSet(0);

	// Constructors

	/** default constructor */
	public StudentInfo() {
	}

	/** minimal constructor */
	public StudentInfo(String stuNo, String stuName, String stuPwd,
			String stuGender, String stuCollege, String stuMajor,
			String stuClass, Integer schoolSystem, String stuLevel,
			String stuNativePlace, String stuTel, String stuEmail,
			String stuIdNumber, String stuPhoto) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.stuGender = stuGender;
		this.stuCollege = stuCollege;
		this.stuMajor = stuMajor;
		this.stuClass = stuClass;
		this.schoolSystem = schoolSystem;
		this.stuLevel = stuLevel;
		this.stuNativePlace = stuNativePlace;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
		this.stuIdNumber = stuIdNumber;
		this.stuPhoto = stuPhoto;
	}

	/** full constructor */
	public StudentInfo(String stuNo, String stuName, String stuPwd,
			String stuGender, String stuCollege, String stuMajor,
			String stuClass, Integer schoolSystem, String stuLevel,
			String stuNativePlace, String stuTel, String stuEmail,
			String stuIdNumber, String stuPhoto, Set studentVolunteers) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.stuGender = stuGender;
		this.stuCollege = stuCollege;
		this.stuMajor = stuMajor;
		this.stuClass = stuClass;
		this.schoolSystem = schoolSystem;
		this.stuLevel = stuLevel;
		this.stuNativePlace = stuNativePlace;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
		this.stuIdNumber = stuIdNumber;
		this.stuPhoto = stuPhoto;
		this.studentVolunteers = studentVolunteers;
	}

	// Property accessors

	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuPwd() {
		return this.stuPwd;
	}

	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}

	public String getStuGender() {
		return this.stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public String getStuCollege() {
		return this.stuCollege;
	}

	public void setStuCollege(String stuCollege) {
		this.stuCollege = stuCollege;
	}

	public String getStuMajor() {
		return this.stuMajor;
	}

	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	public String getStuClass() {
		return this.stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public Integer getSchoolSystem() {
		return this.schoolSystem;
	}

	public void setSchoolSystem(Integer schoolSystem) {
		this.schoolSystem = schoolSystem;
	}

	public String getStuLevel() {
		return this.stuLevel;
	}

	public void setStuLevel(String stuLevel) {
		this.stuLevel = stuLevel;
	}

	public String getStuNativePlace() {
		return this.stuNativePlace;
	}

	public void setStuNativePlace(String stuNativePlace) {
		this.stuNativePlace = stuNativePlace;
	}

	public String getStuTel() {
		return this.stuTel;
	}

	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}

	public String getStuEmail() {
		return this.stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuIdNumber() {
		return this.stuIdNumber;
	}

	public void setStuIdNumber(String stuIdNumber) {
		this.stuIdNumber = stuIdNumber;
	}

	public String getStuPhoto() {
		return this.stuPhoto;
	}

	public void setStuPhoto(String stuPhoto) {
		this.stuPhoto = stuPhoto;
	}

	public Set getStudentVolunteers() {
		return this.studentVolunteers;
	}

	public void setStudentVolunteers(Set studentVolunteers) {
		this.studentVolunteers = studentVolunteers;
	}

}