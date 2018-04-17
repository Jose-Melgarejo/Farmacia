package datos;

import java.util.GregorianCalendar;

public class Afiliado {
	private int 				id;
	private int 				numafiliado;
	private ObraSocial 			obrasocial;
	private GregorianCalendar 	fecafiliacion;
	
	public Afiliado(int numafiliado, ObraSocial obrasocial, GregorianCalendar fecafiliacion) {
		super();
		this.numafiliado = numafiliado;
		this.obrasocial = obrasocial;
		this.fecafiliacion = fecafiliacion;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public int getNumafiliado() {
		return numafiliado;
	}

	public void setNumafiliado(int numafiliado) {
		this.numafiliado = numafiliado;
	}

	public ObraSocial getObrasocial() {
		return obrasocial;
	}

	public void setObrasocial(ObraSocial obrasocial) {
		this.obrasocial = obrasocial;
	}

	public GregorianCalendar getFecafiliacion() {
		return fecafiliacion;
	}

	public void setFecafiliacion(GregorianCalendar fecafiliacion) {
		this.fecafiliacion = fecafiliacion;
	}

	@Override
	public String toString() {
		return "Afiliado [id=" + id + ", numafiliado=" + numafiliado + ", obrasocial=" + obrasocial + ", fecafiliacion="
				+ fecafiliacion + "]";
	}
	
	
}
