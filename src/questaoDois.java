import java.util.Scanner;
import java.util.Random;
public class questaoDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        int palpite = -1;
        Random r = new Random();
        int valor = r.nextInt(1001);
        do {
            tentativas ++;
            System.out.print("\nTente adivinhar um valor (de 0 até 1000): ");
            palpite = sc.nextInt();
            if (palpite == valor) {
                System.out.println("Você acertou! Número de tentativas: " + tentativas);
            } else {
                if (valor > palpite) {
                    System.out.println("O valor é maior! Tente novamente.");
                } else {
                    System.out.println("O valor é menor! Tente novamente.");
                }
            }
        } while (palpite != valor);
        sc.close();
    }
}