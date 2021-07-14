import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class AllInOneMethod {

	
	
	
	
	public void FilesAscending() {
		
		File file = new File("C:\\Users\\sagar\\Desktop\\SimpliLearn\\Live Lecture\\Phase 1\\Phase1ProjectLockers");
		if(file.isDirectory()) {
			List<String> fileList = Arrays.asList(file.list());
			System.out.println("\n\tFiles With Ascending Order");
			Collections.sort(fileList);
			for(Object sortfnm:fileList) {
				System.out.println(sortfnm);
			}
		}
		else {
			System.out.println("Wrong Directory or Folder");
		}
	}
	
	
	
	
	
	
	public void Add() {
		File file = new File("C:\\Users\\sagar\\Desktop\\SimpliLearn\\Live Lecture\\Phase 1\\Phase1ProjectLockers");
		
		if(file.isDirectory()) {
			try {
				Scanner nm= new Scanner(System.in);
				System.out.println("Enter File Name For Creation ");
				String inputnm = nm.nextLine();
				File newFile = new File("C:\\Users\\sagar\\Desktop\\SimpliLearn\\Live Lecture\\Phase 1\\Phase1ProjectLockers"+inputnm);
			
				newFile.createNewFile();
				System.out.println("Successfully File Created"+newFile);
				
//				FileWriter writeInFile = new FileWriter(newFile);
//				System.out.println("Write something into new file "+newFile);
//				String newContent = nm.nextLine();
//				writeInFile.write(newContent);
//				writeInFile.close();
				System.out.println("Writing into the file is Successfull in file : "+inputnm);
//				nm.close();
			} catch (IOException e) {
				System.out.println("Unable to create file");
				e.printStackTrace();
			}			
			
		}
		else {
			System.out.println(file.getAbsolutePath()+" Wrong Path");
		}	
		
	}
	
	

	
	

	
	public void Read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("File name with extension to be Read");
		String inputName = sc.nextLine();
		File file = new File("C:\\Users\\sagar\\Desktop\\SimpliLearn\\Live Lecture\\Phase 1\\Phase1ProjectLockers"+inputName);
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

	
	
	

	public void Delete() {
		System.out.println("Enter name of File to be Deleted with extension : ");
		Scanner nm = new Scanner(System.in);
		String filenm = nm.nextLine();
		File file =  new File("C:\\Users\\sagar\\Desktop\\SimpliLearn\\Live Lecture\\Phase 1\\Phase1ProjectLockers"+filenm);
		boolean a=file.delete();
		if(a) {
			System.out.println("Deleted Successfully");
		}else {
			System.out.println("File Not Found");
		}
		
	}

	
	
	
	
	
	public void Search() {
		System.out.println("Searching a file in the directory");
		 try
		 {
			 File filesearch = new File("C:\\Users\\sagar\\Desktop\\SimpliLearn\\Live Lecture\\Phase 1\\Phase1ProjectLockers");
			 String[] search = filesearch.list();
			 System.out.print("Please enter filename to search : ");
			 Scanner fs = new Scanner(System.in);
			 String filese = fs.nextLine();
			 int flag = 0;
			 if(search == null)
				 System.out.println("Empty directory");
			 else
			 {
				 for(int i =0;i<search.length;i++)
				 {
					 String filename = search[i];
					 if(filename.equals(filese))
					 {
						 System.out.println("File found : " +filename);
						 flag = 1;
					 }
				 }
			 }
			 if (flag == 0)
				 System.out.println("File not found : "+filese);
		 }

		 catch(NullPointerException ne)
		 {
			 System.out.println("filename or foldername is wrong");
		 }
	}

	
	
	
	
	public void Stop() {
		System.out.println("Thank, Program is Stopped");
	}
	
	
	
	
	
	
//	public static void main(String[] args) throws FileNotFoundException {
//		AllInOneMethod a = new AllInOneMethod();
//		//a.FilesAscending();
//		//a.Add();
//		//a.Read();
//		//a.Search();
//	}
	
}
