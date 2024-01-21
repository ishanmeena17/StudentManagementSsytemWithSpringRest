package smswithspringrest.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import smswithspringrest.pojo.Admin;

@Repository
public class AdminRespository {
	@Autowired
	private EntityManager entityManager;

	public  Admin addAdmin(Admin admin) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(admin);
         entityTransaction.commit();
         return admin;
	}

}
