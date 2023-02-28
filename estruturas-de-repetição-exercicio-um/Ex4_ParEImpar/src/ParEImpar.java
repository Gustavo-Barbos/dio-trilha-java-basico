import java.util.Scanner;

import javax.imageio.ImageReadParam;

public class ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int numero = 0;
        int quantiNumeros = 4;
        int par = 0;
        int impar = 0;

        while(contador < quantiNumeros ){
            System.out.println("Digite um número: ");
            numero = scan.nextInt(); 
            
            if (numero % 2 == 0 ){
                par++ ;
            } else {
                impar++ ;
            }

            contador++ ;
        }
        System.out.println("Quantidade de números Pares: " + par);
        System.out.println("Quantidade de números Impares: " + impar);
    }
}
