package Televisao;

public class Controle {
	public static void aumentarVolume(Televisao televisao){
        televisao.aumentarVolume();;
    }

    public static void diminuirVolume(Televisao televisao){
        televisao.diminuirVolume();
    }

    public static void aumentarCanal(Televisao televisao){
        televisao.aumentarCanal();
    }

    public static void diminuirCanal(Televisao televisao){
        televisao.diminuirCanal();
    }

    public static void  irParaCanal(Televisao televisao, int canal){
        televisao.irParaCanal(canal);
    }

    public static void consultaVolumeECanal(Televisao televisao){
        System.out.println(televisao.toString());
    }
}
