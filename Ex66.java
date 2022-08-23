import java.util.Scanner;

class Ex66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nome = new String[10];
        double[][] valores = new double[10][10];
        double[] lucro = new double[10];
        int indice = 0;
        for(int i = 0; i < 10; i++){
            int j = 0;
            System.out.println("Informe o nome do produto:");
            nome[i] = scan.next();
            System.out.println("Informe o valor de compra:");
            valores[i][j] = scan.nextDouble();
            j++;
            System.out.println("Informe o valor de venda:");
            valores[i][j] = scan.nextDouble();
            lucro[i] = valores[i][j] - valores[i][j-1];
        }
        while(indice >= 0 && indice < 10){
            System.out.println("Informe o índice para consulta:");
            indice = scan.nextInt();
            if(indice < 10){
                System.out.println("O lucro do produto " + nome[indice] + " é igual a " + lucro[indice]);
            }
        }
    }
}
