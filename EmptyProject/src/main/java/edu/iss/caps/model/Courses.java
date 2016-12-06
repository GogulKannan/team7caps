package edu.iss.caps.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")

public class Courses {
	@Id
	@Column(name = "CourseId")
	private String courseId;
	@Basic(optional = false)
	@Column(name = "CourseName")
	private String courseName;
	@Column(name = "Credits")
	private int credits;
	@Column(name = "StartDate")
	private Date startDate;
	@Column(name = "CurrentEnrollment")
	private int currentEnrollment;
	
	@OneToOne (mappedBy="course")
	private LecturerDetails lecturerDetails; 
	
	@OneToMany (mappedBy="courses")
	private List<StudentCourses> studentCourses = new ArrayList<StudentCourses>();
	
	public Courses(){
		
	}

	

	public Courses(String courseId, String courseName, int credits, Date startDate, int currentEnrollment,
			LecturerDetails lecturerDetails, List<StudentCourses> studentCourses) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
		this.startDate = startDate;
		this.currentEnrollment = currentEnrollment;
		this.lecturerDetails = lecturerDetails;
		this.studentCourses = studentCourses;
	}

	public String getCourseId() {
		return courseId;
	}



	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public int getCredits() {
		return credits;
	}



	public void setCredits(int credits) {
		this.credits = credits;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public int getCurrentEnrollment() {
		return currentEnrollment;
	}



	public void setCurrentEnrollment(int currentEnrollment) {
		this.currentEnrollment = currentEnrollment;
	}



	public LecturerDetails getLecturerDetails() {
		return lecturerDetails;
	}



	public void setLecturerDetails(LecturerDetails lecturerDetails) {
		this.lecturerDetails = lecturerDetails;
	}



	public List<StudentCourses> getStudentCourses() {
		return studentCourses;
	}



	public void setStudentCourses(List<StudentCourses> studentCourses) {
		this.studentCourses = studentCourses;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Courses other = (Courses) obj;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		return true;
	}
	
}
