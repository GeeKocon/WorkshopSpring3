package com.skni.workshopspring3;

import com.skni.workshopspring3.repo.entity.CourseTypeEnum;
import com.skni.workshopspring3.repo.entity.GenderEnum;
import com.skni.workshopspring3.repo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Override
    List<Student> findAll();

    @Override
    Optional<Student> findById(Long id);

    List<Student> findAllByLastName(String lastName);

//    @Query(
//            value = "SELECT distinct s.* FROM student s JOIN course c ON s.course_id = c.id WHERE s.gender = ?1 " +
//                    "AND c.courseType = ?2",
//            nativeQuery = true)
//    List<Student> findAllByGenderAndCAndCourseType(GenderEnum gender, CourseTypeEnum courseType);




}
