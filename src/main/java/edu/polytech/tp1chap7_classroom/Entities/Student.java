package edu.polytech.tp1chap7_classroom.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "student")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer id;
	
	
	
	private String ncs;
	
	
	
	private String email ;
	
	
	
	@ManyToOne
	@JsonIgnoreProperties
	private Classroom  classroom;
	
	
	
	
	@JsonIgnoreProperties
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Club> clubs ;
	
	

}
