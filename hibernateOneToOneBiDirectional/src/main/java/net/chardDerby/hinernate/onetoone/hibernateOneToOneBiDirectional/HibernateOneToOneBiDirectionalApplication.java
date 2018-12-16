package net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional.config.HibernateOnetoOneMappingConfig;
import net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional.entities.Instructor;
import net.chardDerby.hinernate.onetoone.hibernateOneToOneBiDirectional.entities.InstructorDetail;

public class HibernateOneToOneBiDirectionalApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateOnetoOneMappingConfig.class);
		Session hibernateSession = context.getBean("hibernateSession",Session.class);
		try{
			/*hibernateSession.beginTransaction();
			Instructor ushaInstructor = new Instructor("Usha", "Poojary", "usha.poojary@email.com");
			InstructorDetail detail = new InstructorDetail("ushaYouTube", "cleaning");
			ushaInstructor.setInstructorDetail(detail);
			
			hibernateSession.save(ushaInstructor);
			
			System.out.println("AFter saving "+ushaInstructor);
			
			hibernateSession.getTransaction().commit();*/
			
			hibernateSession.beginTransaction();
			int instructorDetailId = 1;
			
			InstructorDetail userDetail = hibernateSession.get(InstructorDetail.class, instructorDetailId);
			System.out.println("Retrieved Detail "+userDetail);
			userDetail.getInstructor().setInstructorDetail(null);
			hibernateSession.delete(userDetail);
			hibernateSession.getTransaction().commit();
		}
		catch(Exception exc)
		{
			
		}
		finally {
			/*hibernateSession.close();*/
			
		}
		
		
		
		
	}

}

