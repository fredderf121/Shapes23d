/*
 * The subclass that contains information that is used for any 3D shape
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
                    + "or a sphere? [type 3]", 1, 3);
            switch (which3D) {
                case 1:
                    Prism pr1 = new Prism("base");
                    break;
                case 2:
                    Pyramid py1 = new Pyramid("base");
                    break;
                case 3:
                    Sphere sph1 = new Sphere();
                    break;
                default:
                    break;
            }
    }

}
