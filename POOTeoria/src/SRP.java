/**
 * Created by Miguel-David Orrico Teruel on 22/02/2018.
 */
//Crear un array
//Rellenarlo del 1 al 100
//Imprimir el resultado
public class SRP {
    public static void main(String[] args) {
        resuelveEjercicio();
    }

    private static void resuelveEjercicio() {
        int[] vector = Inicializa();
        rellena(vector);
        imprime(vector);
    }

    private static void imprime(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
        System.out.println("");
    }

    private static void rellena(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i*i;
        }
    }

    private static int[] Inicializa() {
        return new int[100];
    }
}
