
import java.util.Scanner;


public class ex_java_02 {

    public static void main(String[] args) {
        int n1[] = new int [5];
        int n2[] = new int [5];
        int n3 [] = new int [5];
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            n1[i]= teclado.nextInt();
           
            }
         System.out.println("Informe 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            n2[i]= teclado.nextInt();
            n3[i] = n1[i] + n2[i];
        }
        System.out.println("Os valores de A:");
        for (int i = 0; i < 5; i++){
            System.out.println("" +n1[i]+ "");
        }
        System.out.println("Os valores de B:");
        for (int i = 0; i < 5; i++){
            System.out.println("" +n2[i]+ "");
        }
        System.out.println("Os valores de C:");
        for (int i = 0; i < 5; i++){
            System.out.println("" +n3[i]+ "");
        }
            
        }
        
    }
    

