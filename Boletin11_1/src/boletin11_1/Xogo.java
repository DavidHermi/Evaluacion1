/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin11_1;


import javax.swing.JOptionPane;



public class Xogo {
    
  
    public Xogo(){}

      int vidas = 5;

        public void juego() {


            int numJugador_1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a adivinar"));
            int numJugador_2;

            while (vidas != 0) {

                numJugador_2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que desee"));

                if (numJugador_1 < numJugador_2){

                    vidas--;
                    JOptionPane.showMessageDialog(null, "Tu numero es mayor, te quedan " + vidas + " vidas");

                }

                if (numJugador_1 > numJugador_2){

                    vidas--;
                    JOptionPane.showMessageDialog(null, "Tu numero es mayor, te quedan " + vidas + " vidas");

                }

                if (numJugador_1 == numJugador_2){


                    JOptionPane.showMessageDialog(null, "Acertaste el numero, te sobraron " + vidas + " vidas");
                    vidas = 0;
                }

            }
        }
        
        } 
    

    

  
  
 
    
    

