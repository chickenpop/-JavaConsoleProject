package hosptial.usersession.doctor;

// 처방전 클래스
public class Prescription {

	/*
	 
	   * 0 
	   * 유광재
	   * 951227-169638
	   * 1
	   * 이성원
	   * 바마마병원
	   * 우을증약
	   * 치의학과
	   * A544
	   
	 */
	
	private String patientType = "0";
	private String patientName;
	private String regNum;
	private String doctorType = "1";
	private String doctorName;
	private String hospitalName;
	private String medicine;
	private String department;
	private String diseaseCode;
	
	// constructor
	public Prescription(String patientType, String patientName, String regNum, String doctorType,
			String doctorName, String hospitalName, String medicine, String department,
			String diseaseCode) {
		super();
		this.patientType = patientType;
		this.patientName = patientName;
		this.regNum = regNum;
		this.doctorType = doctorType;
		this.doctorName = doctorName;
		this.hospitalName = hospitalName;
		this.medicine = medicine;
		this.department = department;
		this.diseaseCode = diseaseCode;
	}
	
	//getter, setter
	public String getPatientType() {
		return patientType;
	}
	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getDoctorType() {
		return doctorType;
	}
	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDiseaseCode() {
		return diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Prescription [patientType=%s, patientName=%s, regNum=%s, doctorType=%s, doctorName=%s, hospitalName=%s, medicine=%s, department=%s, diseaseCode=%s]",
				patientType, patientName, regNum, doctorType, doctorName, hospitalName, medicine,
				department, diseaseCode);
	}
	
	
	
	
	
	
}
