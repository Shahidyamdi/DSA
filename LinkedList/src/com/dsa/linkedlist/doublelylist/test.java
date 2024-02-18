package com.dsa.linkedlist.doublelylist;

public class test {
	public static void main(String[] args) {
	DoublyLinkedList link = new DoublyLinkedList();
	link.create(10);
	link.create(20);
	link.create(30);
	link.insertATTheBeginning(100);
	link.insertAtAfter(2, 200);
	link.traverse();
	}

}
