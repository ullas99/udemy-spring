package net.chardDerby.hinernate.onetoone.hibernateOneToMany;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import net.chardDerby.hinernate.onetoone.hibernateOneToMany.config.HibernateConfig;
import net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities.Course;
import net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities.Instructor;
import net.chardDerby.hinernate.onetoone.hibernateOneToMany.entities.InstructorDetail;

public class HibernateOneToManyApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		
		Session session = context.getBean("hibernateSession", Session.class);
		session.beginTransaction();
		
		Instructor ushaInstructor = new Instructor();
		ushaInstructor.setFirstName("USHA");
		ushaInstructor.setLastName("Poojary");
		ushaInstructor.setEmail("usha.poojary@abcd.com");
		
		InstructorDetail ushaDetail = new InstructorDetail();
		ushaDetail.setHobby("cooking");
		ushaDetail.setYouTubeChannel("ushaCookingyouttube");
		
		
		ushaInstructor.setInstructorDetail(ushaDetail);
		
		Course course = new Course();
		course.setTitle("My Cooking");
		
		
		ushaInstructor.getCourses().add(course);
		course.setInstructor(ushaInstructor);
		
		session.persist(ushaInstructor);
		
		session.getTransaction().commit();
		
		System.out.println("Saved Instructor "+ushaInstructor);
		
		session.close();
		((AbstractApplicationContext) context).close();
	}

}

