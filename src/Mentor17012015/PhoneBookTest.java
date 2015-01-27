package Mentor17012015;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class PhoneBookTest {
	public static void main(String[] args) {

		PhoneBook phoneBook = new PhoneBook();
		phoneBook.addNewContact("Emir", 12345);
		phoneBook.addNewContact("Sanela", 102030);
		phoneBook.addNewContact("Vedad", 302010);
		phoneBook.addNewContact("Davor", 98765);
		phoneBook.addNewContact("Hikmet", 908070);
		phoneBook.addNewContact("Nedzad", 708090);
		phoneBook.addNewContact("Emina", 192837);

		System.out.println("If you want to add contact in phoneBook press 1"
				+ "\nIf you want to see contacts press 2."
				+ "\nIf you want to edit phoneBook press 3."
				+ "\nFor exit press 4.");
		int option = 0;
		do {
			option = TextIO.getlnInt();
			if (option != 1 && option != 2 && option != 3 && option != 4)
				System.out.println("Incorrect option, please try again.");
		} while (option != 1 && option != 2 && option != 3 && option != 4);

		while (option != 4) {
			switch (option) {
			case 1:
				System.out.println("Enter contact name!");
				String contactName = TextIO.getlnString();
				System.out.println("Enter contact number!");
				int contactNumber = TextIO.getInt();
				if (contactNumber == -1)
					break;
				phoneBook.addNewContact(contactName, contactNumber);
				return;
			case 2:
				phoneBook.printPhoneBook();
				return;

			case 3: {
				System.out
						.println("If you want to add phone number on your contact press 1"
								+ "\nIf you want to delete number from contact, press 2"
								+ "\nIf you want to see some contact, press 3"
								+ "\nIf you want to delete some contact press 4"
								+ "\nFor exit press 5.");
				int secondOption = 0;
				secondOption = TextIO.getlnInt();
				switch (secondOption) {
				case 1:
					System.out.println("Enter name of contact");
					contactName = TextIO.getln();
					System.out.println("Enter new number");
					int phoneNumber = TextIO.getlnInt();
					phoneBook.addNewPhoneNumber(contactName, phoneNumber);
					return;
				case 2:
					System.out.println("Enter name of contact");
					contactName = TextIO.getln();
					System.out.println("Enter new number");
					phoneNumber = TextIO.getlnInt();
					phoneBook.removePhoneNumber(contactName, phoneNumber);
					return;
				case 3:
					System.out.println("Enter name of contact");
					contactName = TextIO.getln();
					phoneBook.printContact(contactName);
					return;
				case 4:
					System.out.println("Enter name of contact");
					contactName = TextIO.getln();
					phoneBook.removeContact(contactName);
					return;
				case 5:
					return;
				}
			}
			}
		}
	}
}
