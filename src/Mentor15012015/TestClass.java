package Mentor15012015;

public class TestClass {
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();

		b.add(5);
		b.add(3);
		b.add(3);
		b.add(4);
		b.add(7);
		b.add(67);
		b.add(67);
		b.add(44);
		b.add(12);
		b.add(7);
		b.add(6);

		BinaryTree b1 = new BinaryTree();

		b1.add(67);
		b1.add(44);
		b1.add(12);

		System.out.println(b.isSubtree(b.getRoot(), b1.getRoot()));
	}
}
