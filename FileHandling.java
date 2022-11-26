import java.io.File;//import the file class
import java.io.IOException;//Import the IOException class to errors
import java.io.FileWriter;//Import the FileWrite class
import java.io.FileNotFoundException;//import this class to handling the errors
import java.util.Scanner;// import Scanner class to read the file
import java.io.FileReader;
import java.io.*;
class FileHandling{
	public static void main(String args[]){
		//To create a file using File handling
		/*try{
			File obj=new File("Text.txt");
			if(obj.createNewFile()){
				System.out.println("File created: "+obj.getName());
			}
			else{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}*/
	// To write a file
		/*try{
			FileWriter obj=new FileWriter("Text.txt");
			obj.write("Hello Everyone!,Wellcome");
			obj.close();
			System.out.println("Successfully wrote the file");
		}
		catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}*/
		//To Read a file
		/*try{
			File obj=new File("Text.txt");
			Scanner read=new Scanner(obj);
			while(read.hasNextLine()){
				String data=read.nextLine();
				System.out.println(data);
			}
			read.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error");
			e.printStackTrace();
		}*/
		//to check the file the data present or not
		try{
			FileReader obj=new FileReader("Text.txt");
			BufferedReader text=new BufferedReader(obj);
			String str=text.readLine();
			if(str.indexOf("Everyone")!=-1){
				System.out.println("Available");
			}
			else{
				System.out.println("Not avilable");
			}
		}
		catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}	
	}
}

