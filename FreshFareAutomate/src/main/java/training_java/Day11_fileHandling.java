package training_java;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Day11_fileHandling {

	public static void main(String[] args) {
		
		try {
			File file = new File("demo_text.txt");
			if(file.createNewFile()) {
				System.out.println("File has been Created");
			}else {
				System.out.println("File already Created");
				FileWriter write =  new FileWriter("demo_text.txt");
				write.write("This is for Demo Session on File Handling");
				write.close();
				System.out.println("File Writting is completed");
				
			}
			
			try {
				Scanner read = new Scanner(file);
				while(read.hasNextLine()) {
					
					String data =  read.nextLine();
					System.out.println(data);
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("File not able to");
				e.printStackTrace();
			}
			
		}catch(IOException e) {
			System.out.println("Unable to open the file");
			e.printStackTrace();
		}

	}

}
//  Selenium --> Automation Tool --> Free tool and open source
// QTP --> UFT --> Microfocus --> It has own language and It wil be combined with VBScript
// cost --> too high
//
//	1. SELENIUM IDE --> extension in browser --> Simply record and play
//	2. SELENIUM WEBDRIVER --> its code you can write on own and it can be customized. --> Cucumber, Maven, Testng
//	3. SELENIUM GRID --> BDD Framework 
//	4. SELENIUM RC
//
//
// 
//	POM -> Page Object Model
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

