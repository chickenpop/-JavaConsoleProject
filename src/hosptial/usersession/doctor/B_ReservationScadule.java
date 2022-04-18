package hosptial.usersession.doctor;

import java.util.Scanner;

public class B_ReservationScadule {

	public void reservationScadule() {

		Scanner sc = new Scanner(System.in);
		C_PatientReservationList patientReservationList = new C_PatientReservationList();
		D_DoctorScadule doctorScadule = new D_DoctorScadule();

		while (true) {
			System.out.println("========================================");
			System.out.print("\t예약 스케줄 관리 메뉴\n");
			System.out.println("========================================");
			System.out.println("1. 환자 예약 목록 조회");
			System.out.println("2. 의사 스케쥴 관리");
			System.out.println("0. 뒤로가기");
			System.out.println("========================================");
			System.out.print("번호 : ");
			int input = sc.nextInt();

			if (input == 0) {
				System.out.println("뒤로가기");
				return;

			} else if (input == 1) {
				patientReservationList.patientReservationList();

			} else {
				doctorScadule.doctorScadule();
			}
		}

	}// patientList

}// class reservationScadule
