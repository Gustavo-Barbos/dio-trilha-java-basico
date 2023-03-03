import java.util.Scanner;

public class Ex8_Consoates {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoante = new String[6];
        String letra;
        String consoates[];
        int contador = 0;

        for(int i= 0; i < consoante.length; i++){
            System.out.println("Digite a " +(i + 1) +" letra ");
            letra = scan.next();
            
            if (!(          letra.equalsIgnoreCase("a") ||
                            letra.equalsIgnoreCase("e") ||
                            letra.equalsIgnoreCase("i") ||
                            letra.equalsIgnoreCase("o") ||
                            letra.equalsIgnoreCase("u")) ) {

            consoante[i] = letra;        
            }
        
        }
        for (String consoantes : consoante) {
            if (consoantes != null){
                contador++;
                System.out.print(consoantes + " ");
            }
            
        }
        System.out.println("\nQuantidade de consoantes: " + contador);



    }
    
}
