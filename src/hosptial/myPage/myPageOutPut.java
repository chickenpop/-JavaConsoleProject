package hosptial.myPage;

public class myPageOutPut {
	
	public static void myPageTitle() {
		
		System.out.println("========================================");
		System.out.println("           마이페이지");
		System.out.println("========================================");
		
	}
	
	public static void myPageMain() {
		
		System.out.println("(1. 회원정보수정 2. 진료내역확인 3. 회원탈퇴 0. 뒤로가기)");
		System.out.println("번호를 입력하세요. : ");
		
	}
	
	public static void subTitle(String title) {
		
		System.out.println();
		System.out.println();
		System.out.println("========================================");
		System.out.println("           " + title);
		System.out.println("========================================");
		
	}

}
