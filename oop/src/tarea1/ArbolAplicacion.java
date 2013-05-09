package tarea1;

public class ArbolAplicacion {

	public static void main(String[] args) {
		
		Arbol pino = new Arbol(new Nodo(5));
		pino.insertar(new Nodo(10), pino.getRaiz());
		pino.insertar(new Nodo(15), pino.getRaiz());
		pino.insertar(new Nodo(2), pino.getRaiz());
		pino.insertar(new Nodo(3), pino.getRaiz());
		pino.insertar(new Nodo(1), pino.getRaiz());
		pino.insertar(new Nodo(50), pino.getRaiz());
		pino.insertar(new Nodo(25), pino.getRaiz());
		pino.insertar(new Nodo(12), pino.getRaiz());
		pino.insertar(new Nodo(5), pino.getRaiz());
		
		if(pino.buscar(25, pino.getRaiz())){
			System.out.println("Valor Emncontrado");
		} else {
			System.out.println("Valor NO Emncontrado");
		}
		
		Arbol cedro = new Arbol(pino.buscarMin());
		Arbol cipres = new Arbol(pino.buscarMax());
		
	}

}
