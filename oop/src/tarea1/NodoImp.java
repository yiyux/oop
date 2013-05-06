package tarea1;

public class NodoImp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Nodo arbol = new Nodo (10);
		arbol.addHoja(new Nodo(9));
		//arbol.dibujarNodo(arbol);
		arbol.addHoja(new Nodo(12));
		arbol.addHoja(new Nodo(50));
		arbol.addHoja(new Nodo(1));
		arbol.dibujarNodo(arbol);

	}

}
