package LibraryProject;

import java.util.ArrayList;

public class Library {

	ArrayList<Person> peopleList = new ArrayList<>();
	ArrayList<Items> itemList = new ArrayList<>();

	public String checkOutItem(int itemId, Person p1) {
		//Items Item = new Items();	
		for (int i = 0; i < p1.listOfBorrowedItems.length; i++) {
			if (p1.listOfBorrowedItems[i] == 0 && itemList.get(i).getIsAvailable()) {
				p1.listOfBorrowedItems[i] = itemId;
				break;
			}
			
			else {
				System.out.println("Item is Unavailable");
				}
		}

		return "Items: " + p1.listOfBorrowedItems[0] + ", " + p1.listOfBorrowedItems[1] + ", "
				+ p1.listOfBorrowedItems[2] + ", " + p1.listOfBorrowedItems[3] + "\t" + "Person: " + p1.uniqueId
				+ " borrowed item: " + itemId;
	}

	public int checkInItem() {
		return 0;

	}

	public String listAvailItems() {
		return null;
	}

	public String listOutItems() {
		return null;
	}

	public String createItemList() {
		{
			itemList.add(new Books("Book 1", 1995, "Good", 7, "Author 1", true, true));
			itemList.add(new Maps("Map 1", 2010, "Excellent", 7, 70, true));
			itemList.add(new Newspapers("Newspaper 1", 2011, "Poor", 1, "Monday", "June 6th", true));
		}
		return "3 Items Added";

	}

	public String createPeopleList() {
		{
			peopleList.add(new Person("FirstName1", "Surname1"));
			peopleList.add(new Person("FirstName2", "Surname2"));
			peopleList.add(new Person("FirstName3", "Surname3"));
		}
		return "Users Created";
	}

	public Person getPeopleList(int i) {
		return peopleList.get(i);
	}

	public String toString() {

		Person userId = getPeopleList(1);
		return "Items: " + userId.listOfBorrowedItems[0] + " ," + userId.listOfBorrowedItems[1] + ", "
				+ userId.listOfBorrowedItems[2] + " ," + userId.listOfBorrowedItems[3];

	}

}
