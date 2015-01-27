package Mentor17012015;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Class phoneBook that creates phonebook. It has options to add/remove new contact
 * or edit existing contact. For creating phonebook we used HashMap. To get through phonebook as keys
 * we used String (name of contacts). Values in hashmap are contacts.
 *
 */
public class PhoneBook {	
	private   HashMap<String, Contact> phonebook; 	
	private   Set<String> keys;
	
	
	/**
	 * Constructor that creates phonebook. It creates hashmap and set of keys
	 * for moving through phonebook.
	 */
	public PhoneBook(){
		phonebook = new HashMap<String, Contact>();
		keys = phonebook.keySet();
	}
	
	/**
	 * Method which prints phonebook.
	 */
	public  void printPhoneBook(){
		Iterator<String> keyIterator = keys.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();			
			Iterator<Integer> valueIterator = phonebook.get(key).getPhoneNumbers().iterator();
			System.out.println("Name: " + key);
			
			while(valueIterator.hasNext()){
				System.out.print( "\tPhone numbers: " +valueIterator.next() + "\n" );
			}
			System.out.println();
		}
	}
	
	/**
	 * Method which add another phone number to existing contact(use methods
	 * from Contact class).
	 * @param person
	 * @param newPhoneNumber
	 */
	public void addNewPhoneNumber(String contact, int newPhoneNumber){
		if(keys.contains(contact)){
			phonebook.get(contact).addNewPhoneNumber(newPhoneNumber);
		} else
		System.out.println("Couldn't find that contact.");			
	}
	
	/**
	 * Method which remove number from existing contact. Similar as adding new phone number.
	 * @param person
	 * @param newPhoneNumber
	 */
	public void removePhoneNumber(String contact ,int newPhoneNumber){
		if(keys.contains(contact)){
			phonebook.get(contact).removeNumber(newPhoneNumber);
		}else
		System.out.println("Couldn't find that contact.");			
	}
	
	/**
	 * Method which print just one selected contact.
	 * @param name
	 */
	public void printContact(String name){
		if(keys.contains(name)){
			System.out.println(phonebook.get(name).toString());
		}else
			System.out.println("Couldn't find that contact in phonebook");
	}
	
	/**
	 * Method that add new contact into phonebook.
	 * @param name
	 * @param number
	 */
	public  void addNewContact(String name, int number){
		phonebook.put(name, new Contact(name, number));
	}
	
	/**
	 * Method which removes contact from phonebook
	 * @param name
	 */
	public  void removeContact(String name){
		if(keys.contains(name))
			keys.remove(name);
		else
			System.out.println("Couldn't find that contact in phonebook");
	}	
	
}