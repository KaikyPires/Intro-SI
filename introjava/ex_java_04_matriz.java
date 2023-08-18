
import java.util.Random;


public class ex_java_04_matriz {

    public static void main(String[] args) {
        int m [][] = new int [4][4];
        int maior = 0;
        int linha = 0;
        int coluna = 0;        
        
         Random gerador = new Random();
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 m[i][j] = gerador.nextInt(100);
                 System.out.print(m[i][j]+" ");
                 if ( m[i][j] > maior){
                 maior =  m[i][j];
                 linha = i;
                 coluna = j;
             }
             }
             System.out.println("");
             
        }
         System.out.println(maior);
         System.out.println(linha);
         System.out.println(coluna);
    }
    
}
