import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        
        int numero = -1;
        
        while(numero < 0 || numero > 10){
            System.out.println("Nota: ");
         Scanner scan = new Scanner(System.in);
            numero = scan.nextInt();
        }

        System.out.println("fim");

    }
    
}
