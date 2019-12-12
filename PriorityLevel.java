/**
 * 
 */
package assignment;

/**
 * @author Claudio Santana - Student nr. 2017180
 *
 */
public enum PriorityLevel {
	
	HIGH (1),
	MEDIUM (2),
	LOW (3);
	
	private int priority;
	
	PriorityLevel(int priority){
		this.priority = priority;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	
	

}
