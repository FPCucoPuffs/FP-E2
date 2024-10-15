/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String usu="", contra="";
        
        while(!(usu.equals("admin") && (contra.equals("1234"))));{
        System.out.println("USUARIO");
        usu = captu.nextLine();
        System.out.println("CONTRASEÑA");
        contra = captu.nextLine();
        
    }
    }
    
}
