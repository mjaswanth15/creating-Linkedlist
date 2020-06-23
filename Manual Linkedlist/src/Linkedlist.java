
public class Linkedlist {
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			}
			
		}
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);			
	}
	public void insertAtFront(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index == 0) {
			insertAtFront(data);
		}
		else {
		Node n = head;
		for(int i = 0; i < index-1; i++) {
			n = n.next;			
		}

		node.next = n.next;
		n.next = node;
		}
	}
	public void deleteAt(int index) {
		if(index == 0) {
		head = head.next;
		}
		else {
			Node n = head;
			Node n1 = null;
			for(int i = 0; i<index-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}
	}
