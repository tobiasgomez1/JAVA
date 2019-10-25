package clases;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
public class Veterinario extends Usuario {
	
	private String lugarAtencion;
	
	@Transient
	private Set<Evento> eventos;
	
	@Transient
	private Set<Mascota> mascotas;
	@Transient
	private Set<Turno> turnos;
	private boolean aceptado;
		
	public boolean isAceptado() {
		return aceptado;
	}
	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}
	public Set<Turno> getTurnos() {
		return turnos;
	}
	public void setTurnos(Set<Turno> turnos) {
		this.turnos = turnos;
	}
	public Set<Mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	public Set<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

	public String getLugarAtencion() {
		return lugarAtencion;
	}

	public void setLugarAtencion(String lugarAtencion) {
		this.lugarAtencion = lugarAtencion;
	}
}
