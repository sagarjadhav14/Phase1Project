
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;


public class MainMenu {

	public static void main(String[] args) {
		AllInOneMethod impobj = new AllInOneMethod();
		System.out.println(" ");
		System.out.println("Application :- LockedMe.com");
		System.out.println(" ");
		System.out.println("Developer Details :- ");
		System.out.println(" ");
		System.out.println("Name        : Sagar Prakash Jadhav");
		System.out.println("Email       : sagarj1411@gmail.com");
		System.out.println("Designation : Lockers Pvt. Ltd.");
		System.out.println(" ");
		System.out.print("\nPlease choose an option from above : ");
	
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Type y to continue, and e for exit");
			String mainChoice = sc.nextLine();
			
			
			if(mainChoice.equals("y")) {
				System.out.println("\nFile Operations : ");
				System.out.println("\n Enter s : To Show all files. "
						+ "\n Enter c: To create a New File. "
						+ "\n Enter d: To delete File. "
						+ "\n Enter r: To read File. "
						+ "\n Enter f: To Find Existing File. ");
				System.out.println("Select One Option : ");
			
			}else if(mainChoice.equals("e")) {
				impobj.Stop();
				break;
			
			}else {
				System.out.println("Invalid : Choose only y or e");
			}
			
			
			String choice =sc.nextLine();
			
			switch (choice) {
			case "s" :
				impobj.FilesAscending();
				break;
			case "c" :
				impobj.Add();
				break;
			case "d" :
				impobj.Delete();
				break;
			case "r" :
				impobj.Read();
				break;
			case "f" :
				impobj.Search();
				break;
			default:
				System.out.println("Invaild Option : Enter one of Following : s,c,d,r,f ");
				break;
			}
			
			
			
			
		}
				
	}

}