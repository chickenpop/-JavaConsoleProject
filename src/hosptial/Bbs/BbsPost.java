package hosptial.Bbs;

public class BbsPost {
	
	private String sequence;
	private String grade;
	private String name;
	private String text;
	private String date;
	private String hospital;
	
	public BbsPost(String sequence, String grade, String name, String text, String date, String hospital) {
		super();
		this.sequence = sequence;
		this.grade = grade;
		this.name = name;
		this.text = text;
		this.date = date;
		this.hospital = hospital;
	}
	
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}
