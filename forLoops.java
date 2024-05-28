/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
public class forLoops {
    /*
    for loops
    declaration & initialization;
    range;
    increment or Decrement
    for(int a = 0; a<=10;a++){
    //Block of codes
    }
    */
    /*
    for loops
    declaration & initialisation;
    range;
    increment or decrement
    for(inta=0;a<=10;a++){
    //block of codes
    }
    
    */
    public static void main(String[]args){
     //generate a series of numbers between 20 and 40 inclisive
     for(int n=20;n<=40;n++){
         // checkfor only even numbers and out put them
         if(n%2==0){
             System.out.println( n+"\t,\t");
             if(n==30){
                 continue;//20,22,
             }
         }
     }
     
    }
    
    }