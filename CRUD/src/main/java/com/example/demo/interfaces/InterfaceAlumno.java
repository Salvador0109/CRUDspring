package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Alumno;

@Repository
public interface InterfaceAlumno extends CrudRepository<Alumno, Integer>{

}
