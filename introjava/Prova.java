
import java.util.Scanner;


public class Prova {

    public static void main(String[] args) {
       int v1[] = new int [10];
        int v2 [] = new int [10];
        
       
         Scanner teclado = new Scanner(System.in);
      
         for (int i = 0; i < 10; i++) {
              v1[i]= teclado.nextInt();
 
        }
         for (int i = 0; i < 10; i++) {
             
             v2[i] = v1[9-i];
         
        }
         System.out.print("v1={");
         for (int i = 0; i < 10; i++) {
             if (i != 9) {
                 System.out.print(v1[i]+",");
                 
             }
             else if(i == 9){
                 System.out.print(v1[i]);
             }
        }
         System.out.println("} ");
         System.out.print("v2={");
         for (int i = 0; i < 10; i++) {
             if (i != 9) {
                 System.out.print(v2[i]+",");
                 
                 
             }
              else if(i == 9){
                 System.out.print(v2[i]);
             }
        }
         System.out.println("}");
    }
    
}
