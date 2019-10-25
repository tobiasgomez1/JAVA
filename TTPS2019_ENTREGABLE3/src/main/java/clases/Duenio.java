package clases;
import java.util.Set;
import javax.persistence.*;
//@Entity
public class Duenio extends Usuario {
	
	private Set<Mascota> mascotas;
		
	public Set<Mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
}
