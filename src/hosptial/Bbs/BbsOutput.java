package hosptial.Bbs;

public class BbsOutput {
	
	public static void bbstitle() {
		System.out.println("========================================");
		System.out.println("           게시판");
		System.out.println("========================================");
	}
	
	public static void bbsmain() {
		System.out.println("(1. 후기 2. 질의응답 0. 뒤로가기)");
		System.out.print("번호를 입력하세요 : ");
	}
	
	public static void subtiltle(String title) {
		System.out.println();
		System.out.println();
		System.out.println("========================================");
		System.out.println("           " + title);
		System.out.println("========================================");
	}
	
	public static void post() {
		System.out.println("(1. 상세보기 2. 글 쓰기 3. 삭제하기 0. 뒤로가기)");
		System.out.print("번호를 입력하세요. : ");
	}
	
	public static void question() {
		System.out.println("(1. 질문하기 2. 상세보기 3. 대답하기 0. 뒤로가기)");
		System.out.print("번호를 입력하세요. : ");
	}
	

}
