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
	
private int level;
	
	PriorityLevel (int level){
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}
	
	
}
