
package obligatorio;

import java.util.ArrayList;

/*
 * @author Victor Estigarribia - 188413
 * @author Nicolas Elizabelar - 210056
*/
public class Partida {
    
    private ArrayList <Jugador> jugadores = new ArrayList<>(); 
    private int tipo;
    private int puntaje1;
    private int puntaje2;
    
    public Partida (ArrayList <Jugador> unosJugadores,int unTipo, int puntajeRojo,int puntajeAzul){
        
        this.setJugadores(unosJugadores);
        this.setTipo(tipo);
        this.setPuntaje1(puntajeRojo);
        this.setPuntaje2(puntajeAzul);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> unosJugadores) {
        this.jugadores = unosJugadores;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int unTipo) {
        this.tipo = tipo;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int unPuntaje1) {
        this.puntaje1 = unPuntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int unPuntaje2) {
        this.puntaje2 = unPuntaje2;
    }
    
    
    
}


