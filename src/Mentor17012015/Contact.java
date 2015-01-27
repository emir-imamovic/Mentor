package Mentor17012015;
import java.util.Iterator;
import java.util.LinkedList;

	/**
	 * Class contact creates contact for phonebook. It contains name of contact and linked list of numbers.
	 *
	 */
	public class Contact {
		private String name;
		private LinkedList<Integer> phoneNumbers;
		
		/**
		 * Constructor for contact class. 
		 * @param name
		 * @param phoneNumber
		 */
		public Contact(String name, int phoneNumber) {
			this.name = name;
			phoneNumbers = new LinkedList<Integer>();
			phoneNumbers.add(phoneNumber);
		}
		
		/**
		 * Add new phone number to contact. Actually  add into linked list.
		 * @param newNumber
		 */
		public void addNewPhoneNumber(int newNumber){
			phoneNumbers.add(newNumber);
		}
		
		/**
		 * Remove number from contact.
		 * @param phoneNumber
		 */
		public void removeNumber(int phoneNumber){
			int idx = 0;
			if(idx > phoneNumbers.size() || idx < 0)
				throw new IndexOutOfBoundsException("Not possible to remove number at that index");
			
			Iterator it = phoneNumbers.iterator();		
			
			while(it.hasNext() && phoneNumbers.get(idx) != phoneNumber){
				idx++;
				it.next();			
			}		
			phoneNumbers.remove(idx);		
		}

		@Override
		public String toString() {
			return "Person:" + name + "\n PhoneNumbers=" + phoneNumbers.toString();
		}
		
		/**
		 * Method which return linked list of phone numbers.
		 * @return linked list of phone numbers
		 */
		public LinkedList<Integer> getPhoneNumbers() {
			return phoneNumbers;
		}

	}