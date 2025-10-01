public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial (int numero, double limite) {
        super(numero);
        this.limite = limite;
    }
    public double getLimite () {
        return limite;
    }
    public void setLimite (double limite) {
        this. limite = limite;
    }
    public void depositar (double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }
    public void retirar (double valor) {
        if (super.getSaldo() + this.limite >= valor) {
            if (super.getSaldo() >= valor) {
                super.setSaldo(super.getSaldo() - valor);
            }
            else {
                double diferenca = valor - super.getSaldo();
                super.setSaldo(0);
                limite = limite - diferenca;
            }
        }
    }
}
