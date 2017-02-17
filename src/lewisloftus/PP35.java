/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author dfreer
 */
public class PP35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of a sphere:");
        while(!s.hasNextDouble()) s.next();
        double radius = s.nextDouble();
        double volume = 4.0/3.0*Math.PI*Math.pow(radius, 3);
        double surfaceArea = 4*Math.PI*Math.pow(radius, 2);
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Volume " + formatter.format(volume));
        System.out.println("Surface area " + formatter.format(surfaceArea));
        
    }
}
