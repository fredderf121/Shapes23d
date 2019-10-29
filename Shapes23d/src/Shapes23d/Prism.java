/*
 * Prism Class
 */
package Shapes23d;

/**
 *
 * @author S332896109
 */
public class Prism extends Shape3D implements threeDimensional {
    
        
    public Prism(String name){
        initSides(name);
        this.height  = getValue("Please enter in the height of the prism",0, Double.MAX_VALUE);
        this.surface_area = calculateSurfaceArea(this.height, this.base_area, this.perimeter);
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
    public double calculateSurfaceArea(double height, double base_area, double perimeter){
        return height*perimeter+2*base_area;
    }
    
}
