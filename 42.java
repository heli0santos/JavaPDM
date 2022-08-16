import java.util.Scanner;

class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        System.out.println("Informe o salário:");
        num = scan.nextDouble();

        if(num <= 500){
            num = num + (num * 0.1);
        }
        else{
            num = num + (num * 0.05);
        }
        System.out.println(num);
    }
}
