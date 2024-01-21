package smswithspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smswithspringrest.pojo.Student;
import smswithspringrest.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student addStudent(Student student) {
		return studentRepository.addStudent(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	public Student getStudentById(long id) {
		return studentRepository.getStudentById(id);
	}

	public Student updateStudent(Student student) {
		Student studentToBeUpdated = studentRepository.getStudentById(student.getId());
		System.out.println(student.getId());
		if (studentToBeUpdated != null) {
			studentToBeUpdated.setName(student.getName());
			studentToBeUpdated.setEmail(student.getEmail());
			studentToBeUpdated.setMobile(student.getMobile());
			studentToBeUpdated.setAge(student.getAge());
			studentRepository.addStudent(studentToBeUpdated);
		}
		return studentToBeUpdated;
	}

	public Student deleteStudent(long id) {
		return studentRepository.deleteStudent(id);
	}

}
