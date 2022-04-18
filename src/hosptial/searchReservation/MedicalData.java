package hosptial.searchReservation;

import java.util.Calendar;

public class MedicalData {
	/*
	 
	 고길지 -환자이름
	 370728-136349- 환자주민번호
	 2022-04-18-진료날짜
	 안기의원-병원
	 10:00-예약시간
	 황자웅-dr
	 259-drnum
	
	   
	 */
	
	private String patientName;
	private String patientRegNo;
	private String reservationDate;
	private String hospitalName;
	private String reservationTime;
	private String doctorName;
	private String doctorNum;
	
	public MedicalData(String patientName, String patientRegNo, String reservationDate,
			String hospitalName, String reservationTime, String doctorName, String doctorNum) {
		super();
		this.patientName = patientName;
		this.patientRegNo = patientRegNo;
		this.reservationDate = reservationDate;
		this.hospitalName = hospitalName;
		this.reservationTime = reservationTime;
		this.doctorName = doctorName;
		this.doctorNum = doctorNum;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientRegNo() {
		return patientRegNo;
	}

	public void setPatientRegNo(String patientRegNo) {
		this.patientRegNo = patientRegNo;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getReservationTime() {
		return reservationTime;
	}

	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorNum() {
		return doctorNum;
	}

	public void setDoctorNum(String doctorNum) {
		this.doctorNum = doctorNum;
	}

	@Override
	public String toString() {
		return String.format(
				"MedicalData [patientName=%s, patientRegNo=%s, reservationDate=%s, hospitalName=%s, reservationTime=%s, doctorName=%s, doctorNum=%s]",
				patientName, patientRegNo, reservationDate, hospitalName, reservationTime,
				doctorName, doctorNum);
	}
	
	

}
