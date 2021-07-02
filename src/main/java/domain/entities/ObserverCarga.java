package domain.entities;

public class ObserverCarga implements Observador{

    @Override
    public void update(int carga, int tiempo) {
        if(carga <= 15)
            System.out.println("La bateria se esta agotando, " + carga + "% restante");
    }
}
