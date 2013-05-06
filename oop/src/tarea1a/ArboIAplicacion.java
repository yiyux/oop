package tarea1a;

public class ArboIAplicacion {

	public static void main(String[] args) {
		Arbol cipres = new Arbol();
		cipres.insertar(34);
		cipres.insertar(45);
		cipres.insertar(9);
		cipres.insertar(1);
		cipres.insertar(22);
		//cipres.insertar(100);
		
		Nodo buscarNodo = cipres.buscar(22);
		if(buscarNodo != null)
			System.out.println("Nodo encontrado con valor: " + buscarNodo.valor);
		else
			System.out.println("Nodo no encontrado");
		
		buscarNodo = cipres.buscarMaximo();
		System.out.println("Valor Maximo: "+ buscarNodo.valor);
		
		buscarNodo = cipres.buscarMinimo();
		System.out.println("Valor Minimo: "+ buscarNodo.valor);
		
		System.out.println("Suma de los valores de los nodos:" + cipres.getSuma());
		
	}

}
