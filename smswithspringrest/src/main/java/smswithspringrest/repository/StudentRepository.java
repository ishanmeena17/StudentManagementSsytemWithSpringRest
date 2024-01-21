package smswithspringrest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import smswithspringrest.pojo.Student;

@Repository
public class StudentRepository {

	@Autowired
	private EntityManager entityManager;

	public Student addStudent(Student student) {
		Persistence.createEntityManagerFactory("product_management").createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents() {
		Query query = entityManager.createQuery("SELECT student FROM Student student");
		return query.getResultList();
	}

	public Student getStudentById(long id) {
		return entityManager.find(Student.class, id);
	}

	public Student deleteStudent(long id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student student = getStudentById(id);
		entityManager.remove(student);
		entityTransaction.commit();
		return student;
	}

}