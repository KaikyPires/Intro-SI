
import java.util.Random;


public class ex_java_8 {

    public static void main(String[] args) {
         int a[] = new int [15];
         int b [] = new int [15];   
       
        
        Random gerador = new Random();
        for (int i = 0; i < 15; i++) {
            a[i] = gerador.nextInt(8);
            System.out.print(a[i]+" ");
    }
        System.out.println(" ");
        for (int i = 0; i < 15; i++) {
             b[i] = a[14-i];
            System.out.print(b[i]+" ");
        }
        System.out.println(" ");
    }
}
