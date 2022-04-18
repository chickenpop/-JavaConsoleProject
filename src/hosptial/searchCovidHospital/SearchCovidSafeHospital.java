package hosptial.searchCovidHospital;

import java.util.ArrayList;
import java.util.Scanner;

// 국민안심병원 검색창
public class SearchCovidSafeHospital {
	

	public static boolean searchCovidSafeHospital() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			CovidOutput.serachPage("국민안심병원");
			String keyWord = sc.nextLine();
			
			if(keyWord.equals("0")) {
				System.out.println("이전으로 돌아갑니다.");
				loop = false;
			} else {
				
				// 키워드 검색
				// 시도, 시군구, 전화번호로 키워드
				ArrayList<CovidSafeHospital> list = Search.keyWordCovidSafeList(keyWord);
				FindCovidSafeHospitalList findList = new FindCovidSafeHospitalList(list);
				findList.searchCovidSafeHospital();
			}
			
		}
		return true;
	}
	
}
