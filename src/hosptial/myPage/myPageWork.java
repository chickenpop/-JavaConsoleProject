package hosptial.myPage;

import java.util.Scanner;

import hosptial.LoginSession;
import hosptial.Bbs.BbsData;
import hosptial.Bbs.BbsOutput;
import hosptial.Bbs.BbsPost;
import hosptial.domain.User;

public class myPageWork {

	private Scanner scan;

	public myPageWork() {
		this.scan = new Scanner(System.in);
	}

	public void modify() {

		User user = LoginSession.getSession();

		myPageOutPut.subTitle("수정하기");

		info result = null;

		for (info a : myPageData.infolist) {
			if (a.getSequence().equals(Long.toString(user.getSequence()))) {
				result = a;
				break;
			}

		}

		if (result != null) {
			System.out.print("비밀번호(미수정시 엔터입력) : ");
			String password = scan.nextLine();

			if (!password.equals("")) {
				result.setPassword(password);
			}

			System.out.print("이름(미수정시 엔터입력) : ");
			String name = scan.nextLine();

			if (!name.equals("")) {
				result.setName(name);
			}

			System.out.print("핸드폰 번호(미수정시 엔터입력) : ");
			String phoneNum = scan.nextLine();

			if (!phoneNum.equals("")) {
				result.setPhoneNum(phoneNum);
			}

			System.out.print("주소(미수정시 엔터입력) : ");
			String address = scan.nextLine();

			if (!address.equals("")) {
				result.setAddress(address);
			}

		}

		myPageData.infoSave();

		System.out.println();
		System.out.println("수정 완료");
		System.out.println();

	}

	public void delete() {

		info result = null;

		User user = LoginSession.getSession();

		for (info a : myPageData.infolist) {
			if (a.getSequence().equals(Long.toString(user.getSequence()))) {
				result = a;
				break;
			}
		}

		if (result != null) {
			myPageData.infolist.remove(result);
			myPageData.infoSave();
			System.out.println("회원탈퇴 완료");
		}

	}

	public void medicalInfo() {

		medicalInfo result = null;

		User user = LoginSession.getSession();

		BbsOutput.subtiltle("진료 내역");

		for (medicalInfo b : myPageData.medicalInfoList) {
			if (b.getRegNo().equals(user.getRegNo())) {
				result = b;
				break;
			}
		
		}
		
		if (result != null) {
			
			System.out.println("[회원이름]\t[주민번호]\t[증상]\t[날짜]\t[병원명]\t[시간]\t[의사이름]");
			System.out.printf("%s\t%2s\t%2s\t%2s\t%s\t%s\t%s\n"
					, result.getPatientName()
					, result.getRegNo()
					, result.getSymptom()
					, result.getDate()
					, result.getHospital()
					, result.getTime()
					, result.getDoctorName());
		}

		System.out.println();

		System.out.println();

	}

}
