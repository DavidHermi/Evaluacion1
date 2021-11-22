/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import java.util.Scanner;
public class Tabla {
    
      private int i = 0;
        private int e = 0;
        private int producto = 1;
       Scanner sc = new Scanner(System.in);

        public Tabla() {
        }

        public void tabla(Tabla table) {

            i = 0;

            System.out.print("Introduce un numero: "); e = sc.nextInt(); System.out.println("--------------------"); //Estos guiones los uso para separar las líneas en la terminal y que sea más fácil distinguir unas sentencias de otras.

            if (e == 0) {System.exit(0);}

            while (i < 11) {

                producto = e * i;

                System.out.println(e + " x " + i + " = " + producto);

                i++;
            }
            System.out.println("--------------------");
            table.tabla(table);

        }

    }
    
    
