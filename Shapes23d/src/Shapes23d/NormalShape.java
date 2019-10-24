/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes23d;

/**
 *
 * @author S346795925
 */
public class NormalShape extends Shape{
    public NormalShape(double[] sideLength, int sideNum){
        super(sideLength);
        this.sideN = sideNum;
    }
    public double perimeter(){
        return(sideN*lengths.get(0));
    }
    public double area(){
        double apothem = lengths.get(0)/(2*Math.tan(180/sideN));
        return(perimeter()*apothem*0.5);   
    }
}
