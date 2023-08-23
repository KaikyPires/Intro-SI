
package pkg2p_poo;
import java.util.Scanner;
public class ex_java_array7 {

    public static void main(String[] args) {
        //QUANTOS DIAS FALTAM PARA O NATAL
        
        Scanner teclado = new Scanner(System.in);
        int mes = teclado.nextInt();
        int data = teclado.nextInt();
        int x = 0;
        int y = 0;
        int v[] = {31,29,31,30,31,30,31,31,30,31,30,25};
        int k = 0;
        int j = 0;
       
        
        for (int i = 0; i < mes; i++) {
            y = v[i] + y;
        }
      
        j = v[mes - 1] - data;
        k = 360 - y + j ;
       
        
        if((data == 24) && mes == 12) {
            System.out.println("É vespera de natal");
        }else if ((data == 25) && mes == 12) {

                        System.out.println("É natal!!!");
            }
                        else{
                            System.out.println("Faltam " + k + " dias para o natal");
                        }
                    }

}
