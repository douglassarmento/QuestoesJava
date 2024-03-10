import java.util.Scanner;
public class questaoTres {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        nome = sc.nextLine();
        String [] letras = nome.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String letra : letras) {
            sb.append(letra.charAt(0)).append(".");
        }
        System.out.println("Iniciais: " + sb.toString().toUpperCase());
        sc.close();
    }
}