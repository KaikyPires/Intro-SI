
import java.util.Random;


public class ex_java_6 {

    public static void main(String[] args) {
          int a[] = new int [10];
         int b = 0;     
        int c = 0;
        
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = gerador.nextInt(15);
            System.out.print(a[i]+" ");
           
    }
        for (int i = 0; i < 5; i++) {
            
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            
        
        if(i % 2 == 0){
                c = i;
               
                 System.out.print(c+" ");
            }
        }
            System.out.println(" ");
            
        for (int i = 0; i < 10; i++) {
             if (i % 2 == 1){
                b = i;
            System.out.print(b+" ");
        }
        }
     System.out.println(" ");
           
        }
}
