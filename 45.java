import java.util.Scanner;

class Main7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if(a < (b + c) && b < (a + c) && c < (b + a)){
            System.out.println("Pode ser um triângulo.");
        }
        else{
            System.out.println("Não pode ser um triângulo.");
        }
    }
}
