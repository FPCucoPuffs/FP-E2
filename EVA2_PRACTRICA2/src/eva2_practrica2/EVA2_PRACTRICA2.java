/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_practrica2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_PRACTRICA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        System.out.println("primer numero");
        int num1 = captu.nextInt();
        System.out.println("segundo numero");
        int num2 = captu.nextInt();
        
        if( num1 > num2 ){
            for(int i = num1; i >= num2; i--){
                System.out.println(i);
            }
            for(int i = num2; i <= num1; i++){
                System.out.println(i);
            }
        
                }
        
        
        
    }  
    
}
