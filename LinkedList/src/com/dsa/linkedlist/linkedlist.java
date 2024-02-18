package com.dsa.linkedlist;

public class linkedlist {
	private ListNode head;

	public boolean hasloop() {
		ListNode slowptr = head, fastptr = head;
		while (slowptr != null && fastptr != null && fastptr.getNext() != null) {
			slowptr = slowptr.getNext();
			fastptr = fastptr.getNext().getNext();
			if (slowptr == fastptr) {
				return true;
			}

		}
		return false;

	}

	public void create(int data) {
		ListNode newNode = createNewNode(data);

		if (head == null) {
			head = newNode;

		} else {
			ListNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	private ListNode createNewNode(int data) {
		ListNode newNode = new ListNode();
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}

	public void reverse() {
		ListNode prevNode = null, nextNode = null;
		while (head != null) {
			nextNode = head.getNext();
			head.setNext(prevNode);
			prevNode = head;
			head = nextNode;
		}
		head = prevNode;
	}

	public void insertAtBeginning(int data) {
		ListNode newNode = createNewNode(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void insertAtEnd(int data) {
		ListNode newNode = createNewNode(data);

		if (head == null) {
			head = newNode;
		} else {
			ListNode p = head;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(newNode);
		}

	}

	public void insertAtmiddle(int position, int data) {
		ListNode newNode = createNewNode(data);

		if (head == null) {
			head = newNode;
		} else if (position == 0) {
			ListNode temp = head;
			temp.setNext(temp);
			head = temp;

		} else {
			ListNode temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);

		}
	}

	public void traverse() {
		ListNode currentnode = head;
		while (currentnode != null) {
			System.out.println(currentnode.getData());
			System.out.println(currentnode.getNext());
			currentnode = currentnode.getNext();
		}
	}

	public void removeAtBeginning() {
		ListNode temp = head;
		if (temp != null) {
			head = temp.getNext();
			temp.setNext(null);
		}
	}

	public void removematching(int data) {
		ListNode p = head;
		if (head.getData() == data) {
			p = head;
			head = p.getNext();
			return;
		}
		ListNode q = head;
		while (q.getNext() != null) {
			if (q.getNext().getData() == data) {
				p = q.getNext();
				q.setNext(p.getNext());
				return;
			}
			q = q.getNext();

		}

	}

	public void clearlist() {
		head = null;
	}

	public void nthNodeAtEnding(int n) {
		ListNode nthNode = null, temp = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		for (int i = 1; i < n; i++) {
			if (temp != null) {
				temp = temp.getNext();
			}
		}
		while (temp != null) {
			if (nthNode != null) {
				nthNode = head;

			} else {
				nthNode = nthNode.getNext();
			}
			temp = temp.getNext();
		}
		if (nthNode != null) {
			System.out.println(nthNode.getData());

		}

		else {
			System.out.println("not enought  element in the list");
		}
	}

}