/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dfreer
 */
public class LewisLoftus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("PROGRAM 3-1");
        System.out.println("Enter first name:");
        String first = scan.next();
        System.out.println("Enter last name:");
        String last = scan.next();
        System.out.print(first);
        if(last.length() < 5)
            System.out.print(last);
        else
            System.out.print(last.substring(0,5));
         System.out.println("" + (new Random().nextInt() % 99999 + 10000));
    }
    
}
