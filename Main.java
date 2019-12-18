/**
 * 
 */
package assignment;

import java.util.Scanner;

/**
 * @author Claudio Santana - Student nr. 2017180
 *
 */
public class Main {

	static Scanner sc = new Scanner(System.in);
	static Boolean run = true;
	static DLL myList = new DLL();
	static int personId = 0;

	Main() {


		Welcome();

		// this while loop builds up the menu of the system, utilising the I/O class
		// scanner to receive the input from the user
		while (run) {

			System.out.println("**********************************************************************");
			System.out.println("              Please Select From The Following Options:               ");
			System.out.println("**********************************************************************");

			System.out.println("Enter 1 to list the queue");
			System.out.println("Enter 2 to call the next person from the queue");
			System.out.println("Enter 3 to add a person to the system");
			System.out.println("Enter 4 to delete a person from the system");
			System.out.println("Enter 5 to search the position of a person in the queue");
			System.out.println("Enter 6 to quit without saving");

			int answer = sc.nextInt();

			// this conditional switch executes blocks of methods in regards to the option
			// typed by the user. After executing the whole block of commands it breaks and
			// print off the option menu again
			switch (answer) {

			case 1:
				PrintList(myList.getHead());
				break;

			case 2:
				Person call = myList.removeHead();
				System.out.println("The person to be called is " + call);
				break;

			case 3:
				AddPerson();
				break;

			case 4:
				System.out.println("Under construction");
				break;

			case 5:
				System.out.println("Under construction");
				break;


			case 6:
				EndProgram();
				break;

			}
		}
		System.exit(0);

	}

	// ------------------------------------------------------------------
	// METHOD TO ADD A PERSON TO THE SYSTEM
	// ------------------------------------------------------------------

	// this method add a new method to the list of items. Before that, it
	// instantiates a new object with all attributes received from the user
	private static void AddPerson() {
		// TODO Auto-generated method stub

		String firstName, lastName, passport;
		int dateOfArrival;
		PriorityLevel priority;

		personId++;

		System.out.println("Enter First Name: ");
		firstName = sc.next();

		System.out.println("Enter Last Name: ");
		lastName = sc.next();

		System.out.println("Enter Date of Arrival (ddmmyyy): ");
		dateOfArrival = sc.nextInt();

		System.out.println("Enter Passport Number: ");
		passport = sc.next();

		priority = ValidPriority();

		Person person = new Person(personId, firstName, lastName, dateOfArrival, passport, priority);
		
		
		//Checking priorities to add the person in the right position in the queue
		if (priority == PriorityLevel.LOW) {
			
			myList.addTail(person);
		}else if (priority == PriorityLevel.MEDIUM) {
			
			myList.addMedium(person);
			
		}else {
			myList.addHead(person);
		}

		

	}

	// ------------------------------------------------------------------
	// METHOD TO VALID ENTERED PRIORITY LEVEL
	// ------------------------------------------------------------------

	// this method just consists the option typed by the user with the correct media
	// format created in the enum
	private static PriorityLevel ValidPriority() {
		// TODO Auto-generated method stub

		PriorityLevel priority = null;

		try {

			boolean valid = false;

			do {
				System.out.println("Enter Priority Level: (1 - High, 2 - Medium, 3 - Low)");
				String option = sc.next();

				if (option.matches("[0-9]+")) {
					if (Integer.parseInt(option) == 1 || Integer.parseInt(option) == 2
							|| Integer.parseInt(option) == 3) {
						valid = true;
						if (option.equals("1")) {
							priority = PriorityLevel.HIGH;
						} else if (option.equals("2")) {
							priority = PriorityLevel.MEDIUM;
						} else if (option.equals("3")) {
							priority = PriorityLevel.LOW;
						} else {
							ValidPriority();
						}
					} else {
						valid = false;
						System.out.println("Invalid option");
					}
				}

			} while (valid == false);

		} catch (Exception e) {
			System.out.println("Error reading input");
		}

		return priority;

	}

	// ------------------------------------------------------------------
	// METHOD TO PRINT ALL THE QUEUE
	// ------------------------------------------------------------------

	// This function prints contents of linked list starting from the first node
	public void PrintList(Node node) {
		Node last = null;
		System.out.println("List of people in the queue:");
		while (node != null) {
			System.out.println(node.getData().toString() + " ");
			last = node;
			node = node.getNext();
		}
		
	}

	// --------------------------------------------------------------------
	// METHOD TO WELCOME USER
	// --------------------------------------------------------------------

	private static void Welcome() {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to Immigration Service Appointment System!");
		System.out.println();

	}

	// ------------------------------------------------------------------
	// ENDING THE PROGRAM
	// ------------------------------------------------------------------

	public static void EndProgram() {

		System.out.println("Thanks for using Immigration Service Appointment System!");
		System.exit(0);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
