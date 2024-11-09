/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_examen;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println("piedra = 1, papel = 2, tijera = 3, numero diferente para terminar");
        
        
        do{
            num = captu.nextInt();
        captu.nextLine();
            switch(num){
        case 1:
        System.out.println("tijera, !ganaste¡");
        break;
        case 2:
        System.out.println("piedra, !ganaste¡");
        break;
        case 3:
        System.out.println("piedra, perdiste :c");
        break;}
        }while(num == 1 || num == 2 || num == 3);
        
        
        
          
        
        
      
        
        
        
    }
    
}
}