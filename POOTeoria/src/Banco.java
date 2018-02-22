/**
 * Created by Miguel-David Orrico Teruel on 22/02/2018.
 */

class CuentaCorriente{
    private int saldo=0;
    private double interes=0;
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes) {
        this.interes = interes;
    }
    public void ingreso(int dinero){
        saldo+=dinero;
    }
    public void retirada(int dinero){
        saldo-=dinero;
    }
}
