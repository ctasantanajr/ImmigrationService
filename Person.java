/**
 * 
 */
package assignment;

/**
 * @author Claudio Santana - Student nr. 2017180
 *
 */
public class Person {
	
	private int personId;
	private String firstName;
	private String lastName;
	private int dateOfArrival;
	private int passportNumber;
	private PriorityLevel priorityLevel;
	/**
	 * @param personId
	 * @param firstName
	 * @param lastName
	 * @param dateOfArrival
	 * @param passportNumber
	 * @param priorityLevel
	 */
	private Person(int personId, String firstName, String lastName, int dateOfArrival, int passportNumber,
			PriorityLevel priorityLevel) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfArrival = dateOfArrival;
		this.passportNumber = passportNumber;
		this.priorityLevel = priorityLevel;
	}
	/**
	 * @return the personId
	 */
	public int getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the dateOfArrival
	 */
	public int getDateOfArrival() {
		return dateOfArrival;
	}
	/**
	 * @param dateOfArrival the dateOfArrival to set
	 */
	public void setDateOfArrival(int dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	/**
	 * @return the passportNumber
	 */
	public int getPassportNumber() {
		return passportNumber;
	}
	/**
	 * @param passportNumber the passportNumber to set
	 */
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	/**
	 * @return the priorityLevel
	 */
	public PriorityLevel getPriorityLevel() {
		return priorityLevel;
	}
	/**
	 * @param priorityLevel the priorityLevel to set
	 */
	public void setPriorityLevel(PriorityLevel priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfArrival=" + dateOfArrival + ", passportNumber=" + passportNumber + ", priorityLevel="
				+ priorityLevel + "]";
	}
	
	

}
