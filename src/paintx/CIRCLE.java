/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintx;

/**
 *
 * @author Tasneem
 */
public class CIRCLE extends ELIPSE{
    private double Radius;

    public CIRCLE(double Radius, String Name) {
        super(Radius, Radius, Name);
        this.Radius = Radius;
    }
        @Override
    public void Draw(){
        
    } 

    /**
     * @return the Radius
     */
    public double getRadius() {
        return Radius;
    }

    /**
     * @param Radius the Radius to set
     */
    public void setRadius(double Radius) {
        this.Radius = Radius;
    }
    
    
    
}
