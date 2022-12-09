package edu.polytech.tp1chap7_classroom.Repositories;

import edu.polytech.tp1chap7_classroom.Entities.Classroom;
import edu.polytech.tp1chap7_classroom.Entities.Club;
import edu.polytech.tp1chap7_classroom.Entities.Student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClubRepository extends CrudRepository<Club, Integer> {
	  // B.5
    @Query("select c, count(c.students) from Club c group by c.students")
    Iterable<Object[]> studentsPerClub();


    // B.4
    @Query("select count(c) from Club c where c = :club")
    Long studentCountPerClub(@Param("club") Club club);

    // B.2
    @Query("select c from Club c having max (c.students)")
    Club bestclub();

    // B.3
    @Query("select c from Club c having min (c.students)")
    Club worstClub();

    // B.6
    @Query("select c from Club c where :s in (c.students)")
    Iterable<Club> findClubByStudents(@Param("s") Student s);
}
