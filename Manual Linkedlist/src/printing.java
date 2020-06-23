public class printing {

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		System.out.println("(1) Here is the list of all elements we inserted at 1st step");
		list.insert(3);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.show();
		System.out.println("........................");
		
		System.out.println("(2) After inserting value '2' at first index position");
		list.insertAtFront(2);
		list.show();
		System.out.println("........................");
	    System.out.println("(3) After inserting value '4', '1' at index positions '0', '2' ");
	    list.insertAt( 2, 4);
	    list.insertAt(0, 1);
	    list.show();
	    System.out.println("........................");
	    System.out.println("(4) After deleting element at index position '6' ");
	    list.deleteAt(6);
	    list.show();

	
	}

}
