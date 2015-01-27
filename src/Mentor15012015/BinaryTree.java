package Mentor15012015;

public class BinaryTree {
	private Node root;

	/**
	 * Constructor for binary tree
	 */
	public BinaryTree() {
		this.root = null;
	}

	/**
	 * Method which return first node
	 * @return
	 */
	public Node getRoot() {
		return root;
	}

	public void add(int value) {
		if (root == null) {
			root = new Node(value);
		} else
			add(root, value);
	}

	/**
	 * Method for adding nodes in binary tree using recursion.
	 * @param current
	 * @param value
	 */
	private void add(Node current, int value) {
		if (current == null) {
			current = new Node(value);
			return;
		}

		if (value <= current.getValue()) {
			if (current.getLeft() == null) {
				current.setLeft(new Node(value));
				return;
			}
			add(current.getLeft(), value);
		} else {
			if (current.getRight() == null) {
				current.setRight(new Node(value));
				return;
			}
			add(current.getRight(), value);
		}
	}

	
	public void print() {
		print(root);
	}

	/**
	 * Method which prints binary tree recursively. It first print all left,
	 * then all middle, then all right.
	 * @param root
	 */
	private void print(Node root) {
		if (root == null)
			return;
		else {
			print(root.getLeft());
			System.out.println(root.getValue());
			print(root.getRight());
		}
	}

	public boolean contains(int value) {
		if (root == null)
			throw new IllegalStateException("Empty list");
		else
			return contains(root, value);

	}

	/**
	 * Method which is searching for sent value in binary three using recursion.
	 * @param current - current node
	 * @param value - value that is required
	 * @return true if the value is in the tree, otherwise return false.

	 */
	private boolean contains(Node current, int value) {

		if (current.getValue() == value) {
			return true;

		} else if (value <= current.getValue()) {
			if (current.getLeft() == null) {
				return false;
			}
			return contains(current.getLeft(), value);

		} else {
			if (current.getRight() == null)
				return false;

			return contains(current.getRight(), value);
		}

	}

	/**
	 * Method check if the some binary tree subtree of current binary tree
	 * @param biggerTree - current tree
	 * @param smallerTree - another tree
	 * @return
	 */
	public static boolean isSubtree(Node biggerTree, Node smallerTree) {

		if (biggerTree == null)
			return false;
		if (smallerTree == null)
			return true;
		if (biggerTree.equals(smallerTree)) {
			if (isSubtree(biggerTree.getLeft(), smallerTree.getLeft())
					&& isSubtree(biggerTree.getRight(), smallerTree.getRight()));
			return true;

		} else
			return isSubtree(biggerTree.getLeft(), smallerTree)
					|| isSubtree(biggerTree.getRight(), smallerTree);
	}

}
