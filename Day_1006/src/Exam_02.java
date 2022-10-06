/*int total = 152;         // 메일 총 개수
  int counterPerPage = 10; // 한페이지에 보일 메일 개수
  int totalPage = ?;       // 전체 페이지는 몇페이지일끼요?
  <결과>
  총 메일 개수 : 152개, 페이지 : 16페이지 */
public class Exam_02 {

	public static void main(String[] args) {
		int total = 152;
		int counterPerPage = 10;
		int totalPage = 0;
		//s나머지가 있으면 +1
		totalPage = total / counterPerPage;
		totalPage = (total % counterPerPage ==0) ? totalPage:totalPage+1;
		
		
		System.out.println(totalPage);
		

	}

}
