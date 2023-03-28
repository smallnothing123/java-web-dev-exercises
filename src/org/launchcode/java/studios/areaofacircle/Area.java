package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {

        public static void main(String[] args) {
            double Radius;
            double Area;
            Scanner input;

            input = new Scanner(System.in);
            System.out.println("Enter a radius:  ");
            Radius = input.nextDouble();
            input.close();

            Area = Circle.getArea(Radius);
            System.out.println("The area of a circle of radius " + Radius + " is: " + Area );
        }


}


