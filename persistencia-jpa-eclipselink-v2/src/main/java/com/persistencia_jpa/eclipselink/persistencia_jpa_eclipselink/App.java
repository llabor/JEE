package com.persistencia_jpa.eclipselink.persistencia_jpa_eclipselink;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import com.persistencia.jpa.DAOservice.ProjectService;
import com.persistencia.jpa.entities.Employee;
import com.persistencia.jpa.entities.Project;

public class App 
{
    public static void main( String[] args )
    {
       
    	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ServiceJPADBcreator" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Employee employee = new Employee( ); 
        employee.setEname( "Gopal" );
        employee.setSalary( 30000 );
        employee.setDeg( "Technical Manager" );
        Project project = new Project();
        project.setPname("ProjectoJEE");
        project.setPduration(1500);
        
        entitymanager.persist( employee );
        entitymanager.persist( project );
        entitymanager.getTransaction( ).commit( );

        entitymanager.close( );
        emfactory.close( );
    }
}
