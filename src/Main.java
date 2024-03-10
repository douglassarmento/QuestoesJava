import java.util.Scanner;
import java.util.ArrayList;

class Aluno {
    private String nome;
    private double notaUm;
    private double notaDois;
    private double notaTres;
    private double media;

    public Aluno(String nome, double notaUm, double notaDois, double notaTres, double media) {
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public double getMedia() {
        return media;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao, nome;
        double notaUm, notaDois, notaTres;
        double somaMedia = 0;
        int numeroAlunos = 0;
        int quantidadeAprovados = 0;
        int quantidadeReprovados = 0;
        ArrayList<Aluno> turma = new ArrayList<>();

        do {
            System.out.print("Digite o nome do aluno(a): ");
            nome = sc.nextLine();
            System.out.print("Digite a primeira nota: ");
            notaUm = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            notaDois = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
            notaTres = sc.nextDouble();

            double media = (notaUm + notaDois + notaTres) / 3.0;
            numeroAlunos++;
            somaMedia += media;
            Aluno aluno = new Aluno(nome, notaUm, notaDois, notaTres, media);
            turma.add(aluno);

            if (media >= 6) {
                quantidadeAprovados++;
            } else {
                quantidadeReprovados++;
            }
            System.out.print("Digite 'continuar' ou 'sair' -> ");
            opcao = sc.nextLine();
        } while (!opcao.equals("sair"));

        System.out.println("Notas dos alunos:");
        for (Aluno aluno : turma) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota 1: " + aluno.getNotaUm());
            System.out.println("Nota 2: " + aluno.getNotaDois());
            System.out.println("Nota 3: " + aluno.getNotaTres());
            System.out.println("Média: " + String.format("%.2f", aluno.getMedia()));
            System.out.println();
        }

        System.out.println("Informações gerais da turma:\n");
        System.out.println("Média geral da turma: " + String.format("%.2f", somaMedia / numeroAlunos));
        System.out.println("Quantidade de alunos aprovados: " + quantidadeAprovados);
        System.out.println("Quantidade de alunos reprovados: " + quantidadeReprovados);
        sc.close();
    }
}