package acdaview_assignment_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread {
	public static void main(String[] args) throws IOException {
		File  file = new File("C://Users//fameer foodie//Desktop//abc.txt.txt");
	
	FileReader in = null;
	try{
		in = new FileReader(file);
	int c;
	while((c=in.read())!=-1){
		System.out.print((char)c);
	}
	}catch(FileNotFoundException e){
		System.out.println("File not found");
	}finally{
		if(in!=null){
			in.close();
		}
	}
}
}