package hosptial.test.paging;

/*

  코로나 병원 목록 조회를 10, 20, 30씩 목록의 일부를 보여주고,
  원하는 페이지를 선택할 수 있는 기능을 구현하려는 클래스
  이미지
  병원 목록 총 300, 페이지 30개씩
  
  [첫화면]
  병원 목록1
  병원 목록2
  ..
  병원 목록10
  [1]|2|3|4|...|10 
  원하는 페이지 선택 : 2
  
  [페이지 이동 후]
  병원 목록1
  병원 목록2
  ..
  병원 목록10
  1|[2]|3|...|10
  
*/

public class paging {

	public static void main(String[] args) {
		
		int currentPage = 1; // 현재 페이지
		int totalPage = 300; // 총 페이지
		int pageBlock = 10;  // 페이지 당 목록 수
		
		int currentBlock = currentPage/pageBlock;	// 현재 목록 번호
		int lastBlock = totalPage/pageBlock;		// 마지막 목록 번호
		int startNum = currentBlock*pageBlock+1;
		int endNum = currentBlock*pageBlock+pageBlock+1;
		
		for(int i=startNum; i<endNum; i++) {
			if(i>totalPage) break;
			if(i==currentPage) System.out.printf("[%d]", i);
			else System.out.printf("|%d|", i);
		}

		
	}
	
}

//package hosptial.searchCovidHospital;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// * 국민안심병원 검색 목록 출력하는 클래스입니다.
// * @author 박채은
// *
// */
//public class FindCovidSafeHospitalList {
//
//	private static ArrayList<CovidSafeHospital> list = new ArrayList<CovidSafeHospital>(50);
//
//	/**
//	 * 국민안심병원 목록을 입력받을 수 있습니다.
//	 * 국민안심병원 검색 클래스에서 탐색과정에서 저장된 목록을 받을 수 있습니다.
//	 * @param list 국민안심병원 목록
//	 */
//	public FindCovidSafeHospitalList(ArrayList<CovidSafeHospital> list) {
//		this.list = list;
//	}
//
//	/**
//	 * 검색 클래스에서 받은 국민안심병원 목록을 출력합니다.
//	 * 검색 클래스에서 받은 목록이 없으면 '해당되는 목록이 없습니다.'가 출력됩니다.
//	 * 뒤로가기 키워드를 입력받으면 loop를 빠져나가 메소드가 종료됩니다.
//	 * @return true 메소드 종료
//	 */
//	public static boolean searchCovidSafeHospital() {
//		Scanner sc = new Scanner(System.in);
//		boolean loop = true;
//		while(loop) {
//			
//			CovidOutput.findPage("국민안심병원", true);
//			if(list.size() > 0) {
//
//				System.out.println("[번호]\t[시도]\t[시군구]\t\t[기관명]\t\t\t[유형]\t\t\t[전화번호]");
//				int cnt = 0;
//				for(CovidSafeHospital c : FindCovidSafeHospitalList.list) {
//					System.out.printf("%4d\t%3s\t%-16s \t%-15s\t%-10s\t%s\n"
//											, ++cnt
//											, c.getCity_do()
//											, c.getSi_gu_gun()
//											, c.getHospitalName().length() < 8 ? c.getHospitalName() + "\t" : c.getHospitalName()
//											, (c.getTypeOFthreatment().equals("A") ? "외래진료" : "외래진료 및 입원")
//											, c.getPhoneNumber());
//				}		
//				CovidOutput.bar(true);
//			} else {
//				System.out.println("해당되는 목록이 없습니다.");
//				CovidOutput.bar(true);
//			}
//			
//			System.out.print("0.다시검색하기: ");
//			String keyWord = sc.nextLine();
//			
//			if(keyWord.equals("0")) {
//				System.out.println("이전으로 돌아갑니다.");
//				loop = false;
//			} 
//			
//		}
//		return true;
//	}
//	
//}
//
//
