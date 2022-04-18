package hosptial.usersession.common;

import java.util.Scanner;
import hosptial.Bbs.Bbs;
import hosptial.myPage.myPage;
import hosptial.searchReservation.Search;

public class CommonUserSesstion {

	public void main() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. 마이페이지");
			System.out.println("2. 증상별 검색");
			System.out.println("3. 키워드 검색");
			System.out.println("4. 진료과별 검색");
			System.out.println("5. 건강검진");
			System.out.println("6. 게시판 작성");
			System.out.println("7. 로그아웃");
			System.out.println("0. 뒤로가기");
			System.out.print("번호 : ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("뒤로가기");
				return;

			} else if (input == 1) {
				myPage a = new myPage();
				a.main();

			} else if (input == 2) {
				Search search = new Search();
				search.symptomSearch();

			} else if (input == 3) {
				Search search = new Search();
				search.partSearch();

			} else if (input == 4) {
				Search search = new Search();
				search.medicalSearch();
				//// 4.로그아웃

			} else if (input == 5) {
				Checkup checkup = new Checkup();
				checkup.checkup();

			} else if (input == 6) {
				Bbs b = new Bbs();
				b.main();

			} else if (input == 7) {
				// TODO 메서드 만들어서 기능구현
				System.out.println("확인용");

			} else {
				System.out.println("잘못입력");
			}

		} // while

	}

}
