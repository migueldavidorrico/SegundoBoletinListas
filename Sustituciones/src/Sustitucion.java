/**
 * Created by Miguel-David Orrico Teruel on 18/02/2018.
 */
public class Sustitucion {
    private final char original;
    private final char sustituido;
    private int numeroVeces;

    public Sustitucion(char original, char sustituido,int numeroVeces) {
        this.original = original;
        this.sustituido = sustituido;
        this.numeroVeces=numeroVeces;
    }

    public Sustitucion(char original, char sustituido) {
        this(original,sustituido,Integer.MAX_VALUE);
    }

    public char getOriginal() {
        return original;
    }

    public char getSustituido() {
        return sustituido;
    }
    public void aplicaCambio(){
        this.numeroVeces--;
    }

    public int getNumeroVeces() {
        return numeroVeces;
    }
}
