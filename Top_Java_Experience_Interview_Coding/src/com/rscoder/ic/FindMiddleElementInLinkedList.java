package com.rscoder.ic;

public class FindMiddleElementInLinkedList {
	private Node head;

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
	}

	public int getSize() {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public void findMiddleElement() {
		if (head != null) {
			int len = getSize();
			Node temp = head;
			int middleLength = len / 2;
			while (middleLength != 0) {
				temp = temp.next;
				middleLength--;
			}
			System.out.println("Middle Element : " + temp.value);
		}

	}

	public static void main(String[] args) {
		FindMiddleElementInLinkedList node = new FindMiddleElementInLinkedList();
		node.insert(1);
		node.insert(2);
		node.insert(3);
		node.insert(4);
		node.insert(5);
		node.findMiddleElement();
	}

}
