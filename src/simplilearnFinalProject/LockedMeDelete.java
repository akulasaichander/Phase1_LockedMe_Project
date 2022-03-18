package simplilearnFinalProject;

import java.io.File;
import java.util.Scanner;

public class LockedMeDelete {

	/**
	 * This method will delete specified files 
	 * @fileDelCount is the count of files to be deleted
	 */
	public static void deleteFiles()  throws Exception {
		System.out.println("****************************");
		System.out.println("Operation - 3 Deleting Files");
		System.out.println("****************************");
		System.out.println("Enter How Many Files to be Deleted :");
		int fileDelcount=LockedMe.obj.nextInt();
		
		Scanner scan2=new Scanner (System.in);	
		for(int j=1;j<=fileDelcount;j++) 
		{
			System.out.println("\tEnter the FileName to Delete :");
			LockedMe.fileName=scan2.nextLine();
			
			File f=new File(LockedMe.Path+"\\"+LockedMe.fileName);
		
			if(LockedMe.list.contains(LockedMe.fileName)) 
			{
				f.delete();
				LockedMe.list.remove(LockedMe.fileName);
				System.out.println("\tFile Deleted Successfully...");
				System.out.println("\n");
			}
			else
				System.out.println("\tFile Not Found!!!!!!...");
				System.out.println("\n");
		}
	}		

}
