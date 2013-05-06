package tarea1a;

public class Arbol {

	private Nodo raiz;
	private int suma = 0; 
	
	public Nodo buscar(int dato){
		Nodo nodoActual = raiz;
		while(nodoActual.valor != dato){
			if(dato < nodoActual.valor)
				nodoActual = nodoActual.izq;
			else
				nodoActual = nodoActual.der;
			if(nodoActual == null){
				return null;
			}
		}
		return nodoActual;
	}
	
	public void insertar(int dato){
		Nodo nuevoNodo = new Nodo(dato);
		if(raiz == null)
			raiz = nuevoNodo;
		else {
			Nodo nodoActual = raiz;
			Nodo nodoPadre;
			while(true){
				nodoPadre = nodoActual;
				if(dato < nodoActual.valor){
					nodoActual = nodoActual.izq;
					if(nodoActual == null){
						nodoPadre.izq = nuevoNodo;
						return;
					}
				} else {
					nodoActual = nodoActual.der;
					if(nodoActual == null){
						nodoPadre.der = nuevoNodo;
						return;
					}
				}
			}
		}
	}
	
	public Nodo buscarMinimo(){
		Nodo nodoActual, nodoUltimo = null;
		nodoActual = raiz;
		while(nodoActual != null){
			nodoUltimo = nodoActual;
			nodoActual = nodoActual.izq;
		}
		return nodoUltimo;
	}
	
	public Nodo buscarMaximo(){
		Nodo nodoActual, nodoMaximo = null;
		nodoActual = raiz;
		while(nodoActual != null){
			nodoMaximo = nodoActual;
			nodoActual = nodoActual.der;
		}
		return nodoMaximo;
	}
	
	private int sumarValores(Nodo nodoActual){
		if(nodoActual != null){
			suma += nodoActual.valor;
			sumarValores(nodoActual.izq);
			sumarValores(nodoActual.der);
		}
		return suma;
	}
	
	public int getSuma(){
		return this.sumarValores(raiz);
	}
	
}
