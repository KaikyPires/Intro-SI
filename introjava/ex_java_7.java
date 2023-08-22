
import java.util.Random;


public class ex_java_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[] = new int [10];
         int b = 0;     
       
        
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = gerador.nextInt(6);
            System.out.print(a[i]+" ");
    }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]+" ");
           
            if (a[i] == 0) {
                a[i]= 1;
               
            }
            
          
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
               System.out.print(a[i]+" ");
        }
}
}