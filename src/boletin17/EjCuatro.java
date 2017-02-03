/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class EjCuatro {
    private int NDNI;
    private String [] tablaLet = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
     

 
    
    public void calcLetraDNI(){
        Integer n;
        NDNI=Integer.parseInt(JOptionPane.showInputDialog("Introduce os numeros do dni"));
        n= NDNI%23;
        System.out.println(NDNI+tablaLet[n]);
    }
}
