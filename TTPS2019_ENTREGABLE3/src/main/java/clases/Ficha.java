package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//@Entity
public class Ficha {
	//@Id @GeneratedValue
	private Long id;
	
	//@OneToOne
	private Mascota mascota;
	
	private boolean nombre;
	private boolean fechaNac;
	private boolean sexo;
	private boolean color;
	private boolean se�as;
	public boolean isNombre() {
		return nombre;
	}
	public void setNombre(boolean nombre) {
		this.nombre = nombre;
	}
	public boolean isFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(boolean fechaNac) {
		this.fechaNac = fechaNac;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public boolean isSe�as() {
		return se�as;
	}
	public void setSe�as(boolean se�as) {
		this.se�as = se�as;
	}
	
}
