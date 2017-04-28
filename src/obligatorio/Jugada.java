
package obligatorio;

/*
 * @author Victor Estigarribia - 184413
 * @author Nicolas Elizabelar - 210056
 */

public class Jugada {
   private String tipo;
   
   public Jugada (String unTipo){
   this.tipo = unTipo;
   }
   
   public String getTipo(Jugada unaJugada){
       return unaJugada.tipo;
   }
   
   public void setTipo(String unTipo){
       this.tipo = unTipo;
   }
}


