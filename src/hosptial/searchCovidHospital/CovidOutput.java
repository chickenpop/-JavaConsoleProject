package hosptial.searchCovidHospital;

public class CovidOutput {

	public static void main() {
		System.out.println("================================================");
		System.out.println("\t코로나 안심병원 찾기 서비스입니다.");
		System.out.println("================================================");
	}

	public static void menu() {
		System.out.println("1. 국민안심병원");
		System.out.println("2. 호흡기 전담 클리닉");
		System.out.println("3. 선별진료소");
		System.out.println("4. 임시 선별진료소");
		System.out.println("5. 자동차 이동형 선별진료소");
		System.out.println("0. 뒤로가기");
		System.out.println("================================================");
	}

	public static void serachPage(String title) {
		System.out.println("================================================================");
		System.out.printf("\t\t%s찾기 검색창입니다.\n", title);
		System.out.println("================================================================");
		System.out.println("시도, 시군구, 기관명, 전화번호를 통합 검색합니다.");
		System.out.println("검색어 예시 : \'서울\'  또는 \'강남구\' 또는 \'대학교병원\', \'02\'");
		System.out.println("================================================================");
		System.out.print("검색어를 입력해주세요(0.뒤로가기):");
	}
	
	public static void findPage(String pageName) {
		System.out.println("==============================================================================================================");
		System.out.printf("\t\t\t\t\t%s 목록창입니다.\n", pageName);
		System.out.println("==============================================================================================================");
	}
	
	public static void findPage(String pageName, boolean flag) {
		System.out.print("=================================================================================================================");
		System.out.println("====================================================");
		System.out.printf("\t\t\t\t\t\t\t\t\t%s 목록창입니다.\n", pageName);
		if(flag) {
			System.out.print("=================================================================================================================");
			System.out.println("====================================================");			
		}
	}
	
	public static void bar(boolean flag) {
		if(flag) {
			System.out.println("==============================================================================================================");			
		} else {
			System.out.print("=================================================================================================================");
			System.out.println("====================================================");
		}
	}

	
}
