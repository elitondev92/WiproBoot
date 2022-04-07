package Televisao;

public class Test {

	public static void main(String[] args) {
		Televisao televisao = new Televisao();
        Controle.diminuirVolume(televisao);
        Controle.aumentarVolume(televisao);
        Controle.aumentarVolume(televisao);
        Controle.consultaVolumeECanal(televisao);
        Controle.irParaCanal(televisao, 50);
        Controle.irParaCanal(televisao, 100);
        Controle.aumentarCanal(televisao);
        Controle.consultaVolumeECanal(televisao);
	}

}
