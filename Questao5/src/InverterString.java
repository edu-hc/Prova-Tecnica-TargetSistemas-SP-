import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a String que vai ser invertida: ");
        String string = sc.nextLine();

        inverterString(string);

        sc.close();
        

    }

    public static void inverterString (String string) {

        String stringInvertida = "";

        for(int i = (string.length() - 1); i >= 0; i--) {

            stringInvertida += string.charAt(i);
        }

        System.out.println("Sua String invertida fica desse jeito: " + stringInvertida);
    }

}
