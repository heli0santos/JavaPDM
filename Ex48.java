import java.util.Scanner;

class Ex48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario;
        String classe;
        System.out.println("Informe o salário:");
        salario = scan.nextDouble();
        System.out.println("Informe a Classe (A, B ou C)");
        classe = scan.next();
        switch(classe){
            case "A":
            salario = salario + (salario * 0.10);
            break;
            case "B":
            salario = salario + (salario * 0.15);
            break;
            case "C":
            salario = salario + (salario * 0.20);
            break;
        }
        System.out.println("Novo salário: " + salario);
    }
}