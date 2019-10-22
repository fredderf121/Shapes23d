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
public class Pyramid implements threeDimensional extends {
    
    public double calculateVolume(double height, double base_area){
        return 1/3*height*base_area;
        }
    
    public double calculateSurfaceArea(double height, double base_area, double apothem, int num_sides){
        double slant_length =  Math.sqrt(Math.pow(height, 2)+Math.pow(apothem, 2));
    }
    
}
