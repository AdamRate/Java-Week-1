package LibraryProject;

public class Runner {

	public static void main(String[] args) {
		int inputUserId =0; int itemId = 1; //itemId = scanned input /////inputUserId = scanned input
		Library mainLib = new Library();
		mainLib.createItemList();
		mainLib.createPeopleList();
		Person person = mainLib.getPeopleList(1);
		System.out.println(mainLib.checkOutItem(itemId, person));
		System.out.println(mainLib.checkOutItem(itemId +1, person));		
		System.out.println(mainLib.checkOutItem(itemId +2, person));
	}

}
