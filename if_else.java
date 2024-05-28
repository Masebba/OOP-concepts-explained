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
public class if_else {
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter Marks for Science");
      double sci = save.nextDouble();
      
      System.out.println("Enter Marks for English");
      double eng = save.nextDouble();
      
        System.out.println("Enter Marks for SST");
      double sst = save.nextDouble();
      
        System.out.println("Enter Marks for Math");
      double math = save.nextDouble();
      
     double total = sci +math +sst +eng;
     
      System.out.println(total);
     
      double avg = (sci +math +sst +eng)/4;
         System.out.println(avg);
      // if and else if to check for the grading of a given  a student.
      if(avg>=90){
          System.out.println("A+");
      }
      else if(avg>=80){
          System.out.println("A");          
      }
      else if(avg>=70){
          System.out.println("B");          
      }
      else if(avg>=60){
          System.out.println("c");          
      }
      
      else { 
          System.out.println("F");          
      }
      
    }
}