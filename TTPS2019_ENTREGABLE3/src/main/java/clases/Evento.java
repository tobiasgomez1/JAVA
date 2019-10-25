package clases;
import java.util.Date;
import javax.persistence.*;

//@MappedSuperclass
public abstract class Evento {
	
	//@Id @GeneratedValue
	//@Column(name="id")
	private Long id;
	
	//@ManyToOne
	//@JoinColumn(name="id")
	private Veterinario veterinario;
	
	//@ManyToOne
	//@JoinColumn(name="id")
	private Mascota mascota;
	
	private Date fecha;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
