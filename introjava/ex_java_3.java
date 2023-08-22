import java.util.Random;
public class ex_java_3 {

    public static void main(String[] args) {
       int v[] = new int [10];
         int v2[] = new int [10];
         
         
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            v[i] = gerador.nextInt(20);
                    System.out.print(v[i]+" ");
                    

        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            v2[i] = v[i] * 2;
              System.out.print(v2[i]+" ");
        }
        System.out.println("  ");
      
    } 
}
