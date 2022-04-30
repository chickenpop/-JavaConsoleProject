package hosptial.usersession.admin;

import java.util.Scanner;
import hosptial.LoginSession;
import hosptial.Output;
import hosptial.usersession.admin.forummanagement.ForumnManagementMain;
import hosptial.usersession.admin.membermanagement.MemberManagementMain;

/**
 * 관리자 세션 메인클래스입니다.
 * @author joung
 *
 */
public class AdminSession {
	/**
	 * 관리자 세션 메인 화면실행 메서드입니다.
	 */
	public void main() {
		
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			
			AdminSessionOutput.adminMain();
			int input = sc.nextInt();
			
			if(input==0) {
				logoutCheck();
				return;
			} else if(input==1) {
				MemberManagementMain member = new MemberManagementMain();
				member.main();			
			} else if(input==2) {
				ForumnManagementMain forumn = new ForumnManagementMain();
				try {
					forumn.main();
				} catch (Exception e) {
					System.out.println("게시판 관리중 에러발생");
					e.printStackTrace();
				}
			}  else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
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
	}

}
