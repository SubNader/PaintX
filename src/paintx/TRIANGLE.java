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
public class TRIANGLE extends SHAPE{
    private double Base;
    private double Height;
    private double Angle;

    public TRIANGLE(double Base, double Height, double Angle, String Name) {
        super(Name);
        this.Base = Base;
        this.Height = Height;
        this.Angle = Angle;
    }
   @Override
    public void Draw(){
        
    } 

    /**
     * @return the Base
     */
    public double getBase() {
        return Base;
    }

    /**
     * @param Base the Base to set
     */
    public void setBase(double Base) {
        this.Base = Base;
    }

    /**
     * @return the Height
     */
    public double getHeight() {
        return Height;
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(double Height) {
        this.Height = Height;
    }

    /**
     * @return the Angle
     */
    public double getAngle() {
        return Angle;
    }

    /**
     * @param Angle the Angle to set
     */
    public void setAngle(double Angle) {
        this.Angle = Angle;
    }
    
}
