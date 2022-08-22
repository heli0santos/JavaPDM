import java.util.Scanner;

class Exec36 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String sexo;

        System.out.println("Informe o sexo M ou F:");
        sexo = scan.next();
        
        if(sexo.intern() == "M" || sexo.intern() == "F"){
            System.out.println("O sexo é válido");
        }
        else{
            System.out.println("O sexo é inválido");
        }        
    }
}