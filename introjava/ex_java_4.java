
import java.util.Random;


public class ex_java_4 {

    public static void main(String[] args) {
      int a[] = new int [8];
         int b[] = new int [8];
        int c[] = new int [8];
        int d[] = new int [8];
        
        Random gerador = new Random();
        
        for (int i = 0; i < 8; i++) {
            a[i] = gerador.nextInt(15);
            System.out.print(a[i]+" ");
          
            }
        System.out.println(" ");
        for (int i = 0; i < 8; i++) {
             b[i] = gerador.nextInt(15);
               
                System.out.print(b[i]+" ");
            
        }
        System.out.println(" ");
        System.out.print("A: ");
        for (int i = 0; i < 8; i++) {
            c = b;
             
            System.out.print(c[i]+" ");
            
        }
        System.out.println("");
        System.out.print("B: ");
        for (int i = 0; i < 8; i++) {
            d = a;
          
            System.out.print(d[i]+" ");
            
        }
            System.out.println(" ");
         
        }
    }
    

