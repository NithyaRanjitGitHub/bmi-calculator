/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.bmicalculator;

/**
 *
 * @author rit
 */
//public class Bmicalculator {
//
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
//package com.example.bmicalculator;

import java.util.Scanner;

public class Bmicalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5)
            System.out.println("Category: Underweight");
        else if (bmi < 25)
            System.out.println("Category: Normal weight");
        else if (bmi < 30)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");

        sc.close();
    }
}
