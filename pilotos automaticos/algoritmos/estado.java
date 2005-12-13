package algoritmos;
import java.util.Vector;
import mapa.tablero;

public class estado {
	
	int x;	//representamos el abin con sus coordenadas
	int y;
	estado padre;

	public estado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public estado(int x, int y) {
		super();
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public estado getPadre() {
		return padre;
	}

	public void setPadre(estado padre) {
		this.padre = padre;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public estado moverArriba(){
		estado arriba = new estado (x, y+1);
		return arriba;
	}

	public estado moverAbajo(){
		estado arriba = new estado (x, y-1);
		return arriba;
	}
	
	public estado moverDerecha(){
		estado arriba = new estado (x+1, y);
		return arriba;
	}
	
	public estado moverIzquierda(){
		estado arriba = new estado (x-1, y);
		return arriba;
	}
	
	public boolean peligro(){
		tablero t = new tablero (5,5);
		if ( (this.y <= t.getY()) || (this.x <= t.getX()) )
			return true;
		else
			return false;	
	}
	
	public Vector generarCamino(estado ei){
		estado e = this;
		Vector aux = new Vector();
		while (!(e.equals(ei))){
			aux.add(0,e.padre);
			e = e.padre;
		}
		return aux;
	}
}
