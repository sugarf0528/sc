public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	public LinkedList() {
		tail = null;
		size = 0;
	}

	class Node {
		Node next = null;
		Node prev = null;
		int data;

		Node(int data) {
			this.data = data;
		}
	}

	//从上面插入
	public void add(int item) {
		Node node = new Node(item);

		if (tail == null) {
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}


	//打印输出链表
	public void printItems() {
		Node temp = this.tail;
		System.out.print(temp.data);

	}
}


