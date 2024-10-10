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
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la cadena de texto:");
        String tex;
        tex = captu.nextLine();
        String voc;
        voc = "";
        
        for(int i = 0; i < tex.length(); i++){
            if(tex.charAt(i) == 'a' || tex.charAt(i) == 'e' || tex.charAt(i) == 'i' || tex.charAt(i) == 'o' || tex.charAt(i) == 'u' || tex.charAt(i) == 'A' || tex.charAt(i) == 'E' || tex.charAt(i) == 'I' || tex.charAt(i) == 'I'|| tex.charAt(i) == 'O'|| tex.charAt(i) == 'U'){
            char let;
            let = tex.charAt(i);
            voc+=let+" ";
            }
            
                }
          System.out.println(voc);
            
             
             
    
          
          
    }
    
}

