/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes23d;

/**
 *
 * @author S332896109
 */
public class Sphere extends Shape3D implements threeDimensional {
    
    @Override
    public double calculateVolume(double radius){
        return 4/3*Math.PI*Math.pow(radius, 3);
    }
    
    @Override
    public double calculateSurfaceArea(double radius){
        return 4*Math.PI*Math.pow(radius, 2);
    }
}
