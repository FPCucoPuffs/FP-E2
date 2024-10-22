/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        int cantidad, producto;
        String menu[] = {"Dogos","Hamburguesa","Boneless", "Tacos","Montados", "Camarones"};
        int precios[] = {50, 80, 120, 150, 70, 200};
        for (int i = 0; i < menu.length; i++){
        System.out.println(i + " - " + menu[i] + " $" + precios[i]);}
        
        System.out.println("Cuales es tu orden? (introduce el numero del producto)");
        producto = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto vas a querer?");
        cantidad = captu.nextInt();
        captu.nextLine();
        System.out.println("El costo es de = $" + cantidad * precios[producto]);
        
    }
    
}
