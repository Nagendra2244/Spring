package com.SpringJPA1;

import javax.persistence.Persistence;

import com.SpringJPA.EntityManager;
import com.SpringJPA.EntityManagerFactory;
import com.SpringJPA.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 
             EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
             EntityManager entityManager = entityManagerFactory.createEntityManager();
      
             // create a new user
             entityManager.getTransaction().begin();1
             User user = new User();
             user.setName("arun");
             user.setEmail("arun@example.com");
             entityManager.persist(user);
             entityManager.getTransaction().commit();
      
            /* // fetch all users
             Query query = entityManager.createQuery("SELECT u FROM User u");
             List<User> users = query.getResultList();
             for (User u : users) {
                 System.out.println(u.getName());
             }
      
             // fetch user by email
             Query queryByEmail = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email");
             queryByEmail.setParameter("email", "eedekarunakar@example.com");
             User userByEmail = (User) queryByEmail.getSingleResult();
             System.out.println("Name:"+userByEmail.getName());
      */
             entityManager.close();
             entityManagerFactory.close();
         }
      
     }