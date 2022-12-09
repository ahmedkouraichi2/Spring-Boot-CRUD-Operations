package edu.polytech.tp1chap7_classroom.RestControlers;


import edu.polytech.tp1chap7_classroom.Entities.Classroom;
import edu.polytech.tp1chap7_classroom.Entities.Student;
import edu.polytech.tp1chap7_classroom.Repositories.ClassroomRepository;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/classrooms")
public class ClassroomRestControler {

    @Autowired
    private ClassroomRepository classroomRepository;

    @GetMapping("/all")
    private Iterable<Classroom> getAllClassrooms(){
        return classroomRepository.findAll();
    }

    @PostMapping("/add")
    private Classroom addClassroom(@RequestBody Classroom classroom)
    {
        return classroomRepository.save(classroom);
    }

    @PutMapping("/update/{id}")
    private Classroom updateClassroomById ( @RequestBody Classroom classroom
            , @PathVariable Integer id ){
        Classroom ancien = new Classroom();
        ancien =   classroomRepository.findById(id).get();
        if(ancien != null){
            ancien.setName(classroom.getName());
            ancien.setStudents(classroom.getStudents());
            return classroomRepository.save(ancien);
        }else
            return null;

    }

    @DeleteMapping("/delete/{id}")
    private void deleteClassroomById (@PathVariable Integer id ) {
        classroomRepository.deleteById(id);
    }



}
