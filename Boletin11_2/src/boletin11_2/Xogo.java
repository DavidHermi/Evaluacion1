/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Xogo {
    int vidas = 10;


        public void juego() {


            int numRandom = (int) (Math.random() * 50);
            int numJugador;
            int distancia;

            while (vidas != 0) {

                //System.out.println(numRandom);

                numJugador = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 50"));

                distancia = (numJugador - numRandom);
                if (distancia<0){distancia = distancia*-1;}

                if (distancia>20 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "MOI LONXE, TE QUEDAN " + vidas + " VIDAS");
                }


                if (distancia<20 && distancia>10 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "LONXE, TE QUEDAN " + vidas + " VIDAS");
                }

                if (distancia<10 && distancia>5 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "PRETO, TE QUEDAN " + vidas + " VIDAS");
                }

                if (distancia<=5 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "MOI PRETO, TE QUEDAN " + vidas + " VIDAS");
                }

                if (numJugador == numRandom) {

                    JOptionPane.showMessageDialog(null, "ACERTASTE EL NUMERO, TE SOBRARON " + vidas + " VIDAS");
                    vidas = 0;



                }
            }
        } 
}
