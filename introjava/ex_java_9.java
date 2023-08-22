
import java.util.Random;


public class ex_java_9 {

    public static void main(String[] args) {
         int a[] = new int [10];
         int b = 1;     
       int c = 0;
        
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = gerador.nextInt(20);
            System.out.print(a[i]+" ");
            if(a[i] == i){
            b = b + 1;
            c = c + i;
        }
    }
        System.out.println(" ");
         System.out.println("O número "+c+" aparece "+b+" vezes");
        
        }
       
}
