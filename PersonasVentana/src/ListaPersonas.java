import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Miguel-David Orrico Teruel on 20/02/2018.
 */
public class ListaPersonas {
    private final List<Persona> lista=new ArrayList<>();
    public boolean addPersona(Persona p){
        return this.lista.add(p);
    }
    public ListIterator<Persona> iteradorPersonas(){
        return this.lista.listIterator();
    }
    public Persona getPersona(int i){
        return this.lista.get(i);
    }
    public int size(){
        return this.lista.size();
    }
}
