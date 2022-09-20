package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;
//    List<Course> courses = new ArrayList<>(
//            Arrays.asList(
//                    new Course(1,"DSA","Algorithm and data stucture"),
//                    new Course(2,"DBMS","Learn about Database")
//            )
//    );


    //Get the list of courses
    @GetMapping("/listCourses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    //Get the course information
    @GetMapping("/course/{id}")
    public  Course getCourse(@PathVariable Integer id)
    {
        return courseRepository.findById(id).get();
    }

    //Add new Course
    @PostMapping("/course")
    public List<Course> addCourse(@RequestBody Course course){
        courseRepository.save(course);
        return  courseRepository.findAll();
    }

   
}
