import java.util.Scanner;

public class Cumprimento {
    public static void main(String[] args) throws Exception {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Digite a Hora: ");
        int horas = scan.nextInt();

        Mensagem.obterMensagem(horas);

        scan.close();
    }
}
