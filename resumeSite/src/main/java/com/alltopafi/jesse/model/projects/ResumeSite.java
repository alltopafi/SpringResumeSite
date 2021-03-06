package com.alltopafi.jesse.model.projects;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ResumeSite extends Project{

	private int grade;
	private List<String> teamMembers;
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public List<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
}
