package com.skni.workshopspring3.repo.service;

import com.skni.workshopspring3.CourseRepository;
import com.skni.workshopspring3.repo.entity.Course;
import com.skni.workshopspring3.repo.entity.CourseTypeEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course addCourse(String name, int yearOfStudy, String college, CourseTypeEnum courseType) {
        Course course = Course.builder()
                .name(name)
                .yearOfStudy(yearOfStudy)
                .college(college)
                .courseType(courseType)
                .build();

        return courseRepository.save(course);
    }
}
