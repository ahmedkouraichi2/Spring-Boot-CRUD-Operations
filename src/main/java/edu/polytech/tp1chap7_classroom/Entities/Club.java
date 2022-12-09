package edu.polytech.tp1chap7_classroom.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "club")
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ref", nullable = false, unique = true)
    private String ref;

    private String dateCreation;

    @JsonIgnoreProperties
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Student> students  ;


}
