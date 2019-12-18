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
	
	
	// ------------------------------------------------------------------
	// METHOD TO ADD HIGH PRIORITY TO THE HEAD OF THE QUEUE
	// ------------------------------------------------------------------

	// the new object is going to receive just data as parameter
	// because when instantiating a new object, both nodes are
	// being set as "null"
	public void addHead(Person data) {

		Node newNode = new Node(data);

		// In order to add a new person, it is necessary to check
		// if the queue is empty
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {

			// If p is less than or equal front
			// node's priority, then insert at
			// the front.
			if (newNode.getData().getPriorityLevel().getLevel() < head.getData().getPriorityLevel().getLevel()) {
				head.setPrevious(newNode);
				newNode.setNext(head);
				head = newNode;
			}

			// If p is more rear node's priority,
			// then insert after the rear.
			else if (newNode.getData().getPriorityLevel().getLevel() == tail.getData().getPriorityLevel().getLevel()) {
				newNode.setPrevious(tail);
				tail.setNext(newNode);
				tail = newNode;
			}

			// Handle other cases
			else {

				// Find position where we need to
				// insert.
				Node start = head.getNext();

				if (start == tail) {

					(tail.getPrevious()).setNext(newNode);
					newNode.setNext(tail);
					newNode.setPrevious(tail.getPrevious());
					tail.setPrevious(newNode);

				} else {

					while (start.getData().getPriorityLevel().getLevel() == PriorityLevel.HIGH.getLevel()) {

						start = start.getNext();

					}

					if (start == tail) {

						(tail.getPrevious()).setNext(newNode);
						newNode.setNext(tail);
						newNode.setPrevious(tail.getPrevious());
						tail.setPrevious(newNode);

					} else {

						(start.getPrevious()).setNext(newNode);
						newNode.setNext(start);
						newNode.setPrevious(start.getPrevious());
						start.setPrevious(newNode);
					}

				}

			}

		}

		size++;
	}
	
	
	// ------------------------------------------------------------------
	// METHOD TO REMOVE THE HEAD OF THE QUEUE
	// ------------------------------------------------------------------

	public Person removeHead() {

		// checking if the queue is empty
		if (isEmpty())
			return null;

		Node aux = head;

		// checking if there is a next object in the queue
		if (head.getNext() != null) {

			head = head.getNext();
			head.getPrevious().setNext(null);
			head.setPrevious(null);

		} else {

			head = null;
			tail = null;
		}

		size--;

		return aux.getData();
	}

	
	// ------------------------------------------------------------------
	// METHOD TO ADD LOW PRIORITY TO THE QUEUE
	// ------------------------------------------------------------------
	
	// the new object is going to receive just data as parameter
	// because when instantiating a new object, both nodes are
	// being set as "null"
	public void addTail(Person data) {
		Node newNode = new Node(data);

		// In order to add a new person, it is necessary to check
		// if the queue is empty
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail = newNode;
		}

		size++;
	}
	
	
	// ------------------------------------------------------------------
	// METHOD TO REMOVE PEOPLE FROM THE BACK OF THE QUEUE
	// ------------------------------------------------------------------

	public Person removeTail() {

		// checking if the queue is empty
		if (isEmpty())
			return null;

		Node aux = tail;

		// checking if there is a next object in the queue
		if (tail.getPrevious() != null) {

			tail = tail.getNext();
			tail.getPrevious().setNext(null);
			tail.setPrevious(null);

		} else {

			head = null;
			tail = null;
		}
		size--;

		return aux.getData();
	}

	
	// ------------------------------------------------------------------
	// METHOD TO ADD MEDIUM PRIORITY TO THE QUEUE
	// ------------------------------------------------------------------
	
	public void addMedium(Person data) {

		Node newNode = new Node(data);

		// In order to add a new person, it is necessary to check
		// if the queue is empty
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {

			// If p is less than or equal front
			// node's priority, then insert at
			// the front.
			if (newNode.getData().getPriorityLevel().getLevel() < head.getData().getPriorityLevel().getLevel()) {
				head.setPrevious(newNode);
				newNode.setNext(head);
				head = newNode;
			}

			// If p is more rear node's priority,
			// then insert after the rear.
			else if (newNode.getData().getPriorityLevel().getLevel() >= tail.getData().getPriorityLevel().getLevel()) {
				newNode.setPrevious(tail);
				tail.setNext(newNode);
				tail = newNode;
			}

			// Handle other cases
			else {

				// Find position where we need to
				// insert.
				Node start = head.getNext();

				if (start == tail) {

					(tail.getPrevious()).setNext(newNode);
					newNode.setNext(tail);
					newNode.setPrevious(tail.getPrevious());
					tail.setPrevious(newNode);

				} else {

					while (start.getData().getPriorityLevel().getLevel() < PriorityLevel.LOW.getLevel()) {

						start = start.getNext();

					}

					if (start == tail) {

						(tail.getPrevious()).setNext(newNode);
						newNode.setNext(tail);
						newNode.setPrevious(tail.getPrevious());
						tail.setPrevious(newNode);

					} else {

						(start.getPrevious()).setNext(newNode);
						newNode.setNext(start);
						newNode.setPrevious(start.getPrevious());
						start.setPrevious(newNode);
					}

				}

			}

		}

		size++;

	}

	// method to verify if the list is empty
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
	 * @param head
	 *            the head to set
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
	 * @param tail
	 *            the tail to set
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
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

}
