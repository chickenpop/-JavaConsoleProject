package hosptial.myPage;

public class info {
	
	private String sequence;
	private String userTypeCheck;
	private String id;
	private String password;
	private String name;
	private String phoneNum;
	private String address;
	private String regNo;
	
	public info(String sequence, String userTypeCheck, String id, String password, String name, String phoneNum,
			String address, String regNo) {
		super();
		this.sequence = sequence;
		this.userTypeCheck = userTypeCheck;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.regNo = regNo;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getUserTypeCheck() {
		return userTypeCheck;
	}

	public void setUserTypeCheck(String userTypeCheck) {
		this.userTypeCheck = userTypeCheck;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

}
