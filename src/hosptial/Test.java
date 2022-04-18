package hosptial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Test {

	public static void main(String[] args) throws Exception {

//		BufferedReader br = new BufferedReader(new FileReader(new File(DataPath.userDataDoctor)));
//		
//		String loop = null;
//		while((loop=br.readLine())!=null) {
//			if(loop=="") continue;
//			String[] temp = loop.split(",");
//			if("10".equals(temp[0])) {
//				System.out.println(Arrays.toString(temp));
//			}
//		}
		String name = "아아abc";
		String name2 = "아아아아아";
		String log = "아아아아아아아아아아아아아아아";
		String log2 = "아아아아아아아아아아아아아아아";
		System.out.printf("[%-30s]\t[%-30s]\n",name, log);
		System.out.printf("[%-30s]\t[%-30s]\n",name2, log2);


	}
	
}

