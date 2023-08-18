package IntroJava;

import java.util.Scanner;
public class IntroJava{

    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        System.out.println("Qual o seu peso: ");
        int peso = teclado.nextInt();
        System.out.println("Qual a sua altura: ");
        int altura = teclado.nextInt();
        
        int imc;
        imc =  (peso / ((altura /100)*(altura /100)));
                
        if (imc < 18.5)
        System.out.println("Abaixo do peso");
        
        else if (imc >= 18.5 & imc <= 24.9)
        System.out.println("Normal");
        
        else if (imc >= 25.0 & imc <= 29.9)
        System.out.println("Sobrepeso");
        
        
    
    }
    
}
