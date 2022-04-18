package hosptial.usersession.common;



public class Reservationdetail {
	//조기공 2022-04-27 바가바병원 14:00 
	private String personName;
	private String date;
	private String hospitalcheckupName;
	private String hour;
	



	public Reservationdetail(String personName,  String date,
			String hospitalcheckupName, String hour) {
		super();
		this.personName = personName;
	
		this.date = date;
		this.hospitalcheckupName = hospitalcheckupName;
		this.hour = hour;
	}


	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHospitalcheckupName() {
		return hospitalcheckupName;
	}

	public void setHospitalcheckupName(String hospitalcheckupName) {
		this.hospitalcheckupName = hospitalcheckupName;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}



	@Override
	public String toString() {
		return String.format(
				"Reservationdetail [personName=%s, date=%s, hospitalcheckupName=%s, hour=%s]",
				personName, date, hospitalcheckupName, hour);
	}

	



	
	
	
}
