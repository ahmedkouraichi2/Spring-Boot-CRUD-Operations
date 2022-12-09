package edu.polytech.tp1chap7_classroom.RestControlers;


import edu.polytech.tp1chap7_classroom.Entities.Club;
import edu.polytech.tp1chap7_classroom.Repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/clubs")
public class ClubRestControler {

    @Autowired
    private ClubRepository clubRepository;

    @GetMapping("/all")
    private Iterable<Club> getAllClubs(){
        return clubRepository.findAll();
    }

    @PostMapping("/add")
    private Club addClub(@RequestBody Club club)
    {
        return clubRepository.save(club);
    }

    @PutMapping("/update/{id}")
    private Club updateClubById ( @RequestBody Club club
            , @PathVariable Integer id ){
        Club ancien = new Club();
        ancien =   clubRepository.findById(id).get();
        if(ancien != null){
            ancien.setRef(club.getRef());
            ancien.setStudents(club.getStudents());
            ancien.setDateCreation(club.getDateCreation());
            return clubRepository.save(ancien);
        }else
            return null;

    }

    @DeleteMapping("/delete/{id}")
    private void deleteClassroomById (@PathVariable Integer id ) {
        clubRepository.deleteById(id);
    }



}
