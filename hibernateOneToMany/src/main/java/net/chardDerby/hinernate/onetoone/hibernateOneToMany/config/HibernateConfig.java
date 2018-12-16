package net.chardDerby.hinernate.onetoone.hibernateOneToMany.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities.Course;
import net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities.Instructor;
import net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities.InstructorDetail;

@Configurable
@ComponentScan(basePackages="net.chardDerby.hinernate.onetoone.hibernateOneToMany")
public class HibernateConfig {
	
	@Bean(name="hibernateSessionFactory")
	public SessionFactory sessionFactory(){
		return configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Instructor.class)
		.addAnnotatedClass(InstructorDetail.class)
		.addAnnotatedClass(Course.class)
		.buildSessionFactory();
		
	}
	
	@Bean(name="hibernateConfiguration")
	public Configuration configuration(){
		return new Configuration();
	}
	
	@Bean(name="hibernateSession")
	public Session session(){
		return sessionFactory().getCurrentSession();
	}
	
}
