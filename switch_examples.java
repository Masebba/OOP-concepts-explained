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
public class switch_examples {
    
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter the Marks for SST");
        int sst = save.nextInt();
        System.out.println("Enter the Marks for English");
        int eng = save.nextInt();
        System.out.println("Enter the Marks for Science");
        int sci = save.nextInt();
        System.out.println("Enter the Marks for Math");
        int math = save.nextInt();
        
        //Total Marks
        int total = sst+math+sci+eng;
        int avg = total/4;
        System.out.println(total + "\t" + avg);
        //Switch statements
        switch(avg){
            case 90:
                System.out.println("Grade is A++");
                break;
                
            case 80:
                System.out.println("Grade is A++");
                break;
                
            default: 
                System.out.println("F");
        }
                
        
    }
}
