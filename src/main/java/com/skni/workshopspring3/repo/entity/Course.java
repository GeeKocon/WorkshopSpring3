package com.skni.workshopspring3.repo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "yearOfStudy")
    private int yearOfStudy;

    @Column(name = "college")
    private String college;

    @Column(name = "courseType")
    @Enumerated(EnumType.STRING)
    private CourseTypeEnum courseType;

}
