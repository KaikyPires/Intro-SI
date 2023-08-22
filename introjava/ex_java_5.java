
import java.util.Random;


public class ex_java_5 {

    public static void main(String[] args) {
        int a[] = new int [10];
         int b[] = new int [10];
        int c[] = new int [10];
        
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = gerador.nextInt(15);
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            b[i] = gerador.nextInt(15);
            System.out.print(b[i]+" ");
            
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] * b[i];
            System.out.print(c[i]+"");
            System.out.print(" ");
        }
    }
    
}
