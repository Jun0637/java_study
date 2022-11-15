import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest_01 {

	public static void main(String[] args) {
		// 1)객체 생성한다.(Output)
		FileOutputStream fos = null;
		try {
			// 1) 객체를 생성한다(Output)
			fos = new FileOutputStream("temp.txt");
			
			//2 작업을 한다.
			int ch = 'A';
			for(int i =ch; i<=(ch+26); ++i)
			fos.write(i);
			fos.write('\n');
			
			ch = 'a';
			for(int i = ch; i<(ch+26); ++i)
				fos.write(i);;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)fos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작업 종료");

	}
}
