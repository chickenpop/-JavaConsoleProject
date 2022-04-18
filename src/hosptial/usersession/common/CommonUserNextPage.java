package hosptial.usersession.common;

import java.util.Scanner;

public class CommonUserNextPage {

	public static boolean page() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			
			System.out.println("증상페이지");
			System.out.println("0.다시검색하기");
			String keyWord = sc.nextLine();
			
			if(keyWord.equals("0")) {
				System.out.println("이전으로 돌아갑니다.");
				loop = false;
			} 
			
		}
		return true;
	}
	
	
}
