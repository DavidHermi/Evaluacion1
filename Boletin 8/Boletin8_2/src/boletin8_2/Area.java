/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Area {
      private float l;
        private float b;
        private float h;
        private float r;

        private int opcion;

        public Area(){}

        public void menu(Area area){

            opcion = Integer.parseInt(JOptionPane.showInputDialog("--AREAS--\n1.CUADRADO\n2.TRIANGULO\n3.CIRCULO\n--ELIGE UNA OPCION--"));

            switch (opcion){

                case 1: {
                    l = Integer.parseInt(JOptionPane.showInputDialog("LADO DEL CUADRADO"));
                    JOptionPane.showMessageDialog(null, "EL AREA DEL CUADRADO ES: "+ l*l);
                    break;
                }

                case 2: {
                    b = Integer.parseInt(JOptionPane.showInputDialog("BASE DEL TRIANGULO"));
                    h = Integer.parseInt(JOptionPane.showInputDialog("ALTURA DEL TRIANGULO"));
                    JOptionPane.showMessageDialog(null, "EL AREA DEL TRIANGULO ES: " + (b*h)/2 );
                    break;
                }

                case 3: {
                    r = Integer.parseInt(JOptionPane.showInputDialog("RADIO DE LA CIRCUNFERENCIA"));
                    JOptionPane.showMessageDialog(null, "EL AREA DE LA CIRCUNFERENCIA ES: "+ 3.14*r*r);
                    break;
                }

                default: JOptionPane.showMessageDialog(null, "ESTA OPCION NOI ES VALIDA");
                    area.menu(area);

            }


        }


    }

