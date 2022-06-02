/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pr8vectorsedgar;

/**
 *
 * @author Jupiter
 */
public class Pr8VectorsEdgar {

    public static void main(String[] args) {
       int[] num = {15,56,562,75,53,85,45,105,25,55,-99, -2345,838383, 123, -100243};
         
        Burbuja lista = new Burbuja(num);
        int[] ordenado = lista.Ordenar();
        HexaDecimal hexnum = new HexaDecimal(ordenado[num.length -1]);
        
        for(int i=0;i<num.length;i++){
            System.out.println(ordenado[i]);
        }
        System.out.println(hexnum.ToHexa());
    }
}
