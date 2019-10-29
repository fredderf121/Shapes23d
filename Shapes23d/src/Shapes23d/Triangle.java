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
public class Triangle extends Shape {

    List<Double> angles = new ArrayList<>();  
    
    public Triangle(){
        this.sideN = 3;
        for(int i = 0; i < this.sideN; i++){
            this.lengths.add((double)getValue("Enter the length of side "+(i+1), 0, Double.MAX_VALUE));
        }
        this.base_area = area();
        this.perimeter = perimeter();
        this.angles = calculateAngles(this.lengths);
        displayResults();
    }
    @Override
    public double perimeter(){
        return(lengths.get(0)+lengths.get(1)+lengths.get(2));
    }
    public List<Double> calculateAngles(List<Double> sideLengths){
        List<Double> calculatedAngles = new ArrayList<>();  
        double a = sideLengths.get(0);
        double b = sideLengths.get(1);
        double c = sideLengths.get(2);
        calculatedAngles.add(Math.toDegrees(Math.acos((c*c-a*a-b*b)/((-2)*a*b))));
        calculatedAngles.add(Math.toDegrees(Math.acos((b*b-c*c-a*a)/((-2)*a*c))));
        calculatedAngles.add(Math.toDegrees(Math.acos((a*a-c*c-b*b)/((-2)*c*b))));
        return(calculatedAngles);
    }
    public void displayResults(){
        System.out.println("Area is "+this.base_area);
        System.out.println("Perimeter is "+this.perimeter);
        System.out.println("The angles are ");
        for(int i = 0; i < this.sideN; i++){
            System.out.println(this.angles.get(i));
        }
    }
    
}
