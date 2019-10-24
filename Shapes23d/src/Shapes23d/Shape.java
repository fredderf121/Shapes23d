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
    public double height;
    public double volume;
    public double surface_area;
    public double base_area;
    /*public Shape(double[] sideLength){
        for(int i=0; i<sideLength.length;i++){
            lengths.add(sideLength[i]);
        }
    }*/
    
    public void initSides(String identifier){//identifier will either be 'shape' or 'base'
        this.sideN = (int)getValue("How many sides does the "+identifier+" have?"); 
        double length = getValue("How wide is each side of the "+identifier+" ?");
        for(int i=0; i<this.sideN;i++){
            this.lengths.add(length);
        }
        this.base_area = area();
    }
    
    
    public double perimeter(){
        return(sideN*lengths.get(0));
    }
    public double area(){
        double apothem = Math.pow(this.lengths.get(0), 2)*this.sideN/(4*Math.tan(Math.toRadians(180/this.sideN)));
        return apothem;   
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
                    Prism p1 = new Prism();
                    p1.create();
                    break;
                case 2:
                    // code block
                    break;
                case 3:
                    break;
                default:
                // code block
            }
        }
    }
    
}
