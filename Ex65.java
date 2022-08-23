import java.util.Scanner;

class Ex65 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nome = new String[20];
        double[] salario = new double[20];
        int indice = 0;
        for(int i = 0; i < 20; i++){
            System.out.println("Informe o nome do funcionário " + (i+1)+ ":");
            nome[i] = scan.next();
            System.out.println("Informe o salário do funcionário " + (i+1)+ ":");
            salario[i] = scan.nextDouble();
        }
        while(indice >= 0 && indice < 20){
            System.out.println("Informe o índice para consulta:");
            indice = scan.nextInt();
            if(indice < 20){
                System.out.println("O funcionário " + nome[indice] + " tem o salário de " + salario[indice] + ".");
            }
        }
    }
}