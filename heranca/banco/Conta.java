public abstract class  Conta {
    private int numero;
    private double saldo;
    public Conta (int numero) {
        setNumero(numero);
    }
    public Conta (int numero, double saldo) {
        this(numero);
        setSaldo(saldo);
    }
    public void setNumero (int numero) {
        if (numero >= 1000 && numero <= 9999) {
            this.numero = numero;
        }
        else {
            numero = 0;
        }
    }
    public void setSaldo (double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        }
        else {
            this.saldo = saldo;
        }
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public abstract void depositar (double valor);

    public abstract void retirar (double valor);

    @Override
    public String toString () {
        return "numero: " + numero + ", saldo: R$ " + String.format("%.2f", saldo);
    }
}