package hosptial;

import java.util.Scanner;
import hosptial.domain.User;
import hosptial.login.LoginMain;
import hosptial.searchCovidHospital.SearchCovidHospitalMain;
import hosptial.signup.SignupMain;
import hosptial.usersession.admin.AdminSession;
import hosptial.usersession.common.CommonUserSesstion;
import hosptial.usersession.doctor.A_DoctorSession;

public class Main {	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Output.main();
			Output.menu();
			System.out.print("번호 : ");
			int input = sc.nextInt();
			
			if(input==0) {
				Output.exit();
				sc.close();
				System.exit(0);
			} else if(input==1) {
				if(LoginSession.getSession()!=null) {
					Output.logout();
					continue;
				}
				LoginMain longinMain = new LoginMain();								////1.로그인
				longinMain.login();					
			} else if(input==2) {
				if(LoginSession.getSession()!=null) {
					Output.logout();
					continue;
				}
				SignupMain signUpMain = new SignupMain();							////2.회원가입
				signUpMain.signUp();				
			} else if(input==3) {
				SearchCovidHospitalMain covidMain = new SearchCovidHospitalMain();	////3.코로나 안심병원 찾기
				covidMain.searchCovidHospital();
			} else if(input==4) {
				logoutCheck();														////4.로그아웃
			} else {
				Output.stop();
				Thread.sleep(3000);
			}
			
			if(LoginSession.getSession()!=null) userSesstion();

		}//while
		
	}

	private static void logoutCheck() {
		if(LoginSession.getSession()!=null) {
			LoginSession.setSession(null);
			try {
				if(LoginSession.getSession()==null) 
					Output.logoutSuccess();
			} catch (Exception e) {
				System.out.println("로그아웃 시도중 에러가 발생했습니다.");
				e.printStackTrace();
			}
		} else {
			Output.logoutFail();
		}//if
	}//logoutCheck
	
	private static void userSesstion() {
		User currentUser = LoginSession.getSession();
		Long userType = currentUser.getUserTypeCheck();
		
		if(userType == -1) {
			AdminSession ad = new AdminSession();
			ad.main();
		} else if(userType == 0) {
			CommonUserSesstion cs = new CommonUserSesstion();
			cs.main();
		} else if(userType == 1) {
			A_DoctorSession ds = new A_DoctorSession();
			ds.main();
		}
	}

}
