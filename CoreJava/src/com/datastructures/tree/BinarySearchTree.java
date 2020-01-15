package com.datastructures.tree;

class BinarySearchTree<T extends Comparable<T>> {

	private Node root = null;
	int nodeCount = 0;

	private class Node {
		Node left, right;
		T data;

		Node(Node left, Node right, T data) {
			this.left = left;
			this.right = right;
			this.data = data;
		}
	}

	public int size() {
		return nodeCount;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean add(T data) {
		if (contains(data))
			return false;
		else {
			root = add(root, data);
			nodeCount++;
			return true;
		}
	}

	private Node add(Node node, T data) {
		if (node == null)
			return new Node(null, null, data);
		int compare = data.compareTo(node.data);
		if (compare > 0) {
			node.right = add(node.right, data);
		} else {
			node.left = add(node.left, data);
		}
		return node;
	}

	public boolean contains(T data) {
		return contains(root, data);
	}

	private boolean contains(Node node, T data) {
		if (node == null)
			return false;
		int compare = data.compareTo(node.data);
		if (compare > 0) {
			return contains(node.right, data);
		} else if (compare < 0) {
			return contains(node.left, data);
		} else
			return true;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		return Math.max(height(node.left), height(node.right)) + 1;
	}

	public Node findMax(Node node) {
		while (node != null)
			node = node.right;
		return node;
	}

	public Node findMin(Node node) {
		while (node != null)
			node = node.left;
		return node;
	}
	
	public boolean remove(T data) {
		if(contains(data)) {
			root = remove(root, data);
			nodeCount--;
			return true;
		}
		return false;
	}
	
	private Node remove(Node node, T data) {
		if(node==null) return null;
		int compare = data.compareTo(node.data);
		
		if(compare>0) {
			return remove(node.right, data);
		}else if(compare<0) {
			return remove(node.left, data);
		}else {
			if(node.right==null) {
				Node leftChild = node.left;
				node.data = null; 
				node=null;
				return leftChild;
			}else if(node.left==null) {
				Node rightChild = node.right;
				node.data = null;
				node = null;
				return rightChild;
			}else {
				Node tmp = findMin(node.right);
				node.data = tmp.data;
				node.right = remove(node.right, tmp.data);
			}
		}
		return node;
	}
}