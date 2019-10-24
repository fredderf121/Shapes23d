/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes23d;

/**
 *
 * @author S332896109
 */
public class Prism extends Shape implements threeDimensional {
    
    public double getValue(String instruction){
        // helper method to bullet proof and force user to enter a double value
        System.out.print(instruction);
        Scanner input = new Scanner(System.in);
        double val;
        while (true){
            try{
                val=input.nextDouble();
                break;
            }
            catch (InputMismatchException err){
                input.next();
                System.out.print("Not a number, try again! "+instruction);
            }
        }
        return val;
    }    
    public void getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, you want to create a prism.");
        System.out.println("Please enter the number of si");
        while (true){
            this.a=getValue("a: ");
            if (a!=0) break;
            else System.out.println("\"a\" must NOT equal 0!");
        }  
        this.root1=getValue("one root: ");
        this.root2=getValue("other root: ");    
    }
    
    @Override
    public double calculateVolume(double height, double base_area){
        return base_area*height;
        }
    
    @Override
    public double calculateSurfaceArea(double height, double base_area, int num_sides, int side_length){
        return height*side_length*num_sides+2*base_area;
    }
    
}
