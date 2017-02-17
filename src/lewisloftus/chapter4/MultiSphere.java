/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisloftus.chapter4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author dfreer
 */
public class MultiSphere {
        public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Sphere sphere1 = new Sphere(2);
        Sphere sphere2 = new Sphere(4.5);
        System.out.println(sphere.toString());
        System.out.println(sphere1.toString());
        System.out.println(sphere2.toString());
    }
}
