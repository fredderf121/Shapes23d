/*
 * Pyramid class
 */
package Shapes23d;
/**
 *
 * @author S332896109
 */
public class Pyramid extends Shape3D implements threeDimensional {
    
    public Pyramid(String name){
        initSides(name);
        this.height  = getValue("Please enter in the height of the pyramid", 0, Double.MAX_VALUE);
        
        this.surface_area = calculateSurfaceArea(this.height, this.base_area, this.apothem, this.sideN, this.lengths.get(0));
        
        this.volume = calculateVolume(this.height, this.base_area);
        displayResults();
    }
    public void displayResults(){
        System.out.println("SA is "+this.surface_area);
        System.out.println("Vol is "+this.volume);
    }
    
    @Override
    public double calculateVolume(double height, double base_area){
        return 1.0/3.0*height*base_area;
        }
    
    @Override
    public double calculateSurfaceArea(double height, double base_area, 
                        double apothem, int num_sides, double side_length){
        double slant_length =  Math.sqrt(Math.pow(height, 2)+Math.pow(apothem, 2));
        return base_area + slant_length*side_length/2*num_sides;
        
    }
    
    
}
