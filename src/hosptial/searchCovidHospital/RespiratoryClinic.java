package hosptial.searchCovidHospital;

// 호흡기 클리닉 
public class RespiratoryClinic {

	/*
	
	  시도 city_do
	  시군구 si_gu_gun
	  기관명 hospitalName
	  신속항원검사 rat : O, X
	  주소 hospitaladress
	  운영시간 공휴일 hospitalOperatingTimeHoliday
	  운영시간 평일 hospitalOperatingTimeWeekday
	  운영시간 주말 hospitalOperatingTimeWeekend
	  전화번호 phoneNumber
	
	*/

	private String city_do;
	private String si_gu_gun;
	private String hospitalName;
	private String rat;
	private String hospitaladress;
	private String hospitalOperatingTimeHoliday;
	private String hospitalOperatingTimeWeekday;
	private String hospitalOperatingTimeWeekend;
	private String phoneNumber;
	
	public RespiratoryClinic(String city_do, String si_gu_gun, String hospitalName, String rat,
			String hospitaladress, String hospitalOperatingTimeHoliday,
			String hospitalOperatingTimeWeekday, String hospitalOperatingTimeWeekend,
			String phoneNumber) {
		super();
		this.city_do = city_do;
		this.si_gu_gun = si_gu_gun;
		this.hospitalName = hospitalName;
		this.rat = rat;
		this.hospitaladress = hospitaladress;
		this.hospitalOperatingTimeHoliday = hospitalOperatingTimeHoliday;
		this.hospitalOperatingTimeWeekday = hospitalOperatingTimeWeekday;
		this.hospitalOperatingTimeWeekend = hospitalOperatingTimeWeekend;
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

	public String getRat() {
		return rat;
	}

	public void setRat(String rat) {
		this.rat = rat;
	}

	public String getHospitaladress() {
		return hospitaladress;
	}

	public void setHospitaladress(String hospitaladress) {
		this.hospitaladress = hospitaladress;
	}

	public String getHospitalOperatingTimeHoliday() {
		return hospitalOperatingTimeHoliday;
	}

	public void setHospitalOperatingTimeHoliday(String hospitalOperatingTimeHoliday) {
		this.hospitalOperatingTimeHoliday = hospitalOperatingTimeHoliday;
	}

	public String getHospitalOperatingTimeWeekday() {
		return hospitalOperatingTimeWeekday;
	}

	public void setHospitalOperatingTimeWeekday(String hospitalOperatingTimeWeekday) {
		this.hospitalOperatingTimeWeekday = hospitalOperatingTimeWeekday;
	}

	public String getHospitalOperatingTimeWeekend() {
		return hospitalOperatingTimeWeekend;
	}

	public void setHospitalOperatingTimeWeekend(String hospitalOperatingTimeWeekend) {
		this.hospitalOperatingTimeWeekend = hospitalOperatingTimeWeekend;
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
				"RespiratoryClinic [city_do=%s, si_gu_gun=%s, hospitalName=%s, rat=%s, hospitaladress=%s, hospitalOperatingTimeHoliday=%s, hospitalOperatingTimeWeekday=%s, hospitalOperatingTimeWeekend=%s, phoneNumber=%s]",
				city_do, si_gu_gun, hospitalName, rat, hospitaladress, hospitalOperatingTimeHoliday,
				hospitalOperatingTimeWeekday, hospitalOperatingTimeWeekend, phoneNumber);
	}

	
}
