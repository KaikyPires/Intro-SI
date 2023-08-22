
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kaiky
 */
public class ex_java_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int [5];
         int b[] = new int [5];
       int cont = 0;
        
        Random gerador = new Random();
          for (int i = 0; i < 5; i++) {
            a[i] = gerador.nextInt(20);
            
            b[i]= a[i];
           
        }
         
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 4; j++) {
                 if(b[j] > b[j + 1])
                     cont = b[j];
                     b[j]= b[j + 1];
                     b[j + 1]= cont;
                 
             }
             System.out.println("Desordenado");
             for (int j = 0; j < 5; j++) {
                 System.out.print(a[i]+" ");
             }
             System.out.println(" ");
             System.out.println("Ordenado");
             for (int j = 0; j < 5; j++) {
                 System.out.print(b[i]+" ");
             }
            
        }
        }
    }
        
    }
   
