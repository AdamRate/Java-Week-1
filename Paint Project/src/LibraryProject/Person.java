package LibraryProject;

public class Person {

	private static int totalPeople;
	public int uniqueId;
	public String firstName;
	public String surname;
	public int[] listOfBorrowedItems;

	public Person(String firstName, String surname) {
		totalPeople++;
		this.uniqueId = totalPeople;
		this.firstName = firstName;
		this.surname = surname;
		listOfBorrowedItems  = new int[4];
	}

	public String registerUser() { // List of attributes- uniqueId firstName
									// surname listOfBorrowedItems
		return null;
	}

	public String deleteUser() {
		return null;
	}

	public String updatePerson() {
		return null;
	}

	public int returnItem() {
		return 0;
	}

	public String hasBorrowed() { // List of borrowed items
		return null;
	}

	public String toString() {
		return "Items:" + listOfBorrowedItems[1];

	}

}
