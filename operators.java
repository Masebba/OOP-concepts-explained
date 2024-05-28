/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
public class operators {
    public static void main(String [] args){
        int n1 = 25;
        int n2 = 30;
        int sum,sub, times,mod;
        double div;
        /*
        Arithmetic Operators
        =====================
        + = Addition Operators
        - = Subtraction Operator
        / = Division Operator
        * = Multiplication Operator
        % = Modulus operator | Reminder.
        */
        sum = n1+n2; //Expression of sum 
        div = n2/n1;
        sub = n2-n1;
        mod = n2&n1;
        
        //Output
        System.out.println("When "+ n2 +" is added to " + n1 + " , it gives "+sum);
                
        
       
    }
    
}
