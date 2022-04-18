package hosptial.searchCovidHospital;

import java.util.ArrayList;
import java.util.Scanner;

// 호흡기 클리닉 검색창
public class SearchRespiratoryClinic {

	public static boolean searchRespiratoryClinic() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			CovidOutput.serachPage("호흡기 클리닉");
			String keyWord = sc.nextLine();
			
			if(keyWord.equals("0")) {
				System.out.println("이전으로 돌아갑니다.");
				loop = false;
			} else {
				
				// 키워드 검색
				// 시도, 시군구, 전화번호로 키워드
				ArrayList<RespiratoryClinic> list = Search.keyWordRespiratoryClinicList(keyWord);
				FindRespiratoryClinicList findList = new FindRespiratoryClinicList(list);
				findList.searchRespiratoryClinic();
			}
			
		}
		return true;
	}
	
}
