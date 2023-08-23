import java.util.Scanner;
public class ex_java_intro {

    public static void main(String[] args) {
        
        
       Scanner teclado = new Scanner(System.in);
        System.out.println("O quanto de felicidade voc~e quer?");
        int n = teclado.nextInt();
        
        System.out.print("Feliz Nat");
        for (int i = 0; i < n; i++) {
            System.out.print("a");
        }
        System.out.print("l!");
    }
    
}
