package hosptial.signup;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import hosptial.DataPath;

public class LogicCheck {
	private ArrayList<String> list;
	
	public LogicCheck() {
		list = new ArrayList<String>();
		fileReader();
	}
	
	public long getSequence() {
		long max = 0;
		for(String s : list) {
			long temp = Long.parseLong(s.split(",")[0]);
			if(temp > max) max = temp;
		}
		long sequence = ++max;
		
		return sequence;
	}

	public void fileReader() {
		String path = DataPath.userData;
		File file = new File(path);
		
		if(file.exists()) {
			try(BufferedReader br = new BufferedReader(new FileReader(file))) {
				String loop = null;
				
				while((loop=br.readLine())!=null) {
					if(loop.equals("")) continue;
					list.add(loop);
				}	
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			SingupOutput.signupFileError();
		}//if
	}
	
	public boolean idLogicCheck(String input) {
		if(input==null || (input.length()<5 || input.length()>16)) return false;
		String format = "^[a-z0-9]*$";
		return Pattern.matches(format, input);
	}
	
	public boolean pwLogicCheck(String input) {
		if(input==null || (input.length()<10 || input.length()>16)) return false;	
		String format = "^[a-zA-Z0-9]*$";
		return Pattern.matches(format, input);
	}
	
	public boolean nameLogicCheck(String input) {
		if(input==null || (input.length()<2 || input.length()>5)) return false;
		String format = "^[가-힣]*$";
		return Pattern.matches(format, input);
	}
	public boolean phoneNumberLogicCheck(String input) {
		if(input==null) return false;
		String format = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";	//휴대폰 번호만 체크가능
		return Pattern.matches(format, input);
	}
	public boolean regNoCheck(String input) {
		if(input==null) return false;
		String format = "\\d{6}\\-[1-4]\\d{6}";
		if(regNoLogicCheck(input)) return false;
		return Pattern.matches(format, input);
	}
	//TODO 주민번호 로직체크 아직 추가x
	public boolean regNoLogicCheck(String input) {
		//로직체크 성공하면 true 리턴
		return false;
	}
	//TODO 이건 나중에 추가 아직 주소는 한글입력 외 미구현임 + 의사 본인 병원 지역 등록이랑 똑같이 사용 ㄱㄱ
	public boolean addressLogicCheck(String input) {
		if(input==null || input.length()<8) return false;
		String format = "^[가-힣\s]*$";
		return Pattern.matches(format, input);
	}
	
	public boolean departmentLogicCheck(String input) {
		if(input==null || input.length()<2) return false;
		String format = "^[가-힣\s]*$";
		return Pattern.matches(format, input);
	}
	public boolean hospitalNameLogicCheck(String input) {
		if(input==null || input.length()<3) return false;
		String format = "^[가-힣\s]*$";
		return Pattern.matches(format, input);
	}
	//TODO 의사 면허도 이해못해서 일단 미구현
	public boolean licenseNumberLogicCheck(String input) {
		if(input==null || input.length()!=5) return false;
		String format = "^[0-9]*$";
		return Pattern.matches(format, input);
	}
	//24시간 체계 체크
	public boolean operatingTimeLogicCheck(String input) {
		if(input==null) return false;
		String format = "([01]?[0-9]|2[0-3]):[0-5][0-9]~([01]?[0-9]|2[0-3]):[0-5][0-9]";
		return Pattern.matches(format, input);
	}

	public boolean DuplicateCehck(int index, String input) {
		//2 = id,
		for(String s : list) {
			String temp = s.split(",")[index];
			if(input.equals(temp)) return true;
		}
		return false;
	}
	
	
}












