/*
 * Interface that connects the Sphere, Pyramid, and Prism classes
 */
package Shapes23d;

/**
 *
 * @author S332896109
 */
public interface threeDimensional {
    
    default public double calculateVolume(double height, double base_area){//Method for the prism and pyramid
        return 0;
    }
    default public double calculateVolume(double radius){//Method for the sphere
        return 0;
    }
    
    default public double calculateSurfaceArea(double height, double base_area, double perimeter){//Method for the prism
        return 0;
    }
    default public double calculateSurfaceArea(double height, double base_area, double apothem, int num_sides, double side_length){
        //Method for the pyramid
        return 0;
    }
    default public double calculateSurfaceArea( double radius){//Method for the sphere
        return 0;
    }
}
