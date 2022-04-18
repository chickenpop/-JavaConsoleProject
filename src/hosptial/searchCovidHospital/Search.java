package hosptial.searchCovidHospital;

import java.util.ArrayList;

public class Search {

	public static ArrayList<CovidSafeHospital> keyWordCovidSafeList(String keyWord) {
		ArrayList<CovidSafeHospital> list = new ArrayList<CovidSafeHospital>(50);
		for(CovidSafeHospital c : HospitalData.covidSafeList) {
			
			String[] phoneNumber = c.getPhoneNumber().split("-");
		
			search(keyWord, list, c, phoneNumber);
			
		}
		
		return list;
		
	}

	private static void search(String keyWord, ArrayList<CovidSafeHospital> list,
			CovidSafeHospital c, String[] phoneNumber) {
		for(String number : phoneNumber) {
			if(number.equals(keyWord)) {
				list.add(c);
			}
		}
		
		if(c.getCity_do().contains(keyWord)) {
			list.add(c);
		} else if(c.getSi_gu_gun().contains(keyWord)) {
			list.add(c);
		} else if(c.getHospitalName().contains(keyWord)) {
			list.add(c);
		}
	}
	
	
	public static ArrayList<RespiratoryClinic> keyWordRespiratoryClinicList(String keyWord) {
		ArrayList<RespiratoryClinic> list = new ArrayList<RespiratoryClinic>(50);
		for(RespiratoryClinic c : HospitalData.clinicList) {
			
			String[] phoneNumber = c.getPhoneNumber().split("-");
		
			search(keyWord, list, c, phoneNumber);
			
		}
		
		return list;
		
	}

	private static void search(String keyWord, ArrayList<RespiratoryClinic> list,
			RespiratoryClinic c, String[] phoneNumber) {
		for(String number : phoneNumber) {
			if(number.equals(keyWord)) {
				list.add(c);
			}
		}
		
		if(c.getCity_do().contains(keyWord)) {
			list.add(c);
		} else if(c.getSi_gu_gun().contains(keyWord)) {
			list.add(c);
		} else if(c.getHospitalName().contains(keyWord)) {
			list.add(c);
		}
	}
	
}
