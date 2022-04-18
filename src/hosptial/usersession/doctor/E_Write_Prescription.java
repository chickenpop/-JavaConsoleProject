package hosptial.usersession.doctor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import hosptial.DataPath;
import hosptial.LoginSession;
import hosptial.domain.DoctorUser;
import hosptial.domain.User;

public class E_Write_Prescription {

	DoctorUser user = (DoctorUser) LoginSession.getSession();
	public static ArrayList<Prescription> prescription = new ArrayList<Prescription>();
	
	public void prescription() {
		// 처방전 데이터 로드
		patientLoad(prescription);
		// 처방전 작성하기
		// 양식
		// 0,이경석,240411-226413,1,박형동,차사가병원,감기약,소아청소년과,B1026
		// 약 이름 데이터 만드신분 감기약이 김기약이라고 되어있음 확인

		//ArrayList<Prescription> prescription = new ArrayList<Prescription>();
		Scanner scan = new Scanner(System.in);


		// 로그인한 의사정보 가져오기
		DoctorUser doctorUser = (DoctorUser) LoginSession.getSession();

		System.out.println("========================================");
		System.out.println("\t    처방전 작성");
		System.out.println("========================================");

		System.out.println("처방전 작성 가능한 환자 목록");
		ArrayList<Prescription> plist = new ArrayList<Prescription>();
		int cnt = 0;
		for(Prescription p : prescription) {
			if(p.getDoctorName().equals(user.getName()) && p.getMedicine().equals("-")) {
				System.out.printf("%d. %s\n", ++cnt, p.getPatientName());
				plist.add(p);
			}
		}
		System.out.println("========================================");
		System.out.print("처방전 작성 환자 선택(예시 1): ");
		String in = scan.nextLine();
		Prescription pick = plist.get(Integer.parseInt(in)-1);
		System.out.printf("선택환자 : %s, %s\n", pick.getPatientName(), pick.getRegNum());
		// 처방약과 질병코드를 입력
		System.out.println("처방약과 질병코드를 입력하세요");

		// 의사가 작성할수있게 만들기
		System.out.print("처방약 : ");
		String medicine = scan.nextLine();
		pick.setMedicine(medicine);

		// 의사가 작성할수있게 만들기
		System.out.print("질병코드 : ");
		String code = scan.nextLine();
		pick.setDiseaseCode(code);
		System.out.println("========================================");
		System.out.println("\t    작성된 처방전");
		System.out.println("========================================");
		System.out.printf("처방전 환자명: %s\n주민번호: %s\n처방약:%s\n질병코드: %s\n"
								, pick.getPatientName()
								, pick.getRegNum()
								, pick.getMedicine()
								, pick.getDiseaseCode());
		
		/*
		 
		   * 0 patientType
		   * 유광재 patientName
		   * 951227-169638 regNum
		   * 1  doctorType
		   * 이성원 String
		   * 바마마병원 hospitalName
		   * 우을증약 medicine
		   * 치의학과 department
		   * A544 diseaseCode
		   
		 */
		//System.out.println("처방전 작성 현황");
		//System.out.println(pick.toString());
		for(Prescription pre : prescription) {
			if(pre.getPatientName().equals(pick.getPatientName()) && pre.getDoctorName().equals(pick.getDoctorName())) {
				pre = pick;
			}
		}
		
		patientSave(prescription);
		System.out.println("========================================");
		System.out.println("처방전 작성 완료");
		System.out.println("========================================");
		
//		try {
//
//			// 예약한 환자 목록중 이름하고 주민번호 받아오기
//			BufferedReader patientReservationReader =
//					new BufferedReader(new FileReader(DataPath.환자목록));
//
//			String patientReservationLine = null;
//			while ((patientReservationLine = patientReservationReader.readLine()) != null) {
//
//			}
//
//			// 읽기 종료
//			patientReservationReader.close();
//
//			// 처방전 불러오기
//			BufferedReader prescriptionReader = new BufferedReader(new FileReader(DataPath.처방전));
//
//			String precriptionLine = null;
//			String[] tmp = new String[9];
//			while ((precriptionLine = prescriptionReader.readLine()) != null) {
//
//				// 0,이경석,240411-226413,1,박형동,차사가병원,감기약,소아청소년과,B1026
//				// 212,1,hqr4z4,8Tpd2w48Ns,최진신,010-8477-7115,인천광역시 강북구 대치동,761102-123435
//
//				tmp = precriptionLine.split(",");
//
//				System.out.printf("0,%s,%s,1,%s,%s,%s,%s,%s",
//						tmp[1], tmp[2], doctorUser.getName(), doctorUser.getHospitalName(),
//						medicine, doctorUser.getDepartment(), code);
//				System.out.println();
//
//				// 메모리 배열 즉 저장
//				patientSave(prescription);
//
//			} // while
//
//			// 읽기 종료
//			prescriptionReader.close();
//
//
//		} catch (Exception e) {
//			System.out.println("E_Prescription.prescription");
//			e.printStackTrace();
//		}



	}// main

	public static void patientLoad(ArrayList<Prescription> list) {

		try {

			// 환자목록.txt 파일을 patientlist에 넣기
			BufferedReader patientReader = new BufferedReader(new FileReader(DataPath.처방전));

			String line = null;

			while ((line = patientReader.readLine()) != null) {

				//System.out.println(line);

				String[] temp = line.split(",");

				Prescription prescription = new Prescription(temp[0], temp[1], temp[2], temp[3],
						temp[4], temp[5], temp[6], temp[7], temp[8]);

				list.add(prescription);

			} // while
			patientReader.close();

		} catch (Exception e) {
			System.out.println("FindPatientUserList.load");
			e.printStackTrace();
		}



	}// patientLoad

	public static void patientSave(ArrayList<Prescription> list) {

		try {

			// 환자목록을 메모리에 파일데이터로 저장
			// 뒤에 이어지게 하고싶으면 datapath뒤에 true 붙일것. 까먹지말것.
			// 덮어쓰기로 변경 true 삭제
			BufferedWriter patientWriter = new BufferedWriter(new FileWriter(DataPath.처방전));

			for (Prescription prescription : prescription) {
				/*
				   * 0 
				   * 유광재
				   * 951227-169638
				   * 1
				   * 이성원
				   * 바마마병원
				   * 우을증약
				   * 치의학과
				   * A544
				 */

				String line =
						String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n"
											, prescription.getPatientType()
											, prescription.getPatientName()
											, prescription.getRegNum()
											, prescription.getDoctorType()
											, prescription.getDoctorName()
											, prescription.getHospitalName()
											, prescription.getMedicine()
											, prescription.getDepartment()
											, prescription.getDiseaseCode());
				
				patientWriter.write(line);

			} // for

			patientWriter.close();

		} catch (Exception e) {
			System.out.println("FindPatientUserList.patientSave");
			e.printStackTrace();
		}



	}// patientSave


}// class
