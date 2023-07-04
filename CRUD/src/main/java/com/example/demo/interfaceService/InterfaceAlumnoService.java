package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Alumno;

public interface InterfaceAlumnoService {
	//Listar a todos los alumnos.
	public List <Alumno>listar();
	
	//Obtener un alumno especifico con id como parametro.
	public Optional<Alumno>listarPorId(int id);
	
	//Guardar un alumno.
	public int guardarAlumno(Alumno a);
	
	//Eliminar un alumno.
	public void eliminarAlumno(int id);

	//Actualizar datos de un alumno.
	public Alumno actualizarAlumno(Alumno alumno);
	

	
}
