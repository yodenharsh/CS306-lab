package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputAndQuitOnQ {
	public static void main(String[] args) {
	
	String str;	
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
	str = "Initial value";
	while(!str.equalsIgnoreCase("quit")) {
		str = br.readLine();
		System.out.println(str);
	}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	}
}
