/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus;

import java.util.Scanner;

/**
 *
 * @author dfreer
 */
public class PP34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x coordinate:");
        while(!s.hasNextInt()) s.next();
        int x = s.nextInt();
        System.out.println("Enter y coordinate:");
        while(!s.hasNextInt()) s.next();
        int y = s.nextInt();
        System.out.println("Enter x coordinate:");
        while(!s.hasNextInt()) s.next();
        int x1 = s.nextInt();
        System.out.println("Enter y coordinate:");
        while(!s.hasNextInt()) s.next();
        int y1 = s.nextInt();
        
        double distance = Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
        System.out.println("The distance is " + distance);
    }
}
