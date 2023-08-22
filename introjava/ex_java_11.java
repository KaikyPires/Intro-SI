
import java.util.Random;
import java.util.Scanner;


public class ex_java_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int v[] = new int [5];
         int v2[] = new int [5];
         int v3[] = new int [10];
         int aux = 0 ;
         
       
          Random gerador = new Random();
         for (int i = 0; i < 5; i++) {
            
             v[i] = gerador.nextInt(20);
             v2[i] = gerador.nextInt(20);
         }
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 4; j++) {
                 if (v[j] > v[j + 1]) {
                     aux = v[j];
                     v[j] = v[j + 1];
                     v[j + 1] = v[j];
                 }
                 
             }
         }
         aux = 0 ;
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 4; j++) {
                 if (v2[j] > v2[j + 1]) {
                     aux = v2[j];
                     v2[j] = v2[j + 1];
                     v2[j + 1] = v2[j];
                 }

             }
         }
         aux = 0 ;
         for (int i = 0; i < 5; i++) {
             v3[i] = v[i];
         }
         for (int i = 0; i < 5; i++) {
             v3[i + 5] = v2[i];
         }
         
         for (int i = 0; i < 10; i++) {
             for (int j = 0; j < 9; j++) {
                 if (v3[j] > v3[j + 1]) {
                     aux = v3[j];
                     v3[j] = v3[j + 1];
                     v3[j + 1] = aux;
                 }
             }
         }
         for (int i = 0; i < 10; i++) {
             System.out.print(v3[i] + " ");
         }
    }
}
   
    
