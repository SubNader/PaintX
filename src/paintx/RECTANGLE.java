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
public class RECTANGLE extends SHAPE{
    private double Length;
    private double Width;

    public RECTANGLE(double Length, double Width, String Name) {
        super(Name);
        this.Length = Length;
        this.Width = Width;
    }

    
    @Override
    public void Draw(){
        
    }
    /**
     * @return the Length
     */
    public double getLength() {
        return Length;
    }

    /**
     * @param Length the Length to set
     */
    public void setLength(double Length) {
        this.Length = Length;
    }

    /**
     * @return the Width
     */
    public double getWidth() {
        return Width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(double Width) {
        this.Width = Width;
    }
    
    
}
