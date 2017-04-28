package obligatorio;

import java.util.Collection;
import java.util.Comparator;

/*
 * @author Victor Estigarribia - 184413
 * @author Nicolas Elizabelar - 210056
 */
public class Jugador implements Comparable<Jugador> {

    private String nombre;
    private String alias;
    private int edad;
    private int partidasJugadas;

    public Jugador(String nombre, String alias, int edad) {
        this.setNombre(nombre);
        this.setAlias(alias);
        this.setEdad(edad);
        this.setPartidasJugadas(0);
    }

    public void setPartidasJugadas(int unasPartidasJugadas) {
        this.partidasJugadas = unasPartidasJugadas;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String unAlias) {
        this.alias = unAlias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }

    @Override
    public String toString() {
        return "alias = " + this.getAlias();
    }

    @Override
    public int compareTo(Jugador j) {

        return this.getPartidasJugadas() - j.getPartidasJugadas();
    }

    @Override
    public boolean equals(Object o) {

        Jugador j = (Jugador) o;
        return this.getAlias() == j.getAlias();

    }
}
