public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume Atual ?" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: Tv ligada ?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume incrementado: "+smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume decrementado: "+smartTv.volume);

        smartTv.definirCanal(30);
        System.out.println("Definido o canal desejado: "+smartTv.canal);

        smartTv.incrementarCanal();
        System.out.println("Canal desejado incrementado: "+ smartTv.canal);

        smartTv.decrementarCanal();
        System.out.println("Canal desejado decementado: "+ smartTv.canal);


    }
}
