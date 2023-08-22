
import java.util.Scanner;


public class NewMain {

    public static void main(String[] args) {
        int notaln[] = new int[3];
       
        int media = 0;
       
         char gabarito[] = new char [10];
        Scanner teclado = new Scanner(System.in);
        String teste = teclado.nextLine();

        for (int i = 0; i < 10; i++) {

               gabarito[i] = teste.charAt(i);
        }
  
        char questAlunos[][] = new char[3][10];

        String sequencia;

        for (int i = 0; i < 3; i++) {

            sequencia = teclado.nextLine();

            for (int j = 0; j < 10; j++) {
                  questAlunos[i][j] = sequencia.charAt( j );
                 if(questAlunos[i][j] == gabarito[j]){
                     notaln[i]+=1;
                 }
 
    } 
            if(notaln[i]>=6){
            media++;
}
       
        }
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Nota do Aluno1:"+(i+1)+notaln[i]);}
                     System.out.println("Notas acima da media:"+media);
                    
            }
    }
            
            
        
        
    


