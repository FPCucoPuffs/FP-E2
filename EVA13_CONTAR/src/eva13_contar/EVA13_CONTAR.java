/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva13_contar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la cadena de texto:");
        String tex;
        tex = captu.nextLine();
      
        int cont = 0;
        
        for(int i = 0; i < tex.length(); i++){
            if(tex.toLowerCase().charAt(i) == 'a' || tex.charAt(i) == 'e' || tex.charAt(i) == 'i' || tex.charAt(i) == 'o' || tex.charAt(i) == 'u' ){
             cont++;
            }
          
    }
                  System.out.println("La cantidad de vocales es: "+cont);

    
    }
}
