package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {
    static void filer(File[] files){
        try{
            String attributes = "";
            for(File file : files){
                if (file.isDirectory()){
                    attributes=attributes+"d";
                    if(file.canRead()){
                        attributes=attributes+"r";
                    }
                    else{
                        attributes=attributes+"-";
                    }
                    if(file.canWrite()){
                        attributes=attributes+"w";
                    }
                    else{
                        attributes=attributes+"r";
                    }
                    if(file.canExecute()){
                        attributes=attributes+"x ";
                    }
                    else{
                        attributes=attributes+"- ";
                    }
                    System.out.println(attributes+file);
                    attributes="";
                    File file1 = new File(file.getAbsolutePath());
                    File[] listfiles = file1.listFiles();
                    filer(listfiles);
                }
                else{
                    attributes=attributes+"-";
                    if(file.canRead()){
                        attributes=attributes+"r";
                    }
                    else{
                        attributes=attributes+"-";
                    }
                    if(file.canWrite()){
                        attributes=attributes+"w";
                    }
                    else{
                        attributes=attributes+"r";
                    }
                    if(file.canExecute()){
                        attributes=attributes+"x ";
                    }
                    else{
                        attributes=attributes+"- ";
                    }
                    System.out.println(attributes+file);
                    attributes="";
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Directory -> ");
        String pathInput = scanner.next();
        File path = new File(pathInput);
        File[] listfiles = path.listFiles();
        filer(listfiles);
    }
}