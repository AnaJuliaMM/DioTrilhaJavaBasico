public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        if(volume<100)
            volume++;
    }
    public void diminuirVolume(){
        if(volume>=1)
            volume--;
    }
    public void incrementarCanal(){
        canal++;
    }
    public void decrementarCanal(){
        canal--;
    }
    public void definirCanal(int canalDesejado){
        canal = canalDesejado; 
    }
   

    
}
