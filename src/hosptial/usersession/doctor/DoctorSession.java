package hosptial.usersession.doctor;

import java.util.Scanner;
import hosptial.LoginSession;
import hosptial.domain.DoctorUser;
import hosptial.domain.User;

public class DoctorSession {

	public void main() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 환자 예약 목록 조회");
			System.out.println("2. 예약 스케쥴 관리");
			System.out.println("3. 처방전 작성");
			System.out.println("4. 통계 보기");
			System.out.println("5. 게시판 작성");
			System.out.println("0. 뒤로가기");
			System.out.print("번호 : ");
			int input = sc.nextInt();
			
			if(input==0) {
				System.out.println("뒤로가기");
				return;
			} else if(input==1) {
				System.out.println("환자 예약 목록 조회");				
			} else if(input==2) {
				System.out.println("예약 스케쥴 관리");
			} else if(input==3) {
				System.out.println("처방전 작성");
			} else if(input==4) {
				System.out.println("통계 보기");														////4.로그아웃
			} else if(input==5) {
				System.out.println("게시판 작성");
			} else {
				System.out.println("잘못입력");
			}
		}//while
	}

}
