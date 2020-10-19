/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial.pkg2;
import java.util.*;
/**
 *
 * @author axel
 */
public class Room 
{
    String name="";
    int noOfChair=0;
    boolean isBooked;
    ArrayList<Dimension> InDimension = new ArrayList<Dimension>();
    ArrayList<Window> InWindow = new ArrayList<Window>();
    /*Dimension inDimension;
    Window inWindow;*/
    
    public Room(String inName, int inNoOfChair, boolean inBooked, Dimension inDim, Window inWin)
    {
        this.name=inName;
        this.noOfChair=inNoOfChair;
        this.isBooked=inBooked;
        this.InDimension.add(inDim);
        this.InWindow.add(inWin);
    }
    
    public void setName(String inName)
    {
        this.name = inName;
    }
    
    public void setNoOfChair(int inNoOfChair)
    {
        this.noOfChair = inNoOfChair;
    }
    
    public void setInBooked(boolean inBooked)
    {
        this.isBooked = inBooked;
    }
    public void setInDimension(ArrayList<Dimension> inDim)
    {
        this.InDimension=inDim;
    }
    public void setInWindow(ArrayList<Window> inWin)
    {
        this.InWindow=inWin;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getNoOfChair()
    {
        return this.noOfChair;
    }
    
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
    
    public ArrayList<Dimension> getInDimension()
    {
        return this.InDimension;
    }
    
    public ArrayList<Window> getInWindow()
    {
        return this.InWindow;
    }
    
    public String toString()
    {
       return "Room "+getName()+"\n With "+getInDimension()+"m, with "+getInWindow()+" \n and "+getNoOfChair()+" chairs, and is already booked: "+getIsBooked();
    }
}
