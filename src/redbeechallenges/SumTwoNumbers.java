/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redbeechallenges;

public class SumTwoNumbers {
// Method that recieves two numbers and returns the sum of both
   
    public static void main(String[] args) { 
    
        Integer a = myInput("Enter an Integer number"); 
        Integer b = myInput("Enter another Integer number"); 
        Integer result;
    
        result = sum(a,b);
        System.out.println("The result of the sum is " + result);
       
                
    }

    public static Integer sum(Integer a, Integer b){
        int c;
        c = a + b;
        return c;   //Should it return null?
    }

    
    private static int myInput(String message)
    {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    System.out.println(message);
    return teclado.nextInt();   
    }

} 
    


