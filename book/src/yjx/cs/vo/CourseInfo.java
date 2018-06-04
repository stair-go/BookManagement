package yjx.cs.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * CourseInfo entity. @author MyEclipse Persistence Tools
 */

public class CourseInfo implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private String courseNo;
	private String courseName;
	private String courseCategory;
	private Double courseCredit;
	private Integer totalHours;
	private Set studentVolunteers = new HashSet(0);
	private Set classroomSchedules = new HashSet(0);

	// Constructors

	/** default constructor */
	public CourseInfo() {
	}

	/** minimal constructor */
	public CourseInfo(String courseNo, String courseName,
			String courseCategory, Double courseCredit, Integer totalHours) {
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.courseCredit = courseCredit;
		this.totalHours = totalHours;
	}

	/** full constructor */
	public CourseInfo(String courseNo, String courseName,
			String courseCategory, Double courseCredit, Integer totalHours,
			Set studentVolunteers, Set classroomSchedules) {
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.courseCredit = courseCredit;
		this.totalHours = totalHours;
		this.studentVolunteers = studentVolunteers;
		this.classroomSchedules = classroomSchedules;
	}

	// Property accessors

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseNo() {
		return this.courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategory() {
		return this.courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public Double getCourseCredit() {
		return this.courseCredit;
	}

	public void setCourseCredit(Double courseCredit) {
		this.courseCredit = courseCredit;
	}

	public Integer getTotalHours() {
		return this.totalHours;
	}

	public void setTotalHours(Integer totalHours) {
		this.totalHours = totalHours;
	}

	public Set getStudentVolunteers() {
		return this.studentVolunteers;
	}

	public void setStudentVolunteers(Set studentVolunteers) {
		this.studentVolunteers = studentVolunteers;
	}

	public Set getClassroomSchedules() {
		return this.classroomSchedules;
	}

	public void setClassroomSchedules(Set classroomSchedules) {
		this.classroomSchedules = classroomSchedules;
	}

}