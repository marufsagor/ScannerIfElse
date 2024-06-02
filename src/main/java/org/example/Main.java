package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input Age:");
        int age = Sc.nextInt();
         if (age>=18){
             System.out.println("You are  eligible for vote");

         }
         else {
             System.out.println("You are not Eligble for vote");

         }
    }
}