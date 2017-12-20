package com.persistencia.jpa.DAO;

import com.persistencia.jpa.entities.Project;

public interface ProjectDAO {

	public void createProject(Project project);
	public Project findProject(int pid);
	public Project updateProject(int pid, String newName);
	public void deleteProject(int pid);
	
}
