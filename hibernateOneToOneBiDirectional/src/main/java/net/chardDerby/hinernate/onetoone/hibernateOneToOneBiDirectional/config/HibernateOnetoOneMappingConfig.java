package net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional.entities.Instructor;
import net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional.entities.InstructorDetail;

@Configuration()
@ComponentScan(basePackages="net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional")
public class HibernateOnetoOneMappingConfig {
	
	@Bean(name="sessionFactory")
	public SessionFactory sessionFactory(){
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
		SessionFactory sessionFactory = configuration
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();
		return sessionFactory;
	}
	
	@Bean(name="hibernateSession")
	public Session session(){
		return sessionFactory().getCurrentSession();
	}

}
