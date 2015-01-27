/** Design and implement a stack that has methods push, pop, peek, isEmpty, getMin and contains. */

package Mentor12012015;

public class Stack {
	private Node head;
	private Node min;
	
	/**
	 * Checks if the stack is empty
	 * @param head - first node
	 * @return
	 */
	public boolean isEmpty(Node head) {
		if(head == null)
			return true;
		return false;
	}
	
		/**
		 * Method for adding new Node into the stack. Also check 
		 * for min values in stack  (min values are connected, so once min
		 * value get popped, next min value will be corrected).
		 * @param value - min value in stack.
		 */
		public void push(int value){
			Node p = new Node(value);
		
			if(head == null){					//Empty stack
				min =p;
				head = p;
				
			}
			else if (p.getValue() <= min.getValue()){  //Once we found new min.
					
				p.setPrevMin(min);					// Setting previous min value of new min.
					min = p;						// Moving min to new min	
					p.setNext(head);
					head = p;	
					
			}else{									//No min found. Normal push.				
				
				p.setNext(head);				
				head = p;
			}
		}
		
		/**
		 * Method returns min value in stack. 
		 * @return min value
		 */
		public int getMin(){
			return min.getValue();
		}
		
		/**
		 * Pop method which removes first node in stack. It also check if node
		 * is min, so it can remove min.
		 * @return
		 */
		public int pop(){
			if(head == null)
				throw new IllegalStateException("First node is null");
			
			int result = head.getValue();
			
			if(head == min)		//Checking if our head is min.
				min = min.getPrevMin();			
			
			head = head.getNext();
			return result;
		}
	
		/**
		 * Method return value of first element in stack.
		 * @return value of first element
		 */
		public int peek(){
			if(head == null)
				throw new IllegalStateException("First node is null");
						
			return head.getValue();
		}
		
		/**
		 * Method return size of stack.
		 * @return size of stack
		 */
		public int getSize(){
			if(head == null)
				return 0;			
			return getSize(head, 1);
			
		}
		/**
		 * Counting size of stack with recursion.
		 * @param current
		 * @param counter
		 * @return
		 */
		private int getSize(Node current, int counter){
			if(current.getNext() == null)
				return counter;
			return getSize(current.next	, counter + 1);
						
		}
		
		/**
		 * Method which checks if sent value exists in stack.
		 * @param value
		 * @return
		 */
		public boolean contains(int value){
			if(head == null)
				throw new IllegalArgumentException("Its null");
			return contains(value, head);
		}
		
		/**
		 * Method which checks if sent value exists in stack. This method use recursions.
		 * @param value for check
		 * @param current 
		 * @return
		 */
		private boolean contains(int value, Node current){
				if(current == null) // Return false if it came to end of stack and didn't found value 
					return false;
			
				else if(current.getValue() == value) // Return true if it found value in list 
					return true;
			
				else // Use recursion to check for another element in list if it doesn't came to end and doesn't found value
					return contains(value, current.getNext());								
		}
	
	
	
	public static  class Node{
		private int value;
		private Node next;
		private Node prevMin;
		
			
		public Node(int value){
			this.value = value;
		}
		
		public Node getPrevMin() {
			return prevMin;
		}

		public void setPrevMin(Node prevMin) {
			this.prevMin = prevMin;
		}

		public int getValue(){
			return value;
		}
		public Node getNext(){
			return next;
		}
		public void setNext(Node next){
			this.next = next;
		}
		
	}
	
}

