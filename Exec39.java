import java.util.Scanner;

class Exec39 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int matricula;
        int nota;

        System.out.println("Informe a matrícula:");
        matricula = scan.nextInt();
        System.out.println("Informe a nota:");
        nota = scan.nextInt();

        if(nota >= 60){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
    }
}
