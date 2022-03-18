package simplilearnFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LockedMeGetFiles {
	
	/**
	 * This method will display all files in ascending and descending order in path
	 * @order represent's ascending or descending 
	 */
	public static void getAllFiles() throws Exception  
	{
		System.out.println("**********************************");
		System.out.println("Operation - 1 Displaying All Files");
		System.out.println("**********************************");
		Scanner s1=new Scanner(System.in);
		System.out.println("\tSelect Display Order"); 
		System.out.println("\t********************");
		System.out.println("\t\t1.Display Files in ASCENDING\n\t\t2.Display Files in DESCENDING\n");
		
		int order=s1.nextInt();
		if(order==1) 
		{
			Set<String> Ascending = new TreeSet<String>(LockedMe.list);
			System.out.print("Files in Directory :\n");
			for(String str : Ascending)
	            System.out.print("\t"+str);
			
			System.out.println("");
		}
		else if(order==2) 
		{
			List<String> Descending = new ArrayList<String>(LockedMe.list);
		    Collections.sort(Descending,Collections.reverseOrder());
		    System.out.print("Files in Directory :\n");
			for(String str : Descending)
	            System.out.print("\t"+str);
		    
			System.out.println("");
		} 
		  
    }
}
