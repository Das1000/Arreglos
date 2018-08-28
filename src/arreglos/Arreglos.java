/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author DAS
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Arreglo estatico
        String arreglo [] = new String[5];
        arreglo[0] = "Variable 1";
        arreglo[1] = "Variable 2";
        arreglo[2] = "Variable 3";
        arreglo[3] = "Variable 4";
        arreglo[4] = "Variable 5";
        
        for (int contador = 0; contador < arreglo.length; contador++){
            System.out.println(arreglo[contador]);
        }
        
        //Arreglo Dinamico
        System.out.println("ARREGLO 2");
        
        String arreglo2[] = {"Variable 1",
                             "Variable 2",
                             "Variable 3", 
                             "Variable 4",
                             "Variable 5"};
        
        for (int contador = 0; contador < arreglo2.length; contador++){
            System.out.println(arreglo2[contador]);
        
    }
        //Arreglo estatico
        System.out.println("ARREGLO 3");
        int arreglo3 [] = new int[10];
        arreglo3[0] = 1;
        arreglo3[1] = 2;
        arreglo3[2] = 3;
        arreglo3[3] = 4;
        arreglo3[4] = 5;
        arreglo3[5] = 6;
        arreglo3[6] = 7;
        arreglo3[7] = 8;
        arreglo3[8] = 9;
        arreglo3[9] = 10;
        
        for (int contador = 0; contador < arreglo3.length; contador++){
            System.out.println(arreglo3[contador]);
        }
    
    }
}