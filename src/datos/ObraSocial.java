package datos;

public class ObraSocial {
	private int 	id;
	private String 	nombre;
	private String 	descripcion;
	
	
	public ObraSocial(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "ObraSocial [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
}
