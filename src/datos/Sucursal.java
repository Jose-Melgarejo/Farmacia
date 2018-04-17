package datos;

import java.util.Set;

public class Sucursal {
	
	private int				id;
	private Set<Empleado> 	empleados;
	private Domicilio	   	domicilio;
	private Empleado 		encargado;
	
    public Sucursal (Set<Empleado> empleados, Domicilio domicilio, Empleado encargado) {
    	super();
    	this.empleados = empleados;
    	this.domicilio = domicilio;
    	this.encargado = encargado;
    }

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public Set<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Empleado getEncargado() {
		return encargado;
	}

	public void setEncargado(Empleado encargado) {
		this.encargado = encargado;
	}
    
    
}
