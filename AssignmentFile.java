package basic_syntax;

import java.io.File;
//import java.io.FileInputStream;
import java.util.Scanner;
//import java.io.FileNotFoundException;

public class AssignmentFile {

	public static void main(String[] args) throws Exception {
		//WAP to find the number of lines present in the text file
		
		File file = new File("sample.txt");
		Scanner sc = new Scanner(file);
		int cnt = 0;
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			cnt++;
		}
		System.out.println("No.of Lines in file is: "+cnt);
		sc.close();
	}

}
