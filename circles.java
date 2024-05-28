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

//working with construtors

public class circles {
    //Fields
    double radius;
    static double PI = 3.142;
    
    //Create a Constructor
    public circles(double radius){
        this.radius = radius;        
    }
    
    //Method for computing Area
    double computeArea(){
        return PI*radius*radius;
    }
    
    //Method for computing Perimeter
    double computePerimeter(){
            return 2*PI*radius;
    }
    
    public static void main(String [] args){
        //object for the Scanner        
        Scanner save = new Scanner(System.in);    
        
        System.out.println("Enter the shape  required");
        String shape = save.nextLine();
        
        System.out.println("Enter the value of a Radius of a " + shape);
        double r = save.nextDouble();
        
        //creating an object of a circle c
        circles c = new circles(r);

        System.out.println("The area of a circle is " + c.computeArea() + " and the Perimeter of the circle is " + c.computePerimeter());
        
        
    }
    
}
