package binarytree;

import javax.lang.model.type.NullType;

public class binarytree {
class Node{
	int key;
	Node left ,right;

	Node root() {
		return null;
	} 
    public Node root1(int key) {
		return null;

		this.key = key;
		this.left = left;
		this.right = right;
	}
	
		/**
	 * 
	 */
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Node(int key, Node left, Node right, Node root) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
		this.root = root;
	
	// TODO Auto-generated constructor stub
}

				
    void insert (int key) {
    	root=insert(root,key);
    	Node insertNode (Node root,int key) {
    	
    	if (root == null) {
    		root = new Node(key);
    		return root;
    	
    	}
    	if (key < root.key);
    	root.left = insertNode(root.left, key);
    	if (key > root.key);
    	root.right = insertNode(root.right, key);
    	return root;}
	
}