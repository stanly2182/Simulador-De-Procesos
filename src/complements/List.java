package complements;

import complements.Node;

public class List {
	
	private Node start;
	private int size;
	
	public List() {
		start = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int getSize() {
		return size;
	}
	
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
	
    public void editarPorPosicion(int position , Object value){
    	
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

	
}
