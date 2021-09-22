package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Directory -> ");
		String path = scanner.next();
		File f = new File(path);
		File[] files = f.listFiles();
		try {
			String attributes = "";
			for (File file : files) {
				if (file.isDirectory()) {
					attributes=attributes+"d";
				} else {
					attributes=attributes+"-";
				}
				if (file.canRead()){
					attributes=attributes+"r";
				}
				else{
					attributes=attributes+"-";
				}
				if (file.canWrite()){
					attributes=attributes+"w";
				}
				else{
					attributes=attributes+"-";
				}
				if (file.canExecute()){
					attributes=attributes+"x ";
				}
				else{
					attributes=attributes+"- ";
				}
				System.out.println(attributes+file);
				attributes="";
			}
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
