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
    public char aplicaCambio(char c){
        if(numeroVeces==0){
            return c;
        }
        if(c==this.getOriginal()){
            numeroVeces--;
            return this.getSustituido();
        }
        return c;

    }

    public int getNumeroVeces() {
        return numeroVeces;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Sustitucion{");
        sb.append("original=").append(original);
        sb.append(", sustituido=").append(sustituido);
        sb.append(", numeroVeces=").append(numeroVeces);
        sb.append('}');
        return sb.toString();
    }
}
