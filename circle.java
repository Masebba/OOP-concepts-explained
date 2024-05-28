/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
import java.util.Scanner;
public class circle {
    //Fields
    static double PI = 3.142;
    
    //Method for computing Area
    double computeArea(double radius){
        return PI*radius*radius;
    }
    //Method for computing Perimeter
    double computePerimeter(double radius){
            return 2*PI*radius;
    }
    
    public static void main(String [] args){
        //creating an object of a circle c
        circle c = new circle();
        Scanner save = new Scanner(System.in);
        System.out.println("Enter the shape  required");
        String shape = save.nextLine();
        System.out.println("Enter the value of a Radius of a " + shape);
        double r = save.nextDouble();
        
        System.out.println("The area of a circle is " + c.computeArea(r) + " and the Perimeter of the circle is " + c.computePerimeter(r));
        
        
    }
    
}
