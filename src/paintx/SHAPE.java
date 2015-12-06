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
public abstract class SHAPE {

   private String Name;
   private static int Counter=0;
   
    public SHAPE(String Name) {
        this.Name = Name;
    }
    
    public void Draw(){
        
    }
    
    public static int getCounter() {
        return Counter;
    }

  
    public static void setCounter(int aCounter) {
        Counter = aCounter;
    }
  

    
    public String getName() {
        return Name;
    }

    
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
