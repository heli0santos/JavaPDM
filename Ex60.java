import java.util.Scanner;

class Ex60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] RES = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Informe o valor " + (i+1) + " do vetor A:");
            A[i] = scan.nextInt();
            System.out.println("Informe o valor " + (i+1) + " do vetor B:");
            B[i] = scan.nextInt();
            RES[i] = A[i] + B[i];
        }
        for (int i = 0; i < 5; i++){
            System.out.println("A posição " + (i+1) + " do vetor RES é " + RES[i]);
        }
    }    
}