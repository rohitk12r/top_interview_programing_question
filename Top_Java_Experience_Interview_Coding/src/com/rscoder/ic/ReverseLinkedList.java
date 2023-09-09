package com.rscoder.ic;

public class ReverseLinkedList {
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

	public void reverse() {
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;

	}

	public static void main(String[] args) {
		ReverseLinkedList node = new ReverseLinkedList();
		node.insert(1);
		node.insert(2);
		node.insert(3);
		node.insert(4);
		node.insert(5);
		node.print();
		node.reverse();
		System.out.println();
		node.print();
	}
}
