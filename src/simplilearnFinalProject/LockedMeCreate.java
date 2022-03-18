package simplilearnFinalProject;

import java.io.FileWriter;
import java.util.Scanner;

public class LockedMeCreate {

	/**
	 * This method will create new files and store text into file
	 * @fileCount will number of files to be created
	 */	
	public static void createFiles()   throws Exception {
		System.out.println("********************************");
		System.out.println("Operation 2 - Creating New Files");
		System.out.println("********************************");
		System.out.println("\n\tEnter How Many Files to be Created : ");
		int fileCount=LockedMe.obj.nextInt();
			
		Scanner sc=new Scanner (System.in);
		for(int j=1;j<=fileCount;j++) 
		{
				 System.out.println("\tEnter the FileName :");
				 LockedMe.fileName="";
				 LockedMe.fileName=sc.nextLine();
				
				if(LockedMe.list.contains(LockedMe.fileName)) 
					System.out.println("****\n Same File Already Present in the Location ****\n");
				else 
				{		
						int linesCount;
						System.out.println("\tEnter number of lines for File : "+LockedMe.fileName);
						
						Scanner s=new Scanner (System.in);
						linesCount=Integer.parseInt(s.nextLine());
				
						FileWriter fw =new FileWriter(LockedMe.Path+"\\"+LockedMe.fileName);
						int k=0;
						while(k<linesCount) 
						{
							System.out.println("\tEnter line "+(k+1)+" of "+LockedMe.fileName+": ");
							fw.write(s.nextLine()+"\n");
							k++;
						}
						fw.close();
						
						LockedMe.list.add(LockedMe.fileName);
						System.out.println(LockedMe.fileName+"\tFile is Created Successfully");	
						System.out.println("\n");
			   }
		}
	}

	
}
