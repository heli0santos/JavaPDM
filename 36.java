import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int num2 = 0, menorValor = 0;
        
        num2 = scan.nextInt();
        
        for (int i = 0; i < num2; i++){
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