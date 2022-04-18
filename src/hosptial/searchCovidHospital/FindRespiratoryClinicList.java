package hosptial.searchCovidHospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FindRespiratoryClinicList {

	private static ArrayList<RespiratoryClinic>	list = new ArrayList<RespiratoryClinic>(50);
	
	public FindRespiratoryClinicList(ArrayList<RespiratoryClinic> list) {
		this.list = list;
	}
	
	public static boolean searchRespiratoryClinic() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			
			CovidOutput.findPageLarge("호흡기 클리닉");
			if(list.size() > 0) {
				System.out.println("[번호]\t[시도]\t[시군구]\t\t[기관명]\t\t\t[주소]\t\t\t\t\t[운영시간]\t\t\t\t[전화번호]");
				
				// 시도, 시군구, 기관명, 신속항원검사 rat : (O, X), 주소, 운영시간 공휴일, 운영시간 평일, 운영시간 주말, 전화번호 
				
				list.stream().forEach(s -> {
					
					String adress = s.getHospitaladress()
							.substring(s.getHospitaladress().indexOf(s.getSi_gu_gun().substring(s.getSi_gu_gun().length()-1))+1)
							.trim();
					if(adress.contains("(")) {			
						adress = adress.substring(0, adress.indexOf("("));
					}

					String name = s.getRat().equals("O") ? s.getHospitalName() + "*" : s.getHospitalName();
					name = name.length() < 7 ? name + "*" : name;
					
					//System.out.printf("[%-4d]\t[%-4s]\t[%-15s][%-26s]\t[%-30s]\t[공:%s] [평:%s] [주:%s]\t[%4s]\n"
					System.out.printf("%-4d\t%-4s\t%-15s\t%-26s\t%-30s\t공:%s 평:%s 주:%s\t%4s\n"
											, list.indexOf(s)+1
											, s.getCity_do()
											, s.getSi_gu_gun()
											, s.getRat().equals("O") ? s.getHospitalName() + "*" : s.getHospitalName()
											, adress 
											, s.getHospitalOperatingTimeHoliday(), s.getHospitalOperatingTimeWeekday(), s.getHospitalOperatingTimeWeekend()
											, s.getPhoneNumber());
				});
				
				CovidOutput.Largebar();
				System.out.println("공: 공휴일 평: 평일 주: 주말 신속항원검사(RAT) 가능: *");
				System.out.println("목록 출력이 완료되었습니다.");
			} else {
				System.out.println("해당되는 목록이 없습니다.");
			}
			
			System.out.println("0.다시검색하기");
			String keyWord = sc.nextLine();
			
			if(keyWord.equals("0")) {
				System.out.println("이전으로 돌아갑니다.");
				loop = false;
			} 
			
		}
		return true;
	}

}
