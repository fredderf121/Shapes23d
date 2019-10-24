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
public class Pyramid extends Shape implements threeDimensional {
    
    public double calculateVolume(double height, double base_area){
        return 1/3*height*base_area;
        }
    
    @Override
    public double calculateSurfaceArea(double height, double base_area, 
                        double apothem, int num_sides, int side_length){
        
        double slant_length =  Math.sqrt(Math.pow(height, 2)+Math.pow(apothem, 2));
        return base_area + slant_length*side_length/2*num_sides;
        
    }
    
}
