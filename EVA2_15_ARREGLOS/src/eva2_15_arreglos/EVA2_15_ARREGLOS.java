/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_15_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion de arreglos:
        
        int[] arreglo = new int [10];//ocupa 40 bytes
        arreglo[0] = 100;
         arreglo[1] = 200;
          arreglo[2] = 300;
           arreglo[3] = 400;
            arreglo[4] = 500;
             arreglo[5] = 600;
              arreglo[6] = 00;
               arreglo[7] = 100;
               arreglo[8] = 100;
        //manejo por indices
        
        //primer elemento de un arreglo --> CERO
        
        
        
        //ultomo elemento de un arreglo TAMAÑO -1 
        arreglo[9] = 900;
        
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
        System.out.println(arreglo[6]);
        
        
        
        
    }
    
}
