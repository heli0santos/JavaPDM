import java.util.Scanner;

class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        int num2 = 3, menorValor = 0;
        
        for (int i = 0; i < num2; i++){
            System.out.println("Informe um número:");
            num[i] = scan.nextInt();
        if(i==0){
            menorValor = num[i];
        }
        if(num[i] < menorValor){
            menorValor = num[i];
        }
        }
        System.out.println("Menor Valor = " + menorValor);
    }
}
