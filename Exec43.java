import java.util.Scanner;

class Exec43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Informe um número:");
        num = scan.nextInt();
        if(num % 5 == 0){
            System.out.println("O número é divisível por 5.");
        }
        else{
            System.out.println("O número não é divisível por 5.");
        }
    }
}
