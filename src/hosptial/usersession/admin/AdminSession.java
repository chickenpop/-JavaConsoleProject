package hosptial.usersession.admin;

import java.util.Scanner;
import hosptial.usersession.admin.forummanagement.ForumnManagementMain;
import hosptial.usersession.admin.membermanagement.MemberManagementMain;

public class AdminSession {

	public void main() {
		
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			
			AdminSessionOutput.adminMain();
			int input = sc.nextInt();
			
			if(input==0) {
				loop = false;
			} else if(input==1) {
				//TODO 멤버관리
				MemberManagementMain member = new MemberManagementMain();
				member.main();			
			} else if(input==2) {
				//TODO 게시판관리
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

}
