/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */

//Program checking whether a number isan even or an odd
import java.util.Scanner;
public class ifs {
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter any number ...!");
        int n = save.nextInt();
        
        if(n%2 != 0){
            System.out.println(n + " is an Odd ");
        }
        
        else {
            System.out.println(n + " is an Even ");           
        }
        
        
    }
    
}
