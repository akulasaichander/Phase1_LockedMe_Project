package simplilearnFinalProject;

import java.util.Date;
import java.util.Scanner;

public class ClientApp 
{
	/**
	 * This method will display the Welcome Page and Login page
	 * @choice is operation type to be performed
	 * @Date for getting date and time
	 */
	public static void main(String[] args) {
		Scanner un=new Scanner(System.in);
		System.out.println("********************************************************************************************************************");
		System.out.println("\t\t\t\t\t\tWelcome to LockedMe.com");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\tDeveloper : A.Saichander");
		System.out.println("********************************************************************************************************************");
		System.out.println("\nLogin\n*****\n\tEnter the Username :");
		LockedMe.userName=un.nextLine();
		
		Date date = new Date();	 //Instantiate a Date object
		Scanner obj1=new Scanner(System.in);
		int choice;     
	
		do {
			System.out.println("********************************************************************************************************************");
			System.out.println("\t\t\t\t\t\tLockedMe.com");
			//System.out.println("\t\t\t\t\t\t\t\t\t\t\tDeveloper : A.Saichander");
			System.out.println("********************************************************************************************************************");
			System.out.println("User : "+LockedMe.userName+"\t\t\t\t\t\t\t\t\t    "+date.toString());
			System.out.println("*****************\n");
			LockedMe.displayMenu();
			System.out.println("*********************");
			System.out.println("Select from Main Menu");
			System.out.println("*********************");
			System.out.println("\tEnter any Operation 1 2 3 4 5 ....");
			choice=Integer.parseInt(obj1.nextLine());
			
			try {
				switch(choice) {
				
				case 1:LockedMeGetFiles.getAllFiles();
						break;
						
				case 2:LockedMeCreate.createFiles();
				break;
				
				case 3:LockedMeDelete.deleteFiles();
				break;
				
				case 4:LockedMeSearch.searchFiles();
				break;
				
				case 5:LockedMe.exit();
				break;
				
				default:System.out.println("\tInvalid Options");
				}
			} catch (Exception e) {	}	
		}while(choice>0);
		
		obj1.next();
		obj1.close();
	}
}
