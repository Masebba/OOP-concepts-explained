package vu.helloworld;

import java.util.Scanner;

public class sumCalculator { //Single-Dimensional Arrays
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        //Declaring variables and Initializing them.
        int n[] = new int[200]; // 200 means the maximum values
        int count = 0;
        int sum = 0;
        
        // check whether the user has pressed x to stop
        char decisionMade; // char to mean character data type. x
        do{
            System.out.println("Please  Enter any number , 'press x to stop if need be' ");
                decisionMade = save.next().charAt(0); // Looking for the entered character x.
                if(decisionMade !='x'){
                    n[count] = Integer.parseInt(String.valueOf(decisionMade));
                    sum += n[count]; // sum = sum+b[count;                count++;                    
                }
        }
        
        while (decisionMade!='x');
        //output  the enetedvaluesby the user.
        System.out.println("These are the values entered by the user");
        for(int y =0;y<count;  y++){
            System.out.println(n[1]+ " \n");
        }
        
        System.out.println ("When the number are enterd by the user, it's sum provides a tital of "+ sum );
        save.close();
                     }
        
    }
      