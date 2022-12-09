package edu.polytech.tp1chap7_classroom.RestControlers;


import edu.polytech.tp1chap7_classroom.Entities.Student;
import edu.polytech.tp1chap7_classroom.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/students")
public class StudentRestControler {

    @Autowired
    private StudentRepository studentRespository;

    //Get All Students from Database
    @GetMapping("/all")
    private Iterable<Student> getAllStudents(){
        return studentRespository.findAll();
    }

    @PostMapping("/add")
    private Student addStudent(@RequestBody Student student)
    {
        return studentRespository.save(student);
    }

    @PutMapping("/update/{id}")
    private Student updateStudentById ( @RequestBody Student student
            , @PathVariable Integer id ){
        Student ancien = new Student();
        ancien =   studentRespository.findById(id).get();
        if(ancien != null){
            ancien.setNsc(student.getNsc());
            ancien.setEmail(student.getEmail());
        return studentRespository.save(ancien);
        }else
            return null;

    }



}
