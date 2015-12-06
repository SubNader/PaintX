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
public class LINE extends SHAPE{
    private double Startpoint;
    private double Endpoint;

    public LINE(double Startpoint, double Endpoint, String Name) {
        super(Name);
        this.Startpoint = Startpoint;
        this.Endpoint = Endpoint;
    }
    
    
    @Override
    public void Draw(){
        
    } 

    /**
     * @return the Startpoint
     */
    public double getStartpoint() {
        return Startpoint;
    }

    /**
     * @param Startpoint the Startpoint to set
     */
    public void setStartpoint(double Startpoint) {
        this.Startpoint = Startpoint;
    }

    /**
     * @return the Endpoint
     */
    public double getEndpoint() {
        return Endpoint;
    }

    /**
     * @param Endpoint the Endpoint to set
     */
    public void setEndpoint(double Endpoint) {
        this.Endpoint = Endpoint;
    }
    
}
