package edu.polytech.tp1chap7_classroom.Entities;

import javax.persistence.Table;

import lombok.*;

import javax.persistence.*;
 import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table (name="classroom")
@Entity
public class Classroom {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    
	    
	    @Column(name = "name", nullable = false, unique = true)
	    private String name;
	    
	    
	    

	    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classroom")
	    private List<Student> students  ;
	    
	    
	    
	    public Classroom(String name) {
	        this.name = name;
	    }

}
