package com.examen.grupoSalinas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.examen.grupoSalinas.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	
	Alumno findByIdAlumno( @Param("idAlumno") Long idAlumno );
	Alumno findByNumControl( @Param("numControl") String numControl );
	Alumno findByApPaterno( @Param("apPaterno") String apPaterno );
	List<Alumno> findAllByOrderByIdAlumno();
	void deleteAlumnoByIdAlumno( @Param("idAlumno") Long idAlumno );

}
