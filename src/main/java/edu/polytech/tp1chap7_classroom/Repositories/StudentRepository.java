package edu.polytech.tp1chap7_classroom.Repositories;

import org.springframework.data.repository.CrudRepository;

import edu.polytech.tp1chap7_classroom.Entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
