package com.skni.workshopspring3;

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

    @Query(
            value = "SELECT distinct s.* FROM student s JOIN course c ON s.address_id = c.id WHERE p.gender = ?1 " +
                    "AND c.country = ?2",
            nativeQuery = true)
    List<Student> findAllByGenderAndCAndCourseType();


}
