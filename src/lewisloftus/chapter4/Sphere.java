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
public class Sphere {
    private double diameter, radius, volume, surfaceArea;
    public Sphere(double diameter){
        this.diameter = diameter;
        this.radius = diameter / 2.0;
        volume = 4.0/3.0*Math.PI*Math.pow(radius, 3);
        surfaceArea = 4*Math.PI*Math.pow(radius, 2);
    }
    public double getDiameter(){
        return diameter;
    }
    
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getSurfaceArea(){
        return surfaceArea;
    }
    
    public String toString(){
        NumberFormat nf = new DecimalFormat("#0.00");
        return "Diameter " + nf.format(diameter) + " Volume " + nf.format(volume) + " Surface area " + nf.format(surfaceArea);
    }
}
