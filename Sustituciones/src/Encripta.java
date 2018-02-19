import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Miguel-David Orrico Teruel on 18/02/2018.
 */
public class Encripta {
    static List<Sustitucion> sustituciones=new ArrayList<>();
    public static void main(String[] args) throws IOException {

        List<String> lista=Files.readAllLines(Paths.get("sustituciones2"));
        Iterator<String> iterator=lista.iterator();
        while (iterator.hasNext()){
            sustituciones.add(new Sustitucion(iterator.next().charAt(0),iterator.next().charAt(0),3));
        }
        String original="prueba para sustituir con muchas as para probar el número de sustituciones";
        String cambiada="";
        for (int i = 0; i < original.length(); i++) {
            cambiada+=cambia(original.charAt(i));
        }
        System.out.println(original);
        System.out.println(cambiada);
    }

    private static char cambia(char c) {
        for (Sustitucion s :
                sustituciones) {
            if(s.getOriginal()==c && s.getNumeroVeces()>0){
                s.aplicaCambio();
                return s.getSustituido();
            }
            }
        return c;
    }
}
