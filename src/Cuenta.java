// Entidad cuenta:

class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    public static int total = 0;
    public Cuenta(int agencia) {
        if (agencia <= 0) {
            System.out.println("No se permiten numeros menores o iguales a cero");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total ++;
    }

    // No retorna valor
    public void depositar (double valor) {
        this.saldo += valor;
    }
    // Retorna valor
    public boolean retirar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transferir (double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;

    }
    public double getsaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return Cuenta.total;
    }
}