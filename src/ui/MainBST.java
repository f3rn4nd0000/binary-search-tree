package ui;

import binarySearchTree.BinarySearchTree;

/**
 * Simple main class to test different methods and functions of class Binary Search Tree
 */
public class MainBST {

	public static void main(String[] args) {
		BinarySearchTree<Integer, String> bst1 = new BinarySearchTree<Integer, String>();
		
		bst1.add(15, "Juan");
		bst1.add(7, "Cristian");
		bst1.add(23, "Sergio");
		bst1.add(12, "Andr�s");
		bst1.add(5, "Felipe");
		bst1.add(2, "Mateo");
		bst1.add(36, "Nicol�s");
		
		System.out.println(bst1);
		
		bst1.rotateLeft(7);
		
		System.out.println(bst1);
		
		bst1.rotateRight(15);
		
		System.out.println(bst1);
	}

}
