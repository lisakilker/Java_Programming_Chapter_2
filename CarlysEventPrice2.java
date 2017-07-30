/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W1HW;

import javax.swing.JOptionPane;

/**
 *
 * @author Lisa
 */
public class CarlysEventPrice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //integer input
        String stringAttendees;
        int numOfAttendees;
        boolean isLarge = false;
        
        stringAttendees = JOptionPane.showInputDialog(null, "How many guests? ");
        numOfAttendees = Integer.parseInt(stringAttendees);//takes string and turns into Int
        
        int result = numOfAttendees * 35;
        
        JOptionPane.showMessageDialog(null,"The number of guests is " + stringAttendees + ".");
        JOptionPane.showMessageDialog(null,"The total cost per guest is $35.");
        JOptionPane.showMessageDialog(null,"The total cost is " + "$" + result + ".");
        
        if (numOfAttendees>=50)
            isLarge = true;
        
        if(isLarge)
        JOptionPane.showMessageDialog(null,"Your party is large." );
        
        else
        JOptionPane.showMessageDialog(null,"Your party is small.");
        
    }
    
    
}
