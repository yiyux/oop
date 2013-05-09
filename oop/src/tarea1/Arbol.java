package tarea1;

public class Arbol {
	private Nodo raiz;
	
	Arbol(Nodo raiz){
		this.raiz = raiz;
	}
	
	public Nodo getRaiz(){
		return raiz;
	}
	
	public void insertar(Nodo nuevoNodo, Nodo raiz){
		if(raiz != null){
			if(raiz.getValor() != nuevoNodo.getValor()){
				if(raiz.getValor() > nuevoNodo.getValor()){
					if(raiz.getIzq() == null){
						raiz.setIzq(nuevoNodo);
					} else {
						insertar(nuevoNodo, raiz.getIzq());
					}
				} else {
					if(raiz.getDer() == null){
						raiz.setDer(nuevoNodo);
					} else {
						insertar(nuevoNodo, raiz.getDer());
					}
				}			
			}
		} else {
			raiz = nuevoNodo;
		}
	}
	
	public boolean buscar(int valor, Nodo raiz){
		if(raiz.getValor() == valor){
			return true;
		} else {
			if(raiz.getValor() > valor){
				buscar(valor, raiz.getIzq());
			} else {
				buscar(valor, raiz.getDer());
			}
		}
		return false;
	}

	public Nodo buscarMax(){
		Nodo buscarNodo = raiz;
		if(buscarNodo.getDer() == null){
			return buscarNodo;
		} else {
			while(true){
				buscarNodo = buscarNodo.getDer();
				if(buscarNodo.getDer() == null)
					return buscarNodo;
			}
		}
	}
	
	public Nodo buscarMin(){
		Nodo buscarNodo = raiz;
		if(buscarNodo.getIzq() == null){
			return buscarNodo;
		} else {
			while(true){
				buscarNodo = buscarNodo.getIzq();
				if(buscarNodo.getIzq() == null)
					return buscarNodo;
			}
		}
	}
	
}
