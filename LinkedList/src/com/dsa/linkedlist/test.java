package com.dsa.linkedlist;

public class test {
	public static void main(String[] args) {
		linkedlist linked = new linkedlist();
		linked.create(1);
		linked.create(2);
		linked.create(3);
		linked.reverse();
		
//		linked.insertAtBeginning(10);
//		linked.insertAtEnd(30);
//		linked.insertAtmiddle(2, 10);
		linked.traverse();
	}

}
