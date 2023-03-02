package Questoes;
import java.util.Scanner;

public class Quest5 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase a ser invertida: ");
        String frase = scanner.nextLine();

        scanner.close();

        String fraseInvertida = "";

        for(int i = frase.length() - 1; i >= 0; i--){
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
