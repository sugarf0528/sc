public class LinkedList {
	private Node head, tail;
	private int size = 0;

	public LinkedList() {
		head = tail = null;
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

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	//从头部插入
	public void add(int item) {
		Node node = new Node(item);

		if (size == 0) {
			tail = head = node;
		} else {
			tail.next=node;
			tail=tail.next;
		}
		size++;
	}

	//从尾部删除
	public void pop() {

		if (size == 0) {
			throw new IllegalArgumentException("无法从空队列中出队");
		}
		Node item = head;
		head = head.next;
		item.next = null;

		if (head == null) {
			tail = null;
		}//特殊情况：出队后队列变空
		size--;
	}


	//打印输出链表
	public void printItems() {
		Node item = this.head;
		while (item != null) {
			System.out.println(item.data);
			item = item.next;
		}
	}
}

