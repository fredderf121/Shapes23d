
/*2019/10/29
 *Code Written by Fred Chen and Aswhin Boni Bangari
 *This is a dimension calculator for 2D and 3D shapes. 
 *For non-triangle 2D shapes, the area, perimeter will be calculated provided the # of sides
 *and side length is given.
 *For 3D shapes, the surface area and volume of a prism, pyramid, and sphere can be calculated, 
 *provided the radius/sidelength and # of sides
 *
 */

//THIS PROGRAM IS ONLY FOR REGULAR POLYGONS AND 3D SHAPES 
//THE ONLY IRREGULAR POLYGON THAT CAN BE CALCULATED FOR ARE TRIANGLES

package Shapes23d;
import java.util.*; 

public class Shape {
    List<Double> lengths = new ArrayList<>(); 
    int sideN;
    public double base_area;
    public double perimeter;
    public double apothem;   
    public void create(String name){
        initSides(name);
    }
    
    //initSides gets the dimensions of either the 2D shape or the 3D base (code is in place if the user wants to calculate
    //for a circle or a sphere, where in that case only the radius will be asked for
    public void initSides(String identifier){//identifier will either be 'shape' or 'base', depending on whether 
        
        while (true){
            this.sideN = (int)getValue("How many sides does the "+identifier+" have?"
                + " Enter in 1 for a circle", 1, Double.MAX_VALUE); 
            if (!(this.sideN == 2)){// Can't have a 2-sided shape
                break;
            }
            System.out.println("Please enter in a valid side number!");
        }
        
        double length = getValue("How wide is each side of the "+identifier+" ?"
                + " Enter in the radius if the "
                + identifier + " is a circle", 0, Double.MAX_VALUE);
        for(int i=0; i<this.sideN;i++){
            this.lengths.add(length); //The side lengths are added to an array, this is implemented so that 
                                      //Nothing new has to be added for the triangle class, which can take 
                                      //3 different side lengths
        }
        this.apothem = apothem();
        if (sideN == 1){ // Special, overloaded methods for circles
            this.base_area = area(length);
            this.perimeter = perimeter(length);
        }else{
            this.base_area = area();
            this.perimeter = perimeter();
        }
    }
    
    static public void runProgram(){
        int whichDimension = (int)getValue("Is your shape 3D or 2D? Enter 3 for 3D, 2 for 2D", 2, 3);
        
        if (whichDimension == 2){
            int which2D = (int)getValue("Is the 2D shape a triangle [type 1] or not [type 2]", 1, 2);
            switch (which2D) {//The triangles are unique and therefore a different type of class has to be created
                case 1:
                    Triangle tri1 = new Triangle();
                    break;
                default:
                    Shape sh1 = new Shape();
                    sh1.create("shape");
                    break;
            }
        }else{
            Shape3D.runProgram3D();            
        }
    }
    public double apothem(){//The apothem is the distance from the center of the polygon to the 
                            //midpoint of a side
        double apoth = lengths.get(0)/(2*Math.tan(Math.toRadians(180/sideN)));
        return apoth;  
    }
    public double perimeter(){
        return(sideN*lengths.get(0));
    }
    public double perimeter(double rad){
        return Math.PI*2*rad;
    }
    public double area(){
        double area = Math.pow(this.lengths.get(0), 2)*this.sideN/(4*Math.tan(Math.toRadians(180/this.sideN)));
        return area;   

    }
    public double area(double rad){
        return Math.PI*Math.pow(rad, 2);
    }
    
    public static double getValue(String message, double min, double max){//Min, max inputs help for bulletproofing
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        double val;  
        while (true){ 
            try{
                val=sc.nextDouble(); 
            }catch (Exception e){
                sc.nextLine();
                System.out.println("Please enter in a number!");
                continue;                            
            }
             
            if (val >= min && val <= max && val != 0){//Makes sure the value inputted is within ranges
                                                      // and not 0 (since you can't have 0 sides or side lengths
                break;
            }
            System.out.println("Not a valid input!");
        }        
        return val;
    } 
    
    public static void main(String[] args){
        runProgram();
    }
}

