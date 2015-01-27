package Mentor12012015;

import java.util.Stack;

/**
 * Queue class that uses two stacks to be created. One stack is used for pushing
 * into queue and second stack for popping from it. It keeps all elements in
 * pushStack. If user want to pop program will move all elements to popStack but last
 * element (that will be first element which is pushed). Then program pop that element so
 * queue behave as queue. After that program back all elements into
 * pushStack.
 */
public class MyQueue {

	private Stack<Integer> pushStack;
	private Stack<Integer> popStack;

	/**
	 * Constructor where stacks are created.
	 */
	public MyQueue() {
		pushStack = new Stack<Integer>();
		popStack = new Stack<Integer>();
	}

	/**
	 * Push into pushStack, instead of pushing directly to queue.
	 * @param value
	 */
	public void push(int value) {
		pushStack.push(value);
	}

	/**
	 * Method which pops all elements from pushStack into popStack until
	 * size of stack is 1. That means it came to first element which is pushed so method
	 * pop that element. After that it will  return all elements into push
	 * stack and return value of poped element.
	 * @return
	 */
	public int pop() {
		if (pushStack.isEmpty())
			throw new IllegalStateException("Queue is epmty, can not pop");

		while (pushStack.size() > 1)
			popStack.push(pushStack.pop());

		int result = pushStack.pop();

		while (popStack.size() > 0)
			pushStack.push(popStack.pop());

		return result;
	}

	/**
	 * Returns size of pushStack.
	 * @return
	 */
	public int getSize() {
		return pushStack.size();
	}

	/**
	 * Returns contains method of pushStack.
	 * @param value for check
	 * @return
	 */
	public boolean contains(int value) {
		return pushStack.contains(value);
	}

}
