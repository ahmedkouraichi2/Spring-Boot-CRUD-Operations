package edu.polytech.tp1chap7_classroom.Repositories;

import edu.polytech.tp1chap7_classroom.Entities.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface ClassroomRepository extends CrudRepository<Classroom, Integer> {
}
