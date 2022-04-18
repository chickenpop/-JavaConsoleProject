package hosptial.Bbs;

public class BbsAnswer {

	private String bbsNo;
	private String sequence;
	private String userTypeCheck;
	private String text;
	private String date;
	
	public BbsAnswer(String bbsNo, String sequence, String userTypeCheck, String text, String date) {
		super();
		this.bbsNo = bbsNo;
		this.sequence = sequence;
		this.userTypeCheck = userTypeCheck;
		this.text = text;
		this.date = date;
	}

	public String getBbsNo() {
		return bbsNo;
	}

	public void setBbsNo(String bbsNo) {
		this.bbsNo = bbsNo;
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
	
}
