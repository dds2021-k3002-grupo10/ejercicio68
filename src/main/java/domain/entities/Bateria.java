package domain.entities;

import java.util.ArrayList;
import java.util.List;

public class Bateria {
    private Boolean conectado;
    private Boolean cargando;
    private int carga;
    private int tiempo;
    private List<Observador> observadores = new ArrayList<>();

    public Bateria(Boolean conectado, Boolean cargando, int carga, int tiempo) {
        this.conectado = conectado;
        this.cargando = cargando;
        this.carga = carga;
        this.tiempo = tiempo;
    }

    public void agregarObserver(Observador observer) { observadores.add(observer); }

    public void descargarse(){
        this.carga--;
        if(this.carga <= 15)
            this.notificar();
    }

    public void restarTiempo(){
        this.tiempo--;
        if(this.carga <= 20)
            this.notificar();
    }

    private void notificar(){
        this.observadores.forEach(observer -> observer.update(this.carga, this.tiempo));
    }
}
