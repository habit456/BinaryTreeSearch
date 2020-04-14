package com.company;

public class Main {

    public static void main(String[] args) {
	    Node root = new Node(20);
	    root.insert(12);
	    root.insert(25);
	    root.insert(5);
	    root.insert(18);
	    root.insert(1);
	    root.insert(7);
	    root.insert(16);
	    root.insert(19);
	    root.insert(23);
	    root.insert(22);
	    root.insert(24);
	    root.insert(30);
	    root.insert(28);
	    root.insert(31);

		System.out.println(root.contains(5));

	}
}
