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
public class Main {
    public static void main(String[] args)
    {
        String Direct;
        int Width=0;
        int Length=0;
        String name_="";
        int noChair;
        boolean booked;
        Scanner key=new Scanner(System.in);
        
        System.out.println("Please create the name room: ");
        name_=key.next();
        System.out.println("Please input the direction of window: ");
        Direct=key.next();
        Window newW = new Window(Direct);
        System.out.println("Please input the Width: ");
        Width=key.nextInt();
        System.out.println("Please input the Lenght: ");
        Length=key.nextInt();
        Dimension newD=new Dimension(Width, Length);
        System.out.println("Please input no of chair: ");
        noChair=key.nextInt();
        Room tutorial = new Room(name_, noChair, true, newD, newW);
        System.out.println(tutorial.toString());
    }
}
