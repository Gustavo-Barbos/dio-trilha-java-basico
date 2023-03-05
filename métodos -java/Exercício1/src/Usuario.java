import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double numero1;
        double numero2;    
        

        System.out.println("Digite os dois valores a serem calculados: ");
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();

        System.out.println("Valor da soma é: " +Calculadora.somar(numero1, numero2));
        System.out.println("Valor da subtração é: " +Calculadora.subtrair(numero1, numero2));
        System.out.println("Valor da multiplicação é: " +Calculadora.multiplicar(numero1, numero2));
        System.out.println("Valor da divisão é: " +Calculadora.dividir(numero1, numero2));

        scan.close();

    }
}
