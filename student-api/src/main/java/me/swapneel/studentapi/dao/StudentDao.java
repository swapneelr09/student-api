package me.swapneel.studentapi.dao;

import org.springframework.data.repository.CrudRepository;

import me.swapneel.studentapi.model.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {

}
