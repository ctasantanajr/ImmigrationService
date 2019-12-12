/**
 * 
 */
package assignment;

/**
 * @author Claudio Santana - Student nr. 2017180
 *
 */
public class Node {
	
	private Node next;
	private Node previous;
	private Person data;
	/**
	 * @param next
	 * @param previous
	 * @param data
	 */
	private Node(Node next, Node previous, Person data) {
		this.next = next;
		this.previous = previous;
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	/**
	 * @return the previous
	 */
	public Node getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	/**
	 * @return the data
	 */
	public Person getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Person data) {
		this.data = data;
	}
	
	

}
