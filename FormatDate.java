
public class formatDate {
	
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println(day + ", " + month + " " + date + ", " + year + "\n");
	}
	
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println(day + " " + date + " " + month + " " + year);
	}
	
	public static void main(String[] args) {
		//American
		System.out.print("American format: \n");
		printAmerican("Wednesday", 22, "September", 2026);
		
		//European
		System.out.print("European format: \n");
		printEuropean("Wednesday", 22, "September", 2026);
		
	}
	
}
