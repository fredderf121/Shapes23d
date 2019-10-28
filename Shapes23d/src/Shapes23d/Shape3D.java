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
public class Shape3D extends Shape{
    public double height;
    public double volume;
    public double surface_area; 
    
    static public void runProgram3D(){
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
                    break;
                default:
                    break;
            }
    }
}
            
