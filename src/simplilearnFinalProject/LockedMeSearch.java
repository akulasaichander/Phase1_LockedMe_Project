package simplilearnFinalProject;

import java.util.Scanner;

public class LockedMeSearch {
	/**
	 * This method will search specified files 
	 * @filesCount is count of files to be searched
	 */
	public static void searchFiles() throws Exception 
	{
		System.out.println("*********************************");
		System.out.println("Operation - 4 Searching for Files");
		System.out.println("*********************************");
		
		System.out.println("\tEnter How Many Files to be Searched :");
		int filesCount=LockedMe.obj.nextInt();
		
		Scanner scan1=new Scanner (System.in);
			
		for(int j=1;j<=filesCount;j++) 
		{
			System.out.println("\tEnter the FileName to Search :");
			LockedMe.fileName=scan1.nextLine();
		
			if(LockedMe.list.contains(LockedMe.fileName)) 
				System.out.println("\t"+LockedMe.fileName+" file is Found!!!!!!\n");
			else
				System.out.println("\tFile Not Found!!!!!!...\n");
		}		
	}
}
