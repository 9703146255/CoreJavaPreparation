package in.thiru;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
	public static void main(String[] args) {
		
		//1st way
		//=================================
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean matches = m.matches();
		System.out.println(matches);
		
		//2st way
		//=================================
		boolean matches2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(matches2);
		
		boolean matches3 = Pattern.matches(".s","as");
		System.out.println(matches3);
	
	}

}
