package obligatorio;

import java.util.Scanner;

/**
 *
 * @author nelizabelar
 */
public class Prueba {

    public static void main(String[] args) {

        boolean salir = false;
        Sistema nuevoSistema = new Sistema();
        nuevoSistema.imprimirTablero(nuevoSistema.hacerMatrizTemporal());

//        while (!salir) {
//
//            System.out.println("*!*!*!* Bienvenidos a Esquinas *!*!*!*");
//            System.out.println("");
//            System.out.println("Seleccione una opción:");
//            System.out.println("");
//            System.out.println("1 - Registrar jugador");
//            System.out.println("2 - Jugar partida manual");
//            System.out.println("3 - Jugar partida contra computadora");
//            System.out.println("4 - Ranking");
//            System.out.println("5 - Salir");
//
//            int opcion = pedirNumero("");
//
//            while (rangoNum(opcion, 1, 5)) {
//                System.out.println("Seleccione una opción válida:");
//                opcion = pedirNumero("");
//            }
//
//            switch (opcion) {
//                case 1:
//                    //menuRegistrarJugador();
//                    break;
//                case 2:
//                    //jugarPartida("manual");
//                    break;
//                case 3:
//                    //jugarPartida("computadora");
//                    break;
//                case 4:
//                    //verRanking();
//                    break;
//                case 5:
//                    salir = true;
//                    break;
//
//            }

       // }

    }

    public static int pedirNumero(String texto) {

        if (!texto.equals("")) {
            System.out.println("\n" + texto);
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        return num;

    }

    public static boolean rangoNum(int num, int primero, int segundo) {
        boolean noEsta = false;

        if (num < primero || num > segundo) {
            noEsta = true;
        }

        return noEsta;
    }
    
    

}
