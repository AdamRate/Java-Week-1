package LibraryProject;

public class Newspapers extends Items {

	public String day;
	public String date;
	
	public Newspapers(String title, int year, String condition, int loanLength, String day, String date, boolean isAvailable) {
		super(title, year, condition, loanLength, isAvailable);
		this.day=day;
		this.date=date;
	}

	public String toString(){
		return super.toString() + "\t Date: " + date + "\tDay: " + day; 
		}
	
}
