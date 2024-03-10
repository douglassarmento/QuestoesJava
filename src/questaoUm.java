import java.util.Scanner;
public class questaoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero > 1) {
            boolean primo = true;
            int[] valores = {2, 3, 4, 5, 6, 7, 8, 9};
            for (int x : valores) {
                if (numero != x && numero % x == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("É primo.");
            } else {
                System.out.println("Não é primo.");
            }
        } else if (numero <= 1) {
            System.out.println("O número indicado não é primo, pois é menor ou igual a 1.");
            sc.close();
        }
    }
}