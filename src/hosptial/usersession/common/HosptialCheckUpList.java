package hosptial.usersession.common;

public class HosptialCheckUpList {

	private String hosptialName;
	private String hosptialTime;
	private String common;
	private String genderAge;
	private String cancer;
	
	public HosptialCheckUpList(String hosptialName, String hosptialTime, String common,
			String genderAge, String cancer) {
		super();
		this.hosptialName = hosptialName;
		this.hosptialTime = hosptialTime;
		this.common = common;
		this.genderAge = genderAge;
		this.cancer = cancer;
	}

	public String getHosptialName() {
		return hosptialName;
	}

	public void setHosptialName(String hosptialName) {
		this.hosptialName = hosptialName;
	}

	public String getHosptialTime() {
		return hosptialTime;
	}

	public void setHosptialTime(String hosptialTime) {
		this.hosptialTime = hosptialTime;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getGenderAge() {
		return genderAge;
	}

	public void setGenderAge(String genderAge) {
		this.genderAge = genderAge;
	}

	public String getCancer() {
		return cancer;
	}

	public void setCancer(String cancer) {
		this.cancer = cancer;
	}

		
	@Override
	public String toString() {
		return String.format(
				"HosptialCheckUpList [hosptialName=%s, hosptialTime=%s, common=%s, genderAge=%s, cancer=%s]",
				hosptialName, hosptialTime, common, genderAge, cancer);
	}
	
}
