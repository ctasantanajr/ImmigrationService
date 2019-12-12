/**
 * 
 */
package assignment;

/**
 * @author Claudio Santana - Student nr. 2017180
 *
 */
public class Main {
	
	Main (){
		
		DLL myList = new DLL();
		
		Person p1 = new Person(1, "Claudio", "Santana", 12122019, "FHG1234", PriorityLevel.HIGH);
		Node n1 = new Node(p1);
		
		Person p2 = new Person(2, "Joice", "Scarabeli", 12122019, "FZZ2211", PriorityLevel.HIGH);
		Node n2 = new Node(p2);
		
		Person p3 = new Person(3, "Neusa", "Shan", 12122019, "JJK2785", PriorityLevel.HIGH);
		Node n3 = new Node(p3);
		
		
		myList.addTail(p1);
		myList.addTail(p2);
		myList.addTail(p3);
		
		System.out.println(myList.getHead().getData());
		System.out.println(myList.getTail().getData());
		System.out.println(myList.getSize());
		
		System.out.println("-------------------------------------------------");
		
		Person test = myList.removeHead();
		
		System.out.println("The person served was "+test);
		System.out.println(myList.getHead().getData());
		System.out.println(myList.getTail().getData());
		System.out.println(myList.getSize());
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
