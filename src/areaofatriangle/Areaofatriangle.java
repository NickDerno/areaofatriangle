/*
 * Nick Dernovsek
 * nider6687
 * This program calculates the area of a triangle
 */
package areaofatriangle;
import javax.swing.*;
/**
 *
 * @author nickd
 */
public class Areaofatriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JTextField base = new JTextField();       //declaring textfields
        JTextField height = new JTextField();
        
        Object [] fields = {
            "Enter a height in cm",height,      //creates objects for height and base
            "Enter a base in cm",base
        };
        
        JOptionPane.showConfirmDialog(null, fields, "Find the area of a triangle", JOptionPane.OK_CANCEL_OPTION);
        double baseNumber = Double.parseDouble(base.getText()); 
        double heightNumber = Double.parseDouble(height.getText());     //gets text and converts is to double
        double area = (baseNumber*heightNumber/2);
        JOptionPane.showMessageDialog(null, "The area of this trinagle is " + area + " cm^2");      //calculates the area
    }
    
}
