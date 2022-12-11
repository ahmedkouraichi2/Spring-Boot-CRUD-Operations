package edu.polytech.tp1chap7_classroom.RestControlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.polytech.tp1chap7_classroom.Entities.Club;
import edu.polytech.tp1chap7_classroom.Repositories.ClubRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/clubs")
class ClubRestControler {
	
	 @Autowired ClubRepository clubRepository ;
	
	  @GetMapping("/all")
	  private Iterable<Club> getAllClubs(){
		return clubRepository.findAll();
		 
	}
	  
	  @PostMapping("/add")
	  private Club addClub(@RequestBody Club club) {
		   return  clubRepository.save(club);
	  }
	  
	  
	  
	  @PutMapping("/update/{id}")
	  private Club updateClubById(@RequestBody Club club, @PathVariable Integer id) {
		   Club ancien = new Club();
		   ancien = clubRepository.findById(id).get();
		   
		   if(ancien != null) {
			    ancien.setRef(club.getRef());
			    ancien.setStudents(club.getStudents());
			    ancien.setDateCreation(club.getDateCreation());
			    return clubRepository.save(ancien);
		   }else {
			    return null;
		   }
		   
		   
	  }
	  
	  
	  @DeleteMapping("/delete/{id}")
	   private void deleteClassroomById(@PathVariable Integer id) {
		   clubRepository.deleteById(id);
	  }

}
