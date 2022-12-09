package edu.polytech.tp1chap7_classroom.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nsc;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @JsonIgnoreProperties
    @ManyToOne
    private Classroom classroom = new Classroom();

    @JsonIgnoreProperties
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Club> clubs  ;
}
