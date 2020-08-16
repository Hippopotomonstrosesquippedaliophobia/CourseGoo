/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursegoo;

import java.awt.event.MouseEvent;

/**
 *
 * @author Bronj
 */
public class settingsCalls 
{    
    /*When mouse is clicked, returns coordinates and sends them to drag function*/
    void itemClick(MouseEvent evt) 
    {
        sample go = new sample();
        int xMouse = evt.getX();
        int yMouse = evt.getY();     
        
        String temp =  xMouse + " " + yMouse;
        
        String[] coords = temp.split("\\s+");
        
        //convert to Integer
        sideOperations sideOp = new sideOperations();
        
        go.setxMouse(sideOp.toInt(coords[0]));
        go.setyMouse(sideOp.toInt(coords[1]));  
    }
    
    /*Drag function*/
    void mouseDragged(MouseEvent evt,int xMouse,int yMouse) 
    {
        sample go = new sample();
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        System.out.println("X: " + x + " Y: " + y);
        go.setLocation(x - xMouse, y - yMouse);
    }

    
    
    
}
