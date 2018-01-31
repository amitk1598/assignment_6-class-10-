package acdaview_assignment_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class fileread2 {
public static void main(String[] args) throws Exception {
	FileReader file = new FileReader ("C://Users//fameer foodie//Desktop//abcd.txt");
	
	int i;
	while ((i=file.read())!=-1){
		System.out.print((char)i);
	}
}
	
}
