package com.persistencia.jpa.DAOservice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import com.persistencia.jpa.DAO.ProjectDAO;
import com.persistencia.jpa.entities.Project;

public class ProjectService implements ProjectDAO {
	
    @PersistenceContext(unitName="ProjectService")
    EntityManager em;
    
	public void createProject(Project project) {
		em.getTransaction( ).begin( );
		em.persist(project);
		em.getTransaction( ).commit( );
		em.close( );
	}

	public Project findProject(int pid) {
		return em.find(Project.class, pid);
	}

	public Project updateProject(int pid, String newName) {
		Project project = em.find(Project.class, pid);
		if (project != null) {
			project.setPname(newName);
		}
		return project;
	}

	public void deleteProject(int pid) {
		Project project = em.find(Project.class, pid);
		em.remove(project);
	}
}



//    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ProjectService" );
//    EntityManager em = emfactory.createEntityManager( );
