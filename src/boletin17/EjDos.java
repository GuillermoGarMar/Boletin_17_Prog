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
public class EjDos {
    private int [] alumnos = new int [30];
    public void visual2(){
        for(int i =0;i<30;i++){
            System.out.println(alumnos[i]);
        }
    }
    public void IntroNotas(){
        int nota=0;
        for(int i =0;i<30;i++){
            nota= (int) (Math.random()*10);
            if(nota>=0){alumnos[i]=nota;}else{alumnos[i]=0;}
        }
    }
    public void VerAoS(){
        int Apr =0;
        int sus =0;
        for(int i =0;i<30;i++){
            if( alumnos[i]>=5){
                Apr++;
            }else if(alumnos[i]<4){
                sus++;
            }
        }
        System.out.println("tantos aprobados:"+Apr);
        System.out.println("tantos suspensos:"+sus);
    }
    
    public void Media(){
        int med=0;

        for(int i =0;i<30;i++){
            med=alumnos[i]+med;
            }
          System.out.println("La media es: "+(med/30));
    }
    
    public void NotaMasAlt(){
        int nAlta=0;
        for(int i =0;i<30;i++){
            if(alumnos[i]>nAlta){nAlta=alumnos[i];}
            
            }
          System.out.println("La nota mas alta es: "+(nAlta));
    }
    // ejercicio 3
    
    public void PedirNota(){
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion del alumno:"));
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i]==pos){
                System.out.println("el alumno "+pos+" tiene la nota: "+(alumnos[i]));
                break;
            }
        }
        
    }
    
    public void SoloAprobados(){
         for(int i =0;i<30;i++){
            if( alumnos[i]>=5){
                System.out.println(alumnos[i]);
            }
        }
        
    }
    
    public void OrdenarAlumnos(){
        Arrays.sort(alumnos);
    }
}


