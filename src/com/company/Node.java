package com.company;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value >= data) {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        } else {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        }

        if (value > data) {
            if (right != null) {
                return right.contains(value);
            } else {
                return false;
            }
        } else {
            if (left != null) {
                return left.contains(value);
            } else {
                return false;
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }

        System.out.println(data);

        if (right != null) {
            right.printInOrder();
        }
    }
}
