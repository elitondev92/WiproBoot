package Televisao;

public class Televisao {
	private int volume = 10;
    private int canal = 1;

    public Televisao() {
    }

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume(){
        if(this.volume < 100) this.volume++;
        this.printVolume();
    }

    public void diminuirVolume(){
        if(this.volume > 0) this.volume--;
        this.printVolume();
    }

    public void aumentarCanal(){
        if(this.canal < 100)
            this.canal++;
        else
            this.canal = 1;
        this.printCanal();
    }

    public void diminuirCanal(){
        if(this.canal > 1) this.canal--;
        this.printCanal();
    }

    public void irParaCanal(int canal){
        this.canal = canal;
        this.printCanal();
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volume=" + volume +
                ", canal=" + canal +
                '}';
    }
    
    private void printVolume () {
    	System.out.println("Volume " + this.volume);
    }
    
    private void printCanal () {
    	System.out.println("Canal " + this.canal);
    }
}
