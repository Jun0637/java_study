import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest_02 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file = new File("temp2.txt"); // Directory, File을 다룸
		byte[] by = { 65, 78, 45, 123, -127 };
		try {
			// fos = new FileOutputStream(file);
			fos = new FileOutputStream(new File("temp2.txt"));

			fos.write(by);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("작업종료");
	}
}
