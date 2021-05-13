package com.shayekh.springrest.springrest.dao;

import com.shayekh.springrest.springrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseDao extends JpaRepository<Course,Long> {
}
