package hosptial.signup;

public class DoctorSignup extends UserSignup {
	
	
	public boolean main() {
		
		SingupOutput.doctorSignupMain();
		
		boolean loop = true;
		while(loop) {
			
			idInputCheck("1");					//1 의사유저
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
			
			hospitalNameInputCheck();
			if(escapeCheck()) return false;
			
			operatingTimeInputCheck(1);			//1 : 평일
			if(escapeCheck()) return false;
			
			operatingTimeInputCheck(2);			//2 : 주말
			if(escapeCheck()) return false;
			
			operatingTimeInputCheck(3);			//3 : 공휴일 - 미운영으로 통일하기로 했음
			if(escapeCheck()) return false;
			
			licenseNumberInputCheck();
			if(escapeCheck()) return false;
			
			departmentInputCheck();
			if(escapeCheck()) return false;
			
			save("1");	//1 의사유저
			loop = false;
		}//while
		return true;
	}

}
