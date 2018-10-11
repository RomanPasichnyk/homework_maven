package ua.logos.homework;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.homework.entity.Company;
import ua.logos.homework.entity.Work;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("homework_maven");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Work work = new Work();
		work.setWorkName("Java Developer");
		work.setSalary(1204);
		em.persist(work);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
		
	}
}
