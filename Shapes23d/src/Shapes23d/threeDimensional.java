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
public interface threeDimensional {
    public final double height = 0;
    public final double volume = 0;
    public final double surface_area = 0;
    public final double base_area = 0;
    default public double calculateVolume(double height, double base_area){
        return 0;
    }
    default public double calculateVolume(double radius){
        return 0;
    }
    
    default public double calculateSurfaceArea(double height, double base_area, int num_sides, int side_length){
        return 0;
    }
    default public double calculateSurfaceArea(double height, double base_area, double apothem, int num_sides, int side_length){
        return 0;
    }
    default public double calculateSurfaceArea(double radius){
        return 0;
    }
}
