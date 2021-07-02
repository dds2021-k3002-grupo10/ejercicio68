package domain.entities;

public class ObserverTiempo implements Observador{
    @Override
    public void update(int carga, int tiempo) {
        if(tiempo <= 20)
            System.out.println("Solo quedan " + tiempo + " minutos");
    }
}
