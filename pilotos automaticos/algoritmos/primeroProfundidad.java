package algoritmos;

import java.util.Vector;


public class primeroProfundidad implements algoritmo {

	estado inicial;
	estado objetivo;
	Vector abiertos;
	Vector cerrados;

	public primeroProfundidad() {
		super();
		// TODO Auto-generated constructor stub
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
			// no basta con == hay que hacer equals
	}

	/* 1. Si el estado inicial es el objetivo, salir y retornar �xito.
	   2. Sino, haga lo siguiente hasta que se obtenga se�al de �xito o fracaso:
	         1. Genere un sucesor E del estado inicial. Si no hay m�s sucesores, retorne con se�al de fracaso.
	         2. Llame recursivamente al algoritmo, esta vez con E como el estado inicial.
	         3. Si la se�al es �xito, retorne, de otra manera, contin�e en este lazo.
	*/
	
	public void resolver( estado ei, estado ef){
	}
}
