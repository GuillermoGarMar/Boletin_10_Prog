/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ggarciamartinez
 */
public class Juego {
   private int Nmaquina;
   private int numF=0;
    public Juego() {
    }

    public Juego(int Nmaquina) {
        this.Nmaquina = Nmaquina;
    }
    
    public void azar(){
        Random rnd = new Random();
        Nmaquina=(int)(rnd.nextDouble() * 50 + 0);
    do{
        int np=Integer.parseInt(JOptionPane.showInputDialog("Introduce un nunero entre 0-50"));
        if(np==Nmaquina){
            JOptionPane.showMessageDialog(null,"WIN!");
            System.exit(0);
        }else if(np+5>Nmaquina && np-5<Nmaquina){
             JOptionPane.showMessageDialog(null,"Estas cerca");
        }else if(np>Nmaquina){
            JOptionPane.showMessageDialog(null,"El numero es mas pequeño");
        }else if(np<Nmaquina){
            JOptionPane.showMessageDialog(null,"El numero es mayor");
        }
        numF++;
        }while(numF<5);
        JOptionPane.showMessageDialog(null,"GAME OVER");
    }
    
    }
       
        
        

