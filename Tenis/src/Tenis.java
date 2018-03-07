import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Miguel-David Orrico Teruel on 07/03/2018.
 */
public class Tenis {
    static List<String> tenistas=new ArrayList<>();
    public static void main(String[] args) {
        int numeroJugadores=Integer.parseInt(JOptionPane.showInputDialog("Número de tenistas"));
        for (int i = 0; i <numeroJugadores; i++) {
            tenistas.add(JOptionPane.showInputDialog("nombre del Tenista"));
        }
        while(tenistas.size()>1){
            String ronda="Jugadores Que quedan en el torneo:\n";
            for (String s :
                    tenistas) {
                ronda+=s+"\n";
            }
            JOptionPane.showMessageDialog(null,ronda);

            List<String> ganadores=new ArrayList<>();
            Iterator<String> itTenistas=tenistas.iterator();
            while(itTenistas.hasNext()) {
                String jugador1 = itTenistas.next();
                if (!itTenistas.hasNext()) {
                    JOptionPane.showMessageDialog(null, "Gana " + jugador1 + " por no tener rival");
                    ganadores.add(jugador1);
                } else {
                    String[] jugadores = new String[2];
                    jugadores[0] = jugador1;
                    jugadores[1] = itTenistas.next();
                    int ganador = JOptionPane.showOptionDialog(null,
                            "¿Quién gana?",
                            "Partido",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            jugadores,
                            jugadores[0]);
                    ganadores.add(jugadores[ganador]);
                }
            }
            tenistas=ganadores;
        }
        JOptionPane.showMessageDialog(null,"El ganador es "+tenistas.get(0));
    }
}
