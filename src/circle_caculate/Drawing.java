/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_caculate;

import javax.swing.JComponent;
import java.awt.Graphics;

/**
 *
 * @author Karta Yu
 */
public class Drawing extends JComponent{
    private String r = "";
    private String x = "";
    private double radius1;
    
    public void set_radius(double value){
        this.radius1 = value;
    }
    
    public void set_radius_text(String s){
        this.r = s;
    }
    
    public void set_value_text_x(String s){
        double a  = radius1 * 2 * 3.14;
        this.x = Double.toString(a);
    }
    
    public void paintComponent(Graphics g){
        int radius = (int)radius1;
        g.drawOval(100, 100, radius, radius);
        g.drawLine(100 + radius / 2, 100 + radius / 2, 100 + radius, 100 + radius / 2);
        g.drawString(r, 100 + radius * 3 / 5, 100 + radius / 2);
        g.drawString("周長" + x, 100 + radius + 10, 100 + radius / 2);
    }
}
