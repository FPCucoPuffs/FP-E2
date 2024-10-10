/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class EVA2_PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        String input, accum;
        
        System.out.println("cadena de texto:");
        input = scanner.nextLine();
        accum = "";
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
          accum+= c +" ";
        }
        System.out.println(accum);
        
}
}