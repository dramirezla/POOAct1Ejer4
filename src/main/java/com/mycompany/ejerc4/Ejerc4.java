/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerc4;

/**
 *
 * @author David R.L
 */
import java.util.*;
import java.lang.*;
public class Ejerc4 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int radio=entrada.nextInt();
        System.out.println("El area del circulo es: "+(Math.PI*Math.pow(radio, 2)));
        System.out.println("La longitud de la circunferencia es: "+(2*Math.PI*radio));
    }
}
