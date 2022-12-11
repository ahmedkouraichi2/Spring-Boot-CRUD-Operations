package edu.polytech.tp1chap7_classroom.Repositories;

import org.springframework.data.repository.CrudRepository;

import edu.polytech.tp1chap7_classroom.Entities.Classroom;

public interface ClassroomRepository  extends CrudRepository<Classroom,Integer>{
	

}
