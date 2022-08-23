import java.util.Scanner;

class Ex47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioBruto, salarioLiquido;
        System.out.println("Informe o valor do salário bruto:");
        salarioBruto = scan.nextDouble();
        if(salarioBruto < 1500){
            salarioLiquido = salarioBruto - (salarioBruto * 0.08);
        }else{
            salarioLiquido = salarioBruto - (salarioBruto * 0.05) - (salarioBruto * 0.11);
        }
        System.out.println("O salário líquido é de " + salarioLiquido);
    }
}
