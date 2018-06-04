package yjx.cs.vo;

/**
 * ClassroomSchedule entity. @author MyEclipse Persistence Tools
 */

public class ClassroomSchedule implements java.io.Serializable {

	// Fields

	private Integer classroomSchedId;
	private CourseInfo courseInfo;
	private String classroom;
	private String classTime;
	private String classWeek;
	private String className;
	private String teacher;
	private Integer maxNumber;
	private Integer selectedNumber;
	private String schoolTerm;

	// Constructors

	/** default constructor */
	public ClassroomSchedule() {
	}

	/** minimal constructor */
	public ClassroomSchedule(String classroom, String classTime,
			String classWeek) {
		this.classroom = classroom;
		this.classTime = classTime;
		this.classWeek = classWeek;
	}

	/** full constructor */
	public ClassroomSchedule(CourseInfo courseInfo, String classroom,
			String classTime, String classWeek, String className,
			String teacher, Integer maxNumber, Integer selectedNumber,
			String schoolTerm) {
		this.courseInfo = courseInfo;
		this.classroom = classroom;
		this.classTime = classTime;
		this.classWeek = classWeek;
		this.className = className;
		this.teacher = teacher;
		this.maxNumber = maxNumber;
		this.selectedNumber = selectedNumber;
		this.schoolTerm = schoolTerm;
	}

	// Property accessors

	public Integer getClassroomSchedId() {
		return this.classroomSchedId;
	}

	public void setClassroomSchedId(Integer classroomSchedId) {
		this.classroomSchedId = classroomSchedId;
	}

	public CourseInfo getCourseInfo() {
		return this.courseInfo;
	}

	public void setCourseInfo(CourseInfo courseInfo) {
		this.courseInfo = courseInfo;
	}

	public String getClassroom() {
		return this.classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getClassTime() {
		return this.classTime;
	}

	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}

	public String getClassWeek() {
		return this.classWeek;
	}

	public void setClassWeek(String classWeek) {
		this.classWeek = classWeek;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Integer getMaxNumber() {
		return this.maxNumber;
	}

	public void setMaxNumber(Integer maxNumber) {
		this.maxNumber = maxNumber;
	}

	public Integer getSelectedNumber() {
		return this.selectedNumber;
	}

	public void setSelectedNumber(Integer selectedNumber) {
		this.selectedNumber = selectedNumber;
	}

	public String getSchoolTerm() {
		return this.schoolTerm;
	}

	public void setSchoolTerm(String schoolTerm) {
		this.schoolTerm = schoolTerm;
	}

}