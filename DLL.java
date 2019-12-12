/**
 * 
 */
package assignment;

/**
 * @author Claudio Santana - Student nr. 2017180
 *
 */
public class DLL {
	
	private Node head = null, tail = null;
	private int size = 0;
	
	//the new object is going to receive just data as parameter
	//because when instantiating a new object, both nodes are
	//being set as "null"
	public void addHead(Person data) {
		Node newNode = new Node(data);
		
		//In order to add a new person, it is necessary to check
		//if the queue is empty 
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}else {
			
			//the previous head receive 
			//now the reference of the new object
			head.setPrevious(newNode); 
			
			//the new object now is pointing to the following object,
			//becoming the new head of the queue
			newNode.setNext(head);
			head = newNode;
			
		}
		
		size++;
	}
	
	public Person removeHead() {
		
		//cheking if the queue is empty
		if (isEmpty()) return null;
		
		Node aux = head;
		
		//checking if there is a next object in the queue
		if (head.getPrevious() != null) {
			
			head = head.getNext();
			head.getPrevious().setNext(null);
			head.setPrevious(null);
			
		}else {
			
			head = null;
			tail = null;
		}
		size--;
		
		return aux.getData();
	}
	
	
	//the new object is going to receive just data as parameter
		//because when instantiating a new object, both nodes are
		//being set as "null"
		public void addTail(Person data) {
			Node newNode = new Node(data);
			
			//In order to add a new person, it is necessary to check
			//if the queue is empty 
			if (isEmpty()) {
				head = newNode;
				tail = newNode;
			}else {
				newNode.setPrevious(tail);
				tail.setNext(newNode);
				tail = newNode;
			}
			
			size++;
		}
		
		public Person removeTail() {
			
			//checking if the queue is empty
			if (isEmpty()) return null;
			
			Node aux = tail;
			
			//checking if there is a next object in the queue
			if (tail.getPrevious() != null) {
				
				tail = tail.getNext();
				tail.getPrevious().setNext(null);
				tail.setPrevious(null);
				
			}else {
				
				head = null;
				tail = null;
			}
			size--;
			
			return aux.getData();
		}

		//method to verify if the list is empty
		private boolean isEmpty() {
			// TODO Auto-generated method stub
			return head == null;
		}

		/**
		 * @return the head
		 */
		public Node getHead() {
			return head;
		}

		/**
		 * @param head the head to set
		 */
		public void setHead(Node head) {
			this.head = head;
		}

		/**
		 * @return the tail
		 */
		public Node getTail() {
			return tail;
		}

		/**
		 * @param tail the tail to set
		 */
		public void setTail(Node tail) {
			this.tail = tail;
		}

		/**
		 * @return the size
		 */
		public int getSize() {
			return size;
		}

		/**
		 * @param size the size to set
		 */
		public void setSize(int size) {
			this.size = size;
		}
		
		

}
