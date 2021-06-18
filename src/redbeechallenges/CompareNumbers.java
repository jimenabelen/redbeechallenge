/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redbeechallenges;




public class CompareNumbers {

    public static void main(String[] args) {  
    
    // Request the user to enter three numbers
    Integer num1 = myInput("Enter the first number"); 
    Integer num2 = myInput("Enter the second number"); 
    Integer num3 = myInput("Enter the third number");
    
    // Compare the numbers, calculate the max one and print 
    System.out.println("The max number is " + Math.max(Math.max(num1,num2),Math.max(num2,num3)));

     
    }  

    private static int myInput(String message)
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println(message);
        return teclado.nextInt();   
    }

} 
    


