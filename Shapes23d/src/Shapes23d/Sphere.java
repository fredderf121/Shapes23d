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
    public void initSides(){//identifier will either be 'shape' or 'base'       
              
            this.lengths.add(getValue("What is the radius?", 0, Double.MAX_VALUE));         
    }
    
    public Sphere(){
        
        initSides();
        
        this.surface_area = calculateSurfaceArea(this.lengths.get(0));
        
        this.volume = calculateVolume(this.lengths.get(0));
        displayResults();
    }
    public void displayResults(){
        System.out.println("SA is "+this.surface_area);
        System.out.println("Vol is "+this.volume);
    }
    
    @Override
    public double calculateVolume(double radius){
        return 4.0/3.0*Math.PI*Math.pow(radius, 3);
    }
    
    @Override
    public double calculateSurfaceArea(double radius){
        return 4.0*Math.PI*Math.pow(radius, 2);
    }
}
