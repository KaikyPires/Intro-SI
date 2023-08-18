
import java.util.Random;
public class ex_java_matriz {
    public static void main(String[] args) {
       int m[] [] = new int [4] [4];
       int maior = 0;
       
     Random gerador = new Random();
               for (int i = 0; i < 4; i++) {
                   for (int j = 0; j < 4; j++) {
                       m[i][j] = gerador.nextInt(100) ;
                       System.out.print(m[i][j]+" ");
                       if(m[i][j]> 10){
                       maior = maior + 1;
                       }
                   }
                       System.out.println("");
                       
               }
                    int nm[] = new int[maior];
                    int cont = 0;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                          
                                    if (m[i][j] > 10){
                                        nm[cont]= m[i][j];
                                        cont ++;
                                        
                                    }
                        }
                    }
                    for (int i = 0; i < maior; i++) {
                        System.out.print(nm[i]+" ");
                              
                    }
                    System.out.println("");
                    System.out.println(maior);
                   }
                   }
   


            

        
    
    
