/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

import javafx.application.Platform;
import javax.swing.JOptionPane;
//import jdk.tools.jlink.internal.Platform;

/**
 *
 * @author Wil
 */
public class ControlesBasicos {
    
    public void salirSistema() {
        int pregunta = JOptionPane.showConfirmDialog(null, "Realmente desea salir del programa?");
        int yes = 0;
        if (pregunta == yes) {
            Platform.exit();
        } 
    }
}
