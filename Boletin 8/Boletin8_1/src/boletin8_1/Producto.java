/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Producto {
    
    
   private String nom;
        private float ventas;
        Scanner sc = new Scanner(System.in);

        public Producto(){}

        public Producto(String nom, float ventas){

            System.out.print("Nombre del producto: ");
            nom = sc.nextLine();

            System.out.print("Numero de ventas: ");
            ventas = sc.nextFloat();

            this.nom = nom;
            this.ventas = ventas;

        }

        public void Consumo(){

            if (ventas <= 100){System.out.println(nom + " es un producto de bajo consumo");}
            if (ventas > 100 && ventas <= 500){System.out.println(nom + " es un producto de consumo medio");}
            if (ventas > 500 && ventas <= 1000){System.out.println(nom + " es un producto de alto consumo");}
            if (ventas > 1000){System.out.println(nom + " es un producto de primera necesidad");}

        }

    }   
    
    
    
    
    

