package hosptial.myPage;

public class medicalInfo {
	
	private String PatientName;
	private String RegNo;
	private String Symptom;
	private String Date;
	private String Hospital;
	private String Time;
	private String DoctorName;
	
	public medicalInfo(String patientName, String regNo, String symptom, String date, String hospital, String time,
			String doctorName) {
		super();
		PatientName = patientName;
		RegNo = regNo;
		Symptom = symptom;
		Date = date;
		Hospital = hospital;
		Time = time;
		DoctorName = doctorName;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getSymptom() {
		return Symptom;
	}
	public void setSymptom(String symptom) {
		Symptom = symptom;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getHospital() {
		return Hospital;
	}
	public void setHospital(String hospital) {
		Hospital = hospital;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	
}
