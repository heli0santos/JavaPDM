import java.util.Scanner;

class Ex53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c, cfinal;
        double f;
        System.out.println("Informe a temperatura inicial:");
        c = scan.nextInt();
        System.out.println("Informe a temperatura final:");
        cfinal = scan.nextInt();
        for(int i = c; i <= cfinal; i++){
            f = 1.8*i + 32;
            System.out.println(i +" Celsius = " + f + " Fahrenheit");
        }
    }
}