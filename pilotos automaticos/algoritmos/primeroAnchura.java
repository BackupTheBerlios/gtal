package algoritmos;
import java.util.Vector;

public class primeroAnchura implements algoritmo {
	
	estado inicial;
	estado objetivo;
	Vector abiertos;
	Vector cerrados;
	Vector camino;
	
	public primeroAnchura() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public primeroAnchura(estado inicial, estado objetivo) {
		super();
		// TODO Auto-generated constructor stub
		this.inicial = inicial;
		this.objetivo = objetivo;
		this.abiertos = new Vector();
		this.cerrados = new Vector();
		this.camino = new Vector();
	}


	public Vector getCamino() {
		return camino;
	}

	public void setCamino(Vector camino) {
		this.camino = camino;
	}

	public Vector getAbiertos() {
		return abiertos;
	}

	public void setAbiertos(Vector abiertos) {
		this.abiertos = abiertos;
	}

	public estado getInicial() {
		return inicial;
	}

	public void setInicial(estado inicial) {
		this.inicial = inicial;
	}

	public estado getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(estado objetivo) {
		this.objetivo = objetivo;
	}
	public Vector getCerrados() {
		return cerrados;
	}

	public void setCerrados(Vector cerrados) {
		this.cerrados = cerrados;
	}
	
	public boolean comprobarObjetivo(estado eo){
		return true;
			// no basta con == hay que hacer equalsTo()
	}

	public void generarSucesor(estado e){
		if (!e.moverArriba().peligro()) {
			abiertos.add(e.moverArriba());
		}
		if (!e.moverDerecha().peligro()) {
			abiertos.add(e.moverDerecha());
		}
		if (!e.moverIzquierda().peligro()) {
			abiertos.add(e.moverIzquierda());
		}
		if (!e.moverAbajo().peligro()) {
			abiertos.add(e.moverAbajo());
		}
	}
	
	
	/* 1.Crear una variable NODE_LIST y ponerla al estado inicial.
	   2. Hasta que se encuentre el objetivo o hasta que NODE_LIST est vaca haga lo siguiente:
	         1. Eliminar el primer elemento de NODE_LIST, y llamarlo E. Si NODE_LIST estuvo vaca, salir.
	         2. Para cada forma en que cada regla puede ajustarse al estado descrito en E, haga lo siguiente:
	               1. Aplicar la regla para generar un nuevo estado.
	               2. Si el nuevo estado es un estado objetivo, salir y retornar este estado.
	               3. Sino, aada el nuevo estado al final de NODE_LIST.
	*/

	public void resolver( estado ei, estado ef){
		estado actual = new estado();
		abiertos = new Vector();
		abiertos.add(inicial);
		actual = (estado)abiertos.firstElement();
		while (!abiertos.isEmpty() && (!actual.equals(objetivo))){
			abiertos.removeElement(abiertos.firstElement());
			cerrados.add(actual);
			generarSucesor(actual);
		}
		if (actual.equals(objetivo)){
			camino = actual.generarCamino(ei);
		}
	}
	
	
}
