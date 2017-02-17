/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author dfreer
 */
public class PP36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] threeSides = new double[3];
        for(int i = 0; i < threeSides.length; i++){
            while(!scanner.hasNextDouble()) scanner.next();
            threeSides[i] = scanner.nextDouble();
        }
        double s = (threeSides[0] + threeSides[1] + threeSides[2]) / 2.0;
        double area = Math.sqrt(s * (s-threeSides[0]) * (s-threeSides[1]) * (s-threeSides[2]) );
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("The area according to Heron's Triangle is " + formatter.format(area));
        
    }
}
