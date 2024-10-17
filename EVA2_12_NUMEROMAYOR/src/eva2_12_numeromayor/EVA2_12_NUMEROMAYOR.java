/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_numeromayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_NUMEROMAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, nummay;
        nummay = -9999;
        Scanner captu = new Scanner(System.in);
        do{
       
        System.out.println("ESCRIBE UN NUMERO:");
        num = captu.nextInt();
        captu.nextLine();
        if(num > nummay){
        nummay = num;
    }
        }while(!(num == 5));
        
        
        System.out.println("El numero mayor fue:" + nummay);
    
}
}