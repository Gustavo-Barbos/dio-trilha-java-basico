public class Emprestimo {

    public static void calcularEmprestimo(double valorEmprestimo, int parcela){ 
        double taxa = 0;

        switch(parcela){
            case 1:
                taxa = 0;
                Emprestimo.informacaoEmprestimo(valorEmprestimo, parcela, taxa);
                break;

            case 2:
                taxa = 0.30;
                Emprestimo.informacaoEmprestimo(valorEmprestimo, parcela, taxa);
                break;

            case 3:
                taxa = 0.45;
                Emprestimo.informacaoEmprestimo(valorEmprestimo, parcela, taxa);
                break;

            default:
                System.out.println("Parcela inválida");
                System.exit(0);
                break;
        }

        

    }

    public static void informacaoEmprestimo(double valorEmprestimo, int parcela, double taxa){
        
        double valorFinal = (1 + taxa)*valorEmprestimo;


        System.out.println("Seu emprestimo de R$ " +valorEmprestimo + " ficou com parcelas de " + parcela + " x " + (valorFinal)/parcela + " = " + valorFinal);

    }
}
