package hosptial.signup;

public class CommonUserSignup extends UserSignup {

	public boolean main() {
		
		SingupOutput.commonUserSignupMain();
		
		//sequence, UsertType, id, pw, 이름, 전화번호, 주소, 주민번호
		boolean loop = true;
		while(loop) {
			
			idInputCheck("0");					//0 일반유저
			if(escapeCheck()) return false;

			pwInputCheck();
			if(escapeCheck()) return false;
			
			nameInputCheck();
			if(escapeCheck()) return false;
			
			phoneNumberInputCheck();
			if(escapeCheck()) return false;
			
			addressInputCheck();
			if(escapeCheck()) return false;

			regNoInputCheck();
			if(escapeCheck()) return false;
			
			save("0");	//0 일반유저
			loop = false;
		}//while
		return true;
			
	}
	
}
