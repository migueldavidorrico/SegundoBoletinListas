import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Miguel-David Orrico Teruel on 15/02/2018.
 * Escriba un programa para simular un campeonato de tenis.

 Primero, debe pedir al usuario que ingrese los nombres de ocho tenistas.
 A continuación, debe pedir los resultados de los partidos juntando los jugadores
 de dos en dos. El ganador de cada partido avanza a la ronda siguiente.

 El programa debe continuar preguntando ganadores de partidos hasta que quede
 un único jugador, que es el campeón del torneo.

 El programa en ejecución debe verse así:

 Jugador 1: Nadal
 Jugador 2: Melzer
 Jugador 3: Murray
 Jugador 4: Soderling
 Jugador 5: Djokovic
 Jugador 6: Berdych
 Jugador 7: Federer
 Jugador 8: Ferrer

 Ronda 1
 a.Nadal - b.Melzer: a
 a.Murray - b.Soderling: b
 a.Djokovic - b.Berdych: a
 a.Federer - b.Ferrer: a

 Ronda 2
 a.Nadal - b.Soderling: a
 a.Djokovic - b.Federer: a

 Ronda 3
 a.Nadal - b.Djokovic: b

 Campeon: Djokovic
 */
public class TorneoTenis {
    public static Scanner sc=new Scanner(System.in);
    public static final int NUMERO_JUGADORES=8;
    List<String> jugadores=new ArrayList<>();
    public static void main(String[] args) {
        TorneoTenis torneo=new TorneoTenis();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < NUMERO_JUGADORES; i++) {
            System.out.print("Jugador " + (i + 1) + ":");
            torneo.jugadores.add(sc.nextLine());
        }
        int ronda=1;
        do {
            System.out.println("Ronda: " + ronda);
            torneo.jugadores = juegaRonda(torneo.jugadores);
            ronda++;
        } while(torneo.jugadores.size()>1);
        System.out.println("Ganador: " + torneo.jugadores.get(0));
    }

    private static List<String> juegaRonda(List<String> jugadores) {
        List<String> pasanDeRonda=new ArrayList<>();
        Iterator<String> iterator=jugadores.iterator();
        while(iterator.hasNext()){
            String primerJugador=iterator.next();
            String segundoJugador=iterator.next();
            String pregunta="a."+primerJugador;
            pregunta+=" b."+segundoJugador+" ";
            System.out.print(pregunta);

            if(sc.nextLine().charAt(0)=='a'){
                pasanDeRonda.add(primerJugador);
            } else {
                pasanDeRonda.add(segundoJugador);
            }

        }
        return pasanDeRonda;
    }
}
