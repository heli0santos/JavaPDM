import java.util.Scanner;

class Ex56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1, numSoma = 0, numPares = 0, numImpares = 0, numQnt = 0;
        double numMedia;
        while (num != 0){
            System.out.println("Informe um número inteiro:");
            num = scan.nextInt();
            if(num != 0){
                numQnt++;
            }
            numSoma = numSoma + num;
            if (num % 2 == 0 && num != 0){
                numPares++;
            }else if(num % 2 != 0 && num != 0){
                numImpares++;
            }
        }
        numMedia = numSoma / numQnt;
        System.out.println("Quantidade de números digitados: " + numQnt);
        System.out.println("Quantidade de números pares: " + numPares);
        System.out.println("Quantidade de números ímpares: " + numImpares);
        System.out.println("Média dos valores digitados: " + numMedia);
    }    
}