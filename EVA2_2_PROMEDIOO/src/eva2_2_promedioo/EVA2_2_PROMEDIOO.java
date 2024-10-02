/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedioo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, acum;
        acum = 0;
        Scanner captu = new Scanner (System.in);
        
        for(int i = 1; i <= 20; i++){
            System.out.println("Estudiante #" + i);
            System.out.println("introduce la calificacion: ");
            califa = captu.nextInt();
            captu.nextLine();
            acum = acum + califa;
           }
        System.out.println("acum = " + acum);
        System.out.println("Proedio = " + (acum / 20.0));
    }
    
}
