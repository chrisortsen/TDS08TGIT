package createfile;

import java.io.File;
import java.io.IOException;

public class CreateFile{
	public static void main(String[] args){
		try{
			File myObj = new File("filename.txt");
			if(myObj.createNewFile()){
				System.out.println("File created: " +myObj.getName());
			}else{
				System.out.println("Arquivo ja existe.");
			}	
		}catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}