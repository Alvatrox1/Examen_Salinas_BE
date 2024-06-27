package com.examen.grupoSalinas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen.grupoSalinas.model.Alumno;
import com.examen.grupoSalinas.repository.AlumnoRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/alumno")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})
public class AlumnoController {
	
	@Autowired
	private AlumnoRepository service;
	
	@GetMapping("/home")
	public String welcome() {
		return "Hola Bienvenido Joven Internauta!.";
	}
	
	@GetMapping("/listarAlumnos")
	public List<Alumno> getAlumnos() {
		return this.service.findAllByOrderByIdAlumno();
	}
	
	@GetMapping("/idAlumno/{idAlumno}")
	public Alumno getAlumnoByIdAlumno(@PathVariable("idAlumno") Long idAlumno ) {
		return this.service.findByIdAlumno( idAlumno );
	}
	
	@GetMapping("/apPaterno/{apPaterno}")
	public Alumno getAlumnoByApPaterno( @PathVariable("apPaterno") String apPaterno) {
		return this.service.findByApPaterno(apPaterno);
	}
	
	@GetMapping("/numControl/{numControl}")
	public Alumno getAlumnoByNumControl( @PathVariable("numControl") String numControl ) {
		return this.service.findByNumControl(numControl);
	}
	
	@PostMapping("/guardarAlumno")
	public Alumno addAlumno( @RequestBody Alumno alumno) {
		return this.service.save(alumno);
	}
	
	@PutMapping("/updateAlumno/{idAlumno}")
	public Alumno updateAlumno( @PathVariable Long idAlumno, @RequestBody Alumno alumno ) {
		return this.service.save(alumno);
	}
	
	@DeleteMapping("/{idAlumno}")
	@Transactional
	public void deleteAlumnoById( @PathVariable Long idAlumno) {
		this.service.deleteAlumnoByIdAlumno(idAlumno);
	}
	
	
}
