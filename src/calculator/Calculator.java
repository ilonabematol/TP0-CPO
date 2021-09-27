/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ilonabematol
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TP0 Calculator
        //Ilona Bématol Bertolin Loic
        //27/09/2021
        
        int add = 0;
        int substract = 0;
        float multiply = 0;
        int divide = 0;
        int modulo = 0;
        int operator; 
        int operande1;
        int operande2; 
        Scanner sc = new Scanner( System.in);  
        System.out.println( " please enter the operator:");
        System.out.println( " 1) add:");
        System.out.println( " 2) substract:");
        System.out.println( " 3) multiply:");
        System.out.println( " 4) divide:");
        System.out.println( " 5) modulo:");
        operator = sc.nextInt();// on demande a sc de donner le prochain entier
        
        if (operator < 1|| operator > 5 ){
            System.out.println( " error i need a number between 1 and 5 !");
            System.exit(0);
        }
        
        sc = new Scanner( System.in);
        System.out.println( " please enter the the first number:");
        operande1 = sc.nextInt();
        System.out.println( " please enter the the seconde number:");
        operande2 = sc.nextInt();
        
        switch (operator) {
            case 1 -> {
                add = operande1 + operande2;
                System.out.println(add);
            }
            case 2 -> {
                substract = operande1 - operande2;
                System.out.println(substract);
            }
            case 3 -> {
                multiply = operande1*operande2;
                System.out.println(multiply);
            }
            case 4 -> {
                divide =operande1/operande2;
                System.out.println(divide);
            }
            case 5 -> {
                modulo = operande1%operande2; 
                System.out.println(modulo);
            }
            //default -> {
                //System.out.println("erreur"); 
                
            //}

                    
        }
        
        
        
        
        
        
}   }
