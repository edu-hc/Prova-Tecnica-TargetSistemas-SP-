import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();

        verificaFibonacci(numero);

        sc.close();
    }

    public static void verificaFibonacci (int numero) {

        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        fibonacci.add(0);
        fibonacci.add(1);

        int i = 1;
        while (fibonacci.get(i) < numero) {
            fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
            i++;
        }

        if (fibonacci.contains(numero)) {
            
            System.out.println("O número pertence à sequência de Fibonacci!");
        } else {
            
            System.out.println("O número não pertence à sequência de Fibonacci!");
        }
    }
}