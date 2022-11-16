import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffedReaderTest_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader(new File("score.txt"));
		fw = new FileWriter(new File("score_result.txt"));
		
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
		
		String score;
		String name;
		int it, japanese, basic, total;
		double avg;
		
		while(true) {
			score = br.readLine();
			if(score == null) break;
			
			String[] temp = score.split(" ");
			
			name = temp [0];
			it = Integer.parseInt(temp[1]);
			japanese = Integer.parseInt(temp[2]);
			basic = Integer.parseInt(temp[3]);
			
			ScoreVO vo = new ScoreVO(name, it, japanese, basic);
			
			System.out.print(vo); 		// 화면으로
			bw.write(vo.toString()); 	//파일로
		}
		
		br.close();
		fr.close();
		
		bw.close();
		fw.close();
	}

}
