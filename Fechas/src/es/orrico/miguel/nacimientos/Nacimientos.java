package es.orrico.miguel.nacimientos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Nacimientos {
    public static void main(String[] args) throws IOException {
        List<String> nombreFechas= Files.readAllLines(Paths.get("nacimientos"));
        List<Persona> personas=new ArrayList<>();
        System.out.println(nombreFechas);
        for (String linea :
                nombreFechas) {
            String[] campos = linea.split(":");
            personas.add(new Persona(campos[0],campos[1]));

        }
        System.out.println(personas);
        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                if(o1.getMes()==o2.getMes()){
                    return o1.getDia()-o2.getDia();
                }
                return o1.getMes().compareTo(o2.getMes());
            }
        });
        System.out.println(personas);

    }
}
