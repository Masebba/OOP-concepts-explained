/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
public class arraysExample {
    public static void main(String [] args){
        /*String [] names = {"Ali", "Noel", "Alex", "Ruth", "Peruth"};
        System.out.println("OOP is taught by "+names[2]);
        
        int years [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("BIT and BSC are all courses for "+years[2] + "years");
        */
        
       // Single DImensional arrays
        
        int no [] = new int[7]; //int [] no= new int[10]  //specifies the array length.
        no[0]   = 90;
        no[1]   =   80;
        no[2]   = 70;
        no[3] = 60;
        no[4] = 50;
        no[5] = 40;
        no[6] = 30;
        
        System.out.println(no[3]);
        
        
        
        //Multi-Dimensional Arrays
        int x [][] = new int[2][2]; // [2] [2]  = 4
        x[0][0] = 4;
        x[1][1] = 2;
        x[1][0] = 6;
        x[0][1] = 8;
        
        System.out.println(x[1][0]);
        
    }
    
}
