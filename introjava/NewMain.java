import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x = 1;
        int y = 1;
        
         while(x!=0&y!=0){
            x = teclado.nextInt();
            y = teclado.nextInt();
         
         if (x>0 && y>0){
             System.out.println("Primeiro quadrante");
         }
         else if (x<0 && y>0){
             System.out.println("Segundo quadrante");
         }
         else if (x<0 && y<0){
             System.out.println("Terceiro quadrante");
         }
          
          else if (x>0 && y<0){
             System.out.println("Quarto quadrante");
         }
         
         }
    }
}

