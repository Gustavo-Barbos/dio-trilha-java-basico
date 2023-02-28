import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);

        int contador = 1;
        double numero;
        double numeroMaior;
        double soma = 0;

        System.out.println("Digite um número: ");
        
        numero = scan.nextInt();
        numeroMaior = numero;
        soma = numero;

        while(contador < 5){
                    
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
               
            if (numero > numeroMaior){
                numeroMaior = numero;
            }

            soma = soma + numero;
            contador++;
        }
        System.out.println("Maior número:" + numeroMaior);
        System.out.println("Média: " + (soma/(contador) ));
        System.out.println("soma: " +soma);
        System.out.println("contador: " +contador);
    }
}
