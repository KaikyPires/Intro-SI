import java.util.Random;
public class ex_java_1 {

    public static void main(String[] args) {
       int v[] = new int [10];
       int som = 0;
       
       Random gerador = new Random();
       
        for (int i = 0; i < 10; i++) {
            v[i] = gerador.nextInt(15);
            System.out.print(v[i]+" ");
            if (i % 2 == 0) {
                som = som + v[i];
   
            }
           
        }
         System.out.println(" ");
        System.out.println(som);
    }
    
}
