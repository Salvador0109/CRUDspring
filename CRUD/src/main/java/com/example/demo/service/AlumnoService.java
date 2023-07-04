package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.InterfaceAlumnoService;
import com.example.demo.interfaces.InterfaceAlumno;
import com.example.demo.modelo.Alumno;

@Service
public class AlumnoService implements InterfaceAlumnoService {

	@Autowired
	private InterfaceAlumno data;
	
	@Override
	public List<Alumno> listar() {
		return (List<Alumno>)data.findAll();
	}

	@Override
	public Optional<Alumno> listarPorId(int id) {
		return data.findById(id);
	}

	@Override
	public int guardarAlumno(Alumno a) {
		int res=0;
		Alumno alumno = data.save(a);
		if(!alumno.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminarAlumno(int id) {
		data.deleteById(id);
	}

	@Override
	public Alumno actualizarAlumno(Alumno alumno) {
		return data.save(alumno);
	}





}
