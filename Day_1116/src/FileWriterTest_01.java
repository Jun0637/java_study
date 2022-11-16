
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest_01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		Scanner keyin = new Scanner(System.in);
		
		char[] ch = {67, 68, 69, 70, 80, 97 };
		try {
			fw = new FileWriter(new File("temp.txt"));
			
			fw.write(ch);
		/*	while(true) {
				System.out.println("값 입력 : ");
				int value = keyin.nextInt();
				if(value == -1) break;
				fw.write(value);
			}*/
				System.out.println("끝");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
