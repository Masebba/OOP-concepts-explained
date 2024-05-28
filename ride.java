/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
public class ride {
    //Fields
    int speed;
    String color;
    String model;
    
    //Methods
    void accelerate(int drive){
        speed += 25+drive; //speed = speed+25+drive
    }
    void brake(){
        speed -= 10;
    }
        
    public static void main(String [] args){
       // declaring 1st objects 
        ride toyotaV8 = new ride(); // object
        toyotaV8.color = "Grey";
        toyotaV8.model= "2022";
        toyotaV8.speed = 60;
        toyotaV8.accelerate(15); //invoking the accelerate method with drve value of 10.
        
        //declaring 2nd Object
        ride subaru = new ride();
        subaru.color = "blue";
        subaru.model = "2018";
        subaru.speed = 40;
        subaru.brake();
        System.out.println("My Toyota V8 model "+ toyotaV8.model  +" accelerates at a speed of " +toyotaV8.speed);
        
        System.out.println("There is a subaru of model" + subaru.model + " and brakes at " + subaru.speed);
        
        
    }
}
