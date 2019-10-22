/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes23d;
import java.lang.Math;

/**
 *
 * @author S346795925
 */
public class Shape {
    int sideN;
    int sideL;
    public Shape(int sideNum, int sideLength){
        sideN = sideNum;
        sideL = sideLength;
    }
    public double perimeter(){
        return(sideN*sideL);
    }
    public double area(){
        double apothem = sideL/(2*Math.tan(180/sideN));
        return(perimeter()*apothem*0.5);
    }
}
