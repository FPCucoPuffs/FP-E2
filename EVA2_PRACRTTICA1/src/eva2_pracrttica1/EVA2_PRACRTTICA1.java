/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_pracrttica1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_PRACRTTICA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la cadena");
        String input = captu.nextLine();
        System.out.println("numero de veces que quieres que se repita");
        int num = captu.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.println(input);
        }
        
        
    }
    
}
