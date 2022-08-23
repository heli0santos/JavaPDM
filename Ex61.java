import java.util.Scanner;

class Ex61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] num = new double[20];
        int valor = 0;
        for(int i = 0; i < 20; i++){
            System.out.println("Informe o valor " + (i+1) + " a ser armazenado.");
            num[i] = scan.nextDouble();
        }
        while (valor >= 0 && valor <= 19){
            System.out.println("Informe o índice do vetor que deseja consultar:");
            valor = scan.nextInt();
            if(valor <= 19){
                System.out.println("O valor é igual a " + num[valor]);
            }
        }
    }
}
