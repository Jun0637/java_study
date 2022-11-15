import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest_01 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			File file = new File("data.txt");
			
			if(!file.exists()) {
				System.out.println("파일이 존재하지 않습니다. 확인요망");
				return;
			}
			
			fis = new FileInputStream("file");
			int result = 0;
			while (true) {
				result = fis.read(); // -1 이 리턴되면 데이터가 없음을 나태남
				if (result == -1)
					break;// 종료
				System.out.print((char) result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
