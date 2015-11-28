package Main;

public class Futbolista {

	private int dorsal;
	private String Nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion,
			Equipo equipo) {
		this.dorsal = dorsal;
		Nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	public Futbolista() {
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public void viajar() {
		System.out.println("Viajo");
	}

	public void concentrarse() {
		System.out.println("Me Concentro");
	}

	public void jugarPartido() {
		System.out.println("Juego Partido");
	}

	@Override
	public String toString() {
		return this.dorsal + " - " + this.Nombre + " - "
				+ this.demarcacion.name() + " - " + this.equipo.getNombreClub();
	}
}
