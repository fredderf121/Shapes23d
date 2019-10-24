/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes23d;
import java.util.*;

/**
 *
 * @author S332896109
 */
public class Prism extends Shape implements threeDimensional {
    
        
    public void create(){
        initSides("base");
        this.height  = getValue("Please enter in the height of the prism");
        this.surface_area = calculateSurfaceArea(this.height, this.base_area, this.sideN, this.lengths.get(0));
        this.volume = calculateVolume(this.height, this.base_area);
        displayResults();
    }
    public void displayResults(){
        System.out.println("SA is "+this.surface_area);
        System.out.println("Vol is "+this.volume);
    }
 
    
    @Override
    public double calculateVolume(double height, double base_area){
        return base_area*height;
        }
    
    @Override
    public double calculateSurfaceArea(double height, double base_area, int num_sides, double side_length){
        return height*side_length*num_sides+2*base_area;
    }
    
}
