//Carolina Lee - 10440304
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite alguma coisa:");
        String entrada = scanner.nextLine();
        Palindromo p = new Palindromo(entrada);
        System.out.println(p.verificar());
        scanner.close();
    }
}
