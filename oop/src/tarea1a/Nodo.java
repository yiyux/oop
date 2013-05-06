package tarea1a;

public class Nodo {

	int		valor;
	Nodo	izq;
	Nodo	der;
	
	Nodo(){
		this.izq = this.der = null;
	}
	
	Nodo(int dato){
		this.valor = dato;
		this.izq = this.der = null;
	}
	
}
