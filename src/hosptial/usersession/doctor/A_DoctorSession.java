package hosptial.usersession.doctor;

import java.util.Scanner;
import hosptial.LoginSession;
import hosptial.domain.DoctorUser;

public class A_DoctorSession {

	DoctorUser user = (DoctorUser) LoginSession.getSession();
	
	public void main() {

		// 전전으로 가고싶으면 void 말고 boolean 사용해볼것.

		Scanner sc = new Scanner(System.in);
		B_ReservationScadule reservationScadule = new B_ReservationScadule();
		E_Write_Prescription prescription = new E_Write_Prescription();
		F_PatientAverage patientAverage = new F_PatientAverage();

		while (true) {
			System.out.println("========================================");
			System.out.printf("\t의사 %s님 환영합니다.\n", user.getName());
			System.out.println("========================================");
			System.out.println("1. 예약스케줄 관리");
			System.out.println("2. 처방전 작성");
			System.out.println("3. 통계보기");
			System.out.println("0. 뒤로가기");
			System.out.println("========================================");
			System.out.print("번호 : ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("뒤로가기");
				return;

			} else if (input == 1) {
				reservationScadule.reservationScadule();

			} else if (input == 2) {
				prescription.prescription();
			} else if (input == 3) {
				patientAverage.patientAverage();
				System.out.println("통계 보기"); // 3.로그아웃

			} else {
				System.out.println("잘못입력하셨습니다.");

			}
		} // while

	}// main

}// class
