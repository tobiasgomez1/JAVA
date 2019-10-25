package clases;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class Especie {
	//@Id @GeneratedValue
	private Long id;
	
	private String nombre;
	private Set<Raza> raza;

	public Set<Raza> getRaza() {
		return raza;
	}

	public void setRaza(Set<Raza> raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
