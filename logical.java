/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.helloworld;

/**
 *
 * @author Eng. Balex
 */
public class logical {
    /* Logical Operators
    Logical AND (&&)
    Logical OR (||)
    Logical NOT (!)
    
    */
    //Java is Case Sensitive
    //one  != One  != ONE
    
    public static void main(String [] args){
        boolean above18 = true;
        boolean canClub = false;
        
        //LOGICAL AND
        boolean checkAND = above18 && canClub;
        
        //LOGICAL OR
        boolean checkOR = above18 || canClub;
        
        //LOGICAL NOT
        boolean not18 = !above18;
        boolean noClubbing = !canClub;
        
        //OUTPUTTING
        System.out.println(checkAND);
        
        System.out.println(checkOR);
    }
}
