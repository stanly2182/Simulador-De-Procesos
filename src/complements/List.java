package complements;

import complements.Node;

public class List {
	
	//Nodo de referencia
	private Node start;
	//tamaño de la lista
	private int size;
	
	//constructor para inicializar las variables
	public List() {
		start = null;
		size = 0;
	}
	
	//Metodo para saber si la lista esta vacia
	public boolean isEmpty() {
		return start == null;
	}
	
	//Metodo obtener el tamaño de la lista
	public int getSize() {
		return size;
	}
	
	//Metodo para añadir un elemento al final de la lista
	public void addEnd(Object value) {
		Node newNode = new Node();
		
		newNode.setValue(value);
		
		if (isEmpty()) {
			start = newNode;
		}
		else {
			Node auxiliary = start;
			while (auxiliary.getNext() != null) {
				auxiliary = auxiliary.getNext();
			}
			auxiliary.setNext(newNode);
		}
		size++;
	}
	
	//Metodo para añadir un elemento en un lugar determinado de la lista
	public void addByPosition(int position, Object value) {
		if(position >= 0 && position <= size) {
			Node newNode = new Node();
			newNode.setValue(value);
			
			if(position == 0) {
				newNode.setNext(start);
				start = newNode;
			}
			else {
				if(position == size) {
					Node auxiliary = start;
					while (auxiliary.getNext() != null) {
						auxiliary = auxiliary.getNext();
					}
					auxiliary.setNext(newNode);
				}
				else {
					Node auxiliary = start;
					
					for (int i = 0; i < (position-1); i++) {
						auxiliary = auxiliary.getNext();
					}
					Node next = auxiliary.getNext();
					auxiliary.setNext(newNode);
					newNode.setNext(next);
				}
			}
			size++;
		}
	}
	
	// Metodo para eliminar elementos de una lista
	public void delete(int position) {
		if(position >= 0 && position <= size) {
			Node auxiliary = start;
			if(position == 0) {
				auxiliary = start.getNext();
				start.setValue(null);
				start.setNext(null);
				start = auxiliary;
			}
			else {
				Node auxiliary2 = null;
				for (int i = 0; i <= (position-1); i++) {
					auxiliary2 = auxiliary;
					auxiliary = auxiliary.getNext();
				}
				auxiliary2.setNext(auxiliary.getNext());
				auxiliary.setNext(null);
				auxiliary.setValue(null);
			}
			size--;
		}
	}
	
	//Metodo para modificar elementos en la lista
    public void modify(int position , Object value){
    	
        if(position>=0 && position<size){            
            if(position == 0){
                start.setValue(value);
            }
            else{
                Node auxiliary = start;
                for (int i = 0; i < position; i++) {
                    auxiliary = auxiliary.getNext();
                }
                
                auxiliary.setValue(value);
            }
        }
    }
    
    //Metodo para eliminar la lista
    public void deleteList() {
    	Node auxiliary;
    	while (start.getNext() != null) {
    		auxiliary = start.getNext();
    		start.setNext(null);
    		start.setValue(null);
    		start = auxiliary;
    	}
    	start.setValue(null);
    	size = 0;
    }	
}
