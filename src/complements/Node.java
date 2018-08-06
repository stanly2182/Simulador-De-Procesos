package complements;

//Clase para el manejo de nodos para la implementacion de lista
public class Node {
	
	//variable en la que se va a guardar el valor del nodo
	private Object value;
	//variable para enlazar nodos
	private Node next;
	
	//constructor para inicializar los valores de las variables
	public Node() {
		this.value = 0;
		this.next = null;
	}
	
	//metodos set y get para los atributos

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
