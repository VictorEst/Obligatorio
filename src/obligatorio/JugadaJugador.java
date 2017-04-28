
package obligatorio;

/*
 * @author Victor Estigarribia Chavez - 184413
 * @author Nicolas Elizabelar - 210056
 */
public class JugadaJugador {
    private Jugador jugador;
    private Jugada jugada;
    private int cubos;
    private int [][] tablero;
    private String color;

    public JugadaJugador(Jugador unJugador, Jugada unaJugada, int unosCubos, int[][] unTablero, String unColor) {
        this.setJugador(unJugador);
        this.setJugada(unaJugada);
        this.setCubos(unosCubos);
        this.setTablero(unTablero);
        this.setColor(unColor);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador unJugador) {
        this.jugador = unJugador;
    }

    public Jugada getJugada() {
        return jugada;
    }

    public void setJugada(Jugada unaJugada) {
        this.jugada = unaJugada;
    }

    public int getCubos() {
        return cubos;
    }

    public void setCubos(int unosCubos) {
        this.cubos = unosCubos;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] unTablero) {
        this.tablero = unTablero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }
    
}

