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
        
    public void create(){
        this.sideN = 3;
        for(int i = 0; i < this.sideN; i++){
            this.lengths.add((double)getValue("Enter the length of side "+(i+1)));
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
        calculatedAngles.add(0.0);//Placeholders
        calculatedAngles.add(0.0);
        calculatedAngles.add(0.0);
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
