package com.examen.grupoSalinas.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "alumno" )
@EntityListeners( AuditingEntityListener.class )
public class Alumno {
	
	@Id
	@Column( name = "id_alumno" )
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idAlumno;
	
	@Column( name = "numControl" )
	@NonNull
	private String numControl;
	
	@Column( name = "nombre" )
	@NonNull
	private String nombre;
	
	@Column( name = "apPaterno" )
	@NonNull
	private String apPaterno;
	
	@Column( name = "apMaterno" )
	@NonNull
	private String apMaterno;
	
	@Column( name = "email" )
	@NonNull
	private String email;
	
	@Column( name = "direccion" )
	@NonNull
	private Integer direccionId;
	
	@Column( name = "telefono" )
	@NonNull
	private String telefono;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(Long idAlumno, String numControl, String nombre, String apPaterno, String apMaterno, String email,
			Integer direccionID, String telefono) {
		super();
		this.idAlumno = idAlumno;
		this.numControl = numControl;
		this.nombre = nombre;
		this.apPaterno = apPaterno;
		this.apMaterno = apMaterno;
		this.email = email;
		this.direccionId = direccionId;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumno : [idAlumno=" + idAlumno + ", numControl=" + numControl + ", nombre=" + nombre + ", apPaterno="
				+ apPaterno + ", apMaterno=" + apMaterno + ", email=" + email + ", direccionID=" + direccionId
				+ ", telefono=" + telefono + "]";
	}

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNumControl() {
		return numControl;
	}

	public void setNumControl(String numControl) {
		this.numControl = numControl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDireccionId() {
		return direccionId;
	}

	public void setDireccionID(Integer direccionId) {
		this.direccionId = direccionId;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
