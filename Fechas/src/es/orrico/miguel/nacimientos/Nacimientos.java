package es.orrico.miguel.nacimientos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Nacimientos {
    public static void main(String[] args) throws IOException {
        List<String> nombreFechas= Files.readAllLines(Paths.get("nacimientos"));
        System.out.println(nombreFechas);
    }
}
