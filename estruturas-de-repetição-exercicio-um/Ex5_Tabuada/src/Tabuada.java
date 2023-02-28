import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int tabuada = 0;

        System.out.println("Digite o número da tabuada desejada (1 a 10)");
        tabuada = scan.nextInt();

        while(tabuada < 0 || tabuada > 10){
            System.out.println("Tabuada inválida, digite um número entre 1 e 10: ");
            tabuada = scan.nextInt();
        }

        for(int i = 1; i < 11 ; i++){
            System.out.println(i +" X " +tabuada +" = " +(i*tabuada) );
        }
    }
}
