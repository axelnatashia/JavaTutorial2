/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg2;

/**
 *
 * @author axel
 */
public class Window {
    String direction;
    
    public Window(String InDirection){
        this.direction=InDirection;
    }
    
    public void setDirection(String InDirection){
        this.direction=InDirection;
    }
    
    public String getDirection(){
        return this.direction;
    }
    
    public String toString(){
        return "window facing "+direction;
    }
}
