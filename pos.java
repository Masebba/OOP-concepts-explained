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
public class pos {
    public static void main(String[] args){
        Scanner save = new Scanner(System.in);
        
      System.out.println("Enter the Name of the Product");
      String product =save.nextLine();
      
      
      System.out.println("Enter the Price of the Product");
      double price =save.nextDouble();
           
      
      System.out.println("Enter Product Quantity required");
      int qty =save.nextInt();
      
      double amount = price*qty;
      System.out.println("The client took " + qty + " bottles of "+ product + " at " + price + " each  making a totalof " + amount);
        
    }
    
}
