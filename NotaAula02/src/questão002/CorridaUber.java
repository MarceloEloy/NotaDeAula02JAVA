package questão002;
import java.util.Random;
public class CorridaUber {
    double tarida = tarifaCorrida();
    double distancia = distanciaCorrida();
    double fator = fatorDemanda();
    int tempo = tempoEspera();
    double tarifaCorrida(){
        Random x = new Random();
        return x.nextDouble(10, 20);
    }
    double distanciaCorrida(){
        Random x = new Random();
        return x.nextDouble(10, 100);
    }
    int tempoEspera(){
        Random x = new Random();
        return x.nextInt(10, 100);
    }
    double fatorDemanda(){
        Random x = new Random();
        return x.nextInt(10, 30);
    }
    public final double valorFinal(){
        return ((distancia*2)+(tempo*0.5)+(tarida*fator));
    }
    public String detalhesCorrida(){
        return "distância: "+ distancia +"Km" + " tempo: "+ tempo+"S" + " tarifa: "+ tarida + " demanda: "+ fator;
    }
}
