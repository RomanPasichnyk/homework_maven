package ua.logos.homework;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.homework.entity.Company;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("homework_maven");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Company company = new Company();
		company.setNameCompany("Logos");
		company.setWorkers(1250);
		em.persist(company);
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
		
	}
}
