package Questoes;

import java.util.Scanner;

public class Quest2 {

    public static void main(String[] args) {
        //O programa mostrará a sequência de fibonacci até o 13º termo para fins de limitar processamento.
        Scanner scanner = new Scanner(System.in);
       
        int indice = 13, K = 0, termo1 = 0, termo2 = 1, termo3 = 0;
       
        System.out.print("Digite o número ao qual queira saber se pertence a sequência de Fibonnacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println(termo1 + "\n" + termo2);
        while(K < indice) {
           
            termo3 = termo1 + termo2;
            termo1 = termo2;
            termo2 = termo3;
            K += 1;
           
            System.out.println(termo3);

            if(numero == termo3 || numero == termo1 || numero == termo2){
                System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
                break;            
            }
            else if(numero != termo3 && K == indice){
                System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
            }            
        }

    }
    
}
