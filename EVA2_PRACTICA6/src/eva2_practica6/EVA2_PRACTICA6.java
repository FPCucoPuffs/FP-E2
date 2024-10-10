/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica6;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EVA2_PRACTICA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner captu = new Scanner(System.in);
        System.out.println("escribe un numero: ");
        int num;
        num = captu.nextInt();
        String accum;
        accum = "";
        char c;
        c = '*';
       for (int i= num; i > 0; i--){
           

           for (int j = 0; j < i; j++){
               accum += c;
           }
           System.out.println(accum);
           accum = "";

       }
    }
}
  
    
    


