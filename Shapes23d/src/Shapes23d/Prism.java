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
public class Prism extends Shape implements threeDimensional {
    
    @Override
    public double calculateVolume(double height, double base_area){
        return base_area*height;
        }
    
    @Override
    public double calculateSurfaceArea(double height, double base_area, int num_sides, int side_length){
        return height*side_length*num_sides+2*base_area;
    }
    
}
