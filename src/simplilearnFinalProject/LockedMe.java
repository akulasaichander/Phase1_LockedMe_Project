package simplilearnFinalProject;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class LockedMe
{
	public static String userName="";
	public static String fileName="";
	public static HashSet<String> list=new HashSet<String>();
	 
	public static final String Path="C:\\Users\\MM20095\\Documents\\New folder\\bb check\\javaFs"; 
	public static File folder=new File(Path);
	public static Scanner obj=new Scanner (System.in);
	
	/**
	 * This method will display the Main menu
	 * @userName is for displaying username
	 * @fileName stores name of the file on which operations are performed
	 * @list stores all unique filenames of folder
	 * @Path stores path 
	 * @folder is the file object with specified path
	 */
	public static void displayMenu() {	
		System.out.println("\nHome Page\n*********\n\t Main Menu");
		System.out.println("\t *********");
		System.out.println("\t\t1. Display All Files");
		System.out.println("\t\t2. Create New Files");
		System.out.println("\t\t3. Delete Files");
		System.out.println("\t\t4. Search for Files");
		System.out.println("\t\t5. Exit\n");
		System.out.println("********************************************************************************************************************");
		
		File filesList[]=folder.listFiles();
		for(var x:filesList)
			list.add(x.getName());
	}
	public static void exit() {
		System.out.println("********************************************************************************************************************");
		System.out.println("\n\t\t\t!!!!!!!!!!!!!!!!!! Exiting LockedMe.com !!!!!!!!!!!!!!!!!!");
		System.out.println("\n********************************************************************************************************************");
		obj.close();
		System.exit(0);
	}
}
