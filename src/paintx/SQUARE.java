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
public class SQUARE extends RECTANGLE{
    private double Side;

    public SQUARE(double Side,String Name) {
        super(Side, Side, Name);
        this.Side = Side;
    }

    @Override
    public void Draw(){
        
    }
    public double getSide() {
        return Side;
    }

    /**
     * @param Side the Side to set
     */
    public void setSide(double Side) {
        this.Side = Side;
    }
    

   
    
    
}
