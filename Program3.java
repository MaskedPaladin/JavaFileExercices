package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Filepath-> ");
        String fpath = scanner.next();
        File file = new File(fpath);
        String attributes = "";
        if (file.isDirectory()){
            attributes=attributes+"d";
        }
        else{
            attributes=attributes+"-";
        }
        if(file.canRead()){
            attributes=attributes+"r";
        }
        else {
            attributes=attributes+"-";
        }
        if(file.canWrite()){
            attributes=attributes+"w";
        }
        else{
            attributes=attributes+"-";
        }
        if(file.canExecute()){
            attributes=attributes+"x ";
        }
        else{
            attributes=attributes+"- ";
        }
        if (file.exists()){
            System.out.println("File exists");
            System.out.println(attributes+" "+file.getAbsolutePath());
        }
        else{
            System.out.println("File don't exists");
        }

    }
}
