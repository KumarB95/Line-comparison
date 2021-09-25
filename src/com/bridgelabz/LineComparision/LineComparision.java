package com.bridgelabz.LineComparision;

import com.bridgelabz.Utility.Utility;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison Program");
        float length1,length2;
        length1=takeUserInput();
        length2=takeUserInput();
        compareLines(length1,length2);
    }
    //Taking inputs from user and returning length
    public static float takeUserInput(){
        Utility utility=new Utility();
        System.out.println("Enter co-ordinates of first point of First line :");
        int x1 = utility.getIntValue();
        int y1 = utility.getIntValue();
        System.out.println("Enter co-ordinates of second point of First line :");
        int x2 = utility.getIntValue();
        int y2 = utility.getIntValue();

        return (float) Math.sqrt((Math.pow((x1-x2),2))+(Math.pow((y1-y2),2)));
    }
    //comparing lengths of line entered by user
    private static void compareLines(float length1, float length2) {
        System.out.println("Length of lines are : "+length1+" & "+length2);
        if (Float.compare(length1, length2) >0) {
            System.out.println("Line 1 is greater than line 2");}
        else if (Float.compare(length1, length2) < 0) {
            System.out.println("Line 2 is greater than line 1");}
        else{
            System.out.println("Both lines are Equal");
        }
    }
}
