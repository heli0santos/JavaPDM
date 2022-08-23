import java.util.Scanner;

class Ex51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num =  new int[5];
        int soma = 0;
        double resultado;
        for (int i = 0; i < 5; i++){
            System.out.println("Informe a número " + (i+1));
            num[i] = scan.nextInt();
            soma = soma + num[i];
        }
        resultado = soma/5;
        System.out.println("A média é " + resultado);
    }
}