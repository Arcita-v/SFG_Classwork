/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.ruso.healthyhearts;

import java.util.Scanner;



/**
 *
 * @author cbrec
 */
public class HealthyHearts {
    public static void main (String [] args){
        //define variables
        int  age, maxHR;
        double targetHR1, targetHR2;
        
        //Ask user for age
        System.out.println("What is your age? ");
        Scanner sc = new Scanner (System.in);
        age = Integer.parseInt(sc.nextLine());
        
        //calculate Max and target heart rates
        maxHR = 220 - age;
        targetHR1 = .50 * maxHR;
        targetHR2 = .85 * maxHR;
        
        
        //Print results to user
        System.out.println("Your max heart rate is: " + maxHR);
        System.out.println("Your target HR zone is between :  " + targetHR1 + " and " + targetHR2 + " beats per minute.");
        
       
        
        
        
        
    }
   
}
