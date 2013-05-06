package tarea1;

public class Nodo {
	int		valor;
	Nodo	izq;
	Nodo	der;
	
	Nodo (int valor){
		this.valor = valor;
		this.izq = null;
		this.der = null;
	}
	
	public void addHoja(Nodo izq, Nodo der){
		if(this.izq == null && this.der == null){
			if(izq.valor >= der.valor && izq.valor >= this.valor){
				int tmp;
				tmp = this.valor;
				this.valor = izq.valor;
				izq.valor = tmp;
			} 
			if (der.valor >= this.valor && der.valor >= izq.valor) {
				int tmp;
				tmp = this.valor;
				this.valor = der.valor;
				der.valor = tmp;
			}			
			if(izq.valor >= der.valor){
				this.der = der;
				this.izq = izq;
			} else {
				this.der = izq;
				this.izq = der;
			}
		}
	}
	
	public void addHoja(Nodo nuevoNodo){
		// Caso Base: el nodo es el primero en ser insertado o el ultimo
		int tmp;
		if(this.izq == null && this.der == null){
			if(nuevoNodo.valor > this.valor){
				tmp = this.valor;
				this.valor = nuevoNodo.valor;
				nuevoNodo.valor = tmp;				
			}
			this.izq = nuevoNodo;
		} else {
			if(this.der == null){
				if(nuevoNodo.valor > this.valor){
					Nodo nodoAux = new Nodo(this.izq.valor);
					this.der = nodoAux;
					tmp = this.valor;
					this.izq.valor = tmp;
					this.valor = nuevoNodo.valor;
				} else {
					if(nuevoNodo.valor > this.izq.valor){
						this.der = this.izq;
						this.izq = nuevoNodo;
					} else{
						this.der = nuevoNodo;
					}
				}
			} else {
				// Aca comienza la recursividad
				if(nuevoNodo.valor > this.valor){
					tmp = this.valor;
					this.valor = nuevoNodo.valor;
					nuevoNodo.valor = tmp;
					addHoja(nuevoNodo);
				} else {
					if(nuevoNodo.valor > this.izq.valor){
						tmp = this.izq.valor;
						this.izq.valor = nuevoNodo.valor;
						nuevoNodo.valor = tmp;
						addHoja(nuevoNodo);
					} else {
						if(nuevoNodo.valor > this.der.valor){
							tmp = this.der.valor;
							this.der.valor = nuevoNodo.valor;
							nuevoNodo.valor = tmp;
							addHoja(nuevoNodo);
						} else {
							Nodo nodoAux = this.izq;
							nodoAux.izq = nuevoNodo;
						}
					}
				}
			}
		}
	}
	
	public void dibujarNodo(Nodo nodo){
		if(nodo.izq == null && nodo.der == null){
			System.out.println("[ " + nodo.valor + " ]");
		} else {
			System.out.print("[ " + nodo.valor + " ]");
			dibujarNodo(nodo.izq);
			if(nodo.der != null){
				dibujarNodo(nodo.der);
			}
		}
		
	}

}