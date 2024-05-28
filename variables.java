/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
public class variables { 
    
    //Single Line Comment - This comments or disables only a single line of code
    /*
    Multi-line Comment
        THis comments or disables multiple lines of code.   
    
    */
    
    //Our main program starts here here
    public static void main(String [] args){
        //Variable declaration
        //datatype identifier;
        int age; //expects only whole numbers
        float salary; //expects decimal numbers
        String name; //expects a series of characters combined into a string literal
        
        //Variable Initialization
        age = 30; // avariable name age is initialized to 30.// The initial valuee of age is 30
        salary = 300;
        name = "Ruth Naknabirwa";
        
        /*output the Logic - This involves using the print.
            print - This prints on the same line
            println - This prints on a new line.
        
        */
        
        System.out.print(name + '\n'); //'\n' it means create a line break on your next printing
        System.out.print(age + "\t"); //\t means create a tab or space between the contents.     
        System.out.print(salary);
        
        
    }
}
