import java.util.Scanner;
public class questaoQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        StringBuilder fraseInvertida = new StringBuilder();
        for (String palavra : palavras) {
            StringBuilder palavraInvertida = new StringBuilder();
            for (int i = palavra.length() - 1; i >= 0; i--) {
                palavraInvertida.append(palavra.charAt(i));
            }
            fraseInvertida.append(palavraInvertida).append(" ");
        }
        System.out.println("Frase invertida: " + fraseInvertida.toString().trim());
        sc.close();
    }
}