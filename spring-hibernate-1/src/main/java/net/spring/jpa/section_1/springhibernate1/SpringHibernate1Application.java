package net.spring.jpa.section_1.springhibernate1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SpringHibernate1Application {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.buildSessionFactory();
		
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			
			
			session.getTransaction().commit();
			
			session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sessionFactory.close();
		}
		
	}
}
