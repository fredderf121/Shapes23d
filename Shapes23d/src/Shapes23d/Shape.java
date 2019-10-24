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
    public Shape(double[] sideLength){
        for(int i=0; i<sideLength.length;i++){
            lengths.add(sideLength[i]);
        }
    }
    
}
