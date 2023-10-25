package com.example.demo.dto;

import java.util.Objects;

public class PersonaDTO {
	
	String nombre;
	int edad;
	String domicilio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public PersonaDTO(String nombre, int edad, String domicilio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
	}
	public PersonaDTO() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(domicilio, edad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaDTO other = (PersonaDTO) obj;
		return Objects.equals(domicilio, other.domicilio) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "PersonaDTO [nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + "]";
	}
		
}
