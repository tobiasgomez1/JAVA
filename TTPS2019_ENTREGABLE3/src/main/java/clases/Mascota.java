package clases;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//@Entity
public class Mascota {
	//@Id @GeneratedValue
	private Long id;
	
	//@ManyToOne
	//@JoinColumn(name="id")
	private Veterinario veterinario;
	
	private Duenio dueño;
	
	//@ManyToOne
	private Especie especie;
	
	//@OneToMany(mappedBy="mascota")
	private Set <Evento> eventos;
	
	//@OneToOne(mappedBy="mascota")
	private Ficha ficha;
	
	private String nombre;
	private Date fechaNac;
	private String sexo;
	private String color;
	private String señas;
	private String foto;
	private boolean aceptado;
	
	public boolean isAceptado() {
		return aceptado;
	}
	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}
	public Set<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}
	public Ficha getFicha() {
		return ficha;
	}
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	public Especie getEspecie() {
		return especie;
	}
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}
	public Duenio getDueño() {
		return dueño;
	}
	public void setDueño(Duenio dueño) {
		this.dueño = dueño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSeñas() {
		return señas;
	}
	public void setSeñas(String señas) {
		this.señas = señas;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
