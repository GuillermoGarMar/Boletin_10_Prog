/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author ggarciamartinez
 */
public class Boletin10_2 {
    
public static void Juego() {
        int nR=0;
        int numF=0;
        Random rnd = new Random();
        nR=(int)(rnd.nextDouble() * 50 + 0);
    do{
        int nI=Integer.parseInt(JOptionPane.showInputDialog("Introduce un nunero entre 0-50"));
        if(nI==nR){
            JOptionPane.showMessageDialog(null,"WIN!");
            System.exit(0);
        }else if(nI+5>=nR && nI-5<=nR){
             JOptionPane.showMessageDialog(null,"Moi preto");
        }else if(nI+10>nR && nI-10<nR){
            JOptionPane.showMessageDialog(null,"Preto");
        }else if(nI+20>nR && nI-20<nR){
            JOptionPane.showMessageDialog(null,"Lonxe");
        }
        numF++;
        }while(numF<7);
        JOptionPane.showMessageDialog(null,"GAME OVER");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego();
    }
    
}
