/*Hacer un programa que lea un vector de números enteros, de tamaño N, 
y luego me imprima la cantidad de elementos pares que hay en dicho vector*/
package contar_elementos_padre_vector;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Contar_elementos_padre_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int tam, cont_pares=0;
        System.out.println("cuantos elementos tiene el vector ");
        tam=objread.nextInt();
        //definir el vector 
        int[] numeros=new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("digite elemento " + i + " ");
            numeros[i]=objread.nextInt();
           // contar los elementos pares
        }
            for (int i = 0; i < tam; i++) {
                if (numeros [i]% 2 == 0)
                    cont_pares++;
                
            }
            System.out.println("la cantida de elementos pares es  " + cont_pares);
        }
       
    }
    

