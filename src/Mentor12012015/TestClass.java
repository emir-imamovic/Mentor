package Mentor12012015;


public class TestClass {
	public static void main(String[] args) {
		
		MyQueue  mq = new MyQueue();		
		
		mq.push(23);
		mq.push(12);
		mq.push(11);
	
		
		System.out.println(mq.getSize());
		System.out.println(mq.pop());
		System.out.println(mq.getSize());
		
		System.out.println("________________");
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(2);
		stack.push(13);
		stack.push(67);
		stack.push(100);
		System.out.println(stack.contains(100));
		System.out.println(stack.getMin());
		System.out.println(stack.getSize());
		stack.pop();
		System.out.println(stack.getSize());
		System.out.println(stack.contains(100));


		
	}
	
}
