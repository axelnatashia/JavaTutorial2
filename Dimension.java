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
public class Dimension {
    int InWidth;
    int InLength;
    
    public Dimension()
    {
        InWidth =0;
        InLength = 0;
    }
    public Dimension (int InWidth, int InLength){
        this.InWidth = InWidth;
        this.InLength = InLength;
    }
    
    public void setInWidth(int Width){
        this.InWidth = Width;
    }
    
    public void setInLength(int Length){
        this.InLength = Length;
    }
    
    public int getInWidth(){
        return this.InWidth;
    }
    
    public int getInLength(){
        return this.InLength;
    }
    
    public String toString(){
        return "Dimension "+ InWidth+"x"+InLength;
    }
}