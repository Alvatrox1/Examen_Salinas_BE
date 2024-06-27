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
@Table ( name = "direccion" )
@EntityListeners( AuditingEntityListener.class )
public class Direccion {
	
	@Id
	@Column( name = "id_direccion" )
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idDireccion;
	
	@Column( name = "calle" )
	@NonNull
	private String calle;
	
	@Column( name = "colonia" )
	@NonNull
	private String colonia;
	
	@Column( name = "ciudad" )
	@NonNull
	private String ciudad;
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}

	public Direccion(Long idDireccion, String calle, String colonia, String ciudad) {
		super();
		this.idDireccion = idDireccion;
		this.calle = calle;
		this.colonia = colonia;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Direccion : [idDireccion=" + idDireccion + ", calle=" + calle + ", colonia=" + colonia + ", ciudad="
				+ ciudad + "]";
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	

}
