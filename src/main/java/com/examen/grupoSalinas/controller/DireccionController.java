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
import com.examen.grupoSalinas.model.Direccion;
import com.examen.grupoSalinas.repository.DireccionRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/api/domicilios")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})
public class DireccionController {

	@Autowired
	private DireccionRepository service;
	
	@GetMapping("/listarDomicilios")
	public List<Direccion> getDomicilios() {
		return service.findAllByOrderByIdDireccion();
	}
	
	@GetMapping("/{idDireccion}")
	public Direccion findDireccionByID( @PathVariable Long idDireccion ) {
		return  service.findByIdDireccion(idDireccion);
	}
	
	@PostMapping("/saveDireccion")
	public Direccion saveDireccion( @RequestBody Direccion direccion ) {
		return service.save(direccion);
	}
	
	@PutMapping("/updateDireccion/{idDireccion}")
	public Direccion updateDireccionByIdDireccion( @PathVariable Long idDireccion, @RequestBody Direccion prmtDireccion ) {
		
		 Direccion direccion = findDireccionByID(idDireccion);

	        if ( direccion != null ) {
	        	
	        	direccion.setCalle( prmtDireccion.getCalle() );
	        	direccion.setColonia( prmtDireccion.getColonia() );
	        	direccion.setCiudad( prmtDireccion.getCiudad() );

	        } else {
	        	direccion = new Direccion();
	        	direccion.setCalle( prmtDireccion.getCalle() );
	        	direccion.setColonia( prmtDireccion.getColonia() );
	        	direccion.setCiudad( prmtDireccion.getCiudad() );
	        }
	        
		return service.save(direccion);
	}
	
	@DeleteMapping("/{idDireccion}")
	@Transactional
	public void deleteDomicilioById( @PathVariable Long idDireccion ) {
		this.service.deleteDireccionByIdDireccion(idDireccion);
	}
	
	
}
