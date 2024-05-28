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
public class chris {   

    public static void main(String[] args) {
        
        //creates a new Scanner object named scanner
        //System.in specifies that this Scanner should read input from the user
        
        // declares some variables such as num, sum, count
        Scanner scanner = new Scanner(System.in);
        double num, sum = 0;  
        int count = 0;
        
        System.out.println("enter numbers. type 'x' to quit:");   // Continue reading numbers until user types 'x'
        
        
        //enters a loop that continues as long as there is another number to read from the user
        //using scanner.nextDouble()
      
        while (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
            if (num == 'x') {
                break;
            }
            sum += num;
            count++;
        }
        // If i type 'x', the program breaks out of the loop.
        
        /*If i type a number, the program adds it to the running sum and 
        increments the count of numbers that have been entered.
        */
        
        // Print the sum of the numbers
        
        /*
        After the loop finishes, the program checks whether any numbers were entered
        and if so, it prints the sum of the numbers. 
        
        If not, it prints a message saying that no numbers were entered.
        */
        if (count > 0) {
            System.out.println("the sum of the numbers is: " + sum);
        } else {
            System.out.println("no numbers were entered.");
        }
    }
}


/*
Write a program that enables user to enter values iteratively until He/ She terminates the program by typing x. 
After termination, the program should organize the entered values into an array and compute their summation.
*/
