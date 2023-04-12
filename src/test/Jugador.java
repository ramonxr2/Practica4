package test;


public class Jugador {
    
    private int puntos;
    private int puntosAcum;
    public Jugador() {
        this.puntos = 0;
        this.puntosAcum=0;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPuntosAcum() {
        return puntosAcum;
    }

    
    public void setPuntos(int puntos) {
        this.puntos = puntos;
        this.puntosAcum=puntosAcum+puntos;
    }
   
    
}
