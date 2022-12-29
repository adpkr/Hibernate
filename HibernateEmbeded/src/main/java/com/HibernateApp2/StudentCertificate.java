package com.HibernateApp2;

import javax.persistence.Embeddable;

@Embeddable
public class StudentCertificate {

	private String Course;
	private String Duration;
	
	
	public StudentCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentCertificate(String course, String duration) {
		super();
		Course = course;
		Duration = duration;
	}


	public String getCourse() {
		return Course;
	}


	public void setCourse(String course) {
		Course = course;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		Duration = duration;
	}


	@Override
	public String toString() {
		return "Certificate [Course=" + Course + ", Duration=" + Duration + "]";
	}
	
	
}
