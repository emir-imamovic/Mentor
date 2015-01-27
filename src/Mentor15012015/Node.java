package Mentor15012015;

public class Node {
	private int value;
	private Node left;
	private Node right;

	/**
	 * Constructor for node 
	 * @param value
	 */
	public Node(int value) {
		this.value = value;
	}

	/**
	 * Method returns left node
	 * @return
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * Method setting left node
	 * @param left
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * Method returns right node
	 * @return
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * Method sets right node
	 * @param right
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/**
	 * Method return value of node
	 * @return
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Method checks is the two trees equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Node other = (Node) obj;

		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;

		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;

		if (value != other.value)
			return false;

		return true;
	}

}
