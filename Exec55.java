import java.util.Scanner;

class Exec55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        double salario;
        while (num == 1){
            System.out.println("Informe o valor do salário:");
            salario =  scan.nextDouble();
            if (salario <= 500){
                salario = salario*1.10;
            }else{
                salario = salario*1.08;
            }
            System.out.println("O valor do novo salário é " + salario);
            System.out.println("Deseja digitar outro salário? Sim (1) ou Não (0).");
            num = scan.nextInt();
        }
    }
}    
