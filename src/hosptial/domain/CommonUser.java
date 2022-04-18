package hosptial.domain;

public class CommonUser extends User {

	public CommonUser(long sequence, long userTypeCheck, String id, String password, String name,
			String phoneNum, String address, String regNo) {
		
		super(sequence, userTypeCheck, id, password, name, phoneNum, address, regNo);
		
	}


	
}
