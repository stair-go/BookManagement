package yjx.cs.vo;

/**
 * StudentVolunteer entity. @author MyEclipse Persistence Tools
 */

public class StudentVolunteer implements java.io.Serializable {

	// Fields

	private Integer stuVolunteerId;
	private StudentInfo studentInfo;
	private CourseInfo courseInfo;
	private String stuVolunteer;
	private String selectionResult;

	// Constructors

	/** default constructor */
	public StudentVolunteer() {
	}

	/** full constructor */
	public StudentVolunteer(StudentInfo studentInfo, CourseInfo courseInfo,
			String stuVolunteer, String selectionResult) {
		this.studentInfo = studentInfo;
		this.courseInfo = courseInfo;
		this.stuVolunteer = stuVolunteer;
		this.selectionResult = selectionResult;
	}

	// Property accessors

	public Integer getStuVolunteerId() {
		return this.stuVolunteerId;
	}

	public void setStuVolunteerId(Integer stuVolunteerId) {
		this.stuVolunteerId = stuVolunteerId;
	}

	public StudentInfo getStudentInfo() {
		return this.studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	public CourseInfo getCourseInfo() {
		return this.courseInfo;
	}

	public void setCourseInfo(CourseInfo courseInfo) {
		this.courseInfo = courseInfo;
	}

	public String getStuVolunteer() {
		return this.stuVolunteer;
	}

	public void setStuVolunteer(String stuVolunteer) {
		this.stuVolunteer = stuVolunteer;
	}

	public String getSelectionResult() {
		return this.selectionResult;
	}

	public void setSelectionResult(String selectionResult) {
		this.selectionResult = selectionResult;
	}

}