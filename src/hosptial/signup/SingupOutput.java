package hosptial.signup;

public class SingupOutput {

	public static void main() {
		System.out.println("=====================================");
		System.out.println("\t회원가입 페이지입니다.");
		System.out.println("=====================================");
	}
	public static void loginInfo() {
		System.out.println("====================================");
		System.out.println("\t회원 정보를 입력해주세요.");
		System.out.println("====================================");
	}
	public static void singupsuccess() {
		System.out.println("====================================");
		System.out.println("\t회원가입에 성공했습니다.");
		System.out.println("잠시후 메인화면에 돌아갑니다...");
		System.out.println("====================================");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("hosptial.signup.SingupOutput 에서 발생한 Thread 에러입니다.");
		}
	}
	public static void menu() {
		System.out.println("1. 일반 회원");
		System.out.println("2. 의사 회원");
		System.out.println("0. 뒤로가기");
		
	}
	
	public static void doctorSignupMain() {
		System.out.println("=====================================");
		System.out.println("\t의사 회원 회원가입 페이지입니다.");
		System.out.println("=====================================");
	}
	
	public static void commonUserSignupMain() {
		System.out.println("=====================================");
		System.out.println("\t일반 회원 회원가입 페이지입니다.");
		System.out.println("=====================================");
	}
	
	public static void signupFileError() {
		System.out.println();
		System.out.println("====================");
		System.out.println("관리자에게 문의해주세요.");
		System.out.println("====================");
		System.out.println();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("hosptial.signup.SingupOutput 에서 발생한 Thread 에러입니다.");
		}
	}
	
	public static void idMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("5~16자 사이의 영어 소문자 및 숫자만을 입력할 수 있습니다.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void pwMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("10~16자 사이의 영어 대문자 및 숫자만을 입력할 수 있습니다.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void nameMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("2~5자 사이의 한글만을 입력할 수 있습니다.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void phoneNumberMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("000-000-000 형식의 번호를 입력해주세요.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void departmentLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("진료과목명은 한글만 입력가능합니다.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void addressMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("주소는 한글만 기입가능합니다.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void regNoMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("930967-1111111 형식으로 입력해주세요.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void licenseNumberMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("의사등록 면허번호 5자리를 입력해주세요");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void operatingTimeMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("9:00~18:00 형식으로 입력해주세요.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	public static void hospitalNameMenuLogicFail() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("병원명은 한글만 입력할 수 있습니다.");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}
	
	public static void isDuplicate() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("이미 가입되어있는 회원입니다...");
		System.out.println("0.이전메뉴");
		System.out.println("다시 입력하시려면 아무키나 눌러주세요.");
		System.out.println("=====================================");
	}

}
