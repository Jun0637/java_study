import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ObjectStreamTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ScoreVO vo1 = new ScoreVO("홍길동", 89 , 88 ,100);
		ScoreVO vo2 = new ScoreVO("임꺽정", 87 , 81 ,70);
		FileOutputStream fos = new FileOutputStream("score.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(vo1);
		oos.writeObject(vo2);
		
		oos.close();
		fos.close();
		System.out.println("쓰기 작업종료");
		
		FileInputStream fis = new FileInputStream("score.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while(true) {
			try {
				ScoreVO obj1 = (ScoreVO) ois.readObject();
				System.out.print(obj1);
			} catch(EOFException e) {
				System.out.println("읽기작업 종료");
				break;
			}
		}
		/*Object obj1 = (ScoreVO) ois.readObject();
		Object obj2 = (ScoreVO) ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);*/
		
		ois.close();
		fis.close();
		//1System.out.println("읽기 작업 종료");
	}

}
