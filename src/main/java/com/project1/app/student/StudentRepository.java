package com.project1.app.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//Reponsible for data access
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	//SELECT * FROM student 
	@Query("SELECT s FROM Student s WHERE s.email = ?1")
	Optional<Student> findStudentByEmail(String email);
}
