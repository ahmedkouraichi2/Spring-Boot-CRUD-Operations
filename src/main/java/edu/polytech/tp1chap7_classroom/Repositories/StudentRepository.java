package edu.polytech.tp1chap7_classroom.Repositories;

import edu.polytech.tp1chap7_classroom.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
