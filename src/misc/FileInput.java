package misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Need to provide at least one argument : Filename");
			return;
		}
		try(FileInputStream f = new FileInputStream(args[0])){
			
			int i;
			while((i=f.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
