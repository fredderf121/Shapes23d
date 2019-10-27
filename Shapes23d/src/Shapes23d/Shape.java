/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes23d;
import java.util.*; 
/**
 *
 * @author S346795925
 */
public class Shape {
    List<Double> lengths = new ArrayList<>(); 
    int sideN;
    
    public double base_area;
    public double perimeter;
    public double apothem;

    /*public Shape(double[] sideLength){
        for(int i=0; i<sideLength.length;i++){
            lengths.add(sideLength[i]);
        }
    }*/
    
    public void initSides(String identifier){//identifier will either be 'shape' or 'base'
        this.sideN = (int)getValue("How many sides does the "+identifier+" have?"
                + " Enter in 1 for a circle/sphere"); 
        double length = getValue("How wide is each side of the "+identifier+" ?"
                + " Enter in the radius if the "
                + identifier + " is a circle/sphere");
        for(int i=0; i<this.sideN;i++){
            this.lengths.add(length);
        }
        
        this.apothem = apothem();
        if (sideN == 1){
            this.base_area = area(length);
            this.perimeter = perimeter(length);
            this.apothem = length;
        }else{
            this.base_area = area();
            this.perimeter = perimeter();
            this.apothem = apothem();
        }

    }
    
    public double apothem(){
        double apothem = lengths.get(0)/(2*Math.tan(Math.toRadians(180/sideN)));
        return apothem;  
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
    
    public static double getValue(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        double val;
        val=sc.nextDouble();
        return val;
    } 
    
    public static void main(String[] args){
        
        //getinput        
        int whichDimension = (int)getValue("Is your shape 3D or 2D? Enter 3 for 3D, 2 for 2D");
        
        if (whichDimension == 2){
            //dostuff
        }else{
            
            int which3D = (int)getValue("Is the 3D shape a prism (includes cylinder) [type 1], "
                    + "a pyramid (includes cone) [type 2], "
                    + "or a sphere? [type 3]");
            switch (which3D) {
                case 1:
                    Prism pr1 = new Prism();
                    pr1.create();
                    break;
                case 2:
                    Pyramid py1 = new Pyramid();
                    py1.create();
                    break;
                case 3:
                    Sphere s1 = new Sphere();
                    s1.create();
                    break;
                default:
                // code block
            }
        }
    }
    
    
}
