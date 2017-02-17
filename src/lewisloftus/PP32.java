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
public class PP32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integer values:");
        int i, j;
        i = s.nextInt();
        j = s.nextInt();
        System.out.println(Math.pow(i, 3) + Math.pow(j, 3));
    }
}
