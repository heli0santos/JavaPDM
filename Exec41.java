import java.util.Scanner;

class Exec41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número:");
        num = scan.nextInt();
        if(num >= 20 && num <=90){
            System.out.println("O número está na faixa de 20 a 90.");
        }
        else{
            System.out.println("O número está fora da faixa de 20 a 90.");
        }
    }
}
