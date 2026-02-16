package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("\tWelcome to Java in Visual Studio.");
        System.out.println("==================================================");
        System.out.println();
        File student = new File("Student.txt");
        try {
            BufferedWriter name = new BufferedWriter(new FileWriter(student,true));
            System.out.println("Input Student Name if you input stop system will end.");
            while (true) {
                System.out.print("Enter Student_name: ");
                String students = sc.next();
                if(students.equals("stop")){
                    break;
                }
                name.write(students);
                name.write("\n");

            }
            name.close();
            BufferedReader read = new BufferedReader(new FileReader(student));
            String studentName;
            System.out.println("========================================");
            System.out.println("\t\tStudent ");
            while ((studentName =read.readLine()) !=null) {
                System.out.println("Student-Name: "+studentName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}