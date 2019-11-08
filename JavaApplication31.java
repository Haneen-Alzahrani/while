/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

/**
 *
 * @author hno0o
 */
import java.util.Scanner;
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number, max ;
        number = input.nextInt();
        max = number;
        do {
           number = input.nextInt();
            if ( number > max)
                max = number ;
            
        }
    while ( number != 0);
        System.out.println("max is "+max );
        System.out.println("number is :"+number);
    }
    
}
