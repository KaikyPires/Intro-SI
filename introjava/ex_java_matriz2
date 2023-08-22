import java.util.Random;
public class java_16 {

    public static void main(String[] args) {
        int m[][] = new int [4][4];
        int soma = 0;
         Random gerador = new Random();
         
         
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 m[i][j]= gerador.nextInt(15);
                 System.out.print(m[i][j]+" ");
             }
             System.out.println(" ");
        }
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                
                 if (j == i) {
                     soma = soma + m[i][3-j];
                 }
             }
             }
             System.out.println(soma);
        }
    }
    

