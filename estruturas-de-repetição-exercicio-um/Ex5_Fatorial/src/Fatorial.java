import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int fatorial = 0;
        int resultadoFatorial = 1;


        System.out.println("Digite o valor do fatorial desejado: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i > 0; i--){
            resultadoFatorial = resultadoFatorial*i;
        }
        System.out.println("Fatorial de " +fatorial + " = " + resultadoFatorial);
    }
}
