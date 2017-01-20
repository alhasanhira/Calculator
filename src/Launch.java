
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Launch {

    public static void main(String[] args) {
           try{
            
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
             //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
             //UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
             UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
              //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
               //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
             // UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
              
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
}
       
        Calculator c= new Calculator();
        c.setVisible(true);
    }
    
}
