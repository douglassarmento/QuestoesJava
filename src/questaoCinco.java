import java.util.Arrays;
import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();

        System.out.print("Array do input: {");
        for (int i = 0; i < letras.length; i++) {
            System.out.print((int)letras[i]);
            if (i < letras.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        Arrays.sort(letras);

        System.out.print("Array ordenado: {");
        for (int i = 0; i < letras.length; i++) {
            System.out.print((int)letras[i]);
            if (i < letras.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Palavra ordenada: ");
        for (char letra : letras) {
            System.out.print(letra);
        }
        System.out.println();

        scanner.close();
    }
}