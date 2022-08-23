import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] num = new int[3][3];
        int[] maior = new int[3];
        int[] maiorVetor = new int[3];
        maiorVetor[0] = 0;
        maior[0] = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Informe o valor de vendas do mês " + (i+1) + " do vendedor " + (j+1));
                num[i][j] = scan.nextInt();
                if(i == 0 && maiorVetor[i] == 0){
                    maior[i] = num[i][j];
                    maiorVetor[i] = (j+1);
                }
                if(num[i][j] > maior[i]){
                    maior[i] = num[i][j];
                    maiorVetor[i] = (j+1);
                }
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println("O vendedor que mais vendeu no mês " + (i+1) + " foi o número " + maiorVetor[i] + ", no valor de " + maior[i]);
        }
    }
}
