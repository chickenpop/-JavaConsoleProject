package hosptial.searchCovidHospital;

// 국민안심병원
public class CovidSafeHospital {

	/*
	
	  시도 city_do
	  시군구 si_gu_gun
	  기관명 hospitalName
	  주소 hospitaladress
	  진료유형 typeOfTreatment : A: 외래진료, B: 외래진료 및 입원
	  전화번호 phoneNumber
	  
	*/
	
	private String city_do;
	private String si_gu_gun;
	private String hospitalName;
	private String hospitaladress;
	private String typeOFthreatment;
	private String phoneNumber;
	
	public CovidSafeHospital(String city_do, String si_gu_gun, String hospitalName,
			String hospitaladress, String typeOFthreatment, String phoneNumber) {
		this.city_do = city_do;
		this.si_gu_gun = si_gu_gun;
		this.hospitalName = hospitalName;
		this.hospitaladress = hospitaladress;
		this.typeOFthreatment = typeOFthreatment;
		this.phoneNumber = phoneNumber;
	}
	
	public String getCity_do() {
		return city_do;
	}

	public void setCity_do(String city_do) {
		this.city_do = city_do;
	}

	public String getSi_gu_gun() {
		return si_gu_gun;
	}

	public void setSi_gu_gun(String si_gu_gun) {
		this.si_gu_gun = si_gu_gun;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitaladress() {
		return hospitaladress;
	}

	public void setHospitaladress(String hospitaladress) {
		this.hospitaladress = hospitaladress;
	}

	public String getTypeOFthreatment() {
		return typeOFthreatment;
	}

	public void setTypeOFthreatment(String typeOFthreatment) {
		this.typeOFthreatment = typeOFthreatment;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.format(
				"CoronaSafeHospital [city_do=%s, si_gu_gun=%s, hospitalName=%s, hospitaladress=%s, typeOFthreatment=%s, phoneNumber=%s]",
				city_do, si_gu_gun, hospitalName, hospitaladress, typeOFthreatment, phoneNumber);
	}
	
	
}
