package simae.core.lib;


public class AnotacionMarca implements Comparable<AnotacionMarca> {
	private int fila;
	private int posicionEnFila;
	private String marca;
	private String inicioComentario = "/*/";
	private String finComentario = "/*/";

	public AnotacionMarca(int f, int p, String m) {
		fila = f;
		posicionEnFila = p;
		marca = m;
	}
	
	public AnotacionMarca(int f, int p, String m, String ic, String fc) {
		fila = f;
		posicionEnFila = p;
		marca = m;
		inicioComentario = ic;
		finComentario = fc;
	}
	
	public void setFila(int f) {
		fila = f;
	}
	
	public int getFila() {
		return fila;
	}
	
	public void setPosicion(int f) {
		posicionEnFila = f;
	}
	
	public int getPosicion() {
		return posicionEnFila;
	}
	
	public void setMarca(String m) {
		marca = m;
	}
	
	public String getMarca() {
		return marca;
	}
	
	@Override
	public String toString() {
		return getFila() + " " + getMarca() ;
	}
	
	public String getTexto() {
		return getInicioComentario() + getMarca() + getFinComentario();
	}
	
	//FIXME: inicioComentario y finComentario deben ser distintos
	public String getInicioComentario() {
		return inicioComentario;
	}
	
	public String getFinComentario() {
		return finComentario;
	}
	
	@Override
	public int compareTo(AnotacionMarca otraMarca) {
		if(this.fila > otraMarca.fila) return 1;
		else if(this.fila < otraMarca.fila) return -1;
		else {
			if(this.posicionEnFila < otraMarca.posicionEnFila) return -1;
			else return 0;
		}
	}
}
