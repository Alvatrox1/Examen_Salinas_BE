package com.examen.grupoSalinas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.examen.grupoSalinas.model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Long>{
	
	
	Direccion findByIdDireccion( @Param("idDireccion") Long idDireccion );
	List<Direccion> findAllByOrderByIdDireccion();
	void deleteDireccionByIdDireccion( @Param("idDireccion") Long idDireccion );


}
