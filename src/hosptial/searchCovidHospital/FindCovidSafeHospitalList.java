package hosptial.searchCovidHospital;

import java.util.ArrayList;
import java.util.Scanner;

// 국민안심병원 목록 출력창
public class FindCovidSafeHospitalList {

	private static ArrayList<CovidSafeHospital> list = new ArrayList<CovidSafeHospital>(50);

	public FindCovidSafeHospitalList(ArrayList<CovidSafeHospital> list) {
		FindCovidSafeHospitalList.list = list;
	}

	public static boolean searchCovidSafeHospital() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			
			CovidOutput.findPage("국민안심병원");
			if(list.size() > 0) {

				System.out.println("[번호]\t[시도]\t[시군구]\t\t[기관명]\t\t\t[유형]\t\t\t[전화번호]");
				int cnt = 0;
				for(CovidSafeHospital c : FindCovidSafeHospitalList.list) {
					System.out.printf("%4d\t%3s\t%-16s \t%-15s\t%-10s\t%s\n"
											, ++cnt
											, c.getCity_do()
											, c.getSi_gu_gun()
											, c.getHospitalName().length() < 8 ? c.getHospitalName() + "\t" : c.getHospitalName()
											, (c.getTypeOFthreatment().equals("A") ? "외래진료" : "외래진료 및 입원")
											, c.getPhoneNumber());
				}		
				CovidOutput.bar(true);
			} else {
				System.out.println("해당되는 목록이 없습니다.");
				CovidOutput.bar(true);
			}
			
			System.out.print("0.다시검색하기: ");
			String keyWord = sc.nextLine();
			
			if(keyWord.equals("0")) {
				System.out.println("이전으로 돌아갑니다.");
				loop = false;
			} 
			
		}
		return true;
	}
	
}
