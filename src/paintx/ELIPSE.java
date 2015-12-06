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
public class ELIPSE extends SHAPE  {
    private double Radius1;
    private double Radius2;

    public ELIPSE(double Radius1, double Radius2, String Name) {
        super(Name);
        this.Radius1 = Radius1;
        this.Radius2 = Radius2;
    }
    @Override
    public void Draw(){
        
    } 

    /**
     * @return the Radius1
     */
    public double getRadius1() {
        return Radius1;
    }

    /**
     * @param Radius1 the Radius1 to set
     */
    public void setRadius1(double Radius1) {
        this.Radius1 = Radius1;
    }

    /**
     * @return the Radius2
     */
    public double getRadius2() {
        return Radius2;
    }

    /**
     * @param Radius2 the Radius2 to set
     */
    public void setRadius2(double Radius2) {
        this.Radius2 = Radius2;
    }
    
}
