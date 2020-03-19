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
public class settingsCalls {    
    /*When mouse is clicked, returns coordinates and sends them to drag function*/
    String itemClick(MouseEvent evt) {
        CourseGo go = new CourseGo();
        int xMouse = evt.getX();
        int yMouse = evt.getY();     
        
        return xMouse + " " + yMouse;
    }
    
    /*Drag function*/
    void mouseDragged(MouseEvent evt,int xMouse,int yMouse) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        System.out.println("X: " + x + " Y: " + y);
       // go.setLocation(x - xMouse, y - yMouse);
    }
    
    
}
