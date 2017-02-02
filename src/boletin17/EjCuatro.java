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
    //private String [][] tablaLet = new String[23][2];
     

 
    
    public void calcLetraDNI(){
        String[][]  tablaLet = {{"A","3"},{"B","11"},{"C","11"},{"D","9"},{"E","22"},{"F","7"},{"G","4"},{"H","18"},{"J","13"},
     {"K","21"},{"L","19"},{"M","5"},{"N","12"},{"P","8"},{"Q","16"},{"R","1"},{"S","15"},{"T","0"},{"V","17"},{"W","2"},{"Y","6"},{"Z","14"}};
        String n;
        NDNI=Integer.parseInt(JOptionPane.showInputDialog("Introduce os numeros do dni"));
        n= String.valueOf(NDNI%23);
        for(int i=0;i<tablaLet.length;i++){
            for(int j=0;j<tablaLet[0].length;i++){
                String l = tablaLet[i][j];
                String[][]  tablaAux={{l,n}};
                if(Arrays){
                    
                }else{
                
                }
            }
        }
    }
}
