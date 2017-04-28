package obligatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * @author Victor Estigarribia - 184413
 * @author Nicolas Elizabelar - 210056
 */
public class Sistema {

    private ArrayList<Partida> listaDePartidas = new ArrayList<>();
    private ArrayList<Jugador> listaDeJugadores = new ArrayList<>();
    private ArrayList<Jugada> listaDeJugadas = new ArrayList<>();

    public Sistema() {
        
    }

    public void registroJugador(Jugador unJugador) {
        if (validarAlias(unJugador)) {
            listaDeJugadores.add(unJugador);
        }     
    }

    //Se ordena jugadores por cantidad de partidas jugadas
    public void verRanking() {
        Collections.sort(listaDeJugadores);
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            System.out.println(listaDeJugadores.get(i));
        }
        
        
    }

    //Valida que el alias sea unico
    public boolean validarAlias(Jugador unJugador) {
        
        boolean esUnico = true;
        
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            if (unJugador.equals(listaDeJugadores.get(i))) {
                esUnico = false;
            }
        }
        
        return esUnico;
    }
    
    public int [][] hacerMatrizTemporal(){
        int [][] matriz = new int[6][6];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 1;
            }
        }
        return matriz;
    }
    
    public void imprimirTablero(int [][] tablero){
        
        System.out.println("    1   2   3   4   5   6 ");
        
        for (int i = 0; i < tablero.length; i++) {
            
            Character c=(char)(i+65);
            
            System.out.println("   *** *** *** *** *** *** ");
            System.out.println("  *   *   *   *   *   *   * ");
            System.out.print(c + " *");
            for (int j = 0; j < tablero[0].length; j++) {
                
                System.out.print(" " + tablero[i][j] + " *");
            }
            System.out.print("\n  *   *   *   *   * ");
            System.out.println("  *" + "   " + "*");
        }
        System.out.println("   *** *** *** *** *** *** ");
    }
    
    
}

