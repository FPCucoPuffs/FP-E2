/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica5;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EVA2_PRACTICA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int num;
        
        System.out.println("escribe tu numero");
        num = captu.nextInt();
        String accum;
        accum = "";
        
        for(int i = 0; i < num; i++){
            accum+=num;
            System.out.println(accum);
   }
        
    }
    
}
