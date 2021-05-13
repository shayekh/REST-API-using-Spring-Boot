package com.shayekh.springrest.springrest.service;

import com.shayekh.springrest.springrest.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public  void deleteCourse(long parseLong);
}
