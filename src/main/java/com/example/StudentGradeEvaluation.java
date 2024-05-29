package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        String name = new Scanner.nextline();
        

        // Prompt the user to enter their age
        System.out.println("Enter your age");
        int age = new Scanner.nextInt();
        

        // Prompt the user to enter their exam score
        System.out.println("Enter your exam score");
        int score = new Scanner.nextInt();
        

        // Determine the grade
        String grade;

        if(grade >=90)
        {
            System.out.println("A")
        }else if(grade <=89<80){
            System.out.println("B");
        }else if(grade <=79<60){
            System.out.println("");

        }

    

        // Print the student's details
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("score "+score);
        System.out.println("grade "+grade)
        

       
    }
}
