public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume para : " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume para : " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o volume para : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume para : " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal atual : " + smartTv.canal);


    }
}
