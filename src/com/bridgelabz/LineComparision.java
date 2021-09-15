package com.bridgelabz;

import java.util.Objects;
import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison Program");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter co-ordinates of first point of First line :");
        int x1 =sc.nextInt();
        int y1= sc.nextInt();
        System.out.println("Enter co-ordinates of second point of First line :");
        int x2 =sc.nextInt();
        int y2= sc.nextInt();

        System.out.println("Enter co-ordinates of first point of Second line :");
        int a1 =sc.nextInt();
        int b1= sc.nextInt();
        System.out.println("Enter co-ordinates of second point of second line :");
        int a2 =sc.nextInt();
        int b2= sc.nextInt();


        float length1,length2;
        length1 = (float) Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));
        length2 = (float) Math.sqrt((Math.pow((a1-a2),2))+(Math.pow((b1-b2),2)));
        System.out.println("Length of lines are : "+length1+" & "+length2);

        if (Objects.equals(length1, length2)){
            System.out.println("Lines are of Equal length");
        }
        else {
            System.out.println("Lines are of different length");
        }
    }
}
