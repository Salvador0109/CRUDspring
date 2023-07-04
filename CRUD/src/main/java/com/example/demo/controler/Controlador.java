package com.example.demo.controler;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.interfaceService.InterfaceAlumnoService;
import com.example.demo.modelo.Alumno;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private InterfaceAlumnoService service;
	
	//Lista todos los alumnos de la tabla.
	@GetMapping("")
	public String listar(Model model) {
		List<Alumno>alumnos=service.listar();
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("alumno", new Alumno());
		return "index";
		
	}
	
	//Registra un nuevo alumno en la base de datos.
	@PostMapping ("/guardar")
	public String guardar(@Validated Alumno a, Model model) {
		service.guardarAlumno(a);
		return "redirect:/";
	}
	
	
	//Primera parte para actualizar, obtiene el id y datos del alumno correspondiente a editar
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Alumno>alumnoOptional=service.listarPorId(id);
		if(alumnoOptional.isPresent()) {
			Alumno alumno = alumnoOptional.get();
			model.addAttribute("alumno", alumno);
		}
		else {
			System.out.print("El alumno no existe");
		}
		return "formularioUpdate";
	}
	
	//Segunda parte para actualizar, los valores anteriores son sustituidos por los valores nuevos.
	@PostMapping ("/guardarUpdate/{id}")
	public String guardarUpdate(@PathVariable int id, @Validated Alumno a,  @ModelAttribute("alumno") Alumno alumnoEditado, Model modelo) {
		Optional<Alumno>alumnoExistente=service.listarPorId(id);

			Alumno alumno = alumnoExistente.get();
			alumno.setNombre(alumnoEditado.getNombre());
			alumno.setAp_materno(alumnoEditado.getAp_paterno());
			alumno.setAp_materno(alumnoEditado.getAp_materno());
			alumno.setActivo(alumnoEditado.getActivo());
			service.guardarAlumno(alumno);
			return "redirect:/";
	}
	
	//Elimina alumno de la base de datos.
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable int id) {
		service.eliminarAlumno(id);
		return "redirect:/";
	}
	
	
	//Buscar un alumno mediante un id dado por el usuario.
	@GetMapping("/buscar")
	public String buscarPorId(@RequestParam("id") int id, Model model) {
		Optional<Alumno>alumnoOptional=service.listarPorId(id);
		if(alumnoOptional.isPresent()) {
			Alumno alumno = alumnoOptional.get();
			model.addAttribute("alumno", alumno);
		}
		else {
			System.out.print("El alumno no existe");
		}
		return "mostrarRegistro";
	}
}

