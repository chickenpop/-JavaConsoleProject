package hosptial;

public class Output {

	public static void main() {
		System.out.println("=====================================");
		System.out.println("\t메인페이지입니다.");
		System.out.println("=====================================");
	}
	public static void logout() {
		System.out.println("=====================================");
		System.out.println("로그인 상태입니다 로그아웃을 먼저 해주세요.");
		System.out.println("=====================================");
	}
	
	public static void menu() {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.코로나 안심병원 찾기");
		System.out.println("4.로그아웃");
		System.out.println("0.종료");
	}
	
	public static void exit() {
		System.out.println("=====================================");
		System.out.println();
		System.out.println("\t종료되었습니다.");
		System.out.println();
		System.out.println("=====================================");
	}
	public static void stop() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("잘못 입력하셨습니다.");
		System.out.println("3초뒤 다시 시작됩니다.");
		System.out.println("=====================================");
		System.out.println();
	}
	public static void logoutSuccess() {
		System.out.println("=====================================");
		System.out.println("\t로그아웃 하셨습니다.");
		System.out.println("=====================================");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Output.java Thread Error");
		}
	}
	public static void logoutFail() {
		System.out.println("=====================================");
		System.out.println("\t로그아웃에 실패하셨습니다.");
		System.out.println("로그인 상태가 아닙니다.");
		System.out.println("=====================================");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Output.java Thread Error");
		}
	}

}
