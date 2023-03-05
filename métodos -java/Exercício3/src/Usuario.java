import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double valorEmprestimo;
        int parcela;
        
        System.out.println("Digite o valor do emprestimo e as parcelas desejadas: ");
        valorEmprestimo = scan.nextInt();
        parcela = scan.nextInt();

        scan.close();

        Emprestimo.calcularEmprestimo(valorEmprestimo, parcela);
    }
}
